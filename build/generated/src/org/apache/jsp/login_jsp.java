package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>ST Academy &mdash;</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Muli:300,400,700,900\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/jquery.fancybox.min.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"fonts/flaticon/font/flaticon.css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("  <link href=\"css/jquery.mb.YTPlayer.min.css\" media=\"all\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    ");
 
    HttpSession sessionsa = request.getSession(false);
String user = (String) sessionsa.getAttribute("id");
String role= (String) sessionsa.getAttribute("role");
    
      out.write("\n");
      out.write("    ");
      out.print(user);
      out.write("\n");
      out.write("        ");
      out.print(role);
      out.write(" logged in.\n");
      out.write("        ");
 
if(user==null){
      out.write("\n");
      out.write("        \n");
      out.write("<div id=\"test1\"><a href=\"profile.jsp\" class=\"d-block\">\n");
      out.write("              <img src=\"images/prof.png\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("            </a></div>\n");
}
else{
      out.write("\n");
      out.write("        \n");
      out.write("<div id=\"test1\">test2</div>\n");
}
      out.write("\n");
      out.write("<body data-spy=\"scroll\" data-target=\".site-navbar-target\" data-offset=\"300\">\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("  <div class=\"site-wrap\">\n");
      out.write("\n");
      out.write("    <div class=\"site-mobile-menu site-navbar-target\">\n");
      out.write("      <div class=\"site-mobile-menu-header\">\n");
      out.write("        <div class=\"site-mobile-menu-close mt-3\">\n");
      out.write("          <span class=\"icon-close2 js-menu-toggle\"></span>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"site-mobile-menu-body\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"py-2 bg-light\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-center\">\n");
      out.write("          <div class=\"col-lg-9 d-none d-lg-block\">\n");
      out.write("            <a href=\"#\" class=\"small mr-3\"><span class=\"icon-question-circle-o mr-2\"></span> Have a questions?</a> \n");
      out.write("            <a href=\"#\" class=\"small mr-3\"><span class=\"icon-phone2 mr-2\"></span> 10 20 123 456</a> \n");
      out.write("            <a href=\"#\" class=\"small mr-3\"><span class=\"icon-envelope-o mr-2\"></span> info@mydomain.com</a> \n");
      out.write("          </div>\n");
      out.write("           ");
 if(user==null){
      out.write("\n");
      out.write("          <div class=\"col-lg-3 text-right\">\n");
      out.write("            <a href=\"login.jsp\" class=\"small mr-3\"><span class=\"icon-unlock-alt\"></span> Log In</a>\n");
      out.write("            <a href=\"register.jsp\" class=\"small btn btn-primary px-4 py-2 rounded-0\"><span class=\"icon-users\"></span> Register</a>\n");
      out.write("         ");
}else{
      out.write(" <div class=\"col-lg-3 text-right\">\n");
      out.write("         <a href=\"LogoutServlet\" class=\"small btn btn-primary px-4 py-2 rounded-0\"><span class=\"icon-users\"></span> Logout</a>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("            <style>\n");
      out.write(".button {\n");
      out.write("  background-color: #4CAF50; /* Green */\n");
      out.write("  border: none;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px 29px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  font-size: 16px;\n");
      out.write("  margin: 4px 2px;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("          </div>");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <header class=\"site-navbar py-4 js-sticky-header site-navbar-target\" role=\"banner\">\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"d-flex align-items-center\">\n");
      out.write("          <div class=\"site-logo\">\n");
      out.write("            <a href=\"index.jsp\" class=\"d-block\">\n");
      out.write("              <img src=\"images/logoabcwithoutbg.png\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mr-auto\">\n");
      out.write("            <nav class=\"site-navigation position-relative text-right\" role=\"navigation\">\n");
      out.write("              <ul class=\"site-menu main-menu js-clone-nav mr-auto d-none d-lg-block\">\n");
      out.write("                <li class=\"active\">\n");
      out.write("                  <a href=\"index.jsp\" class=\"nav-link text-left\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"has-children\">\n");
      out.write("                  <a href=\"about.jsp\" class=\"nav-link text-left\">About Us</a>\n");
      out.write("                  <ul class=\"dropdown\">\n");
      out.write("                    <li><a href=\"teachers.jsp\">Our Teachers</a></li>\n");
      out.write("                    <li><a href=\"about.jsp\">Our School</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"admissions.jsp\" class=\"nav-link text-left\">Admissions</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"courses.jsp\" class=\"nav-link text-left\">Courses</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"contact.jsp\" class=\"nav-link text-left\">Contact</a>\n");
      out.write("                  </li>\n");
      out.write("                  \n");
      out.write("                  ");
if(user!=null){
                  if(role.equals("student")|role.equals("teacher")){
      out.write("\n");
      out.write("                  <li>\n");
      out.write("                    <a href=\"notes_stud.jsp\" class=\"nav-link text-left\">Notes</a>\n");
      out.write("                  </li>");
}}
      out.write("\n");
      out.write("                  ");
if(user!=null&&role.equals("staff")){
      out.write("\n");
      out.write("                  <li>\n");
      out.write("                      <a href=\"staffusrmngmt.jsp\" class=\"nav-link text-left\"><u>Staff</u></a>\n");
      out.write("                  </li> ");
}
      out.write("\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              </ul>                                                                                                                                                                                                                                                                                          </ul>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"ml-auto\">\n");
      out.write("            <div class=\"social-wrap\">\n");
      out.write("              <a href=\"#\"><span class=\"icon-facebook\"></span></a>\n");
      out.write("              <a href=\"#\"><span class=\"icon-twitter\"></span></a>\n");
      out.write("              <a href=\"#\"><span class=\"icon-linkedin\"></span></a>\n");
      out.write("\n");
      out.write("              <a href=\"#\" class=\"d-inline-block d-lg-none site-menu-toggle js-menu-toggle text-black\"><span\n");
      out.write("                class=\"icon-menu h3\"></span></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"site-section ftco-subscribe-1 site-blocks-cover pb-4\" style=\"background-image: url('images/bg_1.jpg')\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row align-items-end justify-content-center text-center\">\n");
      out.write("            <div class=\"col-lg-7\">\n");
      out.write("              <h2 class=\"mb-0\">Login</h2>\n");
      out.write("              <p></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div> \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"custom-breadcrumns border-bottom\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <a href=\"index.jsp\">Home</a>\n");
      out.write("        <span class=\"mx-3 icon-keyboard_arrow_right\"></span>\n");
      out.write("        <span class=\"current\">Login</span>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"site-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("  <form name=\"myForm\" action=\"login1\" method=\"get\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-md-5\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                  \n");
      out.write("                        <div class=\"col-md-12 form-group\">\n");
      out.write("                            <label for=\"username\">Enter Student ID/Teacher ID/Staff ID</label>\n");
      out.write("                            <input type=\"text\" name=\"id\" class=\"form-control form-control-lg\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 form-group\">\n");
      out.write("                            <label for=\"pword\">Password</label>\n");
      out.write("                            <input type=\"text\" name=\"pword\" class=\"form-control form-control-lg\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-12\">\n");
      out.write("                         \n");
      out.write("                                <input type=\"submit\" value=\"Log In\" class=\"btn btn-primary btn-lg px-5\">\n");
      out.write("                                 <a href=\"forgotpassword.jsp\" class=\"small mr-3\"></span> forgot password</a> \n");
      out.write("                                  \n");
      out.write("                            <script>\n");
      out.write(" \n");
      out.write("     \n");
      out.write("function myFunction() {\n");
      out.write("         var pass= document.getElementById(\"pword\").value.toString();\n");
      out.write("      var usern = document.getElementById(\"username\").value.toString();\n");
      out.write("      \n");
      out.write("    alert(\"det :\"+usern+\"\"+pass);\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("                                </script>\n");
      out.write("                                                          \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>                          </form>\n");
      out.write("            \n");
      out.write("\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"footer\">    \n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-3\">\n");
      out.write("            <p class=\"mb-4\"><img src=\"images/logoabcwithoutbg.png\" alt=\"Image\" class=\"img-fluid\"></p>\n");
      out.write("            <p>\"An investment in knowledge always pays the best interest.\"</p>  \n");
      out.write("                        <p><a href=\"about.jsp\">Learn More</a></p>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3\">\n");
      out.write("            <h3 class=\"footer-heading\"><span>Our Campus</span></h3>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("                <li><a href=\"#\">ST University</a></li>\n");
      out.write("              \n");
      out.write("                <li><a href=\"#\">Our Interns</a></li>\n");
      out.write("                <li><a href=\"#\">Our Leadership</a></li>\n");
      out.write("                <li><a href=\"#\">Careers</a></li>\n");
      out.write("                <li><a href=\"#\">Human Resources</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3\">\n");
      out.write("              <h3 class=\"footer-heading\"><span>Our Courses</span></h3>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                  <li><a href=\"#\">Math</a></li>\n");
      out.write("                  <li><a href=\"#\">Science &amp; Engineering</a></li>\n");
      out.write("                  <li><a href=\"#\">Arts &amp; Humanities</a></li>\n");
      out.write("                  <li><a href=\"#\">Economics &amp; Finance</a></li>\n");
      out.write("                  <li><a href=\"#\">Business Administration</a></li>\n");
      out.write("                  <li><a href=\"#\">Computer Science</a></li>\n");
      out.write("              </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3\">\n");
      out.write("              <h3 class=\"footer-heading\"><span>Contact</span></h3>\n");
      out.write("              <ul class=\"list-unstyled\">\n");
      out.write("                  <li><a href=\"#\">Help Center</a></li>\n");
      out.write("                  <li><a href=\"#\">Support Community</a></li>\n");
      out.write("                  <li><a href=\"#\">Press</a></li>\n");
      out.write("                  <li><a href=\"#\">Share Your Story</a></li>\n");
      out.write("                  <li><a href=\"#\">Our Supporters</a></li>\n");
      out.write("              </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-12\">\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <!-- .site-wrap -->\n");
      out.write("\n");
      out.write("  <!-- loader -->\n");
      out.write("  <div id=\"loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#51be78\"/></svg></div>\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-ui.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.countdown.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("  <script src=\"js/jquery.fancybox.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("  <script src=\"js/jquery.mb.YTPlayer.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
