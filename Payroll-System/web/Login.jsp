<%@page import="Data.Conn"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    String password = request.getParameter("password");
    String username = request.getParameter("user_email");
    try {
        Conn c = new Conn();
        Connection connection = c.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username=? and password=?");

        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            request.getRequestDispatcher("Login.html").include(request, response);

        } else {
            request.getRequestDispatcher("New calculate.html").forward(request, response);

        }
        connection.close();
    } catch (SQLException e) {

    }

%>