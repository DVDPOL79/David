<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<?php 
function mostrarticulo($men) 
{
	echo "<h1 style=\"text-align:center\">";
	echo $men;
	echo "</h1>";
}

mostrarticulo("Primer titulo");
echo "<br>";
mostrarticulo("Segundo Titulo");
 ?>
</body>
</html>