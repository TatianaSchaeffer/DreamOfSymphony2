package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ingreso_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/dream.css\" type=\"text/css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1></h1>\r\n");
      out.write("        <h2>INGRESO PRODUCTO</h2> <br>\r\n");
      out.write("       \r\n");
      out.write("        <div>\r\n");
      out.write("            <div align-items: flex-start>\r\n");
      out.write("                <div class=\"form-row\"> \r\n");
      out.write("                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                        <label for=\"inputCodigo\">Codigo Producto</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"CodigoP\" >\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                       <label for=\"Cliente\">Cliente</label>\r\n");
      out.write("                       <input type=\"text\" class=\"form-control\" id=\"Cliente\" >\r\n");
      out.write("                    </div>    \r\n");
      out.write("                </div>\r\n");
      out.write("                 \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"Direccion\">Direccion</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"Direccion\">\r\n");
      out.write("                </div>\r\n");
      out.write("                 \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"Telefono\">Telefono</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"Telefono\">\r\n");
      out.write("                </div>\r\n");
      out.write("    \r\n");
      out.write("                <div class=\"form-group col-md-4\">\r\n");
      out.write("                    <label for=\"inputState\">Metodo De Pago</label>\r\n");
      out.write("                    <select id=\"inputState\" class=\"form-control\">\r\n");
      out.write("                        <option selected>.....</option>\r\n");
      out.write("                        <option>Transferencia</option>\r\n");
      out.write("                        <option>Cheque</option>\r\n");
      out.write("                        <option>Efectivo</option>\r\n");
      out.write("                        <option>Debito</option>\r\n");
      out.write("                        <option>Credito</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>  \r\n");
      out.write("             \r\n");
      out.write("                <div class=\"modal fade\" id=\"AgregarPro\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("                    <div class=\"modal-dialog modal-lg\" role=\"document\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("                                <h4 class=\"modal-title\" id=\"myModalLabel\">Buscar productos</h4>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"modal-body\">\r\n");
      out.write("                                <form class=\"form-horizontal\">\r\n");
      out.write("                                    <div class=\"form-group\">                                              \r\n");
      out.write("                                        <div class=\"col-sm-6\">\r\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"filtrar\" placeholder=\"Buscar productos\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <a href=\"#\" id=\"bus\"><i class='glyphicon glyphicon-search'></i> Buscar</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>                 \r\n");
      out.write("                                <div class=\"outer_div\">                                          \r\n");
      out.write("                                    <div class=\"table-responsive\">\r\n");
      out.write("                                        <table class=\"table\">\r\n");
      out.write("                                            <tbody class=\"buscar\">    \r\n");
      out.write("                                                <tr  class=\"warning\">\r\n");
      out.write("                                                    <th>Código</th>\r\n");
      out.write("                                                    <th>Producto</th>\r\n");
      out.write("                                                    <th>Marca</th>  \r\n");
      out.write("                                                    <th><span class=\"pull-right\">Cant.</span></th>\r\n");
      out.write("                                                    <th><span class=\"pull-right\">Precio</span></th>\r\n");
      out.write("                                                    <th class='text-center' style=\"width: 36px;\">Agregar</th>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                            </tbody>\r\n");
      out.write("                                        </table>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" formaction=\"\">Añadir Producto</button>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Nuevo Cliente</button>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <table class=\"table table-condensed\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                       <th>Codigo</th>\r\n");
      out.write("                       <th>Cantidad</th>\r\n");
      out.write("                       <th>Descripcion</th>\r\n");
      out.write("                       <th>Precio UNIT.</th>\r\n");
      out.write("                       <th>Precio Total</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("       \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
