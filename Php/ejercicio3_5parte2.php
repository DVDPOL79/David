<html>

<head>
  <title>Problema</title>
</head>

<body>

  <?php
  if ($_FILES['foto1']['tmp_name'] != "") {
    copy($_FILES['foto1']['tmp_name'], $_FILES['foto1']['name']);
    $nom = $_FILES['foto1']['name'];
    echo "<img src=\"$nom\">";
  }
  if ($_FILES['foto2']['tmp_name'] != "") {
    copy($_FILES['foto2']['tmp_name'], $_FILES['foto2']['name']);
    $nom = $_FILES['foto2']['name'];
    echo "<img src=\"$nom\">";
  }
  if ($_FILES['foto3']['tmp_name'] != "") {
    copy($_FILES['foto3']['tmp_name'], $_FILES['foto3']['name']);
    $nom = $_FILES['foto3']['name'];
    echo "<img src=\"$nom\">";
  }

  ?>

</body>

</html>