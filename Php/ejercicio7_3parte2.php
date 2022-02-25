<html>
<head>
  <title>Problema</title>
</head>

<body>

  <?php
  $conexion = mysqli_connect("localhost", "root", "", "base1") or
    die("Problemas con la conexión");

  $registros = mysqli_query($conexion, "select * from cursos
                        where codigo=$_REQUEST[codigo]") or
    die("Problemas en el select:" . mysqli_error($conexion));
  if ($reg = mysqli_fetch_array($registros)) {
    ?>

    <form action="ejercicio6_6parte2.php" method="post">
      Ingrese el nuevo nombre del cursos:
      <input type="text" name="nombrenuevo" value="<?php echo $reg['nombrecurso'] ?>">
      <input type="hidden" name="nombreviejo" value="<?php echo $reg['nombrecurso'] ?>">
      <br>
      <input type="submit" value="Modificar">
    </form>

  <?php
  } else
    echo "No existe un curso con dicho codigo";
  ?>
</body>

</html>