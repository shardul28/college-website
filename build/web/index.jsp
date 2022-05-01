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

    
    <div class="hero-slide owl-carousel site-blocks-cover">
      <div class="intro-section" style="background-image: url('images/wall.jpg');">
        <div class="container">
          <div class="row align-items-center">
            <div class="col-lg-12 mx-auto text-center" data-aos="fade-up">
              <h1>ST University</h1>
            </div>
          </div>
        </div>
      </div>

      <div class="intro-section" style="background-image: url('images/hero_1.jpg');">
        <div class="container">
          <div class="row align-items-center">
            <div class="col-lg-12 mx-auto text-center" data-aos="fade-up">
              <h1>You Can Learn Anything</h1>
            </div>
          </div>
        </div>
      </div>

    </div>
    

    <div></div>

    <div class="site-section">
      <div class="container">
        <div class="row mb-5 justify-content-center text-center">
          <div class="col-lg-4 mb-5">
            <h2 class="section-title-underline mb-5">
              <span>Why ST University Works</span>
            </h2>
          </div>
        </div>
        <div class="row">
          <div class="col-lg-4 col-md-6 mb-4 mb-lg-0">

            <div class="feature-1 border">
              <div class="icon-wrapper bg-primary">
                <span class="flaticon-mortarboard text-white"></span>
              </div>
              <div class="feature-1-content">
                <h2>Personalize Learning</h2>
                <p>Our Mission is to provide quality efficient education and promote it. We are here to educate in manner that learning becomes quite easier.</p>
                
              </div>
            </div>
          </div>
          <div class="col-lg-4 col-md-6 mb-4 mb-lg-0">
            <div class="feature-1 border">
              <div class="icon-wrapper bg-primary">
                <span class="flaticon-school-material text-white"></span>
              </div>
              <div class="feature-1-content">
                <h2>Trusted Courses</h2>
                <p>Explore a variety of courses from highly educated teachers leading into a leap of opportunities.</p>
                
              </div>
            </div> 
          </div>
          <div class="col-lg-4 col-md-6 mb-4 mb-lg-0">
            <div class="feature-1 border">
              <div class="icon-wrapper bg-primary">
                <span class="flaticon-library text-white"></span>
              </div>
              <div class="feature-1-content">
                <h2>Vision</h2>
                <p>Be committed to maintaining high academic standards, enhancing the quality of teaching and learning offered, and providing a high-quality learning experience for its students. To impart and disseminate knowledge in the emerging areas of Healthcare, Science and Technology, Business Management, Hospitality Management, Liberal Education, Teacher?s Education, Sports, etc.</p>
                
              </div>
            </div> 
          </div>
        </div>
      </div>
    </div>


    <div class="site-section">
      <div class="container">


        <div class="row mb-5 justify-content-center text-center">
          <div class="col-lg-6 mb-5">
            <h2 class="section-title-underline mb-3">
              <span>Popular Courses</span>
            </h2>
            <p></p>
          </div>
        </div>

       <div class="row">
          <div class="col-12">
              <div class="owl-slide-3 owl-carousel">
                  <div class="course-1-item">
                    <figure class="thumnail">
                      <a href="course-single.jsp"><img src="images/science.jpg" alt="Image" class="img-fluid"></a>
                      <div class="category"><h3>Science</h3></div>  
                    </figure>
                    <div class="course-1-content pb-4">
                      <p>
                      Science studies is an interdisciplinary research area that seeks to situate scientific expertise in broad social, historical, and philosophical contexts
                     </p>
                    </div>
                  </div>
      
                  <div class="course-1-item">
                    <figure class="thumnail">
                      <a href="course-single.jsp"><img src="images/it.jpg" alt="Image" class="img-fluid"></a>
                     
                      <div class="category"><h3>Information Tech.</h3></div>  
                    </figure>
                    <div class="course-1-content pb-4">
                      <p>
                     
                      Information technology is the use of computers to store, retrieve, transmit, and manipulate data or information. IT is typically used within the context of business operations as opposed to personal or entertainment technologies.
                      </p>
                    </div>
                  </div>
      
                  <div class="course-1-item">
                    <figure class="thumnail">
                      <a href="course-single.jsp"><img src="images/course_6.jpg" alt="Image" class="img-fluid"></a>
                    
                      <div class="category"><h3>Computer Science</h3></div>  
                    </figure>
                    <div class="course-1-content pb-4">
                      <p class="desc mb-4">Computer Science is the study of computers and computational systems. Unlike electrical and computer engineers, computer scientists deal mostly with software and software systems; this includes their theory, design, development, and application.</p>
                    
                    </div>
                  </div>

                  <div class="course-1-item">
                    <figure class="thumnail">
                        <a href="course-single.jsp"><img src="images/commerce.jpg" alt="Image" class="img-fluid"></a>
                 
                      <div class="category"><h3>Commerce</h3></div>  
                    </figure>
                    <div class="course-1-content pb-4">
                      <p class="desc mb-4">Commerce is the exchange of goods and services, especially on a large scale. It includes legal, economic, political, social, cultural and technological systems that operate in a country or in international trade.</p>
                    
                    </div>
                  </div>
      
      
                  
      
              </div>
      
          </div>
        </div>

        
        
      </div>
    </div>

    


    <div class="section-bg style-1" style="background-image: url('images/about_1.jpg');">
      <div class="container">
        <div class="row">
          <div class="col-lg-4">
            <h2 class="section-title-underline style-2">
              <span>About Our University</span>
            </h2>
          </div>
          <div class="col-lg-8">
            <p class="lead">The Mahatma Education Society embarked upon its mission of ?Education for all" with the Bandra English High School in the year 1970. The vision, dedication, global outlook, tenacious struggle and undaunted spirit of the Chairman and C.E.O., Dr. K. M. Vasudevan and the forward looking, untiring energy of the Secretary, Dr. (Mrs.) Daphne have now transformed the Mahatma Education Society in to a vast educational organization
            <p><a href="about.jsp">Read more</a></p>
          </div>
        </div>
      </div>
    </div>

    <!-- // 05 - Block -->
  <div class="site-section">
      <div class="container">
        <div class="row mb-5">
          <div class="col-lg-4">
            <h2 class="section-title-underline">
              <span>Testimonials</span>
            </h2>
          </div>
        </div>


        <div class="owl-slide owl-carousel">

          <div class="ftco-testimonial-1">
            <div class="ftco-testimonial-vcard d-flex align-items-center mb-4">
              <img src="images/user.png" alt="Image" class="img-fluid mr-3">
              <div>
                <h3>Jogesh Holmey</h3>
                <span>Designer</span>
              </div>
            </div>
            <div>
             Faculty are very supportive and encouraging the students to participate in various co curricular activities .They are providing very good training with well versed knowledge.They identified many talents and supporting them towards their goal.  </div>
          </div>

          <div class="ftco-testimonial-1">
            <div class="ftco-testimonial-vcard d-flex align-items-center mb-4">
              <img src="images/user.png" alt="Image" class="img-fluid mr-3">
              <div>
                <h3>Allison S</h3>
                <span>Designer</span>
              </div>
            </div>
            <div>
            Faculty are very supportive and encouraging the students to participate in various co curricular activities .They are providing very good training with well versed knowledge.They identified many talents and supporting them towards their goal.   </div>
          </div>

          <div class="ftco-testimonial-1">
            <div class="ftco-testimonial-vcard d-flex align-items-center mb-4">
              <img src="images/user.png" alt="Image" class="img-fluid mr-3">
              <div>
                <h3>Arnub Goswami</h3>
                <span>Engineer</span>
              </div>
            </div>
            <div>
             Faculty are very supportive and encouraging the students to participate in various co curricular activities .They are providing very good training with well versed knowledge.They identified many talents and supporting them towards their goal. </div>
          </div>

          <div class="ftco-testimonial-1">
            <div class="ftco-testimonial-vcard d-flex align-items-center mb-4">
              <img src="images/user.png" alt="Image" class="img-fluid mr-3">
              <div>
                <h3>Mike Oxmol</h3>
                <span>CA</span>
              </div>
            </div>
            <div>
              Faculty are very supportive and encouraging the students to participate in various co curricular activities .They are providing very good training with well versed knowledge.They identified many talents and supporting them towards their goal. </div>
          </div>

          <div class="ftco-testimonial-1">
            <div class="ftco-testimonial-vcard d-flex align-items-center mb-4">
              <img src="images/user.png" alt="Image" class="img-fluid mr-3">
              <div>
                <h3>Gowtham S</h3>
                <span>Engineer</span>
              </div>
            </div>
            <div>
              <p> I am Gowtham S, Pursuing Final Year from Department of Computer Science Engineering. Our College will act as a great platform for enhancing our Technical and Management skills. Other than curricular, We can indulge us in co-curricular and extra curricular activities through which we can develop our skills to the peak. Co-curricular activities like event-participation, Internship activities, Consultancy services and Management activities like Event organization, Leadership qualities are very much encouraged in our College. These kind of activities will very much help us in regards to our placements.</p>
            </div>
          </div>

          <div class="ftco-testimonial-1">
            <div class="ftco-testimonial-vcard d-flex align-items-center mb-4">
              <img src="images/user.png" alt="Image" class="img-fluid mr-3">
              <div>
                <h3>Allison Holmes</h3>
                <span>Engineer</span>
              </div>
            </div>
            <div>
              The Facilities over here are really talented, supportive, motivating and friendly. This college has its own way of updating students for their incredible growth. Placement here are good enough and top MNC's are recruiting skilled students . Entrepreneurship are really encouraged and college does its support to students to motivate their interest. The hostel life is upto its mark </div>
          </div>

        </div>
        
      </div>
    </div>
    

    <div class="section-bg style-1" style="background-image: url('images/hero_1.jpg');">
      <div class="container">
        <div class="row">
          <div class="col-lg-4 col-md-6 mb-5 mb-lg-0">
            <span class="icon flaticon-mortarboard"></span>
            <h3>Our Philosphy</h3>
              <p>"Study without desire spoils the memory, and it retains nothing that it takes in."
