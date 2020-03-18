<?php

include("config.php");

$sql = "SELECT * FROM berita";
$result = array();
$query = mysqli_query($db, $sql);

while($row = mysqli_fetch_array($query)){
    array_push($result, array(
    	'id' => $row['id'],
    	'judul' => $row['judul'],
    	'waktu' => $row['waktu'],
    	'penulis' => $row['penulis'],
    	'isi' => $row['isi']
    	
));
}
echo json_encode(array("result" => $result));
?>



