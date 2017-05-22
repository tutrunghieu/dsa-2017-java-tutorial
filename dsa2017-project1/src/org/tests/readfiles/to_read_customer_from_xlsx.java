package org.tests.readfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.cert.X509CRLEntry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

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
		for(Tab_Customer x: kq) 
			System.out.println(x.cus_name + "|" + x.phone);
		
		Tab_Customer t = new Tab_Customer();
		t.ccode = "CST1234";
		t.cus_name = "Khach hang moi them";
		t.phone = "0912345345";
		kq.add(t);
		
		showData(kq);
			
		f = Res.getDesktopFile("test1.xlsx");
		writeList(kq, f);		
	}
	
	private static void showData(List<Tab_Customer> x) 
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(320, 200);
		f.setLocation(10, 10);
		
		JTextArea a = new JTextArea();
		f.add(new JScrollPane(a));
		for(Tab_Customer xk: x) a.append(xk.cus_name + "\r\n");
		
		f.setVisible(true);
	}

	public static<T1> void writeList(List<T1> items, File f) throws Exception
	{
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet s = book.createSheet("Sheet 1");
		
		List<Field> fields = null;
		int r = 0;
		for(T1 ik: items)
		{
			if(r == 0) fields = writeXlsxHeader(ik, s.createRow(r++));
			writeXlsxData(ik, s.createRow(r++), fields);			
		}
		
		FileOutputStream out = new FileOutputStream(f);
		book.write(out);
		out.close();
	}

	private static<T1> List<Field> writeXlsxHeader(T1 ik, XSSFRow r) 
	{
		List<Field> res = new ArrayList<Field>();
		
		for(Field fj: ik.getClass().getFields())
			if( Modifier.isPublic(fj.getModifiers()))
				res.add(fj);
		
		int k = 0;
		for(Field fj: res) 
		{
			XSSFCell ck = r.createCell(k++);
			ck.setCellValue(fj.getName());
		}
		
		return res;
	}
	
	private static<T1> void writeXlsxData(T1 ik, XSSFRow r, List<Field> fields) throws Exception 
	{
		int k = 0;
		for(Field fj: fields) 
		{
			XSSFCell ck = r.createCell(k++);
			ck.setCellValue(fj.get(ik) + "");
		}
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
