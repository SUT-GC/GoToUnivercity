/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2015-11-16 11:31:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ideasource;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class idea_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Idea Source</title>\n");
      out.write("<link href=\"css/idea.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"content\">\n");
      out.write("\t\t<div class=\"content_head\">\n");
      out.write("\t\t\t<h1>项目名称：Go To Univercity</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<div class=\"content_body\">\n");
      out.write("\t\t\t<div class=\"content_body_description\">\n");
      out.write("\t\t\t\t<h2>项目描述:</h2>\n");
      out.write("\t\t\t\t\t<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  当你在考完高考的时候，你是否还在胡乱的翻着《报考指南》这本超过800的仅仅展示了各高校历年录取分数线的书</p>\n");
      out.write("\t\t\t\t\t<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  当你根据预估的分数找到了可能录取你的大学时，你是不是还对这个将要生活四年的大学一无所知？</p>\n");
      out.write("\t\t\t\t\t<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  你找到了心怡的大学，你是不是还需要查询能考的进的专业？然而在此时，你还对“专业”这个词感到无比的陌生。你报了一个专业，却不知道它是干什么的，有什么就业前景，应该学什么？</p>\n");
      out.write("\t\t\t\t\t<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  当你收到大学的录取通知书的时候，你是不是还不知道去学校应该拿什么？应该怎么去学校？你所要抵达的学校具体位置到底在哪里？你是不是想最好有一位学长给你介绍一些在学校生活的经验呢？</p>\n");
      out.write("\t\t\t\t\t<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp  当然，就算你知道了以上所有的信息，你是不是还想知道在你生活的城市，有谁跟你考进了一所大学，考进了一个专业。这样，你们可以结伴而行嘛。。。</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<hr/>\n");
      out.write("\t\t\t<div class=\"content_body_content\">\n");
      out.write("\t\t\t\t<h2>Go To Univercity 就是立志于帮你解决上面所有的问题......</h2>\t\t\n");
      out.write("\t\t\t\t<div class=\"content_body_content_ui\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><p>当你预估完分数（或者知道分数）的时候，输入所估的分数（或者知道分数），它就会根据去年的分数线给你列出可以录取你的高校，你可以根据地域和等级（211 OR 985）进行筛选。</p></li>\n");
      out.write("\t\t\t\t\t\t<li><p>当你想了解某一个可能录取你的高校时，它会把这个学校的官网，贴吧，教务处，地址，与行车路线展现到你的面前。最重要的是它会把该学校前五年的录取分数线形成走势图展现给你。当然还会列出以你的分数可以进入该学校的哪些专业(当然还是依据去年的录取分数线)。</p></li>\n");
      out.write("\t\t\t\t\t\t<li><p>你不了解某个专业？没关系，当你点击这个专业的时候，他会给把这个专业的相关信息展示给你，包括就业情况</p></li>\n");
      out.write("\t\t\t\t\t\t<li><p>到了查分的日子，Go To Univercity 还会帮你查询高考分数：只需要输入相应的信息即可</p></li>\n");
      out.write("\t\t\t\t\t\t<li><p>如果你被录取了，恭喜你，如果你还想继续使用它，它会给你送去贺喜之外，还会统计下它的用户里有多少是跟你在一个城市并且跟你考入一所大学，甚至一个专业，它会把你们拼凑在一起并且提供一个交流平台给你们。当然平台里也允许已经在大学的学长加入，给你们提供一些建议。</p></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content_tail\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr/>\n");
      out.write("\t\t<div class=\"tail\">\n");
      out.write("\t\t\t<span class=\"tail_date\">2015-11-16</span>          <span class=\"tail_writer\">Write By GC</span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<hr/>\n");
      out.write("\t</div>\n");
      out.write("\t</body>\n");
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