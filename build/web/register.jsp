<!DOCTYPE html>
<html lang="en">

<head>
  <title>ST Academy &mdash;</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


  <link href="https://fonts.googleapis.com/css?family=Muli:300,400,700,900" rel="stylesheet">
  <link rel="stylesheet" href="fonts/icomoon/style.css">

  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/jquery-ui.css">
  <link rel="stylesheet" href="css/owl.carousel.min.css">
  <link rel="stylesheet" href="css/owl.theme.default.min.css">
  <link rel="stylesheet" href="css/owl.theme.default.min.css">

  <link rel="stylesheet" href="css/jquery.fancybox.min.css">

  <link rel="stylesheet" href="css/bootstrap-datepicker.css">

  <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">

  <link rel="stylesheet" href="css/aos.css">
  <link href="css/jquery.mb.YTPlayer.min.css" media="all" rel="stylesheet" type="text/css">

  <link rel="stylesheet" href="css/style.css">



</head>
   <% 
    HttpSession sessionsa = request.getSession(false);
String user = (String) sessionsa.getAttribute("id");
String role= (String) sessionsa.getAttribute("role");
    %>
   
        <% 
if(user==null){%>
        
<div id="test1">
              
           No user logged in.</div>
<%}
else{%>
<a href="profile.jsp" class="d-block">Profile:
<div id="test1"> ID:<%=user%>
       Authenticated as: <%=role%> logged in.</div></a>
<%}%>
<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">

       

  <div class="site-wrap">

    <div class="site-mobile-menu site-navbar-target">
      <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div>


    <div class="py-2 bg-light">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-lg-9 d-none d-lg-block">
            <a href="#" class="small mr-3"><span class="icon-question-circle-o mr-2"></span> Have a questions?</a> 
            <a href="#" class="small mr-3"><span class="icon-phone2 mr-2"></span> 10 20 123 456</a> 
            <a href="#" class="small mr-3"><span class="icon-envelope-o mr-2"></span> info@mydomain.com</a> 
          </div>
            <% if(user==null){%>
          <div class="col-lg-3 text-right">
            <a href="login.jsp" class="small mr-3"><span class="icon-unlock-alt"></span> Log In</a>
            <a href="register.jsp" class="small btn btn-primary px-4 py-2 rounded-0"><span class="icon-users"></span> Register</a>
         <%}else{%> <div class="col-lg-3 text-right">
         <a href="LogoutServlet" class="small btn btn-primary px-4 py-2 rounded-0"><span class="icon-users"></span> Logout</a>
</div>
        </div>
            <style>
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 12px 29px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

</style>
          </div><%}%>
        </div>
      </div>
    </div>
    <header class="site-navbar py-4 js-sticky-header site-navbar-target" role="banner">

      <div class="container">
        <div class="d-flex align-items-center">
          <div class="site-logo">
            <a href="index.jsp" class="d-block">
              <img src="images/logoabcwithoutbg.png" alt="Image" class="img-fluid">
            </a>
          </div>
          <div class="mr-auto">
            <nav class="site-navigation position-relative text-right" role="navigation">
              <ul class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">
                <li class="active">
                  <a href="index.jsp" class="nav-link text-left">Home</a>
                </li>
                <li class="has-children">
                  <a href="about.jsp" class="nav-link text-left">About Us</a>
                  <ul class="dropdown">
                    <li><a href="teachers.jsp">Our Teachers</a></li>
                    <li><a href="about.jsp">Our School</a></li>
                  </ul>
                </li>
                <li>
                  <a href="admissions.jsp" class="nav-link text-left">Admissions</a>
                </li>
                <li>
                  <a href="courses.jsp" class="nav-link text-left">Courses</a>
                </li>
                <li>
                    <a href="contact.jsp" class="nav-link text-left">Contact</a>
                  </li>
                  
                  <%if(user!=null){
                  if(role.equals("student")|role.equals("teacher")){%>
                  <li>
                    <a href="notes_stud.jsp" class="nav-link text-left">Notes</a>
                  </li><%}}%>
                  <%if(user!=null&&role.equals("staff")){%>
                  <li>
                      <a href="staffusrmngmt.jsp" class="nav-link text-left"><u>Staff</u></a>
                  </li> <%}%>
                  
                  
                  
              </ul>                                                                                                                                                                                                                                                                                          </ul>
            </nav>

          </div>
          <div class="ml-auto">
            <div class="social-wrap">
              <a href="#"><span class="icon-facebook"></span></a>
              <a href="#"><span class="icon-twitter"></span></a>
              <a href="#"><span class="icon-linkedin"></span></a>

              <a href="#" class="d-inline-block d-lg-none site-menu-toggle js-menu-toggle text-black"><span
                class="icon-menu h3"></span></a>
            </div>
          </div>
         
        </div>
      </div>

    </header>

    
    <div class="site-section ftco-subscribe-1 site-blocks-cover pb-4" style="background-image: url('images/bg_1.jpg')">
        <div class="container">
          <div class="row align-items-end justify-content-center text-center">
            <div class="col-lg-7">
              <h2 class="mb-0">Register</h2>
              <p>"An investment in knowledge always pays the best interest."</p>
            </div>
          </div>
        </div>
      </div> 
    

    <div class="custom-breadcrumns border-bottom">
      <div class="container">
        <a href="index.jsp">Home</a>
        <span class="mx-3 icon-keyboard_arrow_right"></span>
        <span class="current">Register</span>
      </div>
    </div>

    <div class="site-section">
        <div class="container">

            <form name="myForm" action="Register1" method="post" onsubmit="return validateForm()">
            <div class="row justify-content-center">
                <div class="col-md-5">
                    <div class="row">
                        <div class="col-md-12 form-group">
                            <label for="id">Enter SRN/SID/TID</label>
                            <input type="number" name="id" class="form-control form-control-lg">
                        </div>
                        <div class="col-md-12 form-group">
                            <label for="username">Username</label>
                            <input type="text" name="username" class="form-control form-control-lg">
                        </div>
                        <div class="col-md-12 form-group">
                            <label for="email">Email</label>
                            <input type="email" name="email" class="form-control form-control-lg">
                        </div>
                        <div class="col-md-12 form-group">
                            <label for="pword">Password</label>
                            <input type="password" name="pword" class="form-control form-control-lg">
                        </div>
                        <div class="col-md-12 form-group">
                            <label for="pword2">Re-type Password</label>
                            <input type="password" name="pword2" class="form-control form-control-lg">
                        </div>
                        <div>Select Role :  </div>
                        <div>
                           <select name="mySelect">
    <option value="student">Student</option>
    <option value="staff">Staff</option>
    <option value="teacher">Teacher</option>
                           </select>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12">
                            <input type="submit" value="Register" class="btn btn-primary btn-lg px-5">
                        </div>
                    </div>
                </div>
               
                
            </div>
            </form>
            <script>
