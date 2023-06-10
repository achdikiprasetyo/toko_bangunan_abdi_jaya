-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2023 at 09:08 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_abdi_jaya`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `harga` double NOT NULL,
  `stock` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id`, `nama`, `harga`, `stock`) VALUES
(20, 'stopkontak', 3000, 25),
(21, 'Kawat 1 meter', 21000, 1),
(22, 'Kuas besar', 12000, 54),
(23, 'Cat Kayu Coklat', 3000, 228),
(24, 'Kayu Jati', 3000, 18),
(25, 'paku pinus/1gram', 1000, 118),
(26, 'cat alvian (biru)', 4300, 9);

-- --------------------------------------------------------

--
-- Table structure for table `keranjang`
--

CREATE TABLE `keranjang` (
  `id_keranjang` int(11) NOT NULL,
  `id_pembayaran` int(11) DEFAULT NULL,
  `nama_barang` varchar(255) DEFAULT NULL,
  `harga` decimal(10,2) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `keranjang`
--

INSERT INTO `keranjang` (`id_keranjang`, `id_pembayaran`, `nama_barang`, `harga`, `jumlah`) VALUES
(18, 1, 'coba 2', '2000.00', 1),
(19, 2, 'keyboard cat', '2000.00', 2),
(20, 3, 'coba 2', '2000.00', 2),
(21, 4, 'keyboard cat', '2000.00', 2),
(22, 5, 'keyboard cat', '2000.00', 2),
(23, 6, 'coba 2', '2000.00', 6),
(24, 7, 'coba 2', '2000.00', 2),
(25, 8, 'keyboard cat', '2000.00', 4),
(26, 9, 'coba 2', '2000.00', 2),
(27, 10, 'coba 2', '2000.00', 3),
(28, 11, 'edit', '12000.00', 5),
(29, 12, 'coba 2', '2000.00', 4),
(30, 13, 'coba 2', '2000.00', 2),
(31, 14, 'coba 2', '2000.00', 3),
(32, 15, 'keyboard cat', '2000.00', 10),
(33, 16, 'coba 2', '2000.00', 2),
(34, 17, 'edit', '12000.00', 2),
(35, 18, 'keyboard cat', '2000.00', 2),
(36, 19, 'Cat Kayu Coklat', '3000.00', 3),
(37, 20, 'paku pinus/1gram', '1000.00', 5),
(38, 21, 'Kayu Jati', '3000.00', 2),
(39, 22, 'cat alvian (biru)', '4300.00', 3),
(40, 8, 'Kuas besar', '12000.00', 2),
(41, 8, 'Cat Kayu Coklat', '3000.00', 2),
(42, 9, 'Kawat 1 meter', '21000.00', 2);

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_pembayaran` int(11) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `total_harga` double DEFAULT NULL,
  `nama_petugas` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id_pembayaran`, `tanggal`, `total_harga`, `nama_petugas`) VALUES
(2, '2023-06-08', 6000, NULL),
(3, '2023-06-08', 24000, 'edit'),
(4, '2023-06-09', 24000, NULL),
(5, '2023-06-09', 13000, NULL),
(6, '2023-06-09', 23900, NULL),
(7, '2023-06-09', 23900, 'diki'),
(8, '2023-06-10', 30000, 'diki'),
(9, '2023-06-10', 42000, 'mukidi'),
(10, '2023-06-10', 42000, 'mukidi');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `no_hp` varchar(13) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id`, `nama`, `no_hp`, `alamat`) VALUES
(4, 'diki', '99872873', 'sidaorjo'),
(5, 'edit', 'edit', 'edit'),
(6, 'mukidi', '1627612', 'sepande');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `keranjang`
--
ALTER TABLE `keranjang`
  ADD PRIMARY KEY (`id_keranjang`),
  ADD KEY `id_pembayaran` (`id_pembayaran`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`id_pembayaran`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT for table `keranjang`
--
ALTER TABLE `keranjang`
  MODIFY `id_keranjang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `id_pembayaran` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
