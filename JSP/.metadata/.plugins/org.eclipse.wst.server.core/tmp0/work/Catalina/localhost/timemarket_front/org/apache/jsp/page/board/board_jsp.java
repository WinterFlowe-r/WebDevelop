/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.24
 * Generated at: 2020-01-06 05:55:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.page.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class board_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1575740970000L));
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1576418271200L));
    _jspx_dependants.put("jar:file:/D:/1601184_bk/jsp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/timemarket_front/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/fmt.tld", Long.valueOf(1323225978000L));
    _jspx_dependants.put("jar:file:/D:/1601184_bk/jsp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/timemarket_front/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/sql.tld", Long.valueOf(1323225978000L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1576720322738L));
    _jspx_dependants.put("jar:file:/D:/1601184_bk/jsp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/timemarket_front/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323225978000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/db.jsp", out, false);
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>TIME MARKET</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/timemarket_front/css/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/timemarket_front/css/sub.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/timemarket_front/css/jquery.timepicker.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/timemarket_front/css/jquery-ui-timepicker-addon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/timemarket_front/js/jquery.timepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/timemarket_front/js/jquery-ui-timepicker-addon.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/timemarket_front/js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- HEADER -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<div id=\"header_in\">\r\n");
      out.write("\t\t\t<div id=\"nav_bt\">\r\n");
      out.write(" \t\t\t\t<ul> \r\n");
      out.write(" \t\t\t\t\t<li class=\"sear_bt\"><img src=\"/timemarket_front/imgs/search_b.png\" alt=\"search_b\" title=\"search_b\" class=\"se_bt\" /></li>\r\n");
      out.write(" \t\t\t\t\t<li><a href=\"/timemarket_front/page/member/mypage.do\"><img src=\"/timemarket_front/imgs/shop_bt.png\" alt=\"shop_bt\" title=\"shop_bt\"/></a></li>\r\n");
      out.write("\t\t\t \t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t \t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t \t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t \t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"logo\"><a href=\"/timemarket_front/index.do\">TIME MARKET</a></div>\r\n");
      out.write("\t\t\t<nav>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/timemarket_front/page/about/about.do\">마켓소개</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/timemarket_front/page/product/product.do\">제품</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/timemarket_front/page/product/sale.do\">베스트 상품</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/timemarket_front/page/board/board.do\">고객센터</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\r\n");
      out.write("<!--로그인 폼-->\r\n");
      out.write("<div class=\"join_frm2\" id=\"login_2\">\r\n");
      out.write("<form action=\"/timemarket_front/page/member/login_ok.do\" method=\"post\">\r\n");
      out.write("\t<div id=\"in_box\" class=\"idpw_box\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"userid\" id=\"userid\" maxlength=\"20\" placeholder=\"사용자 아이디\" required />\r\n");
      out.write("\t\t\t<input type=\"password\" name=\"userpw\" id=\"userpw\" maxlength=\"20\" placeholder=\"사용자 비밀번호\" required/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<span id=\"idpw_find\"><a href=\"#\">아이디나 비밀번호를 잊어버리셨나요?</a></span>\r\n");
      out.write("\t\t<span id=\"join_mem\"><a href=\"#\">회원가입</a></span>\r\n");
      out.write("\t\t\t<div id=\"log_box_bot\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"\">LOGIN</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"join_frm\">\r\n");
      out.write("\t<form action=\"/timemarket_front/page/member/join_ok.do\" method=\"post\">\r\n");
      out.write("\t\t<div id=\"frm_con\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>아이디</li>\r\n");
      out.write("\t\t\t\t<li><input type=\"text\" id=\"userid\" name=\"userid\" title=\"아이디\" value=\"\" class=\"check\"/></li>\r\n");
      out.write("\t\t\t\t<li id=\"id_check\"><button type=\"button\" id=\"juck\">중복체크</button><span id=\"ick\">※ 아이디를 체크합니다</span></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>비밀번호</li>\r\n");
      out.write("\t\t\t\t<li><input type=\"password\" name=\"userpw\" id=\"userpw\" value=\"\" required /></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>전화번호</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone\" id=\"phone\" value=\"\"  required size=\"5\" maxlength=\"5\" />-\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone2\" id=\"phone2\" value=\"\" required size=\"5\" maxlength=\"5\"/>-\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"phone3\" id=\"phone3\" value=\"\"  required size=\"5\" maxlength=\"5\" />\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>이름</li>\r\n");
      out.write("\t\t\t\t<li><input type=\"text\" name=\"username\" id=\"username\" value=\"\"  required size=\"5\" maxlength=\"5\" /></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>이메일</li>\r\n");
      out.write("\t\t\t\t<li><input type=\"text\" name=\"useremail\" id=\"useremail\" value=\"\"  required />@<select id=\"useremail2\" name=\"useremail2\"><option value=\"naver.com\">naver.com</option><option value=\"daum.net\">daum.net</option><option value=\"nate.com\">nate.com</option></select></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"join_bbb\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><input type=\"submit\" id=\"mem_bt\" value=\"회원가입\"  /></li>\r\n");
      out.write("\t\t\t\t<li><input type=\"reset\" value=\"다시쓰기\" /></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- HEADER END -->");
      out.write("\r\n");
      out.write("<!-- CONTENT -->\r\n");
      out.write("<div id=\"sub_content\">\r\n");
      out.write("\t<div id=\"sub_content_in\">\r\n");
      out.write("\t<div id=\"sub_con_t\" class=\"tc\">고객센터에서 궁금하신 점을 찾아보세요</div>\r\n");
      out.write("\t<div id=\"sub_con_t2\" class=\"tc\">궁금하신 점 또는 상품에 대한 질문내용을 입력해주시면 상세히 안내해드립니다.</div>\r\n");
      out.write("\t<div id=\"consume_in\">\r\n");
      out.write("\t\t<img src=\"../../imgs/shop_info.png\" alt=\"\" title=\"\" id=\"shop_info_bt\">\r\n");
      out.write("\t\t<img src=\"../../imgs/jaju_icon.png\" alt=\"\" title=\"\" id=\"jaju_icon_bt\">\r\n");
      out.write("\t\t<img src=\"../../imgs/qa_icon.png\" alt=\"\" title=\"\" id=\"qa_icon_bt\">\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"board_write\">\r\n");
      out.write("        <h1>문의글 작성</h1>\r\n");
      out.write("            <div id=\"write_area\">\r\n");
      out.write("                <form action=\"write_ok.do\" name=\"bo_form\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                <input type=\"hidden\" name=\"userid\" value=\"");
      out.print(session.getAttribute("userid") );
      out.write("\" />\r\n");
      out.write("                    <div class=\"in_text\">\r\n");
      out.write("                        <textarea name=\"qa_title\" rows=\"1\" cols=\"55\" placeholder=\"제목\" maxlength=\"100\" required></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"wi_line\"></div>\r\n");
      out.write("                    <div class=\"in_text\">\r\n");
      out.write("                        <textarea name=\"qa_text\" placeholder=\"내용\" required></textarea>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"in_text in_date\">\r\n");
      out.write("                    \t<input type=\"file\" name=\"qa_file\" />\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"bt_se\">\r\n");
      out.write("                        <button type=\"submit\">글 작성</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<div id=\"footer_in\" style=\"color:white; text-align: center; line-height: 70px;\">Copyright ⓒ 2019 TIME MARKET and Rights Center. All Rights reserved</div>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /include/header.jsp(31,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userid == 'admin' }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t \t\t\t\t<li class=\"\"><a href=\"/timemarket_front/page/admin/admin.do\"><img src=\"/timemarket_front/imgs/admin_bt.png\" alt=\"\" title=\"\" /></a></li>\r\n");
          out.write("\t\t\t \t\t\t\t<li class=\"\"><a href=\"/timemarket_front/page/member/logout.jsp\"><img src=\"/timemarket_front/imgs/logout_bt.png\" alt=\"\" title=\"\" /></a></li>\r\n");
          out.write("\t\t\t \t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /include/header.jsp(35,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.userid}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t \t\t\t\t<li class=\"login_bottom2\"><img src=\"/timemarket_front/imgs/sign_bt.png\" alt=\"sign_bt\" title=\"sign_bt\" /></li>\r\n");
          out.write("\t\t\t \t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t \t\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t \t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /include/header.jsp(39,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userid !=null && sessionScope.userid != 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t \t\t\t\t<li class=\"\"><a href=\"/timemarket_front/page/member/mem_mypage.do\"><img src=\"/timemarket_front/imgs/mypage_bt.png\" alt=\"\" title=\"\" /></a></li>\r\n");
          out.write("\t\t\t \t\t\t\t<li class=\"\"><a href=\"/timemarket_front/page/member/logout.jsp\"><img src=\"/timemarket_front/imgs/logout_bt.png\" alt=\"\" title=\"\" /></a></li>\r\n");
          out.write("\t\t\t \t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }
}
