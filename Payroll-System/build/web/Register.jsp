<%-- 
    Document   : register
    Created on : Apr 14, 2019, 6:27:31 PM
    Author     : Abd El Rahman Osama
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Data.Conn"%>
<%@page import="Data.Employee_Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String username = request.getParameter("username");
    Employee_Data E;
    E = (Employee_Data) session.getAttribute("current user");
    try {
        Conn c = new Conn();
        Connection connection = c.getConnection();

        PreparedStatement insert_info
                = connection.prepareStatement("insert into user (firstname, lastname, email , password, username) values(?, ?, ?, ?, ?)");

        PreparedStatement psp
                = connection.prepareStatement("select * from user where email=? and username=?");

        psp.setString(1, email);
        psp.setString(2, username);
        ResultSet s = psp.executeQuery();

        if (s.next()) {
            request.getRequestDispatcher("Registration.html").forward(request, response);
        } else {

            insert_info.setString(1, firstname);
            insert_info.setString(2, lastname);
            insert_info.setString(3, email);
            insert_info.setString(4, password);
            insert_info.setString(5, username);
            insert_info.executeUpdate();
            request.getRequestDispatcher("Login.html").forward(request, response);
        }
    } catch (SQLException e) {

    }

%>


</body>
</html>
