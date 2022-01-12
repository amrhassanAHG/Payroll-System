<%-- 
    Document   : print_result
    Created on : Apr 29, 2019, 7:28:10 PM
    Author     : Num1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="Data.result_Data" %>
<jsp:useBean id="result_obj" class="Data.result_Data" scope="session"></jsp:useBean>

    <html>
        <head>
            <link rel="icon" type="image/png" href="images/calculation.png">
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="css/payroll_Design.css" rel="stylesheet" type="text/css">
            <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" media="all" />
            <link href="//fonts.googleapis.com/css?family=Hind:300,400,500,600,700" rel="stylesheet"> 
            <title> Result </title>
        </head>
    <%
        int code = result_obj.getEmp_code();
        double salary = result_obj.getSalary();
        int month_num = result_obj.getMonth_num();
        int week_num = result_obj.getWeek_num();
        double salary_to_date = result_obj.getSalary_to_date();
        double total_pay_to_date = result_obj.getTotal_pay_to_date();
        double pay_table_A = result_obj.getPay_table_A();
        double total_taxable = result_obj.getTotal_taxable();
        double total_tax_due = result_obj.getTotal_tax_due();
    %>
    <body> 
        <header>
            <div class="row">
                <ul class="main-nav" class="active">
                    <li class="active"> <a href="About.html" > Getting started </a></li>
                    <li> <a href="Login.html" > LOG IN </a></li>
                </ul>
            </div>
            <div class="payroll_layout">
                <div class="outdiv"> 
                    <div class="text_layer">
                        <h3 class="headerh3"> Your result </h3>

                        <form>
                            Code : <%= code%> <br><br>
                            Salary : <%= salary%><br><br>
                            Month number : <%= month_num%> <br><br>
                            Week number : <%= week_num%><br><br>
                            Salary to date : <%= salary_to_date%><br><br>
                            Total pay to date : <%= total_pay_to_date%><br><br>
                            Pay in table A : <%= pay_table_A%><br><br>
                            Total taxable : <%= total_taxable%><br><br>
                            Total tax due : <%= total_tax_due%><br><br>

                        </form>

                    </div>
                </div>
            </div>
        </header>
    </body>

</html>
