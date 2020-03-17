<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
  HashMap h=new HashMap();
  h.put("101","accountant");
  h.put("102","manager");
  h.put("103","clerk");
  h.put("104","clerk");
  h.put("105","accountant");
  h.put("106","manager");
  
  HashMap h1=new HashMap();
  h1.put("101","1000");
  h1.put("102","2000");
  h1.put("103","3000");
  h1.put("104","4000");
  h1.put("105","5000");
  h1.put("106","6000");
  
  String eid=request.getParameter("id");
  String edesg=request.getParameter("desg");
  String esal=request.getParameter("salary");
  
  
  
  
  
  
%>
  
</body>
</html>