<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

    <title>Hello, world!</title>
     <style>

        .container{
            width: 500px;
            height: auto;
            background-color: grey;
            padding: 15px;
        }
    </style>
    
  </head>
<body>
<%-- Display success message --%>

   
<div class="container mt-3 bg-primary">
<h1 class="text-center">BOOK DATA</h1>
<form action="LOG" method="post">
BOOK NAME:</br>
<input type="text" name="bname" class="form-control" placeholder="bookname" required/>
<br>
BOOK PRICE:<br>
<input type="text" name="bprice" class="form-control" placeholder="price" required/><br>
BOOK AUTHOR:<br>
<input type="text" name="bauthor" class="form-control" placeholder="author" required/>


<br>
<input type="submit" value="Save Book" class="btn btn-success  bg-success mt-2 border-rounded"/>
<br/>
<c:if test="${not empty requestScope.Success}">
        <p>${requestScope.Success}</p>
    </c:if>

<a href="LOG" class="btn btn-warning">View details</a>
</form>


</div>


 <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</body>
</html>