<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Beasiswa</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <link href="foto/logo.png" rel="icon">
  </head>
  <body>
    <div class="container-fluid">
    <!-- Navigasi -->
        <nav class="navbar navbar-expand-lg" >
            <div class="container-fluid fs-4">
            <ul class="nav navbar-nav">
            <li><img  class="image"src="foto/logo.png" border="0" width="100px" style="margin: 1px;padding: 0px color:white;"></li>
            </ul>
                <a class="navbar-brand text-warning"><h1>Beasiswa</h1></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse d-flex justify-content-end" id="navbarNav">
                    <ul class="nav nav-pills">
                        <li class="nav-item mx-4">
                            <a class="nav-link active text-light" aria-current="page" href="index.php">Pilihan Beasiswa</a>
                        </li>
                        <li class="nav-item mx-4">
                            <a class="nav-link" href="daftar.php">Daftar</a>
                        </li>
                        <li class="nav-item mx-4">
                            <a class="nav-link" href="hasil.php">Hasil</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Konten Pilihan Beasiswa -->
        <h3 class="text-center my-3">Pilihan Beasiswa</h3>
        <div class="row d-flex justify-content-center">
            <div class="col-sm-4 mb-3 mb-sm-0">
                <div class="card">
                <img src="foto/inii.png" class="card-img-top mt-2"  style="width: 275px; height: 275px; display:line; margin:auto;">
                    <div class="card-body">
                        <h5 class="card-title mt-2">Beasiswa Akademik</h5>
                        <ul>
                            <li>Pendaftar masuk ke PTN/PTS melalui jalur reguler.</li>
                            <li>Pendaftar berada dalam rentang semester 2-7 (S1/D4) atau 2-5 (D3).</li>
                            <li>Merupakan seorang mahasiswa aktif.</li>
                            <li>Indeks Prestasi Kumulatif (IPK) minimal 3,00.</li>
                            <li>Berkelakuan baik serta memiliki prestasi (akademik/organisasi).</li>
                            <li>Tidak sedang menerima/mendaftarkan diri ke beasiswa lain.</li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="card">
                <img src="foto/iniii.png" class="card-img-top mt-2"  style="width: 350px; height: 275px; display:line; margin:auto;">
                    <div class="card-body">
                        <h5 class="card-title mt-2">Beasiswa Non-Akademik</h5>
                        <ul>
                            <li>Pendaftar masuk ke PTN/PTS melalui jalur reguler.</li>
                            <li>Beasiswa ini diperuntukkan untuk Program Reguler Prodi S1, D4, dan D3.</li>
                            <li>Besaran Beasiswa diberikan sesuai dengan tingkat prestasi.</li>
                            <li>Indeks Prestasi Kumulatif (IPK) minimal 3,00.</li>
                            <li>Berkelakuan baik serta memiliki prestasi (akademik/organisasi).</li>
                            <li>Tidak sedang menerima/mendaftarkan diri ke beasiswa lain.</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <?php
    include 'koneksi.php';
    ?>

    <div class="container mt-4">
      <h2>Grafik Data Beasiswa</h2>
      <canvas id="myChart"></canvas>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.5.1/chart.min.js"></script>
    <script>
      var ctx = document.getElementById("myChart").getContext('2d');
      var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
          labels: ["Akademik", "Non-Akademik"],
          datasets: [{
            label: 'Jumlah Beasiswa',
            data: [

              <?php
              $akademik = mysqli_query($koneksi, "select * from data_beasiswa where pilihan_beasiswa='Akademik'");
              echo mysqli_num_rows($akademik);
              ?>,
              <?php
              $nonakademik = mysqli_query($koneksi, "select * from data_beasiswa where pilihan_beasiswa='Non Akademik'");
              echo mysqli_num_rows($nonakademik);
              ?>,

            ],
            backgroundColor: [
              'rgba(255, 99, 132, 0.2)',
              'rgba(54, 162, 235, 0.2)',
              'rgba(255, 206, 86, 0.2)',
              'rgba(75, 192, 192, 0.2)'
            ],
            borderColor: [
              'rgba(255,99,132,1)',
              'rgba(54, 162, 235, 1)',
              'rgba(255, 206, 86, 1)',
              'rgba(75, 192, 192, 1)'
            ],
            borderWidth: 1
          }]
        },
        options: {
          scales: {
            yAxes: [{
              ticks: {
                beginAtZero: true
              }
            }]
          }
        }
      });
    </script>
        <!-- Footer -->
        <div class="footer bg-primary text-center text-light mt-5 p-3 ">
            <i class="fa fa-copyright" aria-hidden="true"> 
                Copyright @ raflhynr
            </i>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
  </body>
</html>