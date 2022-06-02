

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ingrese los valores a modificar</h1>
        
        <form action="modificar.do" method="POST">
            ID: <input type="text"  name="txtId" value="" /> <br><br>
           Nombre: <input type="text" name="txtNombre" value="" /><br><br>
           Estado: <input type="text" name="txtEstado" value="" /><br><br>
        <input type="submit" value="Modificar"/>
        </form>
    </body>
</html>
