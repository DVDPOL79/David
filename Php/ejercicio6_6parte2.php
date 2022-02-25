<html>

<head>
    <title>Problema</title>
</head>

<body>
    <?php
    $conexion = mysqli_connect("localhost", "root", "", "base1") or
        die("Problemas con la conexión");
        $sql="select codigo from cursos where nombrecurso='$_REQUEST[nombreviejo]'";
        $registros = mysqli_query($conexion,$sql) or
        die("ERROR :" . mysqli_error($conexion));
        if ($reg = mysqli_fetch_array($registros)) {

    mysqli_query($conexion, "update cursos
                          set nombrecurso='$_REQUEST[nombrenuevo]' 
                        where nombrecurso='$_REQUEST[nombreviejo]'") or
        die("Problemas en el select:" . mysqli_error($conexion));
    echo "Se modificó el nombre del curso";
    } else {
    echo "No existe el curso";
  }
  mysqli_close($conexion);
    ?>
</body>

</html>