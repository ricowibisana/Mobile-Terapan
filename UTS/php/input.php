<?php

include("config.php");

	$id = $_POST['id'];
	$judul = $_POST['judul'];
	$waktu = $_POST['waktu'];
	$penulis = $_POST['penulis'];
	$isi = $_POST['isi'];


	$sql = "UPDATE jadwal_sholat SET id='$id', judul='$judul', waktu='$waktu', penulis='$penulis', isi='$isi' WHERE id_berita=1";
	$query = mysqli_query($db, $sql);

	if($query){
		echo "Update Successful";
	}else{
		die("Gagal menyimpan perubahan");
	}
?>