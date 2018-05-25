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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/dream.css\" type=\"text/css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <body>\n");
      out.write("        <h1></h1>\n");
      out.write("        <label >INGRESO PRODUCTO</label> <br>\n");
      out.write("       \n");
      out.write("       <div>\n");
      out.write("         <div align-items: flex-start>\n");
      out.write("           <div class=\"form-row\"> \n");
      out.write("             <div class=\"form-group col-md-6\">\n");
      out.write("                <label for=\"inputCodigo\">Codigo Producto</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"CodigoP\" >\n");
      out.write("             </div>\n");
      out.write("             <div class=\"form-group col-md-6\">\n");
      out.write("                <label for=\"Cliente\">Cliente</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"Cliente\" >\n");
      out.write("             </div>    \n");
      out.write("           </div>\n");
      out.write("                 \n");
      out.write("           <div class=\"form-group\">\n");
      out.write("               <label for=\"Direccion\">Direccion</label>\n");
      out.write("               <input type=\"text\" class=\"form-control\" id=\"Direccion\">\n");
      out.write("           </div>\n");
      out.write("                 \n");
      out.write("           <div class=\"form-group\">\n");
      out.write("               <label for=\"Telefono\">Telefono</label>\n");
      out.write("               <input type=\"text\" class=\"form-control\" id=\"Telefono\">\n");
      out.write("           </div>\n");
      out.write("    \n");
      out.write("             <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"inputState\">Metodo De Pago</label>\n");
      out.write("                 <select id=\"inputState\" class=\"form-control\">\n");
      out.write("                    <option selected>.....</option>\n");
      out.write("                    <option>Transferencia</option>\n");
      out.write("                    <option>Cheque</option>\n");
      out.write("                    <option>Efectivo</option>\n");
      out.write("                    <option>Debito</option>\n");
      out.write("                   <option>Credito</option>\n");
      out.write("                 </select>\n");
      out.write("                \n");
      out.write("             </div>  \n");
      out.write("           <div class=\"modal fade\" id=\"AgregarPro\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("    <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("    <h4 class=\"modal-title\" id=\"myModalLabel\">Buscar productos</h4>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-body\">\n");
      out.write("    <form class=\"form-horizontal\">\n");
      out.write("    <div class=\"form-group\">                                              \n");
      out.write("    <div class=\"col-sm-6\">\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"filtrar\" placeholder=\"Buscar productos\">\n");
      out.write("    </div>\n");
      out.write("    <a href=\"#\" id=\"bus\"><i class='glyphicon glyphicon-search'></i> Buscar</a>\n");
      out.write("                  </div>\n");
      out.write("                </form>                 \n");
      out.write("                                  <div class=\"outer_div\">                                          \n");
      out.write("                                     \n");
      out.write("                                        <div class=\"table-responsive\">\n");
      out.write("                                        <table class=\"table\">\n");
      out.write("                                            <tbody class=\"buscar\">    \n");
      out.write("                                        <tr  class=\"warning\">\n");
      out.write("                                            <th>Código</th>\n");
      out.write("                                            <th>Producto</th>\n");
      out.write("                                            <th>Marca</th>  \n");
      out.write("                                            <th><span class=\"pull-right\">Cant.</span></th>\n");
      out.write("                                            <th><span class=\"pull-right\">Precio</span></th>\n");
      out.write("                                            <th class='text-center' style=\"width: 36px;\">Agregar</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        </div>\n");
      out.write("                                  </div>\n");
      out.write("              </div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>       \n");
      out.write("           \n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\" formaction=\"\">Añadir Producto</button>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Nuevo Cliente</button>\n");
      out.write("      \n");
      out.write("      </form>\n");
      out.write("               <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\n");
      out.write("       \n");
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
