package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class consumo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String sueldohora;
            String dia1, dia2, dia3, dia4, dia5, dia6, dia7, con;
        
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"consumo.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"valor\">Valor por hora: </label>\n");
      out.write("                <input type=\"text\" name=\"valor\"/>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"valor\">Horas Trabajadas día Lunes: </label>\n");
      out.write("                <input type=\"text\" name=\"lunes\"/>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"valor\">Horas Trabajadas día Martes: </label>\n");
      out.write("                <input type=\"text\" name=\"martes\"/>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"valor\">Horas Trabajadas día Miércoles: </label>\n");
      out.write("                <input type=\"text\" name=\"miercoles\"/>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"valor\">Horas Trabajadas día Jueves: </label>\n");
      out.write("                <input type=\"text\" name=\"jueves\"/>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"valor\">Horas Trabajadas día Viernes: </label>\n");
      out.write("                <input type=\"text\" name=\"viernes\"/>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"valor\">Horas Trabajadas día Sábado: </label>\n");
      out.write("                <input type=\"text\" name=\"sabado\"/>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"valor\">Horas Trabajadas día Domingo: </label>\n");
      out.write("                <input type=\"text\" name=\"domingo\"/>\n");
      out.write("                <br>\n");
      out.write("                <label for=\"valor\">Digite 1 si desea saber el sueldo o digite 2 si desea ver las horas de la semana: </label>\n");
      out.write("                <input type=\"text\" name=\"menu\"/>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Calcular</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
sueldohora = request.getParameter("valor");
      out.write("\n");
      out.write("        ");
dia1 = request.getParameter("lunes");
      out.write("\n");
      out.write("        ");
dia2 = request.getParameter("martes");
      out.write("\n");
      out.write("        ");
dia3 = request.getParameter("miercoles");
      out.write("\n");
      out.write("        ");
dia4 = request.getParameter("jueves");
      out.write("\n");
      out.write("        ");
dia5 = request.getParameter("viernes");
      out.write("\n");
      out.write("        ");
dia6 = request.getParameter("sabado");
      out.write("\n");
      out.write("        ");
dia7 = request.getParameter("domingo");
      out.write("\n");
      out.write("        ");
con = request.getParameter("menu");
      out.write("\n");
      out.write("\n");
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
