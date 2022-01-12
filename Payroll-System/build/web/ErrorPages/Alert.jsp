<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@page import="Data.result_Data" %>
<jsp:useBean id="result_obj" class="Data.result_Data" scope="session"></jsp:useBean>
<html>
<body>
    <script src="../plugin/sweetalert.min.js" type="text/javascript"></script>
        
<script>
    (function f() {
        swal({
            title: "Warning",
            text: "<%="Salary to date is worng"%>",
            dangerMode: true,
        })
    })();
</script>
</body>
</html>
