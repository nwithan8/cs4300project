<!DOCTYPE html>
<html lang="en">

<head>

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

<body id="page-top">

    <nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">EasyGig</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="Login.html">Login</a>
                    </li>
                    <li>
                        <a href="AboutUs.html">About</a>
                    </li>
                    <li>
                        <a href="Help.html">Help</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>

    <header style="min-height:200px;">
        <center>
                <form class="searchbar" style="padding-top:100px; background-color:transparent;">
                <input type="search" name="search" placeholder="Search band, venue, genre..." style="padding-left:20px; width:70%; height:50px; background-color:transparent; border:2px solid #ccc; border-radius:20px; color:white; font-weight:bold;" required>
                    <datalist id="searchchoices">
                        <option value="Demo Band">
                        <option value="Demo Venue">
                        <option value="Demo Genre">
                    </datalist>
            </form>
        </center>
    </header>

    <section class="bg-primary">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <img src="https://placehold.it/600x400" class="center-block img-responsive">
                    <br>
                    <br>
                    <h2 class="section-heading"name="bandname">${band_name}</h2>
                    <hr class="light">
                    <p>${band_description}</p>
                    <p>${band_email}</p>
                    <p>${band_phone}</p>
                    <h4 style="font-style:oblique;"><a href="band.html" class="text-faded">Genre</a> <a href="band.html" class="text-faded">Genre</a> <a href="band.html" class="text-faded">Genre</a></h4>
                    <br>
                    <a href="http://facebook.com" class="btn btn-default btn-xl sr-button">Facebook</a>
                    <a href="http://twitter.com" class="btn btn-default btn-xl sr-button">Twitter</a>
                    <a href="http://soundcloud.com" class="btn btn-default btn-xl sr-button">SoundCloud</a>
                    <a href="http://youtube.com" class="btn btn-default btn-xl sr-button">YouTube</a>
                    <a href="./LiveFeed.html" class="btn btn-default btn-xl sr-button">Live Feed</a>
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

    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Details</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-4 text-center">
                    <div class="service-box">
                        <a href=""><i class="material-icons" style="font-size:60px;">date_range</i>
                        <h3>Schedule</h3></a>
                        <p class="text-muted">When are you available?</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 text-center">
                    <div class="service-box">
                        <a href=""><i class="material-icons" style="font-size:60px;">attach_money</i>
                        <h3>Pricing</h3></a>
                        <p class="text-muted">How much do you charge?</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 text-center">
                    <div class="service-box">
                        <a href=""><i class="material-icons" style="font-size:60px;">thumbs_up_down</i>
                        <h3>Reviews</h3></a>
                        <p class="text-muted">What do other people think?</p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="no-padding" id="gallery">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Gallery</h2>
                    <hr class="primary">
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row no-gutter popup-gallery">
                <div class="col-lg-4 col-sm-6">
                    <a href="" class="portfolio-box">
                        <img src="http://placehold.it/650x350" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Concert Date
                                </div>
                                <div class="project-name">
                                    Location
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="" class="portfolio-box">
                        <img src="http://placehold.it/650x350" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Concert Date
                                </div>
                                <div class="project-name">
                                    Location
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="" class="portfolio-box">
                        <img src="http://placehold.it/650x350" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Concert Date
                                </div>
                                <div class="project-name">
                                    Location
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="" class="portfolio-box">
                        <img src="http://placehold.it/650x350" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Concert Date
                                </div>
                                <div class="project-name">
                                    Location
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="" class="portfolio-box">
                        <img src="http://placehold.it/650x350" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Concert Date
                                </div>
                                <div class="project-name">
                                    Location
                                </div>
                            </div>
                        </div>
                    </a>
                </div>
                <div class="col-lg-4 col-sm-6">
                    <a href="" class="portfolio-box">
                        <img src="http://placehold.it/650x350" class="img-responsive" alt="">
                        <div class="portfolio-box-caption">
                            <div class="portfolio-box-caption-content">
                                <div class="project-category text-faded">
                                    Concert Date
                                </div>
                                <div class="project-name">
                                    Location
                                </div>
                            </div>
                        </div>
                    </a>
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
