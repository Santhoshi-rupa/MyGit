<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   		 String name=request.getParameter("nm");
   		 String psd=request.getParameter("pwd");
         if(name.equals("admin")&& psd.equals("1234"))
         {   
                   %><jsp:forward page="success.jsp"/><% 
         }
        else {
                   %><jsp:forward page="failure.jsp"/><%
              }
 %>
</body>
</html>