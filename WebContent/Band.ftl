<!DOCTYPE html>
<html lang="en">

<head>
  <link rel="stylesheet" href="css/creative.css">
   <link href="css/creative.min.css" rel="stylesheet">
   <script src="js/animate.js"></script>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>EasyGig</title>



</head>


  <body id="page-top"onload="movethem()" style="background-color:none;">
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
                    <h1 style="display:none;">Testing files</h1>
                   Id: <p id="id"></p><br>
                    Name: <p id ="name"></p><br>
                    </div>
                    <script>
// Check browser support

if (typeof(Storage) !== "undefined") {
    // Store
  var id =  localStorage.getItem("userID");
   var name =  localStorage.getItem("name");
    // Retrieve
   document.getElementById("id").innerHTML += id;
    document.getElementById("name").innerHTML += name;
}

</script>
                    <h2 class="section-heading"name="bandname">${band_name}</h2>
                    <hr class="light">
                    <p>${band_description}</p>
                    <p>${band_email}</p>
                    <p>${band_phone}</p>
                    <br>
                    <a href="${facebook}" class="btn btn-default btn-xl sr-button">Facebook</a>
                    <a href="${twitter}" class="btn btn-default btn-xl sr-button">Twitter</a>
                    <a href="${soundcloud}" class="btn btn-default btn-xl sr-button">SoundCloud</a>
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
                    <button type="button"class= "btn btn-default btn-xl" style="background-color:#175411; color:white; font-size:60px; padding-top:none;" onclick="showform();"name="button">Post To Feed</button>

                    <form name="postform" id="hiddenform" style="display:none;"class="" action="./PostToFeed" method="post">
                      <br>
                       <input style="display:none;"type="text" name="bandname" value="${band_name}"><br>
                      Title: <input type="text" name="title" value=""><br><br>
                      Content: <textarea form="postform" name="content" rows="8" cols="80"></textarea>
                      <input type="submit" class= "btn btn-default btn-xl" name="" value="Submit Post">
                    </form>
                </div>
            </div>
        </div>
    </section>



    <section class="no-padding" id="gallery">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Past and Upcoming Performances</h2>
                    <hr class="primary">
                    <button type="button"class="btn btn-default btn-xl" onclick="showEvents();"name="button">Show Events</button>

                </div>
            </div>
        </div>
        <input type="text" id="thisistheband" style="display:none;"name="" value="${band_name}">

        <div id="events">

        </div>
        <script>
        function showEvents(){
          var bandname = document.getElementById("thisistheband").value;
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

        xmlhttp.open("GET","showBandEvents?name="+bandname,true);
        xmlhttp.send();
        }

        </script>

    </section>

    <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>


    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

    <!-- Theme JavaScript -->
    <script src="js/creative.min.js"></script>

</body>

</html>
