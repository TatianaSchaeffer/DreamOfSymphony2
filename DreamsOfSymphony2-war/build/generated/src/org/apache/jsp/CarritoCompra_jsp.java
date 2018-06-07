package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CarritoCompra_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" integrity=\"sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB\" crossorigin=\"anonymous\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("       <div>\r\n");
      out.write("          <h2>Tu Carro de Compras</h2></div>\r\n");
      out.write("    <table class=\"table table-bordered\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">Nombre del Producto</th>\r\n");
      out.write("      <th scope=\"col\">Precio</th>\r\n");
      out.write("      <th scope=\"col\">Cant.</th>\r\n");
      out.write("      <th scope=\"col\">Subtotal</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\"><img class=\"d-block w-100\" src=\"img/Oferta1.jpg\"><</th>\r\n");
      out.write("      \r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\"><a href=\"\"> Guitarra Eléctrica Queen SFV09 tipo Flying V</a></th>\r\n");
      out.write("      <th scope=\"col-md\" >$159.000   </th>\r\n");
      out.write("      <th scope=\"col-md\" > <input type=\"text\" size=\"2\" placeholder=\"1\"></th>\r\n");
      out.write("      <th scope=\"col-md\" >$159.000   </th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("      \r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("      <div class=\"card\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">Codigos de Descuento</h5>\r\n");
      out.write("    <p class=\"card-text\">Ingrese un codigo de Cupón, si tiene.</p>\r\n");
      out.write("    <input type=\"text\" size=\"40\">\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-primary\">Aplicar Cupón</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-md-3\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"card-body\">\r\n");
      out.write("    <h5 class=\"card-title\">Subtotal : $159.000</h5>\r\n");
      out.write("    <h5 class=\"card-title\">Suma Total : $159.000</h5>\r\n");
      out.write("    <p class=\"card-text\">Revise antes de aplicar el boton compra</p>\r\n");
      out.write("    <a href=\"#\" class=\"btn btn-info btn-lg\">\r\n");
      out.write("          <span class=\"glyphicon glyphicon-ok-sign\"></span> Comprar\r\n");
      out.write("        </a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\" integrity=\"sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("  </body>\r\n");
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
