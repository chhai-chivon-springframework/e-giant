<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        /* Remove the navbar's default rounded borders and increase the bottom margin */
        .navbar {
            margin-bottom: 50px;
            border-radius: 0;
        }

        /* Remove the jumbotron's default bottom margin */
        .jumbotron {
            margin-bottom: 0;
        }

        /* Add a gray background color and some padding to the footer */
        footer {
            background-color: #f2f2f2;
            padding: 25px;
        }
    </style>
    <link rel="stylesheet" src="${pageContext.request.contextPath}/resources/static/css/bootstrap.min.css">
    <link rel="stylesheet" src="${pageContext.request.contextPath}/resources/static/css/style.css">
    <script src="${pageContext.request.contextPath}/resources/static/js/js.js"></script>
    <script src="${pageContext.request.contextPath}/resources/static/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/static/js/bootstrap.min.js"></script>
</head>
<body>

<%@include file="includes/header.jsp" %>


<%@include file="includes/footer.jsp" %>

<div class="jumbotron">
    <div class="container text-center">
        <h1>Online Store</h1>
        <p>Mission, Vission & Values</p>
    </div>
</div>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#">Products</a></li>
                <li><a href="#">Deals</a></li>
                <li><a href="#">Stores</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <div class="row">
        <div class="col-sm-8">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="https://placehold.it/800x400?text=IMAGE" alt="Image">
                        <div class="carousel-caption">
                            <h3>Sell $</h3>
                            <p>Money Money.</p>
                        </div>
                    </div>

                    <div class="item">
                        <img src="https://placehold.it/800x400?text=Another Image Maybe" alt="Image">
                        <div class="carousel-caption">
                            <h3>More Sell $</h3>
                            <p>Lorem ipsum...</p>
                        </div>
                    </div>
                </div>

                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="well">
                <p>Some text..</p>
            </div>
            <div class="well">
                <p>Upcoming Events..</p>
            </div>
            <div class="well">
                <p>Visit Our Blog</p>
            </div>
        </div>
    </div>
    <hr>
</div>


<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <div class="panel panel-primary">
                <div class="panel-heading">BLACK FRIDAY DEAL</div>
                <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-danger">
                <div class="panel-heading">BLACK FRIDAY DEAL</div>
                <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-success">
                <div class="panel-heading">BLACK FRIDAY DEAL</div>
                <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
            </div>
        </div>
    </div>
</div><br>

<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <div class="panel panel-primary">
                <div class="panel-heading">BLACK FRIDAY DEAL</div>
                <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-primary">
                <div class="panel-heading">BLACK FRIDAY DEAL</div>
                <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-primary">
                <div class="panel-heading">BLACK FRIDAY DEAL</div>
                <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
                <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
            </div>
        </div>
    </div>
</div><br><br>

<footer class="container-fluid text-center">
    <p>Online Store Copyright</p>
    <form class="form-inline">Get deals:
        <input type="email" class="form-control" size="50" placeholder="Email Address">
        <button type="button" class="btn btn-danger">Sign Up</button>
    </form>
</footer>

</body>
</html>

