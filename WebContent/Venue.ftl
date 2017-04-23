<!DOCTYPE html>
<html lang="en">

<head>
  <script src="js/animate.js"></script>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>EasyGig</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">

    <!-- Plugin CSS -->
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet">

    <!-- Theme CSS -->
    <link href="css/creative.min.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>


  <body id="page-top" onload="movethem()" style="background-color:none;">
  <input type="text" name="name"style="display: none;" id="ourname" name="" value="${(username)! "null"}">
<input type="text" name="userID" style="display: none;" id="ouruserID" name="" value="${(userID)! "null"}">


<script type="text/javascript">
  var val = document.getElementById("ourname").value;
  var idval = document.getElementById("ouruserID").value;
  if(val != "null"){
    localStorage.setItem("name", "${(username)!}");
    localStorage.setItem("userID", "${(userID)!}");
    localStorage.setItem("accountType", "venue");
  }
</script>
      <style>
          #searchradiobuttons {
              display: none;
          }
          #b1,
          #b3,
          #b5,
          #b7,
          #b9,
          #b11,
          #b13,
          #b15,
          #b17,
          #b19,
          #b21,
          #b23,
          #b25,
          #b27,
          #b29{
              background-color: #132e1d;
              opacity: .5;
          }
          #b2,
          #b4,
          #b6,
          #b8,
          #b10,
          #b12,
          #b14,
          #b16,
          #b18,
          #b20,
          #b22,
          #b24,
          #b26,
          #b28,
          #b30{
              background-color: #224730;
              opacity: .5;
          }
          #bars {
              position: absolute;
              width: 100%;
              height: 100%;
              left: 0px;
              top: 0px;
              z-index: -1;
          }
          #bartable {
              width: 100%;
              height: 100%;
          }
          #bartable td {
              padding: 1px;
              vertical-align: bottom;
          }
          #background {
              position: absolute;
              left: 0px;
              top: 0px;
              z-index: -2;
              width: 100%;
              height: 100%;
              background-image: url(img/header2small.jpg)
          }
      </style>

       <nav class="nav">
          <div class="nav-header">
              <span id="title" style="text-decoration:none;">EasyGig</span>
              <ul class="menu">
                  <li class="bar">
                      <a href="Login.html" style="color:white;">Login</a>
                  </li>
                  <li class="bar">
                      <a href="AboutUs.html" style="color:white;">About</a>
                  </li>
                  <li class="bar">
                      <a href="Help.html" style="color:white;">Help</a>
                  </li>
                  <li class="bar">
                      <a href="Search.html" style="color:white;">Search</a>
                  </li>
                  <li class="bar">
                      <a href="Inbox.html" style="color:white;">Inbox</a>
                  </li>
              </ul>
          </div>
      </nav>

      <header style="height:250px;">

          <div id="bars">
                  <table id="bartable">
                      <tr>
                          <td>
                              <div id="b1"></div>
                          </td>
                          <td>
                              <div id="b2"></div>
                          </td>
                          <td>
                              <div id="b3"></div>
                          </td>
                          <td>
                              <div id="b4"></div>
                          </td>
                          <td>
                              <div id="b5"></div>
                          </td>
                          <td>
                              <div id="b6"></div>
                          </td>
                          <td>
                              <div id="b7"></div>
                          </td>
                          <td>
                              <div id="b8"></div>
                          </td>
                          <td>
                              <div id="b9"></div>
                          </td>
                          <td>
                              <div id="b10"></div>
                          </td>
                          <td>
                              <div id="b11"></div>
                          </td>
                          <td>
                              <div id="b12"></div>
                          </td>
                          <td>
                              <div id="b13"></div>
                          </td>
                          <td>
                              <div id="b14"></div>
                          </td>
                          <td>
                              <div id="b15"></div>
                          </td>
                          <td>
                              <div id="b16"></div>
                          </td>
                          <td>
                              <div id="b17"></div>
                          </td>
                          <td>
                              <div id="b18"></div>
                          </td>
                          <td>
                              <div id="b19"></div>
                          </td>
                          <td>
                              <div id="b20"></div>
                          </td>
                          <td>
                              <div id="b21"></div>
                          </td>
                          <td>
                              <div id="b22"></div>
                          </td>
                          <td>
                              <div id="b23"></div>
                          </td>
                          <td>
                              <div id="b24"></div>
                          </td>
                          <td>
                              <div id="b25"></div>
                          </td>
                          <td>
                              <div id="b26"></div>
                          </td>
                          <td>
                              <div id="b27"></div>
                          </td>
                          <td>
                              <div id="b28"></div>
                          </td>
                          <td>
                              <div id="b29"></div>
                          </td>
                          <td>
                              <div id="b30"></div>
                          </td>
                      </tr>
                  </table>
              </div>
              <div id="background"></div>
      </header>

    <section class="bg-primary">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <img src="https://placehold.it/600x400" class="center-block img-responsive">
                    <br>
                    <br>
                    <div style="display:none;">
                    <h1>Testing files</h1>
                   Id: <p id="id"></p><br>
                    Name: <p id ="name"></p><br>
                    userType: <p id = "usatype"></p><br>
                    </div>
                    <script>
