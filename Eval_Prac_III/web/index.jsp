

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-color: aqua; 
            }
           </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Registrar Categoria</h1>
        <form action="registrarcategoria.do" method="POST">
            ID: <input type="text" name="txtId" value="" /><br><br>
       Nombre: <input type="text" name="txtNombre" value="" /><br><br>
       Estado: <input type="text" name="txtEstado" value="" /><br><br>
       <input type="submit" value="Guardar"/>
        </form>
        <form action="mostrar.do" method="POST">
            <input type="submit" value="Mostrar"/>
        </form>
        
            <a href="/Eval_Prac_III/PageEliminar.jsp">Eliminar</a>
        <a href="/Eval_Prac_III/PageModificar.jsp">Modificar</a>
        
        <h1>Registrar Producto</h1>
        <form action="registrarproducto.do" method="POST">                                                    
        ID: <input type="text" name="txtIdP" value="" /><br><br>
        Nombre: <input type="text" name="txtNombreP" value="" /><br><br>
        DesProducto: <input type="text" name="txtDesProducto" value="" /><br><br>
        Stock: <input type="text" name="txtStock" value="" /><br><br>
        Precio: <input type="text" name="txtPrecio" value="" /><br><br>
        Unidad de Medida: <input type="text" name="txtUnidadDeMedida" value="" /><br><br>
        EstadoP: <input type="text" name="txtEstadoP" value="" /><br><br>
        Categoria: <input type="text" name="txtCategoria" value="" /><br><br>
       
       <input type="submit" value="Guardar"/>
        </form>
    </body>
</html>
