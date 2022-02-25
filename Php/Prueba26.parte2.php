<!DOCTYPE html>
<html>
<head>
	<title>Problema</title>
</head>
<body>
<?php 
function retornarpromedio($valor1,$valor2)
 {
 	$pro=($valor1+$valor2)/2;
 	return $pro;
 }

$v1=100;
$v2=50;

$p=retornarpromedio($v1,$v2);
echo $p;
 ?>
</body>
</html>