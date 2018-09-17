<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post">
            INPUT AGE <input type="text" name="number" value="${numb}"><br>
            ${done}
            ${message}
            <input type="submit" value="Submit">
            
        </form>
        <div>
            <a href ="arithmetic"> arithmeticCalculator
        </div>
        
    </body>
</html>
