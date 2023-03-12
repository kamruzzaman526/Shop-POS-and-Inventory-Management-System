-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 12, 2023 at 03:39 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `alogin`
--

CREATE TABLE `alogin` (
  `id` int(11) NOT NULL,
  `user` varchar(255) NOT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `alogin`
--

INSERT INTO `alogin` (`id`, `user`, `pass`) VALUES
(1, 'Emon', 'emon'),
(2, 'chopol', '526'),
(3, 'manager', 'manager');

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `invoice` varchar(100) NOT NULL,
  `date` varchar(110) NOT NULL,
  `total` int(11) NOT NULL,
  `seller` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`invoice`, `date`, `total`, `seller`) VALUES
('1029', 'Sat Jul 23 09:59:46 BDT 2022', 135, ''),
('1028', 'Fri Jul 22 23:26:48 BDT 2022', 120, ''),
('1030', 'Sat Jul 23 10:02:15 BDT 2022', 135, ''),
('1031', 'Sat Jul 23 11:15:15 BDT 2022', 135, ''),
('1032', 'Sat Jul 23 11:15:31 BDT 2022', 135, ''),
('1033', 'Sat Jul 23 12:07:00 BDT 2022', 335, ''),
('1034', 'Sat Jul 23 18:20:59 BDT 2022', 135, ''),
('1035', 'Sat Jul 23 21:13:38 BDT 2022', 200, 'Liza'),
('1036', 'Sun Jul 24 00:05:23 BDT 2022', 135, 'seller'),
('1037', 'Sun Jul 24 00:05:50 BDT 2022', 255, 'seller'),
('1038', 'Sun Jul 24 00:44:03 BDT 2022', 710, 'Emon'),
('1039', 'Sun Jul 24 19:44:36 BDT 2022', 255, 'Chopol'),
('1040', 'Sun Jul 24 19:55:12 BDT 2022', 135, 'Chopol'),
('1041', 'Sun Jul 24 19:56:03 BDT 2022', 120, 'Chopol'),
('1042', 'Sun Jul 24 19:57:37 BDT 2022', 135, 'Chopol'),
('1043', 'Sun Jul 24 20:00:28 BDT 2022', 120, 'Chopol'),
('1044', 'Sun Jul 24 20:02:30 BDT 2022', 135, 'Chopol'),
('1045', 'Sun Jul 24 20:06:43 BDT 2022', 970, 'Chopol'),
('1046', 'Sun Jul 24 20:10:35 BDT 2022', 120, 'Chopol'),
('1047', 'Sun Jul 24 20:12:17 BDT 2022', 120, 'Chopol'),
('1048', 'Sun Jul 24 22:26:34 BDT 2022', 135, 'Chopol'),
('1049', 'Sun Jul 24 22:28:08 BDT 2022', 120, 'Chopol'),
('1050', 'Sun Jul 24 22:31:33 BDT 2022', 255, 'Chopol'),
('1051', 'Sun Jul 24 22:32:20 BDT 2022', 120, 'Chopol'),
('1052', 'Sun Jul 24 22:32:57 BDT 2022', 135, 'Chopol'),
('1053', 'Sun Jul 24 22:33:44 BDT 2022', 120, 'Chopol'),
('1054', 'Sun Jul 24 22:34:47 BDT 2022', 120, 'Chopol'),
('1055', 'Sun Jul 24 22:35:16 BDT 2022', 120, 'Chopol'),
('1056', 'Sun Jul 24 22:36:30 BDT 2022', 120, 'Chopol'),
('1057', 'Sun Jul 24 22:37:25 BDT 2022', 120, 'Chopol'),
('1058', 'Sun Jul 24 22:40:00 BDT 2022', 120, 'Chopol'),
('1059', 'Sun Jul 24 22:41:40 BDT 2022', 120, 'Chopol'),
('1060', 'Sun Jul 24 22:42:21 BDT 2022', 120, 'Chopol'),
('1061', 'Sun Jul 24 22:43:18 BDT 2022', 120, 'Chopol'),
('1062', 'Sun Jul 24 22:43:52 BDT 2022', 120, 'Chopol'),
('1063', 'Sun Jul 24 22:44:32 BDT 2022', 120, 'Chopol'),
('1064', 'Sun Jul 24 22:45:13 BDT 2022', 120, 'Chopol'),
('1065', 'Sun Jul 24 22:49:54 BDT 2022', 120, 'Chopol'),
('1066', 'Sun Jul 24 22:54:08 BDT 2022', 120, 'Chopol'),
('1067', 'Sun Jul 24 22:55:31 BDT 2022', 135, 'Chopol'),
('1068', 'Sun Jul 24 22:56:17 BDT 2022', 135, 'Chopol'),
('1069', 'Sun Jul 24 22:56:43 BDT 2022', 120, 'Chopol'),
('1070', 'Sun Jul 24 22:57:18 BDT 2022', 120, 'Chopol'),
('1071', 'Sun Jul 24 22:59:17 BDT 2022', 120, 'Chopol'),
('1072', 'Sun Jul 24 23:00:09 BDT 2022', 120, 'Chopol'),
('1073', 'Sun Jul 24 23:01:01 BDT 2022', 120, 'Chopol'),
('1074', 'Sun Jul 24 23:02:03 BDT 2022', 120, 'Chopol'),
('1075', 'Sun Jul 24 23:02:38 BDT 2022', 120, 'Chopol'),
('1076', 'Sun Jul 24 23:03:19 BDT 2022', 120, 'Chopol'),
('1077', 'Sun Jul 24 23:04:15 BDT 2022', 120, 'Chopol'),
('1078', 'Sun Jul 24 23:04:48 BDT 2022', 120, 'Chopol'),
('1079', 'Sun Jul 24 23:05:20 BDT 2022', 120, 'Chopol'),
('1080', 'Sun Jul 24 23:06:37 BDT 2022', 120, 'Chopol'),
('1081', 'Sun Jul 24 23:09:09 BDT 2022', 120, 'Chopol'),
('1082', 'Sun Jul 24 23:10:18 BDT 2022', 120, 'Chopol'),
('1083', 'Sun Jul 24 23:12:02 BDT 2022', 120, 'Chopol'),
('1084', 'Sun Jul 24 23:12:46 BDT 2022', 120, 'Chopol'),
('1085', 'Sun Jul 24 23:13:10 BDT 2022', 120, 'Chopol'),
('1086', 'Sun Jul 24 23:13:47 BDT 2022', 120, 'Chopol'),
('1087', 'Sun Jul 24 23:16:51 BDT 2022', 120, 'Chopol'),
('1088', 'Sun Jul 24 23:17:14 BDT 2022', 120, 'Chopol'),
('1089', 'Sun Jul 24 23:18:00 BDT 2022', 240, 'Chopol'),
('1090', 'Mon Jul 25 20:06:20 BDT 2022', 695, 'Emon'),
('1091', 'Mon Jul 25 20:11:25 BDT 2022', 120, 'Emon'),
('1092', 'Mon Jul 25 20:12:17 BDT 2022', 150, 'Emon'),
('1093', 'Mon Jul 25 20:31:17 BDT 2022', 135, 'Emon'),
('1094', 'Mon Jul 25 20:32:19 BDT 2022', 150, 'Emon'),
('1095', 'Mon Jul 25 20:33:10 BDT 2022', 150, 'Emon'),
('1096', 'Mon Jul 25 20:33:57 BDT 2022', 150, 'Emon'),
('1097', 'Mon Jul 25 20:34:33 BDT 2022', 30, 'Emon'),
('1098', 'Mon Jul 25 20:35:03 BDT 2022', 150, 'Emon'),
('1099', 'Mon Jul 25 20:35:33 BDT 2022', 30, 'Emon'),
('1100', 'Mon Jul 25 20:38:52 BDT 2022', 30, 'Emon'),
('1101', 'Mon Jul 25 20:39:23 BDT 2022', 30, 'Emon'),
('1102', 'Mon Jul 25 20:40:38 BDT 2022', 30, 'Emon'),
('1103', 'Mon Jul 25 20:41:42 BDT 2022', 120, 'Emon'),
('1104', 'Mon Jul 25 20:42:24 BDT 2022', 30, 'Emon'),
('1105', 'Mon Jul 25 20:43:13 BDT 2022', 30, 'Emon'),
('1106', 'Mon Jul 25 20:44:47 BDT 2022', 30, 'Emon'),
('1107', 'Mon Jul 25 20:46:12 BDT 2022', 52, 'Emon'),
('1108', 'Mon Jul 25 20:46:58 BDT 2022', 22, 'Emon'),
('1109', 'Mon Jul 25 20:48:35 BDT 2022', 15, 'Emon'),
('1110', 'Mon Jul 25 20:51:24 BDT 2022', 6, 'Emon'),
('1111', 'Mon Jul 25 20:52:14 BDT 2022', 147, 'Emon'),
('1112', 'Mon Jul 25 20:53:15 BDT 2022', 11, 'Emon'),
('1113', 'Mon Jul 25 20:54:08 BDT 2022', 89, 'Emon'),
('1114', 'Mon Jul 25 20:56:31 BDT 2022', 37, 'Emon'),
('1115', 'Mon Jul 25 20:58:15 BDT 2022', 294, 'Emon'),
('1116', 'Mon Jul 25 21:00:39 BDT 2022', 55, 'Emon'),
('1117', 'Mon Jul 25 21:01:07 BDT 2022', 64, 'Emon'),
('1118', 'Mon Jul 25 21:09:45 BDT 2022', 94, 'Emon'),
('1119', 'Mon Jul 25 21:25:41 BDT 2022', 22, 'Emon'),
('1120', 'Mon Jul 25 22:34:47 BDT 2022', 240, 'Emon'),
('1121', 'Mon Jul 25 23:53:12 BDT 2022', 45, 'Emon'),
('1122', 'Tue Jul 26 09:39:22 BDT 2022', 219, 'Emon'),
('1123', 'Tue Jul 26 09:40:35 BDT 2022', 224, 'Emon'),
('1124', 'Tue Jul 26 13:36:39 BDT 2022', 940, 'Chopol'),
('1125', 'Tue Jul 26 13:43:09 BDT 2022', 965, 'Chopol'),
('1126', 'Tue Jul 26 13:44:55 BDT 2022', 640, 'Chopol'),
('1127', 'Tue Jul 26 13:47:09 BDT 2022', 255, 'Emon'),
('1128', 'Tue Jul 26 22:11:24 BDT 2022', 520, 'Emon'),
('1129', 'Tue Jul 26 22:14:59 BDT 2022', 430, 'Emon'),
('1130', 'Wed Jul 27 12:47:28 BDT 2022', 150, 'Emon'),
('1131', 'Wed Jul 27 12:49:45 BDT 2022', 670, 'Emon'),
('1132', 'Sun Jul 31 11:04:15 BDT 2022', 255, 'Rabbi sir'),
('1133', 'Mon Aug 01 15:51:12 BDT 2022', 900, 'Rabbi sir'),
('1134', 'Sun Sep 25 19:51:19 BDT 2022', 480, 'Emon'),
('1135', 'Sun Sep 25 19:52:35 BDT 2022', 240, 'Emon'),
('1136', 'Sun Sep 25 19:54:36 BDT 2022', 240, 'Emon'),
('1137', 'Sun Sep 25 19:56:27 BDT 2022', 240, 'Emon'),
('1138', 'Tue Jan 10 21:17:12 BDT 2023', 320, 'Emon');