function validateForm() {
  var username = document.forms["myForm"]["username"].value;
var id = document.forms["myForm"]["id"].value;
var email = document.forms["myForm"]["email"].value;
var password = document.forms["myForm"]["pword"].value;
var repassword = document.forms["myForm"]["pword2"].value;
if (id == "") {
    alert("SRN/SID/TID must be filled out");
    return false;
  }
      if (username == "") {
    alert("Name must be filled out");
    return false;
  }
 
   if (email == "") {
    alert("Email must be filled out");
    return false;
  }
    
if (password == "") {
    alert("Password must be filled out");
    return false;
  }
        if (password.length<8) {
    alert("Password must have greater than 8 characters");
    return false;
  }
   if (password != repassword) {
    alert("Re-entered password doesnot match the password");
    return false;
  }


  
  
  
}
</script>
         

          
        </div>
    </div>

  </div>

    <div class="footer">
      <div class="container">
        <div class="row">
          <div class="col-lg-3">
            <p class="mb-4"><img src="images/logoabcwithoutbg.png" alt="Image" class="img-fluid"></p>
            <p>Your Future Starts Here.
Your Future Is Our Future.
Your Future. Our Mission.
Your Future, Our Focus.</p>  
           
          </div>
          <div class="col-lg-3">
            <h3 class="footer-heading"><span>Our Campus</span></h3>
            <ul class="list-unstyled">
                <li><a href="#">ST University</a></li>
                <li><a href="#"></a></li>
                <li><a href="#">Our Interns</a></li>
                <li><a href="#">Our Leadership</a></li>
                <li><a href="#">Careers</a></li>
                <li><a href="#">Human Resources</a></li>
            </ul>
          </div>
          <div class="col-lg-3">
              <h3 class="footer-heading"><span>Our Courses</span></h3>
              <ul class="list-unstyled">
                  <li><a href="courses.jsp">Math</a></li>
                  <li><a href="courses.jsp">Science &amp; Engineering</a></li>
                  <li><a href="courses.jsp">Arts &amp; Humanities</a></li>
                  <li><a href="courses.jsp">Economics &amp; Finance</a></li>
                  <li><a href="courses.jsp">Business Administration</a></li>
                  <li><a href="courses.jsp">Computer Science</a></li>
              </ul>
          </div>
          <div class="col-lg-3">
              <h3 class="footer-heading"><span>Contact</span></h3>
              <ul class="list-unstyled">
                  <li><a href="contact.jsp">Help Center</a></li>
                  <li><a href="contact.jsp ">Support Community</a></li>
                 
                  <li><a href="contact.jsp">Share Your Story</a></li>
                  
              </ul>
          </div>
        </div>

      
      </div>
    </div>
    

  </div>
  <!-- .site-wrap -->

  <!-- loader -->
  <div id="loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#51be78"/></svg></div>

  <script src="js/jquery-3.3.1.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/jquery.countdown.min.js"></script>
  <script src="js/bootstrap-datepicker.min.js"></script>
  <script src="js/jquery.easing.1.3.js"></script>
  <script src="js/aos.js"></script>
  <script src="js/jquery.fancybox.min.js"></script>
  <script src="js/jquery.sticky.js"></script>
  <script src="js/jquery.mb.YTPlayer.min.js"></script>




  <script src="js/main.js"></script>

</body>

</html>