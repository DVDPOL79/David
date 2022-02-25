<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<?php 
	$conexion=mysqli_connect("localhost","root","","base1") or die("Problemas con la conexion")
	$registros=mysqli_query($conexion,"select codigo,nombre,codigocurso from alumnos where mail='$_REQUEST['mail']'") or die("problemas en el select:".mysqli_error($conexion));

if ($reg=mysqli_fetch_array($registros)) {
	echo "nombre: ".$reg['nombre']."<br>";
	echo "Curso:";
	switch ($reg['codigocurso']) {
		case 1:echo "PHP";
			break;
		case 2:echo "ASP";
			break;
		case 3:echo "JSP";
			break;
	}
	else {

	}
}

 ?>
</body>
</html>