<?php 

	include ("configMahasiswa.php");

	$nama_mahasiswa = $_POST['nama_mahasiswa'];
	$nomer_mahasiswa = $_POST['nomer_mahasiswa'];
	$alamat_mahasiswa = $_POST['alamat_mahasiswa'];

	// $sql = "INSERT INTO mahasiswa VALUES ('$nama_mahasiswa', '$nomer_mahasiswa', '$alamat_mahasiswa')";
	$sql = "INSERT INTO mahasiswa (id_data, nama_mahasiswa, nomer_mahasiswa, alamat_mahasiswa) VALUES ('', '$nama_mahasiswa', '$nomer_mahasiswa', '$alamat_mahasiswa')";
	$query = mysqli_query($db, $sql);

	if($query){
		
	}else{
		die("Gagal menyimpan...");
	}

?>