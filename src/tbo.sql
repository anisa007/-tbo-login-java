-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2019 at 02:09 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `proyektbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbo`
--

CREATE TABLE `tbo` (
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbo`
--

INSERT INTO `tbo` (`first_name`, `last_name`, `username`, `email`, `password`) VALUES
('admin', 'admin', 'admin', 'admin@gmail.com', '12345678'),
('anisa', 'ica', 'aisa.ica08', 'anisa08@gmail.com', 'O98COd41rf2'),
('aku', 'kamu', 'akukamu', 'akusukakamu@yahoo.com', '46n65PS0'),
('anisa', 'ica', 'anisa1', 'anisa@gmail.com', 'apaajadeh'),
('anisa', 'ica', 'ica478', 'anisa07@gmail.com', 'KGn7pq9m');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbo`
--
ALTER TABLE `tbo`
  ADD UNIQUE KEY `email` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
