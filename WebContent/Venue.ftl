<!DOCTYPE html>
<html lang="en">

<head>
    <link href="css/creative.min.css" rel="stylesheet">
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
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

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

<body id="page-top"onload="movethem()" style="background-color:none;">
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
            </ul>
        </div>
    </nav>

    <header style="height:250px;">
        <center>
                <form class="searchbar" style="padding-top:100px; background-color:transparent; color: #557c33">
                    <input list="searchchoices" type="search" name="search" onclick=displaysearchtypes() placeholder="Search band, venue, genre..." style="padding-left:20px; width:70%; height:50px; background-color:transparent; border:2px solid #ccc; border-radius:20px; color:white; font-weight:bold;" required>
                    <datalist id="searchchoices">
                        <option value="Demo Band">
                        <option value="Demo Venue">
                        <option value="Demo Genre">
                    </datalist>
                    <br>
                    <div id="searchradiobuttons">
                        <input type="radio" name="searchtype" value="band"> Band
                        <input type="radio" name="searchtype" value="venue"> Venue
                        <input type="radio" name="searchtype" value="genre"> Genre
                    </div>
                </form>
        </center>
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
                    <h2 class="section-heading">Venue Name</h2>
                    <hr class="light">
                    <p>Venue Description</p>
                    <br>
                    <a href="http://facebook.com" class="btn btn-default btn-xl sr-button">Facebook</a>
                    <a href="http://twitter.com" class="btn btn-default btn-xl sr-button">Twitter</a>
                    <a href="http://google.com" class="btn btn-default btn-xl sr-button">Website</a>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-lg-12 text-center">
                    <a href="CreateVenueEvent.html">
                    <button style="background-color:#175411; color:white; font-size:30px; padding-top:none;" type="button">
                        Create an Event
                    </button>
                    </a>
                    <script type="text/javascript">
	function artist(){
		var a=document.getElementById("artist").value;
		document.getElementById("myartist").innerHTML=a;
		var b=document.getElementById("artist");
		b.parentNode.removeChild(b);
		return false;	
		document.getElementById("but").style.visibility='hidden';
	}
</script>
                    
                    <form action="./CreateEventVenue" method="get">
                        <table>
    <tr>
        <td>Name:</td>
        <td style="color: black;">${name}</td>
    </tr>    
    <tr>
        <td>Date: </td>
        <td style="color: black;">${date}</td>
    </tr>
    <tr>
        <td>Preferred Genre: </td>
        <td style="color: black;">${genre}</td>
    </tr>
    <tr>
        <td>Description: </td>
        <td style="color: black;">${description}</td>
    </tr>
    </table>
                    </form>
     Artist: <input type="text" name="artist" id="artist"/>
    <div id="myartist"></div>
    <input type="button" value="Submit" id="but" onclick="artist()"/>
                </div>
            </div>
        </div>
    </section>

    <section class="no-padding" id="gallery">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Events!</h2>
                    <hr class="primary">
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

</html>
