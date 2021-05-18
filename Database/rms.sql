-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2021 at 01:17 PM
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
  `RoomNo` char(15) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `NoofP` int(11) DEFAULT NULL,
  `NumberofDays` int(11) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `phoneNo` char(11) DEFAULT NULL,
  `fromdate` date DEFAULT NULL,
  `todate` date DEFAULT NULL,
  `resbill` float DEFAULT NULL,
  `roomtotal` float DEFAULT NULL,
  `finaltotal` float DEFAULT NULL,
  `spagym` int(11) DEFAULT NULL,
  `laundry` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  `NoofP` int(11) DEFAULT NULL,
  `NumberofDays` int(11) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `phoneNo` char(11) DEFAULT NULL,
  `fromdate` date DEFAULT NULL,
  `todate` date DEFAULT NULL,
  `bookedon` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guest`
--

INSERT INTO `guest` (`RoomNo`, `Name`, `NoofP`, `NumberofDays`, `type`, `phoneNo`, `fromdate`, `todate`, `bookedon`) VALUES
('201', 'Sarthak', 3, 5, 'GOLD', '9782927533', '2021-05-20', '2021-05-25', '2021-05-18 13:55:46'),
('SLVR101', 'Saksham', 2, 4, 'SILVER', '8112273369', '2021-05-04', '2021-05-07', '2021-05-04 00:00:00'),
('SLVR102', 'Saksham', 2, 4, 'SILVER', '8112273369', '2021-05-03', '2021-05-07', '2021-05-04 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `platinum`
--

CREATE TABLE `platinum` (
  `roomno` int(100) NOT NULL,
  `status` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
-- Indexes for table `gold`
--
ALTER TABLE `gold`
  ADD PRIMARY KEY (`roomno`);

--
-- Indexes for table `guest`
--
ALTER TABLE `guest`
  ADD PRIMARY KEY (`RoomNo`);

--
-- Indexes for table `platinum`
--
ALTER TABLE `platinum`
  ADD PRIMARY KEY (`roomno`);

--
-- Indexes for table `silver`
--
ALTER TABLE `silver`
  ADD PRIMARY KEY (`roomno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
