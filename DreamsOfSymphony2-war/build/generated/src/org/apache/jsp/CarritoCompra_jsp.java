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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h2>Shopping-cart Glyph</h2>\n");
      out.write("      <p>Shopping-cart icon: <span class=\"glyphicon glyphicon-shopping-cart\"></span></p>    \n");
      out.write("      <p>Shopping-cart icon as a link:\n");
      out.write("        <a href=\"#\">\n");
      out.write("          <span class=\"glyphicon glyphicon-shopping-cart\"></span>\n");
      out.write("        </a>\n");
      out.write("      </p>\n");
      out.write("      <p>Shopping-cart icon on a button:\n");
      out.write("        <button type=\"button\" class=\"btn btn-default btn-sm\">\n");
      out.write("          <span class=\"glyphicon glyphicon-shopping-cart\"></span> Shopping Cart\n");
      out.write("        </button>\n");
      out.write("      </p>\n");
      out.write("      <p>Shopping-cart icon on a styled link button:\n");
      out.write("        <a href=\"#\" class=\"btn btn-info btn-lg\">\n");
      out.write("          <span class=\"glyphicon glyphicon-shopping-cart\"></span> Shopping Cart\n");
      out.write("        </a>\n");
      out.write("      </p> \n");
      out.write("      <p>Unicode:\n");
      out.write("        <span class=\"glyphicon\">&#xe116;</span>\n");
      out.write("      </p> \n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
