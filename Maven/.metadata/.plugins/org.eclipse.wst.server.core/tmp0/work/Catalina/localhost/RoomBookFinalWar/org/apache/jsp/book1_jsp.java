/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2018-01-13 13:03:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>Booking Form - Room Booking Calendar</title>\r\n");
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
      out.write("<!-- <link href=\"css/pages/book.css\" rel=\"stylesheet\" type=\"text/css\"> -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"sweet-alert.css\">\r\n");
      out.write("<script src=\"js/sweet-alert.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t $(document).ready(function () {\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t Date.prototype.toDateInputValue = (function() {\r\n");
      out.write("\t\t\t    var local = new Date(this);\r\n");
      out.write("\t\t\t    local.setMinutes(this.getMinutes() - this.getTimezoneOffset());\r\n");
      out.write("\t\t\t    return local.toJSON().slice(0,10);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t if(");
      out.print(request.getAttribute("booked"));
      out.write("==false)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\r\n");
      out.write("\t\t\t sweetAlertInitialize();\r\n");
      out.write("\t\t\t sweetAlert(\"Oops...!\", \"Timing & dates are clashing.\\nCheck the dashboard for status and availability\");\r\n");
      out.write("\t\t\t \t/* alert(\"Booking cannot be done..!!\\nTiming & dates are clashing.\\nCheck the dashboard for status\");  */\r\n");
      out.write("\t\t/* \t \talert(\"firstname:\"+name);   */\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t //alert(new Date().toDateInputValue());\r\n");
      out.write("\t\t $('#start_date').prop(\"min\",new Date().toDateInputValue());\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t\t//alert(\"Inside onload\");\r\n");
      out.write("\t\t //Check date and time ranges conditions\r\n");
      out.write("\t\t $(\"#start_date\").blur(function (){\r\n");
      out.write("//\t\t\t\talert($(\"#start_date\").val());\r\n");
      out.write("\t\t\t\t$(\"#end_date\").prop(\"min\",$(\"#start_date\").val());\r\n");
      out.write("\t//\t\t\talert($(\"#end_date\"));\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t $(\"[name=start_time]\").blur(function(){\r\n");
      out.write("\t\t\t//\talert($(\"[name=start_time]\").val());\r\n");
      out.write("\t\t\t\tvar temp=$(\"[name=start_time]\").val();\r\n");
      out.write("\t\t//\t\talert(temp);\r\n");
      out.write("\t\t\t\t$(\"[name=end_time]\").prop(\"min\",temp);\r\n");
      out.write("\t\t\t\t//alert($(\"[name=end_time]\"));\r\n");
      out.write("\t\t });\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t \r\n");
      out.write("\t\t //fullday checkbox code\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t$(\"#fullDay\").click(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\tif($(this).is(':checked'))\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t//\t\t\talert(\"inside checked\");\r\n");
      out.write("\t\t\t\t\t\t\t\t $(\"[name=start_time]\").val(\"09:00\");  // checked\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"[name=start_time]\").attr(\"readonly\", \"true\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"[name=end_time]\").val(\"18:00\");  // checked\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"[name=end_time]\").attr(\"readonly\", \"true\");\r\n");
      out.write("\t\t\t\t\t\t\t\t//$(\"#checkbox1\").attr(\"disabled\", \"disabled\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t//\talert(\"inside UNchecked\");\r\n");
      out.write("\t\t\t\t\t$(\"[name=start_time]\").removeAttr(\"readonly\");\r\n");
      out.write("\t\t\t\t\t$(\"[name=end_time]\").removeAttr(\"readonly\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tif($(\"#fullDay\").is(':checked'))\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t//alert(\"Is checked function\");\r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"[name=start_time]\").attr(\"readonly\", \"true\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"[name=start_time]\").val(\"09:00\");  // checked\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"[name=end_time]\").attr(\"readonly\", \"true\");\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"[name=end_time]\").val(\"18:00\");  // checked\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t//$(\"#checkbox1\").attr(\"disabled\", \"disabled\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t$(\"[name=start_time]\").removeAttr(\"readonly\");\r\n");
      out.write("\t\t\t\t\t$(\"[name=end_time]\").removeAttr(\"readonly\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t \r\n");
      out.write("\t \r\n");
      out.write(" $.ajax(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttype:\"GET\",\r\n");
      out.write("\t\t\t\t\t\t\turl:\"display_location.jsp\",\r\n");
      out.write("\t\t\t\t\t\t\tdata:{loc:$(this).val()},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\tsuccess:function(data)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t//alert('hi');\r\n");
      out.write("\t\t\t\t\t\t\t\t$('#location').html(data);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t/* for(var i=0;i<data.length;i++)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(data[i]);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#roomid\").append(\"<option>\"+data[i]+\"</option>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} */\r\n");
      out.write("\t\t\t\t \t\t\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\terror:function(data,status,error)\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t//\talert(data[1]);\r\n");
      out.write("\t\t\t\t\t\t\t//alert(\"Error occured in ajax\"+error+\":\"+status);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}); \r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t$('select#location').change(function(event) {\r\n");
      out.write("\t\t//alert($(this).val());\r\n");
      out.write("        var loc = $(this).val();\r\n");
      out.write("        /* $.getJSON('display_room.jsp',{selectlocation: $(this).val(), ajax: 'true'}, function() {\r\n");
      out.write("         alert('hi');\r\n");
      out.write("        var select1 = $('select#roomid');\r\n");
      out.write("       // select1.find('option').remove();\r\n");
      out.write("          $.each(response, function(index, value) {\r\n");
      out.write("          $('<option>').val(value).text(value).appendTo(select1);\r\n");
      out.write("      });\r\n");
      out.write("        }); */\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("   $.ajax(\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\ttype:\"GET\",\r\n");
      out.write("\t\t\t\t\t\t\t\turl:\"display_room.jsp\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\tdata:{loc:$(this).val()},\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\tsuccess:function(data)\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t//\t\t\t\t\t\talert('hi');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$('#roomid').html(data);\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t/* for(var i=0;i<data.length;i++)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talert(data[i]);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$(\"#roomid\").append(\"<option>\"+data[i]+\"</option>\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t} */\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t \t},\r\n");
      out.write("\t\t\t\t\t\t\terror:function(data,status,error)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\talert(data[1]);\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"Error occured in ajax\"+error+\":\"+status);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("    \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
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
      out.write("\t<div style=\"width: 50px; height: 50px;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"account-container register\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"content clearfix\"\r\n");
      out.write("\t\t\tstyle=\"width: 380px; height: 650px; border: solid\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form action=\"BookRoomController\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"login-fields\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h1>Book Room</h1>\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t");


Long userid=(Long)session.getAttribute("userid");
String firstname=(String)session.getAttribute("firstname");


      out.write("\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"emp_id\">User Id </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"emp_id\" value=\"");
      out.print(userid);
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"employeeid\" required /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"emp_id\">Owner Name </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"emp_id\" name=\"empName\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(firstname);
      out.write("\" required /></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"room_id\">Location Name </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"location\" id=\"location\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"roomid\">Room Name </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"roomName\" id=\"roomid\" required>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"start_date\">Start Date </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"date\" id=\"start_date\" name=\"sDate\" required></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"end_date\">End Date </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"date\" id=\"end_date\" name=\"eDate\" required></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"training_type\">Training Type</label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><select name=\"training_type\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>ELTP</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>RBT</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option>SLT</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"training_name\">Training Name </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" id=\"training_name\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"training_name\" required></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Full Day Booking</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"checkbox\" id=\"fullDay\" checked=\"checked\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"start_time\">Start Time </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=time id=\"timeStart\" name=\"start_time\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmin=9:00 max=19:00 step=900 required></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><label for=\"end_time\">End Time </label></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"time\" id=\"timeEnd\" name=\"end_time\" min=9:00\r\n");
      out.write("\t\t\t\t\t\t\t\tmax=19:00 step=900 required></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
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
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t<button class=\"button btn btn-primary btn-large\">Book</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- .actions -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t<script src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/signin.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
