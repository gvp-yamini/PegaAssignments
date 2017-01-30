package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Pega</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\" />\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link href=\"css/app.css\" rel=\"stylesheet\" />\r\n");
      out.write("<body>\r\n");
      out.write("<script>\r\n");
      out.write(" function validateUsername(){\r\n");
      out.write("\t var text = document.getElementByname(\"user\").value;\r\n");
      out.write("\t if(text==\"\"){\r\n");
      out.write("\t\t document.getElementById(\"errorusername\").innerHTML = \"Provide Username\";\r\n");
      out.write("\t\t document.getElementById(\"errorusername\").style.color = \"red\";\r\n");
      out.write("\t }\r\n");
      out.write(" }\r\n");
      out.write(" function validatePassword(){\r\n");
      out.write("\t var text = document.getElementByname(\"pass\").value;\r\n");
      out.write("\t if(text==\"\"){\r\n");
      out.write("\t\t document.getElementById(\"errorpassword\").innerHTML = \"Provide Password\";\r\n");
      out.write("\t\t document.getElementById(\"errorpassword\").style.color = \"red\";\r\n");
      out.write("\t } \r\n");
      out.write(" }\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"navbar navbar-custom navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("    <div class=\"container\"> \r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span> \r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"https://www.pega.com\"><img src=\"resources/pegalogo.jpg\" alt=\"Pega\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <h1 class=\"navbar-text\">Pega Hiring Portal</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<hr/>\r\n");
      out.write("         <div class=\"rightContainer\">\r\n");
      out.write("   <div class=\"row\">\r\n");
      out.write("       <div class=\"col-sml-12\">\r\n");
      out.write("                   <div class=\"form\">\r\n");
      out.write("\t\t\t\t\t<form method=\"post\" action=\"MyServlet\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\"  name=\"user\" placeholder=\"username\" onblur=\"validateUsername();\"/>\r\n");
      out.write("\t\t\t\t\t\t<label id=\"errorusername\"></label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\"  name=\"pass\" placeholder=\"password\" onblur=\"validatePassword();\"/>\r\n");
      out.write("\t\t\t\t\t\t<label id = \"errorpassword\"></label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Login\" style=\"background: #192980; color: #FFFFFF;\" />\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Create an account</a> &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Forgot Password</a>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
