/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-05-10 08:26:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<title>东软客户关系管理系统</title>\r\n");
      out.write("\t<!-- build:css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"layui/css/layui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"layui/css/kitadmin.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"layui/css/nprogress.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- endbuild -->\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"layui-layout-body\">\r\n");
      out.write("\t<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<div class=\"layui-header\">\r\n");
      out.write("\t\t\t<div class=\"layui-logo\">\r\n");
      out.write("\t\t\t\t<div class=\"layui-logo-toggle\" kit-toggle=\"side\" data-toggle=\"on\">\r\n");
      out.write("\t\t\t\t\t<i class=\"layui-icon\">&#xe65a;</i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"layui-logo-brand\" style=\"width: 174px;\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#/\">客户关系管理系统</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- <div class=\"layui-layout-left\">\r\n");
      out.write("\t\t\t\t<div class=\"kit-search\">\r\n");
      out.write("\t\t\t\t\t<form action=\"/\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"keyword\" class=\"kit-search-input\" placeholder=\"关键字...\" />\r\n");
      out.write("\t\t\t\t\t\t<button class=\"kit-search-btn\" title=\"搜索\" type=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"layui-icon\">&#xe615;</i>\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div> -->\r\n");
      out.write("\t\t\t<div class=\"layui-layout-right\">\r\n");
      out.write("\t\t\t\t<ul class=\"kit-nav\" lay-filter=\"header_right\">\r\n");
      out.write("\t\t\t\t\t<li class=\"kit-item\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"layui-icon\">&#xe607;</i>\r\n");
      out.write("\t\t\t\t\t\t\t<span>帮助</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"kit-item\" id=\"ccleft\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"layui-icon\">&#xe60e;</i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"kit-item\" id=\"cc\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"layui-icon\">&#xe64c;</i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"kit-item\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.account }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"kit-nav-child kit-nav-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"kit-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#/userInfo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"layui-icon\">&#xe612;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>个人中心</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"kit-item\" kit-target=\"setting\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"javascript:;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"layui-icon\">&#xe614;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>设置</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"kit-nav-line\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"kit-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"user/logout\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"layui-icon\">&#x1006;</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>注销</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- silds -->\r\n");
      out.write("\t\t<div class=\"layui-side\" kit-side=\"true\">\r\n");
      out.write("\t\t\t<div class=\"layui-side-scroll\">\r\n");
      out.write("\t\t\t\t<div id=\"menu-box\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"kit-menu\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- main -->\r\n");
      out.write("\t\t<div class=\"layui-body\" kit-body=\"true\">\r\n");
      out.write("\t\t\t<router-view></router-view>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t<div class=\"layui-footer\" kit-footer=\"true\">\r\n");
      out.write("\t\t\t2021 © msy.plus MIT license\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- build:js -->\r\n");
      out.write("\t<script src=\"layui/polyfill.min.js\"></script>\r\n");
      out.write("\t<script src=\"layui/layui.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"https://cdn.bootcss.com/echarts/4.1.0.rc2/echarts.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- <script src=\"layui/kitadmin.js\"></script> -->\r\n");
      out.write("\t<!-- endbuild -->\r\n");
      out.write("\t<!-- build:use -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tlayui.config({\r\n");
      out.write("\t\t\tbase: 'js/'\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}).use('index');\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t   layui.use([ 'element'], function() {\r\n");
      out.write("\t\t   var element = layui.element;\r\n");
      out.write("\t\t   var $ = layui.jquery;\r\n");
      out.write("\t\t   $.ajax({\r\n");
      out.write("\t\t\t  url : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/role/getRolePermissionMenu',\r\n");
      out.write("\t\t\t  type : 'POST',\r\n");
      out.write("\t\t\t  async : false,\r\n");
      out.write("\t\t\t  dataType : 'json',\r\n");
      out.write("\t\t\t  success : function(data){\r\n");
      out.write("\t\t\t\t  var html = '';\r\n");
      out.write("\t\t\t\t  routeOpts.routes = [];\r\n");
      out.write("\t\t\t\t  $(\"#menu-box\").html('');\r\n");
      out.write("\t\t\t\t  //构建树形菜单\r\n");
      out.write("\t\t\t\t  if(data.permission.length > 0){\r\n");
      out.write("\t\t\t\t\t  html += addMenu(data.permission,\"<ul class='kit-menu'>\");\r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t  $(\"#menu-box\").html(html);\r\n");
      out.write("\t\t\t\t  console.log(routeOpts);\r\n");
      out.write("\t\t\t\t  element.render('nav');\r\n");
      out.write("\t\t\t  }\r\n");
      out.write("\t\t   });\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t   //添加菜单\r\n");
      out.write("\t\t   function addMenu(menuArray,ulClass){\r\n");
      out.write("\t\t\t   var html = '';\r\n");
      out.write("\t\t\t   html += ulClass;\r\n");
      out.write("\t\t\t   //用于添加首页菜单\r\n");
      out.write("\t\t\t   var flag = 0;\r\n");
      out.write("\t\t\t   //根据class来判断是否为顶级菜单\r\n");
      out.write("\t\t\t   if(ulClass == \"<ul class='kit-menu'>\"){\r\n");
      out.write("\t\t\t\t   flag = 1;\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t\t   for(var i = 0 ; i < menuArray.length ; i++){\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   if(flag == 1){\r\n");
      out.write("                       var index = {'path': '/', 'component':'views/app.jsp','name':'首页'};\r\n");
      out.write("                       routeOpts.routes.push(index);\r\n");
      out.write("                       html += \"<li class='kit-menu-item'>\";\r\n");
      out.write("                       html += \"<a href='#/'>\";\r\n");
      out.write("                       html += \"<span>首页</span>\";\r\n");
      out.write("                       html += \"</a>\";\r\n");
      out.write("                       html += \"</li>\";\r\n");
      out.write("                       flag = 0;\r\n");
      out.write("                   }\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   var url_split = '';\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   if(menuArray[i].childPermission.length <= 0 ){\r\n");
      out.write("\t\t\t\t\t   var url_str =  menuArray[i].url.split('/');\r\n");
      out.write("\t\t\t\t\t   url_split = url_str[url_str.length-1].split('.jsp')[0];\r\n");
      out.write("\t\t\t\t\t   var route = {'path': '/'+ url_split , 'component':menuArray[i].url ,'name':menuArray[i].title};\r\n");
      out.write("\t\t\t\t\t   routeOpts.routes.push(route);\r\n");
      out.write("\t\t\t\t   }\r\n");
      out.write("\t\t\t\t    \r\n");
      out.write("\t\t\t\t   html += \"<li class='kit-menu-item'>\";\r\n");
      out.write("\t\t\t\t   if(menuArray[i].childPermission.length > 0 ){\r\n");
      out.write("\t\t\t\t\t   html += \"<a href='javascript:;'>\";\r\n");
      out.write("\t\t\t\t   }else{\r\n");
      out.write("\t\t\t\t\t   html += \"<a href='#/\"+url_split+\"'>\";\r\n");
      out.write("\t\t\t\t   }\r\n");
      out.write("\t\t\t\t   html += \"<span>\"+menuArray[i].title+\"</span>\";\r\n");
      out.write("\t\t\t\t   html += \"</a>\";\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t   if(menuArray[i].childPermission.length > 0 ){\r\n");
      out.write("\t\t\t\t\t   html += addMenu(menuArray[i].childPermission,\"<ul class='kit-menu-child kit-menu-child layui-anim'>\");\r\n");
      out.write("\t\t\t\t   }\r\n");
      out.write("\t\t\t\t   html += \"</li>\";\r\n");
      out.write("\t\t\t   }\r\n");
      out.write("\t\t\t   html += \"</ul>\";\r\n");
      out.write("\t\t\t   return html;\r\n");
      out.write("\t\t   }\r\n");
      out.write("\t\t   \r\n");
      out.write("\t   });\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- endbuild -->\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
