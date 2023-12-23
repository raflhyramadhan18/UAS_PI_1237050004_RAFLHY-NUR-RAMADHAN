-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Sep 2023 pada 15.44
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_beasiswa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_beasiswa`
--

CREATE TABLE `data_beasiswa` (
  `id` int(13) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `nomor` varchar(25) NOT NULL,
  `semester` enum('Semester 1','Semester 2','Semester 3','Semester 4','Semester 5','Semester 6','Semester 7','Semester 8') NOT NULL,
  `nilai` float NOT NULL,
  `pilihan_beasiswa` enum('Akademik','Non Akademik') NOT NULL,
  `berkas` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_beasiswa`
--

INSERT INTO `data_beasiswa` (`id`, `nama`, `email`, `nomor`, `semester`, `nilai`, `pilihan_beasiswa`, `berkas`) VALUES
(41, 'Anjar Faudzan Nuryadin', 'anjar@gmail.com', '12362793691', 'Semester 3', 3.44, 'Non Akademik', 'Junior Web Developer (11).png'),
(43, 'Irsyad', 'Irsyad@gmail.com', '2639162397', 'Semester 5', 3.17, 'Akademik', 'Form Registrasi Masyarakat.png'),
(44, 'Aziz', 'aziz@gmail.com', '08129073816', 'Semester 8', 3.46, 'Non Akademik', 'Tampilan Laporan Kasir (1).png'),
(45, 'Raflhy Nur Ramadhan', 'raflhyramadhan28@gmail.com', '08978763186', 'Semester 4', 3.16, 'Akademik', 'Junior Web Developer (1).png');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_beasiswa`
--
ALTER TABLE `data_beasiswa`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `data_beasiswa`
--
ALTER TABLE `data_beasiswa`
  MODIFY `id` int(13) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
