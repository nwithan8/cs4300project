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
    <script type = "text/javascript">
$(window).load(function() {
    setTimeout(function() {
        $("#contentPost").show('fadeIn', {}, 500)
    }, 2000);
});
</script>

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

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                <style>
.contentPost { display:none;}
</style>

<div class="contentPost">
<h2>Almost Ready!</h2>
</div>

<div class="contentPost">
<h2>Almost Ready!</h2>
</div>

                    <h2 class="section-heading" name ="name"value="${bandname}"><#if bandname??>${bandname}<#else>BandNameMissing</#if></h2>
                    <br>
                    <form id="postform" action="./CreateBand" method="post" style="font-size:18px; text-align:left;">
                
                        <input style="display:none;"type="text"name="bandname" value="${bandname}">
                        <input style="display:none;"type="text"name="email" value="${email}">
                        <input style="display:none;"type="text"name="description" value="${description}">


                       <center>
                        <table style="width:80%">

                            <tr>
                                <td>
                                    <p>Photo</p>
                                </td>
                                <td>
                                    <input type="file" name="bandphoto" style="width:70%; margin-bottom:10px;">
                                </td>
                           </tr>

                            <tr>
                                <td>
                                    <p>Genre(s)*</p>
                                </td>
                                <td>
                                    <select name="genres" size="5" style="color:black;" multiple required>
                                        <optgroup label="Rock">
                                            <option value="heavyrock">Heavy Rock</option>
                                            <option value="classicrock">Classic Rock</option>
                                            <option value="punkrock">Punk Rock</option>
                                            <option value="modernrock">Modern Rock</option>
                                        </optgroup>
                                        <optgroup label="Pop">
                                            <option value="top40spop">Top 40s</option>
                                            <option value="dancepop">Dance Pop</option>
                                            <option value="classicpop">Classic Pop</option>
                                        </optgroup>
                                        <optgroup label="Country">
                                            <option value="comtemporarycountry">Contemporary</option>
                                            <option value="bluegrasscountry">Bluegrass</option>
                                            <option value="urbancountry">Urban Country</option>
                                        </optgroup>
                                        <optgroup label="Alternative">
                                            <option value="altrock">Alternative Rock</option>
                                            <option value="altpop">Alternative Pop</option>
                                            <option value="altrap">Alternative Rap</option>
                                            <option value="indie">Indie</option>
                                        </optgroup>
                                        <optgroup label="Hip Hop / Rap">
                                            <option value="hiphop">Hip Hop</option>
                                            <option value="gangsta">Gangsta Rap</option>
                                            <option value="oldschoolrap">Old School Rap</option>
                                        </optgroup>
                                        <optgroup label="Instrumental">
                                            <option value="electronic">Electronic / Dance</option>
                                            <option value="dubstep">Dubstep</option>
                                            <option value="jazz">Jazz</option>
                                            <option value="classical">Classical</option>
                                        </optgroup>
                                        <option value="vocal">Vocal</option>
                                        <option value="other">Other</option>
                                    </select>
                                </td>
                           </tr>
                           <tr>
                                <td>
                                    <b>Contact:</b>
                                </td>
                                <td>
                                </td>
                           </tr>

                           <tr>
                                <td>
                                    <p>Telephone*</p>
                                </td>
                                <td>
                                    <input type="text" name="phonenumber" style="color:grey; width:70%; margin-bottom:10px;" required>
                                </td>
                           </tr>

                           <tr>
                                <td>
                                    <b>Social Media:</b>
                                </td>
                                <td>
                                </td>
                           </tr>
                           <tr>
                                <td>
                                    <p>Facebook</p>
                                </td>
                                <td>
                                    <input type="url" name="facebook" style="color:grey; width:70%; margin-bottom:10px;">
                                </td>
                           </tr>
                           <tr>
                                <td>
                                    <p>Twitter</p>
                                </td>
                                <td>
                                    <input type="url" name="twitter" style="color:grey; width:70%; margin-bottom:10px;">
                                </td>
                           </tr>
                           <tr>
                                <td>
                                    <p>SoundCloud</p>
                                </td>
                                <td>
                                    <input type="url" name="soundcloud" style="color:grey; width:70%; margin-bottom:10px;">
                                </td>
                           </tr>
                           <tr>
                                <td>
                                    <p>YouTube</p>
                                </td>
                                <td>
                                    <input type="url" name="youtube" style="color:grey; width:70%; margin-bottom:10px;">
                                </td>
                           </tr>
                           <tr>
                                <td>
                                    <p style="font-size:12px;">*Required</p>
                               </td>
                           </tr>
                        </table>
                        <br>
                        <input type=submit value="Done" class="btn btn-default btn-xl sr-button">
                            </center>
                    </form>
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