// Check browser support
if (typeof(Storage) !== "undefined") {
    // Store
  var id =  localStorage.getItem("userID");
   var name =  localStorage.getItem("name");
   var usatype = localStorage.getItem("userType");
    // Retrieve
   document.getElementById("id").innerHTML += id;
    document.getElementById("name").innerHTML += name;
    document.getElementById("usatype").innerHTML+=usatype;
}
</script>
                    <h2 class="section-heading" id="thevenuename"name="bandname">${venue_name}</h2>
                    <hr class="light">
                    <p>${venue_description}</p>
                    <p>${venue_email}</p>
                    <p>${venue_phone}</p>
                    <br>
                    <a href="${facebook}" class="btn btn-default btn-xl sr-button">Facebook</a>
                    <a href="${twitter}" class="btn btn-default btn-xl sr-button">Twitter</a>
                    <a href="${youtube}" class="btn btn-default btn-xl sr-button">YouTube</a>
                    <a href="./LiveFeed.html" class="btn btn-default btn-xl sr-button">Live Feed</a>

                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-lg-12 text-center">
<script type="text/javascript">
var i=0;
  function showform(){
    if(i==0){
    document.getElementById("hiddenform").style="display:normal;";
    i=1;
  }else{
    document.getElementById("hiddenform").style="display:none;";
    i=0;
  }
  }
</script>
                    <button type="button"class= "btn btn-default btn-xl" onclick="checkUser();" style="background-color:#175411; color:white; font-size:60px; padding-top:none;" name="button">Create An Event</button>

                    <form name="postform" id="hiddenform" style="display:none;"class="" action="./PostToFeed" method="post">
                      <br>
                       <input style="display:none;"type="text" name="bandname" value=""><br>
                      Title: <input type="text" name="title" value=""><br><br>
                      Content: <textarea form="postform" name="content" rows="8" cols="80"></textarea>
                      <input type="submit" class= "btn btn-default btn-xl" name="" value="Submit Post">
                    </form>
                </div>
            </div>
        </div>
    </section>
    <script type="text/javascript">

    function checkUser(){
      var clicker = localStorage.getItem("name");
      var pagename = document.getElementById("thisisthevenue").value;
      alert("your account name:"+clicker+" owner of the page:"+pagename);
      if(clicker != pagename){
        alert("Only The Profile Owner Can Create An Event!");
      }else{
        window.location = "./CreateVenueEvent.html";
      }
    }
function artist(){
var a=document.getElementById("artist").value;
document.getElementById("myartist").innerHTML=a;
var b=document.getElementById("artist");
b.parentNode.removeChild(b);
return false;
document.getElementById("but").style.visibility='hidden';
}
</script>
<div class="container">
<div class="row">
<div class="col-lg-12 text-center">
    <h2 class="section-heading">Events!</h2>
    <hr class="primary">
</div>
</div>

</div>
<center>
<button type="button"class="btn btn-default btn-xl" onclick="showEvents();"name="button">Show Events</button>
</center>
<div id="events">
<!--
    <form action="./CreateEventVenue" method="get">
        <table>
<tr>
<td>Name:</td>
<td style="color: white;">${(name)! "No Events Created!"}</td>
</tr>
<tr>
<td>Date: </td>
<td style="color: white;">${(date)!}</td>
</tr>
<tr>
<td>Preferred Genre: </td>
<td style="color: white;">${(genre)!}</td>
</tr>
<tr>
<td>Description: </td>
<td style="color: black;">${(description)!}</td>
</tr>
</table>
    </form>
Artist: <input type="text" name="artist" id="artist"/>
<div id="myartist"></div>
<input type="button" value="Submit" id="but" onclick="artist()"/>
-->
</div>


<input type="text" id="thisisthevenue" style="display:none;"name="" value="${venue_name}">
<script>
function showEvents(){
  var venname = document.getElementById("thisisthevenue").value;
if (window.XMLHttpRequest) {
// code for IE7+, Firefox, Chrome, Opera, Safari
xmlhttp=new XMLHttpRequest();
} else {  // code for IE6, IE5
xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
}
xmlhttp.onreadystatechange=function() {
if (this.readyState==4 && this.status==200) {
document.getElementById("events").innerHTML=this.responseText;
document.getElementById("events").style.border="1px solid #A5ACB2";
}
}

xmlhttp.open("GET","showEvents?name="+venname,true);
xmlhttp.send();
}

</script>
<script type="text/javascript">

function signUp(eventid){
  var userid = parseInt(localStorage.getItem("userID"));
  if(userid>=2000000){
    alert("Your account is registered to a venue! Venues cannot sign up for events!");
    return;
  }
  if (window.XMLHttpRequest) {
  // code for IE7+, Firefox, Chrome, Opera, Safari
  xmlhttp=new XMLHttpRequest();
  } else {  // code for IE6, IE5
  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
  }
  xmlhttp.onreadystatechange=function() {
  if (this.readyState==4 && this.status==200) {
  document.getElementById("events").innerHTML=this.responseText;
  document.getElementById("events").style.border="1px solid #A5ACB2";
  }
  }

  xmlhttp.open("GET","eventSignUp?eventid="+eventid+"&bandid="+userid,true);
  xmlhttp.send();
  alert("Congrats! You've Signed up to perform at this Event! Contact the venue for further details!");
}
</script>

</div>
</div>
</div>
</section>





    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src="vendor/scrollreveal/scrollreveal.min.js"></script>
    <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/creative.min.js"></script>

</body>

</html
