package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: aqua; \n");
      out.write("            }\n");
      out.write("           </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>Registrar Categoria</h1>\n");
      out.write("        <form action=\"registrarcategoria.do\" method=\"POST\">\n");
      out.write("            ID: <input type=\"text\" name=\"txtId\" value=\"\" /><br><br>\n");
      out.write("       Nombre: <input type=\"text\" name=\"txtNombre\" value=\"\" /><br><br>\n");
      out.write("       Estado: <input type=\"text\" name=\"txtEstado\" value=\"\" /><br><br>\n");
      out.write("       <input type=\"submit\" value=\"Guardar\"/>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"mostrar.do\" method=\"POST\">\n");
      out.write("            <input type=\"submit\" value=\"Mostrar\"/>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("            <a href=\"/Eval_Prac_III/PageEliminar.jsp\">Eliminar</a>\n");
      out.write("        <a href=\"/Eval_Prac_III/PageModificar.jsp\">Modificar</a>\n");
      out.write("        \n");
      out.write("        <h1>Registrar Producto</h1>\n");
      out.write("        <form action=\"registrarproducto.do\" method=\"POST\">                                                    \n");
      out.write("        ID: <input type=\"text\" name=\"txtIdP\" value=\"\" /><br><br>\n");
      out.write("        Nombre: <input type=\"text\" name=\"txtNombreP\" value=\"\" /><br><br>\n");
      out.write("        DesProducto: <input type=\"text\" name=\"txtDesProducto\" value=\"\" /><br><br>\n");
      out.write("        Stock: <input type=\"text\" name=\"txtStock\" value=\"\" /><br><br>\n");
      out.write("        Precio: <input type=\"text\" name=\"txtPrecio\" value=\"\" /><br><br>\n");
      out.write("        Unidad de Medida: <input type=\"text\" name=\"txtUnidadDeMedida\" value=\"\" /><br><br>\n");
      out.write("        EstadoP: <input type=\"text\" name=\"txtEstadoP\" value=\"\" /><br><br>\n");
      out.write("        Categoria: <input type=\"text\" name=\"txtCategoria\" value=\"\" /><br><br>\n");
      out.write("        Fecha: <input type=\"text\" name=\"txtFecha\" value=\"\" /><br><br>\n");
      out.write("       <input type=\"submit\" value=\"Guardar\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
