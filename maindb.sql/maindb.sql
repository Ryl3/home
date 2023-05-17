-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2023 at 04:05 AM
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
-- Database: `maindb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_customer`
--

CREATE TABLE `tbl_customer` (
  `cus_id` int(10) NOT NULL,
  `cus_fname` varchar(20) NOT NULL,
  `cus_lname` varchar(20) NOT NULL,
  `cus_gender` varchar(20) NOT NULL,
  `cus_address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_customer`
--

INSERT INTO `tbl_customer` (`cus_id`, `cus_fname`, `cus_lname`, `cus_gender`, `cus_address`) VALUES
(1, 'ryle', 'aaron', 'Male', 'Afghanistan'),
(3, 'ROWAN', 'DAAA', 'Male', 'Czech Republic');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_reserve`
--

CREATE TABLE `tbl_reserve` (
  `res_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `customer_id` int(10) NOT NULL,
  `res_contact` int(20) NOT NULL,
  `res_status` varchar(20) NOT NULL,
  `res_userstatus` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_reserve`
--

INSERT INTO `tbl_reserve` (`res_id`, `user_id`, `customer_id`, `res_contact`, `res_status`, `res_userstatus`) VALUES
(1, 2, 1, 4564335, 'sdfer', 'sdfewdf');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(10) NOT NULL,
  `user_fname` varchar(20) NOT NULL,
  `user_lname` varchar(20) NOT NULL,
  `user_email` varchar(20) NOT NULL,
  `user_username` varchar(20) NOT NULL,
  `user_password` varchar(50) NOT NULL,
  `user_status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `user_fname`, `user_lname`, `user_email`, `user_username`, `user_password`, `user_status`) VALUES
(2, 'sad', 'sad', 'sad', 'sad', 'sad', 'Pending'),
(4, 'rowandaa', 'atay', 'pidte.com', 'sadwe', 'sdwrd', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  ADD PRIMARY KEY (`cus_id`);

--
-- Indexes for table `tbl_reserve`
--
ALTER TABLE `tbl_reserve`
  ADD PRIMARY KEY (`res_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `customer_id` (`customer_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_customer`
--
ALTER TABLE `tbl_customer`
  MODIFY `cus_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_reserve`
--
ALTER TABLE `tbl_reserve`
  MODIFY `res_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_reserve`
--
ALTER TABLE `tbl_reserve`
  ADD CONSTRAINT `customer_id` FOREIGN KEY (`customer_id`) REFERENCES `tbl_customer` (`cus_id`),
  ADD CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
