<html>
<head>
	<title>Conexion</title>
</head>
<body>
	<?php  
	$conexion=mysqli_connect("localhost","root","","base1") or die("Problemas con la conexion");

	$registros=mysqli_query($conexion,"update alumnos set mail='$_REQUEST[mailnuevo]' where mail='$_REQUEST[mailviejo]'") or die("Problemas en el select".mysqli_error($conexion));

	echo "Se logro cambiar el correo con satisfaccion";

	?>
</body>
</html>