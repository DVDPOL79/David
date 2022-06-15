<!DOCTYPE html>
<html>
<head>
	<title>Problema</title>
</head>
<body>
 <?php 
 $conexion = mysqli_connect("localhost","root","","sugerencias") or die("Problemas de conexion");

 mysqli_query($conexion,"insert into datos(nombre,email,telefono,mensaje) values ('$_REQUEST[nombre]','$_REQUEST[email]','$_REQUEST[telefono]','$_REQUEST[mensaje]')")
 	or die("Problemas en el select".mysqli_error($conexion));

 	mysqli_close($conexion);

 	echo
   
    '
   
<header>
<div class="menu">
 <!--<img class="logo" src="img/logo.png" alt="logo">--> 
  <nav>
      <ul class="list-nav">
        <li><a href="#"><i class="fa-solid fa-house"></i>Inicio</a></li>
        <li><a href="#"><i class="fa-solid fa-store"></i> Productos</a>
        <li><a href="#"><i class="fa-solid fa-hand-holding-dollar"></i> Donaciones</a></li>
        <li><a href="#"><i class="fa-solid fa-address-card"></i> Contacto</a></li>
        <li><a href="#"><i class="fa-solid fa-cart-shopping"></i></a></li>
      </ul>
  </nav>
</div>
</header>


<h2> Gracias por su sugerencia, puede seguir navegando por nuestras paginas si le apetece
</h2>

<style >
    aside,section{
        width: 50%;
        float: left;
    }
.menu{
    width: 900px;
    margin: 0 auto;
}

header{
    background-color: #239894b6;
    width: 100%;
    clear: both;

    display: table;
}

.logo{
    width: 250px;
    height: 200px;
    float: left;
    padding: 8px;
}

nav{
    float: right;
}

nav ul li{
    list-style: none;
    margin-left: 25px;
    padding: 15px 0;
    float: left;
    position: relative;
}

nav ul li a{
    text-decoration: none;
    color: #194093;
    font-weight: bold;
    font-size: 19px;
}

nav ul li a::before{
    display: block;
    width: 0%;
    background-color: blue;
    height: 5px;
    top: 0;
    position: absolute;
    transition: width 0.2s;
}

nav ul li a:hover::before{
    width: 100%;
}

body{
    background-color: #d6fffb; 
}
hr{
    width: 100%;
}
</style>
    



    
    ';
  ?>

  
</body>
</html>
