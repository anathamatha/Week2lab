<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 17, 2018, 4:05:15 PM
    Author     : 731866
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method ="post">
        First:<input type="text" name="number" value="${numb1}"><br>
        Second:<input type="text" name="number2" value="${numb2}"><br>
            <input type="submit" value="+" name="OPS">
            <input type="submit" value="-"name="OPS">
            <input type="submit" value="*"name="OPS">
            <input type="submit" value="%"name="OPS">
            <br>
            result: ${answer} 
            ${message}
         
         
         
         </form>
         
    </body>
</html>
