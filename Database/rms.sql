-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2021 at 08:39 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rms`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `RoomNo` char(15) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `CheckInDate` date NOT NULL,
  `CheckOutDate` date DEFAULT NULL,
  `RoomTotal` float DEFAULT NULL,
  `GST` float DEFAULT NULL,
  `Total` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`RoomNo`, `Name`, `CheckInDate`, `CheckOutDate`, `RoomTotal`, `GST`, `Total`) VALUES
('101', 'Saksham', '2021-05-20', '2021-05-21', 8000, 1440, 9440),
('302', 'Sarthak', '2021-05-20', '2021-05-25', 25000, 4500, 31910);

-- --------------------------------------------------------

--
-- Table structure for table `gold`
--

CREATE TABLE `gold` (
  `roomno` int(100) NOT NULL,
  `status` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gold`
--

INSERT INTO `gold` (`roomno`, `status`) VALUES
(201, 'FULL'),
(202, 'Empty'),
(203, 'Empty'),
(204, 'Empty'),
(205, 'Empty'),
(206, 'Empty'),
(207, 'EMPTY'),
(208, 'Empty'),
(209, 'Empty'),
(210, 'Empty');

-- --------------------------------------------------------

--
-- Table structure for table `guest`
--

CREATE TABLE `guest` (
  `RoomNo` char(15) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Occupants` int(11) DEFAULT NULL,
  `Days` int(11) DEFAULT NULL,
  `Type` varchar(10) DEFAULT NULL,
  `PhoneNo` char(11) DEFAULT NULL,
  `CheckInDate` date NOT NULL,
  `CheckOutDate` date DEFAULT NULL,
  `BookingDate` datetime DEFAULT NULL,
  `CheckedOut` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`RoomNo`, `Name`, `Occupants`, `Days`, `Type`, `PhoneNo`, `CheckInDate`, `CheckOutDate`, `BookingDate`, `CheckedOut`) VALUES
('101', 'Saksham Jain', 2, 4, 'SILVER', '8112273369', '2021-05-20', '2021-05-21', '2021-05-04 00:00:00', 1),
('102', 'Saksham Jain', 2, 4, 'SILVER', '8112273369', '2021-05-20', '2021-05-22', '2021-05-04 00:00:00', 0),
('103', 'Sushmitha S', 2, 1, 'SILVER', ' 8114468402', '2021-05-20', '2021-05-21', '2021-05-20 17:17:36', 0),
('103', 'Jeet Patel', 2, 4, 'SILVER', '8112273369', '2021-05-25', '2021-05-28', '2021-05-04 00:00:00', 0),
('104', 'Rahul Dewan', 2, 1, 'SILVER', '9810978199', '2021-05-22', '2021-05-23', '2021-05-22 10:38:10', 0),
('201', 'Jeet Patel', 3, 5, 'GOLD', '9782927533', '2021-05-20', '2021-05-25', '2021-05-18 13:55:46', 0),
('202', 'Rahul Dewan', 2, 4, 'GOLD', '8112273369', '2021-05-20', '2021-05-25', '2021-05-04 00:00:00', 0),
('203', 'Saksham Jain', 2, 4, 'GOLD', '8112273369', '2021-05-20', '2021-05-21', '2021-05-04 00:00:00', 0),
('301', 'Nandini Agarwal', 2, 4, 'PLATINUM', '8112273369', '2021-05-20', '2021-05-28', '2021-05-04 00:00:00', 0),
('302', 'Sushmitha S', 3, 5, 'PLATINUM', '9782927533', '2021-05-20', '2021-05-25', '2021-05-18 13:55:46', 1);

-- --------------------------------------------------------

--
-- Table structure for table `reg`
--

CREATE TABLE `reg` (
  `staffid` varchar(7) DEFAULT NULL,
  `password` char(20) DEFAULT NULL,
  `Phnno` char(10) DEFAULT NULL,
  `name` char(20) DEFAULT NULL,
  `email` char(40) DEFAULT NULL,
  `rdate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `restaurant`
--

CREATE TABLE `restaurant` (
  `name` char(50) NOT NULL,
  `Roomno` varchar(6) NOT NULL,
  `resbill` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `restaurant`
--

INSERT INTO `restaurant` (`name`, `Roomno`, `resbill`) VALUES
('Saksham', '102', 298),
('Saksham', '102', 417),
('Saksham', '201', 437),
('Saksham', 'NULL', 437);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `RoomNo` int(100) NOT NULL,
  `Type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`RoomNo`, `Type`) VALUES
(101, 'Silver'),
(102, 'Silver'),
(103, 'Silver'),
(104, 'Silver'),
(201, 'Gold'),
(202, 'Gold'),
(203, 'Gold'),
(301, 'Platinum'),
(302, 'Platinum');

-- --------------------------------------------------------

--
-- Table structure for table `silver`
--

CREATE TABLE `silver` (
  `roomno` int(100) NOT NULL,
  `status` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `silver`
--

INSERT INTO `silver` (`roomno`, `status`) VALUES
(101, 'EMPTY'),
(102, 'EMPTY');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `id` varchar(7) NOT NULL,
  `password` char(20) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `registrationDate` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`id`, `password`, `phone`, `name`, `email`, `registrationDate`) VALUES
('101', '101', '8112273369', 'Saksham Jain', 'saksham.jain@sap.com', '2021-04-23 19:27:29'),
('S0002', '101', '9166017690', 'Rahul', 'rahul@sap.com', '2021-05-21 22:56:41');

-- --------------------------------------------------------

--
-- Table structure for table `visitor`
--

CREATE TABLE `visitor` (
  `name` char(50) NOT NULL,
  `phnNo` char(11) DEFAULT NULL,
  `Roomno` varchar(6) NOT NULL,
  `vdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`RoomNo`,`CheckInDate`);

--
-- Indexes for table `gold`
--
ALTER TABLE `gold`
  ADD PRIMARY KEY (`roomno`);

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`RoomNo`,`CheckInDate`);

--
-- Indexes for table `restaurant`
--
ALTER TABLE `restaurant`
  ADD PRIMARY KEY (`name`,`Roomno`,`resbill`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`RoomNo`);

--
-- Indexes for table `silver`
--
ALTER TABLE `silver`
  ADD PRIMARY KEY (`roomno`);

--
-- Indexes for table `visitor`
--
ALTER TABLE `visitor`
  ADD PRIMARY KEY (`name`,`Roomno`,`vdate`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
