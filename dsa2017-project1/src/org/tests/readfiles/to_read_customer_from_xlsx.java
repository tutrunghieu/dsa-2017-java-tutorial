package org.tests.readfiles;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.CompanyName.project1.physical.Tab_Customer;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class to_read_customer_from_xlsx 
{

	//xem huong dan tai
	// https://docs.google.com/document/d/1jG4vWu3Bf-WjjAnQSlR7eAoMjxVMPhrh1Xycv1fihRc/edit?usp=sharing
	public static void main(String[] args) throws Exception
	{
		File f = Res.getDesktopFile("dsa2017-data/1e2/customers.xlsx");
		
		List<Tab_Customer> kq = readList(f, Tab_Customer.class);
		for(Tab_Customer x: kq) System.out.println(x.cus_name);
	}
	
	@SuppressWarnings("unchecked")
	protected static<T1> List<T1> readList(File f, Class<T1> cl) throws Exception
	{
		List<T1> items = new ArrayList<T1>();
		
		for(Object s: readList(f))
		{
			Map<String, Object> sjj = (Map<String, Object>)s;
			T1 tjj = cl.newInstance();
			for(String k: sjj.keySet()) 
			{
				Object vk = sjj.get(k);
				cl.getField(k).set(tjj, vk);
			}
			
			items.add(tjj);
		}
		
		return items;
	}
	
	private static List<Object> readList(File f) throws Exception
	{
		List<Object> res = new ArrayList<Object>();
		
		FileInputStream rd = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(rd);
		XSSFSheet s = book.getSheetAt(0);
		
		List<String> headers = new ArrayList<String>();
		for(int r=s.getFirstRowNum(); r<=s.getLastRowNum(); )
		{
			//System.out.println("Reading row " + r);
			
			if(r==0) headers = readXlsxHeader(s.getRow(r++));
			Object rk = readXlsxData(s.getRow(r++), headers);
			System.out.println(rk);
			
			res.add(rk);
		}
		
		rd.close();
		
		return res;
	}

	private static Object readXlsxData(XSSFRow row, List<String> headers)
	{
		Map<String, Object> rk = new LinkedHashMap<String, Object>();
		for(int c=row.getFirstCellNum(); c<row.getLastCellNum(); c++)
		{
			rk.put(headers.get(c), row.getCell(c).getStringCellValue() );
		}
		
		return rk;
	}

	private static List<String> readXlsxHeader(XSSFRow row) 
	{
		List<String> headers = new ArrayList<String>();
		
		for(int c=row.getFirstCellNum(); c<row.getLastCellNum(); c++)
		{
			//System.out.println("Reading cell " + c);
			
			XSSFCell ck = row.getCell(c);
			headers.add( ck.getStringCellValue() );
		}
		
		return headers;
	}

}
