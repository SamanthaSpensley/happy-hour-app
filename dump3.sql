-- MySQL dump 10.13  Distrib 5.7.14, for osx10.11 (x86_64)
--
-- Host: localhost    Database: BarInfo
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `BarInfo`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `BarInfo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `BarInfo`;

--
-- Table structure for table `bar_info`
--

DROP TABLE IF EXISTS `bar_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bar_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `friday` bit(1) DEFAULT NULL,
  `friday_time` varchar(255) DEFAULT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `latitude` decimal(19,10) DEFAULT NULL,
  `longitude` decimal(19,10) DEFAULT NULL,
  `menu_url` varchar(255) DEFAULT NULL,
  `monday` bit(1) DEFAULT NULL,
  `monday_time` varchar(255) DEFAULT NULL,
  `neighborhood` varchar(255) DEFAULT NULL,
  `restaurant_name` varchar(255) NOT NULL,
  `saturday` bit(1) DEFAULT NULL,
  `saturday_time` varchar(255) DEFAULT NULL,
  `sunday` bit(1) DEFAULT NULL,
  `sunday_time` varchar(255) DEFAULT NULL,
  `thursday` bit(1) DEFAULT NULL,
  `thursday_time` varchar(255) DEFAULT NULL,
  `tuesday` bit(1) DEFAULT NULL,
  `tuesday_time` varchar(255) DEFAULT NULL,
  `website_url` varchar(255) DEFAULT NULL,
  `wednesday` bit(1) DEFAULT NULL,
  `wednesday_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_rf3tun4n4euikn1vu9ox9h6ic` (`restaurant_name`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bar_info`
--

LOCK TABLES `bar_info` WRITE;
/*!40000 ALTER TABLE `bar_info` DISABLE KEYS */;
INSERT INTO `bar_info` VALUES (1,'','4:00pm - 6:30pm','http://cdn.justluxe.com/articles/images/news/lingerrestaurant.jpg',39.759526,-105.0136293,'http://lingerdenver.com/pdf/Linger_HappyHour_October_2016.pdf','\0',NULL,'LoHi','Linger','\0',NULL,'\0',NULL,'','4:00pm - 6:30pm','','4:00pm - 6:30pm','http://lingerdenver.com/','','4:00pm - 6:30pm'),(2,'','4:00pm - 6:00pm','http://guide.denverpost.com/media/photos/full/lola_600x600.JPG',39.7592294,-105.0107865,'http://www.loladenver.com/menus/happy-hour/','','4:00pm - Close','LoHi','Lola','','2:30pm - 5:00pm','','2:30pm - 5:00pm','','4:00pm - 6:00pm','','4:00pm - 6:00pm','http://www.loladenver.com/','','4:00pm - 6:00pm'),(3,'','2:30pm - 6:30pm','https://s3-media1.fl.yelpcdn.com/bphoto/7kKaMWhDPu8Qq0RSgCz5IQ/o.jpg',39.756242,-104.975893,'http://www.dunbarkitchenandtaphouse.com/new-menu/','','2:30pm - 6:30pm','Rino/Five Points','Dunbar Kitchen & Tap House','','2:30pm - 6:30pm','','2:30pm - 6:30pm','','2:30pm - 6:30pm','','2:30pm - 6:30pm','http://www.dunbarkitchenandtaphouse.com/','','2:30pm - 6:30pm'),(4,'','2:00pm - 6:00pm','https://media-cdn.tripadvisor.com/media/photo-s/03/07/ce/f5/central-bistro-and-bar.jpg',39.759193,-105.0084136,'http://www.centralbistrobar.com/menu-1/','\0',NULL,'LoHi','Central Bistro and Bar','','2:00pm - 6:00pm','\0',NULL,'','2:00pm - 6:00pm','','2:00pm - Close','http://www.centralbistrobar.com/','','2:00pm - 6:00pm'),(5,'','3:00pm - 6:00pm','http://images1.westword.com/imager/old-major/u/original/5180598/8617647.0.jpg',39.763547,-105.010789,'http://oldmajordenver.com/menu/','\0',NULL,'LoHi','Old Major','','4:00pm - 6:00pm','','4:00pm - 6:00pm','','3:00pm - 6:00pm','\0',NULL,'http://oldmajordenver.com/','','3:00pm - 6:00pm'),(6,'','3:00pm - 6:00pm','http://humboldtrestaurant.com/wp-content/uploads/2015/04/tmg-slideshow_xxl-2.jpeg',39.743485,-104.969341,'http://humboldtrestaurant.com/','','3:00pm - 6:00pm','Uptown','Humbolt Farm-Fish-Wine','','3:00pm - 6:00pm','','3:00pm - 6:00pm','','3:00pm - 6:00pm','','3:00pm - 6:00pm','http://humboldtrestaurant.com/','','3:00pm - 6:00pm'),(7,'','4:00pm - 6:00pm','http://images1.westword.com/imager/u/original/7859583/way-back-ext2.jpg',39.769235,-105.041319,'http://thewaybackdenver.com/menus-1/','','4:00pm - 6:00pm','Highlands','The Way Back','\0',NULL,'\0',NULL,'','4:00pm - 6:00pm','','4:00pm - 6:00pm','http://thewaybackdenver.com/#local-seasonal','','4:00pm - 6:00pm'),(8,'','4:00pm - 8:00pm','http://www.milehighhappyhour.com/wp-content/uploads/2014/04/Larimer-Lounge3-1000x500.jpg',39.7599262,-104.9838041,'http://www.larimerlounge.com/happy_hour.cfm','','4:00pm - 8:00pm','Curtis Park','Larimer Lounge','\0',NULL,'\0',NULL,'','4:00pm - 8:00pm','','4:00pm - 8:00pm','http://www.larimerlounge.com/','','4:00pm - 8:00pm'),(9,'','3:00pm - 6:00pm','https://cdn1.vox-cdn.com/uploads/chorus_image/image/46326706/upload.0.0.0.jpg',39.743502,-104.980749,'http://www.aceeatserve.com/menus/happyhour','','3:00pm - 6:00pm','Uptown','Ace','\0',NULL,'\0',NULL,'','3:00pm - 6:00pm','','3:00pm - 6:00pm','http://www.aceeatserve.com/menus/main','','3:00pm - 6:00pm'),(10,'','3:00pm - 6:00pm','http://images2.westword.com/imager/gozo/u/original/6030730/9860624.0.jpg',39.715948,-104.9871319,'http://gozodenver.com/happy-hour/','','3:00pm - 6:00pm','South Broadway','Gozo','\0',NULL,'\0',NULL,'','3:00pm - 6:00pm','','3:00pm - 6:00pm','http://gozodenver.com/','','3:00pm - 6:00pm'),(11,'','4:00pm - 2:00am','http://denver.thedrinknation.com/images/bars/VesperLoungeDENV.jpg',39.727443,-104.983996,'http://vesperdenver.com/menus/VesperHappyHour.pdf','','4:00pm - 2:00am','Central Denver','Vesper Lounge','','2:00pm - 2:00am','','2:00pm - 2:00am','','4:00pm - 2:00am','','4:00pm - 2:00am','http://www.vesperdenver.com/','','4:00pm - 2:00am'),(12,'','4:00pm - 6:00pm','http://wandermelon.com/wordpress/wp-content/uploads/2014/12/004_Lena_570.jpg',39.7171992,-104.9873205,'http://www.lenadenver.com/happy-hour','','4:00pm - 6:00pm','South Broadway','Leña','\0',NULL,'\0',NULL,'','4:00pm - 6:00pm','','4:00pm - 6:00pm','http://www.lenadenver.com/','','4:00pm - 6:00pm');
/*!40000 ALTER TABLE `bar_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `posts`
--

DROP TABLE IF EXISTS `posts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `posts` (
  `id` int(11) DEFAULT NULL,
  `author_id` int(11) DEFAULT NULL,
  `title` linestring DEFAULT NULL,
  `body` multilinestring DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posts`
--

LOCK TABLES `posts` WRITE;
/*!40000 ALTER TABLE `posts` DISABLE KEYS */;
/*!40000 ALTER TABLE `posts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-02 13:37:06
