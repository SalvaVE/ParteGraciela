
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.ICategoria;


public class RegistrarCategoria extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("txtId")) ;
        String nombre = request.getParameter("txtNombre");
        int estado = Integer.parseInt(request.getParameter("txtEstado"));
        
        ICategoria categoria = new ICategoria();
        categoria.setId(id);
        categoria.setNombre(nombre);
        categoria.setEstado(estado);
        
        
        
        if(categoria.insertarDatos() == true) {
            request.getRequestDispatcher("RegistroExito.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("RegistrarnoExito.jsp").forward(request, response);
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
