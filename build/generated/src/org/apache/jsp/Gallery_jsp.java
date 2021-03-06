package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <title>Academics &mdash;</title>\n");
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
      out.write("\n");
      out.write("<body data-spy=\"scroll\" data-target=\".site-navbar-target\" data-offset=\"300\">\n");
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
      out.write("          <div class=\"col-lg-3 text-right\">\n");
      out.write("            <a href=\"login.html\" class=\"small mr-3\"><span class=\"icon-unlock-alt\"></span> Log In</a>\n");
      out.write("            <a href=\"register.html\" class=\"small btn btn-primary px-4 py-2 rounded-0\"><span class=\"icon-users\"></span> Register</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <header class=\"site-navbar py-4 js-sticky-header site-navbar-target\" role=\"banner\">\n");
      out.write("\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"d-flex align-items-center\">\n");
      out.write("          <div class=\"site-logo\">\n");
      out.write("            <a href=\"index.html\" class=\"d-block\">\n");
      out.write("              <img src=\"images/logo.jpg\" alt=\"Image\" class=\"img-fluid\">\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"mr-auto\">\n");
      out.write("            <nav class=\"site-navigation position-relative text-right\" role=\"navigation\">\n");
      out.write("              <ul class=\"site-menu main-menu js-clone-nav mr-auto d-none d-lg-block\">\n");
      out.write("                <li class=\"active\">\n");
      out.write("                  <a href=\"index.html\" class=\"nav-link text-left\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"has-children\">\n");
      out.write("                  <a href=\"about.html\" class=\"nav-link text-left\">About Us</a>\n");
      out.write("                  <ul class=\"dropdown\">\n");
      out.write("                    <li><a href=\"teachers.html\">Our Teachers</a></li>\n");
      out.write("                    <li><a href=\"about.html\">Our School</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"admissions.html\" class=\"nav-link text-left\">Admissions</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <a href=\"courses.html\" class=\"nav-link text-left\">Courses</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"contact.html\" class=\"nav-link text-left\">Contact</a>\n");
      out.write("                  </li>\n");
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
      out.write(" \n");
      out.write("      </br>\n");
      out.write("      </br>\n");
      out.write("\n");
      out.write("            </br>\n");
      out.write("\n");
      out.write("                  </br>\n");
      out.write("      </br>\n");
      out.write("      </br>\n");
      out.write(" <div>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("  font-family: Verdana, sans-serif;\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("* {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row > .column {\n");
      out.write("  padding: 0 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".row:after {\n");
      out.write("  content: \"\";\n");
      out.write("  display: table;\n");
      out.write("  clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".column {\n");
      out.write("  float: left;\n");
      out.write("  width: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("  display: none;\n");
      out.write("  position: fixed;\n");
      out.write("  z-index: 1;\n");
      out.write("  padding-top: 100px;\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("  overflow: auto;\n");
      out.write("  background-color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content */\n");
      out.write(".modal-content {\n");
      out.write("  position: relative;\n");
      out.write("  background-color: #fefefe;\n");
      out.write("  margin: auto;\n");
      out.write("  padding: 0;\n");
      out.write("  width: 90%;\n");
      out.write("  max-width: 1200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Close Button */\n");
      out.write(".close {\n");
      out.write("  color: white;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 10px;\n");
      out.write("  right: 25px;\n");
      out.write("  font-size: 35px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("  color: #999;\n");
      out.write("  text-decoration: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".mySlides {\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cursor {\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Next & previous buttons */\n");
      out.write(".prev,\n");
      out.write(".next {\n");
      out.write("  cursor: pointer;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  width: auto;\n");
      out.write("  padding: 16px;\n");
      out.write("  margin-top: -50px;\n");
      out.write("  color: white;\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 20px;\n");
      out.write("  transition: 0.6s ease;\n");
      out.write("  border-radius: 0 3px 3px 0;\n");
      out.write("  user-select: none;\n");
      out.write("  -webkit-user-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Position the \"next button\" to the right */\n");
      out.write(".next {\n");
      out.write("  right: 0;\n");
      out.write("  border-radius: 3px 0 0 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On hover, add a black background color with a little bit see-through */\n");
      out.write(".prev:hover,\n");
      out.write(".next:hover {\n");
      out.write("  background-color: rgba(0, 0, 0, 0.8);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Number text (1/3 etc) */\n");
      out.write(".numbertext {\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  font-size: 12px;\n");
      out.write("  padding: 8px 12px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  margin-bottom: -4px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".caption-container {\n");
      out.write("  text-align: center;\n");
      out.write("  background-color: black;\n");
      out.write("  padding: 2px 16px;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".demo {\n");
      out.write("  opacity: 0.6;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active,\n");
      out.write(".demo:hover {\n");
      out.write("  opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.hover-shadow {\n");
      out.write("  transition: 0.3s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".hover-shadow:hover {\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2 style=\"text-align:center\">Lightbox</h2>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"gallery/1.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(1)\" class=\"hover-shadow cursor\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"gallery/2.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(2)\" class=\"hover-shadow cursor\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"gallery/4.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(3)\" class=\"hover-shadow cursor\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"column\">\n");
      out.write("    <img src=\"gallery/3.jpg\" style=\"width:100%\" onclick=\"openModal();currentSlide(4)\" class=\"hover-shadow cursor\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"myModal\" class=\"modal\">\n");
      out.write("  <span class=\"close cursor\" onclick=\"closeModal()\">&times;</span>\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("    <div class=\"mySlides\">\n");
      out.write("      <div class=\"numbertext\">1 / 4</div>\n");
      out.write("      <img src=\"gallery/3.jpg\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"mySlides\">\n");
      out.write("      <div class=\"numbertext\">2 / 4</div>\n");
      out.write("      <img src=\"gallery/3.jpg\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"mySlides\">\n");
      out.write("      <div class=\"numbertext\">3 / 4</div>\n");
      out.write("      <img src=\"gallery/3.jpg\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"mySlides\">\n");
      out.write("      <div class=\"numbertext\">4 / 4</div>\n");
      out.write("      <img src=\"gallery/3.jpg\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\n");
      out.write("    <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\n");
      out.write("\n");
      out.write("    <div class=\"caption-container\">\n");
      out.write("      <p id=\"caption\"></p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"column\">\n");
      out.write("      <img class=\"demo cursor\" src=\"gallery/3.jpg\" style=\"width:100%\" onclick=\"currentSlide(1)\" alt=\"Nature and sunrise\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("      <img class=\"demo cursor\" src=\"gallery/3.jpg\" style=\"width:100%\" onclick=\"currentSlide(2)\" alt=\"Snow\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("      <img class=\"demo cursor\" src=\"gallery/3.jpg\" style=\"width:100%\" onclick=\"currentSlide(3)\" alt=\"Mountains and fjords\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"column\">\n");
      out.write("      <img class=\"demo cursor\" src=\"gallery/3.jpg\" style=\"width:100%\" onclick=\"currentSlide(4)\" alt=\"Northern Lights\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function openModal() {\n");
      out.write("  document.getElementById(\"myModal\").style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function closeModal() {\n");
      out.write("  document.getElementById(\"myModal\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("var slideIndex = 1;\n");
      out.write("showSlides(slideIndex);\n");
      out.write("\n");
      out.write("function plusSlides(n) {\n");
      out.write("  showSlides(slideIndex += n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function currentSlide(n) {\n");
      out.write("  showSlides(slideIndex = n);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showSlides(n) {\n");
      out.write("  var i;\n");
      out.write("  var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  var dots = document.getElementsByClassName(\"demo\");\n");
      out.write("  var captionText = document.getElementById(\"caption\");\n");
      out.write("  if (n > slides.length) {slideIndex = 1}\n");
      out.write("  if (n < 1) {slideIndex = slides.length}\n");
      out.write("  for (i = 0; i < slides.length; i++) {\n");
      out.write("      slides[i].style.display = \"none\";\n");
      out.write("  }\n");
      out.write("  for (i = 0; i < dots.length; i++) {\n");
      out.write("      dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("  }\n");
      out.write("  slides[slideIndex-1].style.display = \"block\";\n");
      out.write("  dots[slideIndex-1].className += \" active\";\n");
      out.write("  captionText.innerHTML = dots[slideIndex-1].alt;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("      </br>\n");
      out.write("      </br>\n");
      out.write("\n");
      out.write("            </br>\n");
      out.write("\n");
      out.write("                  </br>\n");
      out.write("      </br>\n");
      out.write("      </br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                  \n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("         <div class=\"site-section ftco-subscribe-1\" style=\"background-image: url('images/bg_1.jpg')\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-center\">\n");
      out.write("          <div class=\"col-lg-7\">\n");
      out.write("            <h2>Subscribe to us!</h2>\n");
      out.write("            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-5\">\n");
      out.write("            <form action=\"emailsubscribtion\" class=\"d-flex\">\n");
      out.write("              <input type=\"text\" name=\"emailsub\" class=\"rounded form-control mr-2 py-3\" placeholder=\"Enter your email\">\n");
      out.write("              <button class=\"btn btn-primary rounded py-3 px-4\" type=\"submit\">Send</button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-3\">\n");
      out.write("            <p class=\"mb-4\"><img src=\"images/logoabcwithoutbg.png\" alt=\"Image\" class=\"img-fluid\"></p>\n");
      out.write("            <p>\"An investment in knowledge always pays the best interest.\"</p>  \n");
      out.write("                        <p><a href=\"about.jsp\">Learn More</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3\">\n");
      out.write("            <h3 class=\"footer-heading\"><span>Our Campus</span></h3>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("                <li><a href=\"#\">ST University</a></li>\n");
      out.write("                <li><a href=\"#\"></a></li>\n");
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
      out.write("    \n");
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
      out.write("</html>\n");
      out.write("\n");
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