- Leonardo da Vinci</p>
            </div>
            <div class="col-lg-4 col-md-6 mb-5 mb-lg-0">
              <span class="icon flaticon-school-material"></span>
              <h3>ST University Principle</h3>
              <p>"University can teach you skill and give you opportunity, but it can't teach you sense, nor give you understanding. Sense and understanding are produced within one's soul."
- C. JoyBell C.</p>
            </div>
            <div class="col-lg-4 col-md-6 mb-5 mb-lg-0">
              <span class="icon flaticon-library"></span>
              <h3>Key of Success</h3>
              <p>"Your comfort zone is a place where you keep yourself in a self-illusion and nothing can grow there but your potentiality can grow only when you can think and grow out of that zone."
- Rashedur Ryan Rahman</p>
            </div>
          </div>
        </div>
      </div>
    </div>
    
    

       <div class="site-section ftco-subscribe-1" style="background-image: url('images/bg_1.jpg')">
      <div class="container">
        <div class="row align-items-center">
          <div class="col-lg-7">
            <h2>Subscribe to us!</h2>
            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,</p>
          </div>
          <div class="col-lg-5">
            <form action="emailsubscribtion" class="d-flex">
              <input type="text" name="emailsub" class="rounded form-control mr-2 py-3" placeholder="Enter your email">
              <button class="btn btn-primary rounded py-3 px-4" type="submit">Send</button>
            </form>
          </div>
        </div>
      </div>
    </div> 


    <div class="footer">
      <div class="container">
        <div class="row">
          <div class="col-lg-3">
            <p class="mb-4"><img src="images/logoabcwithoutbg.png" alt="Image" class="img-fluid"></p>
            <p>"An investment in knowledge always pays the best interest."</p>  
            <p><a href="about.jsp">Learn More</a></p>
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
                  <li><a href="#">Math</a></li>
                  <li><a href="#">Science &amp; Engineering</a></li>
                  <li><a href="#">Arts &amp; Humanities</a></li>
                  <li><a href="#">Economics &amp; Finance</a></li>
                  <li><a href="#">Business Administration</a></li>
                  <li><a href="#">Computer Science</a></li>
              </ul>
          </div>
          <div class="col-lg-3">
              <h3 class="footer-heading"><span>Contact</span></h3>
              <ul class="list-unstyled">
                  <li><a href="#">Help Center</a></li>
                  <li><a href="#">Support Community</a></li>
                  <li><a href="#">Press</a></li>
                  <li><a href="#">Share Your Story</a></li>
                  <li><a href="#">Our Supporters</a></li>
              </ul>
          </div>
        </div>

        <div class="row">
          <div class="col-12">
            <div class="copyright">
             
            </div>
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
