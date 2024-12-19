-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 18, 2024 at 04:48 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: dbsistempenyimpananbarang
--

-- --------------------------------------------------------

--
-- Table structure for table admin
--

CREATE TABLE admin (
  id_admin int(6) NOT NULL AUTO_INCREMENT,
  nama varchar(30) NOT NULL,
  email varchar(50) NOT NULL,
  no_telepon varchar(15) NOT NULL,
  PRIMARY KEY (id_admin),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table customer
--

CREATE TABLE customer (
  id_customer int(6) NOT NULL AUTO_INCREMENT,
  nama varchar(30) NOT NULL,
  email varchar(50) NOT NULL,
  perusahaan varchar(50) NOT NULL,
  no_telepon varchar(15) NOT NULL,
  PRIMARY KEY (id_customer),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table pembayaran
--

CREATE TABLE pembayaran (
  id_pembayaran int(6) NOT NULL AUTO_INCREMENT,
  metode_bayar varchar(30) NOT NULL,
  jadwal_pembayaran date NOT NULL,
  jumlah decimal(10,0) NOT NULL,
  id_customer int(6) NOT NULL,
  PRIMARY KEY (id_pembayaran),
  KEY id_customer (id_customer),
  FOREIGN KEY (id_customer) REFERENCES customer (id_customer)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------
-- Table structure for table barang
--

CREATE TABLE barang (
  id_barang int(5) NOT NULL AUTO_INCREMENT,
  nama_barang varchar(30) NOT NULL,
  jenis_barang varchar(30) NOT NULL,
  berat int(10) NOT NULL,
  kapasitas varchar(30) NOT NULL,
  status varchar(30) NOT NULL,
  id_gudang int(5) NOT NULL,
  PRIMARY KEY (id_barang),
  KEY id_gudang (id_gudang),
  FOREIGN KEY (id_gudang) REFERENCES gudang (id_gudang)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table furniture
--

CREATE TABLE furniture (
  id_barang int(5) NOT NULL,
  bahan varchar(30) NOT NULL,
  dimensi varchar(30) NOT NULL,
  PRIMARY KEY (id_barang),
  FOREIGN KEY (id_barang) REFERENCES barang (id_barang)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table gudang
--

CREATE TABLE gudang (
  id_gudang int(5) NOT NULL AUTO_INCREMENT,
  jenis_gudang varchar(30) NOT NULL,
  kapasitas varchar(30) NOT NULL,
  lokasi varchar(30) NOT NULL,
  status varchar(30) NOT NULL,
  PRIMARY KEY (id_gudang)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Indexes for dumped tables
--

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table admin
--
ALTER TABLE admin
  MODIFY id_admin int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2024001;

--
-- AUTO_INCREMENT for table customer
--
ALTER TABLE customer
  MODIFY id_customer int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24001;

--
-- AUTO_INCREMENT for table pembayaran
--
ALTER TABLE pembayaran
  MODIFY id_pembayaran int(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25001;

--
-- AUTO_INCREMENT for table barang
--
ALTER TABLE barang
  MODIFY id_barang int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10001;

--
-- AUTO_INCREMENT for table gudang
--
ALTER TABLE gudang
  MODIFY id_gudang int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5001;

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
