package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Pega</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\" />\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link href=\"css/app.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"navbar navbar-custom navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("    <div class=\"container\"> \r\n");
      out.write("         <div class=\"navbar-header\">\r\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span>\r\n");
      out.write("                <span class=\"icon-bar\"></span> \r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"https://www.pega.com\"><img src=\"resources/pegalogo.jpg\" alt=\"Pega\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <h1 class=\"navbar-text\">Pega Hiring Portal</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-user\"></span> \r\n");
      out.write("                        <strong>Yamini</strong>\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-chevron-down\"></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <div class=\"navbar-login\">\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-lg-4\">\r\n");
      out.write("                                        <p class=\"text-center\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-user icon-size\"></span>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-8\">\r\n");
      out.write("                                        <p class=\"text-left\"><strong class=\"userDetails\">Yamini Thota</strong></p>\r\n");
      out.write("                                        <p class=\"text-left small userDetails\">yamini10.thota@gmail.com</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"text-left\">\r\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-primary btn-block btn-sm\">Profile</a>\r\n");
      out.write("                                        </p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider navbar-login-session-bg\"></li>\r\n");
      out.write("                         <li><a href=\"#\">Account Settings <span class=\"glyphicon glyphicon-cog pull-right\"></span></a></li>\r\n");
      out.write("            <li class=\"divider\"></li>\r\n");
      out.write("            <li><a href=\"#\">Messages <span class=\"badge pull-right\"> 2 </span></a></li>\r\n");
      out.write("            <li class=\"divider\"></li>\r\n");
      out.write("            <li><a href=\"#!/login\">Sign Out <span class=\"glyphicon glyphicon-log-out pull-right\"></span></a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div role=\"main\" class=\"container theme-showcase\" id=\"mainContainer\">\r\n");
      out.write(" <div class=\"\" style=\"margin-top:10px;\">\r\n");
      out.write("    <div class=\"bs-component\">\r\n");
      out.write("      <sql:setDataSource\r\n");
      out.write("        var=\"myDS\"\r\n");
      out.write("        driver=\"com.mysql.jdbc.Driver\"\r\n");
      out.write("        url=\"jdbc:mysql://localhost:3307/hiringportal\"\r\n");
      out.write("        user=\"root\" password=\"root\"\r\n");
      out.write("    />\r\n");
      out.write("    <sql:query var=\"listUsers\"   dataSource=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${myDS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("        SELECT * FROM employees;\r\n");
      out.write("    </sql:query>\r\n");
      out.write("    <div align=\"center\">\r\n");
      out.write("        <table border=\"1\" cellpadding=\"5\">\r\n");
      out.write("            <caption><h2>List of JobSeekers</h2></caption>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>ID</th>\r\n");
      out.write("                <th>Name</th>\r\n");
      out.write("                <th>Skills</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <c:forEach var=\"employees\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listUsers.rows}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employees.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employees.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("                    <td><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${employees.skills}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </c:forEach>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write(" </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
