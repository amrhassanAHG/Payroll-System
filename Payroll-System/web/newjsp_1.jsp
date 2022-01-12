<%@page import="java.lang.Exception"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="Data.Employee_Data" %>
<%@page import="Data.DB_operation" %>
<%@page import="Data.Conn" %>
<jsp:useBean id="Emp_obj" class="Data.Employee_Data" scope="session"></jsp:useBean>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> set parameter </title>
    </head>
    <body>
     
        <%
            Emp_obj.setCode(request.getParameter("code"));
            Emp_obj.setCode_value(request.getParameter("code_value"));
            Emp_obj.setCity(request.getParameter("city"));
            Emp_obj.setSalary(Double.parseDouble(request.getParameter("salary")));
            Emp_obj.setPay_method(request.getParameter("pay_method"));
            Emp_obj.setSalary_to_date(Double.parseDouble(request.getParameter("salary_to_date")));
            response.sendRedirect("test.jsp");
       %>


    </body>
</html>
