<!DOCTYPE html>
<html>
<head>
	<title>Problema</title>
</head>
<body>
<?php
function contramal($valor1,$valor2)
 {
 	if ($valor1==$valor2) {
 	echo "Usuario y contraseña registrados Correctamente";	
 	}
 	else {
 		echo "contraseñas diferentes ingrese nuevamente";
 	}
 }

$v1=$_REQUEST['contraseña1'];
$v2=$_REQUEST['contraseña2'];

$p=contramal($v1,$v2);
 ?>
</body>

</html>