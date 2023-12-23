<?php 
 include 'koneksi.php';
 $id = $_GET['id'];
 mysqli_query($koneksi, "DELETE FROM data_beasiswa WHERE id='$id'");
 
echo "<script> 
            alert('Data berhasil dihapus!');
            document.location.href = 'hasil.php';
        </script>
    ";
 
?>