-- --------------------------------------------------------

--
-- Table structure for table `gtotal`
--

CREATE TABLE `gtotal` (
  `id` int(10) NOT NULL,
  `gt` varchar(255) NOT NULL,
  `ft` int(100) NOT NULL,
  `bt` varchar(122) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gtotal`
--

INSERT INTO `gtotal` (`id`, `gt`, `ft`, `bt`) VALUES
(1, '320', 1138, 'Kamruzaman');

-- --------------------------------------------------------

--
-- Table structure for table `gtt`
--

CREATE TABLE `gtt` (
  `gt` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gtt`
--

INSERT INTO `gtt` (`gt`) VALUES
('null240'),
('null200'),
('null120');

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

CREATE TABLE `inventory` (
  `id` int(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `qty` int(10) NOT NULL,
  `expire` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `name`, `price`, `qty`, `expire`) VALUES
(1, 'Sugar 1kg', 120, -50, '01-01-1970'),
(2, 'Butter Bun', 15, -6, '14-07-2022'),
(3, 'Salt 1kg', 120, 71, '31-07-2022'),
(4, 'Horlicks', 200, 41, '31-07-2022'),
(5, 'Frutika 1L', 30, 0, '01-01-2023'),
(6, 'Rupchada Oil 1kg', 300, 120, '22-01-2024'),
(7, 'Vim Bar', 35, 100, '24-11-2022');

-- --------------------------------------------------------

--
-- Table structure for table `ulogin`
--

CREATE TABLE `ulogin` (
  `id` int(11) NOT NULL,
  `user` varchar(110) NOT NULL,
  `pass` varchar(110) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ulogin`
--

INSERT INTO `ulogin` (`id`, `user`, `pass`) VALUES
(2, 'seller', 'seller'),
(3, 'Emon', 'emon'),
(4, 'Chopol', 'chopol'),
(5, 'Rabbi sir', '1234'),
(6, 'Kamruzaman', '526');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alogin`
--
ALTER TABLE `alogin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ulogin`
--
ALTER TABLE `ulogin`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alogin`
--
ALTER TABLE `alogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `ulogin`
--
ALTER TABLE `ulogin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
