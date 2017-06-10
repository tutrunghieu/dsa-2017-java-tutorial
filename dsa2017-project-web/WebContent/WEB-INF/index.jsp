<%@ page trimDirectiveWhitespaces="true" %><%@ page language="java" 
contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<body>

<a href="?v=san-pham">Sản phẩm</a> |  
<a href="?v=khach-hang">Khách hàng</a> |
<a href="?v=don-hang">Đơn hàng</a>  

<h1>Nội dung viết dưới đây</h1>
<%= request.getParameter("v") %>

</body>
