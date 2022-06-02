<%-- 
    Document   : PageEliminar
    Created on : 05-31-2022, 12:33:33 PM
    Author     : acer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eliminar Registro</h1>
        
        <h1>Ingrese el DUI del registro a Eliminar</h1>
         <form action= "eliminar.do" method="POST">
           ID:  <input type="text" name="txtId" value="" /><br><br>
        <input type="submit" value="Eliminar" />
        </form>
    </body>
</html>
