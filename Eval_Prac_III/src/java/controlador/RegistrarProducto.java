/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.IProducto;
/**
 *
 * @author acer1
 */
public class RegistrarProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrarProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrarProducto at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idP = Integer.parseInt(request.getParameter("txtIdP")) ;
        String nombreP = request.getParameter("txtNombreP");
        String desProducto = request.getParameter("txtDesProducto");
        double stock = Double.parseDouble(request.getParameter("txtStock")) ;
        double precio = Double.parseDouble(request.getParameter("txtPrecio"));
        String unidadDeMedida = request.getParameter("txtUnidadDeMedida");
        int estadoP = Integer.parseInt(request.getParameter("txtEstadoP"));
        int categoria = Integer.parseInt(request.getParameter("txtCategoria"));
      
       
      
        
        IProducto producto = new IProducto();
        producto.setIdP(idP);
        producto.setNombreP(nombreP);
        producto.setDesProducto(desProducto);
        producto.setStock(stock);
        producto.setPrecio(precio);
        producto.setUnidadDeMedida(unidadDeMedida);
        producto.setEstadoP(estadoP);
        producto.setCategoria(categoria);
        
       
     
        
        if(producto.insertarDatosP() == true) {
            request.getRequestDispatcher("Registro.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("noRegistro.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
