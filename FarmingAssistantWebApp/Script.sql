CREATE DATABASE  IF NOT EXISTS `farmingappdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `farmingappdb`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: farmingappdb
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admins`
--

DROP TABLE IF EXISTS `admins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admins` (
  `adminID` int NOT NULL,
  PRIMARY KEY (`adminID`),
  CONSTRAINT `adminID` FOREIGN KEY (`adminID`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admins`
--

LOCK TABLES `admins` WRITE;
/*!40000 ALTER TABLE `admins` DISABLE KEYS */;
/*!40000 ALTER TABLE `admins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `advertisements`
--

DROP TABLE IF EXISTS `advertisements`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `advertisements` (
  `adID` int NOT NULL AUTO_INCREMENT,
  `adDate` date NOT NULL,
  `cropName` varchar(45) NOT NULL,
  `cropQuantity` int NOT NULL,
  `status` varchar(45) NOT NULL DEFAULT 'not accepted',
  `sID` int NOT NULL,
  PRIMARY KEY (`adID`),
  KEY `supplierID_idx` (`sID`),
  CONSTRAINT `sID` FOREIGN KEY (`sID`) REFERENCES `suppliers` (`supplierID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advertisements`
--

LOCK TABLES `advertisements` WRITE;
/*!40000 ALTER TABLE `advertisements` DISABLE KEYS */;
/*!40000 ALTER TABLE `advertisements` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaint`
--

DROP TABLE IF EXISTS `complaint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complaint` (
  `complaint_id` bigint NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `compl_details` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`complaint_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaint`
--

LOCK TABLES `complaint` WRITE;
/*!40000 ALTER TABLE `complaint` DISABLE KEYS */;
INSERT INTO `complaint` VALUES (1,'CROPS',NULL);
/*!40000 ALTER TABLE `complaint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complaints`
--

DROP TABLE IF EXISTS `complaints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complaints` (
  `complaintID` int NOT NULL AUTO_INCREMENT,
  `category` varchar(45) NOT NULL,
  `details` varchar(255) NOT NULL,
  `status` varchar(45) NOT NULL,
  `farmerID` int NOT NULL,
  PRIMARY KEY (`complaintID`),
  KEY `farmerID_idx` (`farmerID`),
  CONSTRAINT `fID` FOREIGN KEY (`farmerID`) REFERENCES `farmers` (`farmerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complaints`
--

LOCK TABLES `complaints` WRITE;
/*!40000 ALTER TABLE `complaints` DISABLE KEYS */;
/*!40000 ALTER TABLE `complaints` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crop_offers`
--

DROP TABLE IF EXISTS `crop_offers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `crop_offers` (
  `offerID` int NOT NULL AUTO_INCREMENT,
  `price` float NOT NULL,
  `status` varchar(45) NOT NULL DEFAULT 'not accepted',
  `supplierID` int NOT NULL,
  `farmerID` int NOT NULL,
  `adID` int NOT NULL,
  PRIMARY KEY (`offerID`),
  KEY `supplierID_idx` (`supplierID`),
  KEY `farmerID_idx` (`farmerID`),
  KEY `adID_idx` (`adID`),
  CONSTRAINT `adID` FOREIGN KEY (`adID`) REFERENCES `advertisements` (`adID`),
  CONSTRAINT `idFarmer` FOREIGN KEY (`farmerID`) REFERENCES `farmers` (`farmerID`),
  CONSTRAINT `suppID` FOREIGN KEY (`supplierID`) REFERENCES `suppliers` (`supplierID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crop_offers`
--

LOCK TABLES `crop_offers` WRITE;
/*!40000 ALTER TABLE `crop_offers` DISABLE KEYS */;
/*!40000 ALTER TABLE `crop_offers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `farmers`
--

DROP TABLE IF EXISTS `farmers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `farmers` (
  `farmerID` int NOT NULL,
  PRIMARY KEY (`farmerID`),
  CONSTRAINT `farmerID` FOREIGN KEY (`farmerID`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `farmers`
--

LOCK TABLES `farmers` WRITE;
/*!40000 ALTER TABLE `farmers` DISABLE KEYS */;
/*!40000 ALTER TABLE `farmers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `rolename` varchar(45) NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'ADMIN'),(2,'FARMER'),(3,'SUPPLIER');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suppliers` (
  `supplierID` int NOT NULL,
  PRIMARY KEY (`supplierID`),
  CONSTRAINT `supplierID` FOREIGN KEY (`supplierID`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_roles` (
  `user_id` int NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `role_id_fk_idx` (`role_id`),
  CONSTRAINT `role_id_fk` FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`),
  CONSTRAINT `user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (10,1),(6,2),(27,2),(28,2),(29,2),(31,2),(32,2),(33,2),(35,2),(37,2),(39,2),(40,2),(42,2),(43,2),(44,2),(9,3),(30,3),(34,3),(36,3),(41,3),(45,3);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `lastName` varchar(45) NOT NULL,
  `firstName` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `phoneNumber` varchar(45) NOT NULL,
  `enabled` tinyint DEFAULT '1',
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `email_UNIQUE` (`username`),
  UNIQUE KEY `id_UNIQUE` (`user_id`),
  UNIQUE KEY `phoneNumber_UNIQUE` (`phoneNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (6,'mudau','Mike','mikemudau@gmail.com','536 Timber Rd Farmstad','0876543217',1,'$2a$10$YtwC4./sKumzhvhJxEzdlOVjPJL0E0Xq3H1nCZl1RDmW9b8.A0gQC'),(9,'tylor','Tim','ttpty@gmail.com','12 Kimfer Ave Centustad','0836793217',1,'$2a$10$50BQXaqBoRvso6DgHh0/cOm6RkyddoRHRYl4Fv/8JDAplns3sYnm.'),(10,'van Skoor','Peter','admin','6 Donderboom str Plaastjie','0612243217',1,'$2a$10$xVgvYa3WrWgXOZaeJ5OAwueNwBzc.h.7dQc0Ewxq7ogjchj8WFfyi'),(27,'Test','Tester','testing1@gmail.com','kjhgfd','0987654',0,'123456'),(28,'Ftest','TestF','testingfarmer@gmail.com','fghjk','5679',1,'123456'),(29,'Tsupplier','Supplier','testingsupplier@gmail.com','lkjhgf','09876543',1,'123456'),(30,'Test','Testert','testing3@gmail.com','kjhgf','754',1,'123'),(31,'fghjk','fuiopkjhg','loginasfarmer@gmail.com','wertyuytre','12345678765',1,'123'),(32,'fgh','dfgh','loginasfarmer2@gmail.com','ugh','9876543',1,'123456'),(33,'fghj','rtyuio','farmer1@gmail.com','edfg678','456789',1,'123456'),(34,'wertghj','vbnm','supplier1@gmail.com','erty5678','2345678',1,'123456'),(35,'fghjk','fghjkl','f@gmail.com','ghjkl','345678',1,'123456'),(36,'dcfvcqjbhvg','ljkhvcgfxc','s@gmail.com','h908y76','hvjlm;klnjbv',1,'123'),(37,'wertyui','sdfbnm','f1@gmail.com','ertjkl','3456789',1,'$2a$10$GDh6Xc61ALExy/ZKUNOukOUmOrQIcpeeRQ8FCtWivEwqADj5SPDzi'),(39,'fcvgbjnk','cgfvhjbkn','f2@gmail.com','ftyghj','45678988888',1,'$2a$10$18xu7MvWjdIrVGAWy59x3uDjWYDmAhbOe04GZMcGsswOwltCgxbn.'),(40,'dfdgds','efghj,hgfdsa','f5@gmail.com','bhssadj567','1234567890',1,'$2a$10$sei5Xp5Nn8mPUkOBsXHKweFupNoqr4bq2wLkLqXrBvS2hbTYCkLD6'),(41,'ertyu','hhgfd','s24@gmail.com','123 fghjk','23456787654',1,'$2a$10$S1rLApOJuzmAsunxzrvfouFv7FVTYOEC./68Pbjl.tmykKkYanL6e'),(42,'fhdjs','fgehuiruwoq','please','2345678sdfghj','2345',1,'$2a$10$/hiAFpiVxxf9xgdj4JzLkOPX/Ay9W./MV8yPiNG5Gee88JsjJxDS6'),(43,'werty','sdfgh','k1@gmail.com','wertyui','23456781',1,'$2a$10$x6GPVUoXGqNUuy3MxPqVteM.bG0.zYCTj4HMDGeRRYfNR8nPebEEa'),(44,'wertyuio','sdfghjk','peter@gmail.com','sdfghjkl','23456789',1,'123456'),(45,'tyui','dfghj','tom@gmail.com','dfghjkjhgf','23456765',1,'123456');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-21 20:54:07
