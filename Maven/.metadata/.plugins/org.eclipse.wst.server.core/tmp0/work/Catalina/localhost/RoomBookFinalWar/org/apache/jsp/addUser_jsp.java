/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2018-01-13 12:58:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Signup - Room Booking Calendar</title>\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">\r\n");
      out.write("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"css/bootstrap-responsive.min.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"css/pages/signin.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<!-- <script type=\"text/javascript\" src=\"jquery-1.7.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"> -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"sweet-alert.css\">\r\n");
      out.write("<script src=\"js/sweet-alert.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t/* alert(\"inside function\"); */\r\n");
      out.write("\tif(");
      out.print(request.getAttribute("inserted"));
      out.write("==false)\r\n");
      out.write("\t{sweetAlertInitialize();\r\n");
      out.write("\t sweetAlert(\"Oops...!\", \"UserName already exists..!!Please enter another UserName\");\r\n");
      out.write("\t \t//alert(\"UserName already exists..!!Please enter another UserName\"); \r\n");
      out.write("/* \t \talert(\"firstname:\"+name);   */\r\n");
      out.write("\t$(\"#firstname\").val('");
      out.print(request.getAttribute("firstname"));
      out.write("');\r\n");
      out.write("\t\t$(\"#lastname\").val('");
      out.print(request.getAttribute("lastname"));
      out.write("');\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"navbar-inner\">\r\n");
      out.write("\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"PSLLogo.jpg\" width=\"70px\" height=\"70px\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a class=\"btn btn-navbar\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".nav-collapse\"> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</a> <a class=\"brand\" href=\"adminUser.jsp\"> Room Booking Calendar </a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"nav-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav pull-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"\"><a href=\"adminUser.jsp\" class=\"\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"icon-chevron-left\"></i> Back to Homepage\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /container -->\r\n");
      out.write("\t\t\t<div class=\"right\">\r\n");
      out.write("\t\t\t\t<img alt=\"\" src=\"kc-logo-header (1).png\" width=\"70px\" height=\"70px\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /navbar-inner -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /navbar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"account-container register\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"content clearfix\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form action=\"UserController\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h1>Add User</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"login-fields\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p>Create User Account</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- \t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"userid\" name=\"userid\" value=\"\" placeholder=\"User ID\" class=\"login\" required=\"required\" />\r\n");
      out.write("\t\t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"firstname\" name=\"firstname\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"First Name\" class=\"login\" required />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /field -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"lastname\" name=\"lastname\" value=\"\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Last Name\" class=\"login\" required=\"required\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /field -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- \t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" id=\"designation\" name=\"designation\" value=\"\" placeholder=\"Designation\" class=\"login\" required=\"required\"/>\r\n");
      out.write("\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"email\">Username:</label> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"username\" name=\"username\" value=\"\" placeholder=\"Username\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"login\" required=\"required\" /><span id=\"available\"\r\n");
      out.write("\t\t\t\t\t\t\thidden=\"true\">@@@@@@@@@@@@</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /field -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"password\">Password:</label> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"password\" name=\"password\" value=\"\" placeholder=\"Password\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"login\" required=\"required\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /field -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- /field -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"field\">\r\n");
      out.write("\t\t\t\t\t\tUser Type: <span></span><select name=\"usertype\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>Administrator</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Application</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /login-fields -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"login-actions\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<button class=\"button btn btn-primary btn-large\">Register</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- .actions -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /content -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /account-container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Text Under Box -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- <script src=\"js/jquery-1.7.2.min.js\"></script> -->\r\n");
      out.write("\t<!-- <script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/signin.js\"></script>\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
