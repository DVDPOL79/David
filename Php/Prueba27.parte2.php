<!DOCTYPE html>
<html>
<head>
	<title>Problema</title>
</head>
<body>
<?php 
function cuadrado($valor1)
 {
 	$cuad=$valor1*$valor1;
 	return $cuad;
 }
function cubo($valor1)
 {
 	$cub=$valor1*$valor1*$valor1;
 	return $cub;
 }

$v1=5;

$c=cuadrado($v1);
echo "el cuadrado de ".$v1." es ".$c;
echo "<br>";
$d=cubo($v1);
echo  "el cubo de ".$v1." es ".$d;

 ?>
</body>

</html>