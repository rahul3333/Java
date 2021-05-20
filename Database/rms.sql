-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2021 at 06:38 PM
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
('101', 'Saksham', '2021-05-20', '2021-05-21', 8000, 1440, 9440);

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
('101', 'Saksham', 2, 4, 'SILVER', '8112273369', '2021-05-20', '2021-05-21', '2021-05-04 00:00:00', 1),
('102', 'Saksham', 2, 4, 'SILVER', '8112273369', '2021-05-20', '2021-05-22', '2021-05-04 00:00:00', 0),
('103', 'Rajesh Jain', 2, 1, 'SILVER', ' 8114468402', '2021-05-20', '2021-05-21', '2021-05-20 17:17:36', 0),
('103', 'Barkha', 2, 4, 'SILVER', '8112273369', '2021-05-25', '2021-05-28', '2021-05-04 00:00:00', 0),
('201', 'Sarthak', 3, 5, 'GOLD', '9782927533', '2021-05-20', '2021-05-25', '2021-05-18 13:55:46', 0),
('202', 'Saksham', 2, 4, 'GOLD', '8112273369', '2021-05-20', '2021-05-25', '2021-05-04 00:00:00', 0),
('203', 'Saksham', 2, 4, 'GOLD', '8112273369', '2021-05-20', '2021-05-21', '2021-05-04 00:00:00', 0),
('301', 'Barkha', 2, 4, 'PLATINUM', '8112273369', '2021-05-20', '2021-05-28', '2021-05-04 00:00:00', 0),
('302', 'Sarthak', 3, 5, 'PLATINUM', '9782927533', '2021-05-20', '2021-05-25', '2021-05-18 13:55:46', 0);

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
-- Table structure for table `resturant`
--

CREATE TABLE `resturant` (
  `name` char(50) DEFAULT NULL,
  `Roomno` varchar(6) DEFAULT NULL,
  `resbill` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
('101', '101', '8112273369', 'Saksham Jain', 'saksham.jain@sap.com', '2021-04-23 19:27:29');

-- --------------------------------------------------------

--
-- Table structure for table `visitor`
--

CREATE TABLE `visitor` (
  `name` char(50) DEFAULT NULL,
  `phnNo` char(11) DEFAULT NULL,
  `Roomno` varchar(6) DEFAULT NULL,
  `vdate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `visitor`
--

INSERT INTO `visitor` (`name`, `phnNo`, `Roomno`, `vdate`) VALUES
('sa', '8112273369', '101', '2021-05-03 16:35:00'),
('Saksham', '8112273369', '207', '2021-05-18 16:44:06');

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
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`RoomNo`);

--
-- Indexes for table `silver`
--
ALTER TABLE `silver`
  ADD PRIMARY KEY (`roomno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
