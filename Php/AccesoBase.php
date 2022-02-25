<!DOCTYPE html>
<html>
<head>
	<title>Problema</title>
</head>
<body>
<h1>Alta de Alumnos</h1>
<form action="http://localhost/AccesoBass.php/" method="post">
Ingrese su nombre:
<input type="text" name="nombre"><br>
Ingrese su mail:
<input type="text" name="mail"> <br>
Seleccione el curso
<select name="codigocurso">
	<option value="1">PHP</option>
	<option value="2">ASP</option>
	<option value="3">JSP</option>
</select>
<input type="submit" name="Registrar">
</form>
</body>
</html>
