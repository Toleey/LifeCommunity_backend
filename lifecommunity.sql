/*
 Navicat Premium Data Transfer

 Source Server         : MySQL57
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : lifecommunity

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 04/01/2022 10:48:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `like` int(11) DEFAULT NULL,
  `phoneNumber` varchar(11) DEFAULT NULL,
  `workId` int(11) DEFAULT NULL,
  `replyId` int(11) DEFAULT NULL,
  `createdTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
BEGIN;
INSERT INTO `comment` VALUES (1, '不错啊', 12, '13012341234', 1, NULL, '2021-12-19 11:28:10');
INSERT INTO `comment` VALUES (2, '你也这么认为吗', 2, '13112341234', 1, 1, '2021-12-19 11:28:10');
INSERT INTO `comment` VALUES (3, 'hi', 1, '13012341234', 1, 0, '2021-12-26 02:21:47');
INSERT INTO `comment` VALUES (4, 'xixi', 1, '13012341234', 1, 0, '2021-12-26 02:22:34');
INSERT INTO `comment` VALUES (5, 'hi', 1, '13012341234', 1, 0, '2021-12-26 02:26:28');
INSERT INTO `comment` VALUES (6, '真的吗', 7, '13012341234', 3, 0, '2021-12-26 02:26:39');
INSERT INTO `comment` VALUES (7, '终于完成了！', 3, '13012341234', 8, 0, '2021-12-26 02:59:30');
INSERT INTO `comment` VALUES (8, '厉害了！', 2, '13012341234', 8, 0, '2021-12-26 06:06:06');
INSERT INTO `comment` VALUES (9, '哈哈哈', 1, '13012341234', 9, 0, '2021-12-27 07:56:16');
INSERT INTO `comment` VALUES (10, '挺不错的！！！', 2, '13312341234', 10, 0, '2021-12-27 11:18:41');
INSERT INTO `comment` VALUES (11, 'hi', 0, '13012341234', 11, 0, '2022-01-02 08:03:47');
INSERT INTO `comment` VALUES (12, '好看', 2, '13012341234', 10, 0, '2022-01-03 00:10:48');
INSERT INTO `comment` VALUES (13, 'hello', 2, '13012341234', 19, 0, '2022-01-03 01:45:35');
INSERT INTO `comment` VALUES (14, '哈哈哈哈', 1, '13012341234', 13, 0, '2022-01-03 11:13:49');
INSERT INTO `comment` VALUES (15, 'hi', 19, '13012341234', 24, 0, '2022-01-03 12:29:56');
INSERT INTO `comment` VALUES (16, 'hi', 3, '13012341234', 25, 0, '2022-01-03 12:32:11');
INSERT INTO `comment` VALUES (17, 'mk', 2, '13012341234', 25, 0, '2022-01-03 12:32:35');
INSERT INTO `comment` VALUES (18, 'kl', 3, '13012341234', 25, 0, '2022-01-03 12:32:42');
INSERT INTO `comment` VALUES (19, 'op', 16, '13012341234', 25, 0, '2022-01-03 12:33:07');
INSERT INTO `comment` VALUES (20, 'uio', 4, '13012341234', 25, 0, '2022-01-03 13:04:22');
INSERT INTO `comment` VALUES (21, 'oiop', 13, '13012341234', 25, 0, '2022-01-03 13:05:03');
INSERT INTO `comment` VALUES (22, 'hi', 1, '13012341234', 25, 0, '2022-01-03 13:11:51');
INSERT INTO `comment` VALUES (23, '谢谢', 2, '18212341234', 26, 0, '2022-01-03 13:13:40');
INSERT INTO `comment` VALUES (24, '不客气', 2, '13012341234', 26, 0, '2022-01-03 13:13:51');
INSERT INTO `comment` VALUES (25, '挺不错的', 1, '18866666666', 27, 0, '2022-01-03 14:28:49');
COMMIT;

-- ----------------------------
-- Table structure for commentLike
-- ----------------------------
DROP TABLE IF EXISTS `commentLike`;
CREATE TABLE `commentLike` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commentId` int(11) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commentLike
-- ----------------------------
BEGIN;
INSERT INTO `commentLike` VALUES (44, 21, '13012341234');
INSERT INTO `commentLike` VALUES (45, 20, '13012341234');
INSERT INTO `commentLike` VALUES (46, 19, '13012341234');
INSERT INTO `commentLike` VALUES (47, 15, '13012341234');
INSERT INTO `commentLike` VALUES (48, 22, '13012341234');
INSERT INTO `commentLike` VALUES (49, 23, '18212341234');
INSERT INTO `commentLike` VALUES (50, 23, '13012341234');
INSERT INTO `commentLike` VALUES (51, 24, '13012341234');
INSERT INTO `commentLike` VALUES (52, 24, '18212341234');
INSERT INTO `commentLike` VALUES (53, 25, '18866666666');
COMMIT;

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `workId` int(11) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture
-- ----------------------------
BEGIN;
INSERT INTO `picture` VALUES (1, 1, 'https://kjava.com/zs/image/OTqzaj');
INSERT INTO `picture` VALUES (2, 1, 'https://www.qinqinghu.top/static/upload/1635648215296_mmexport1628866204399.jpg');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `avator` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  `createdTime` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `message` int(255) DEFAULT NULL,
  `like` int(255) DEFAULT NULL,
  `post` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'http://127.0.0.1:8088/2022/01/02/6ef3a93d-8b7e-4490-82bd-88187cbbebbf.jpeg', '泡泡龙', '123', '13012341234', '2021-12-18 23:06:02', 'a@a.com', 1, 1, 1);
INSERT INTO `user` VALUES (2, '123', '123', '123', '123', '2021-12-13 23:42:12', '123', 0, 0, 0);
INSERT INTO `user` VALUES (7, 'https://gravatar.zeruns.tech/avatar/2aeb599ab872efb092bce259f75d6154?s=256&d=wavatar', 'LCUser-8093', '12345', '13012341233', '2021-12-18 16:08:27', '', 0, 0, 0);
INSERT INTO `user` VALUES (8, 'https://gravatar.zeruns.tech/avatar/2aeb599ab872efb092bce259f75d6154?s=256&d=wavatar', 'LCUser-8GQ8', '123', '13012341232', '2021-12-18 16:18:00', '', 0, 0, 0);
INSERT INTO `user` VALUES (9, 'https://gravatar.zeruns.tech/avatar/2aeb599ab872efb092bce259f75d6154?s=256&d=wavatar', 'LCUser-lb50', '1234', '12312341234', '2021-12-18 16:22:46', '', 0, 0, 0);
INSERT INTO `user` VALUES (10, 'https://gravatar.zeruns.tech/avatar/2aeb599ab872efb092bce259f75d6154?s=256&d=wavatar', 'LCUser-YR9e', '897', '18819901890', '2021-12-18 16:24:07', '', 0, 0, 0);
INSERT INTO `user` VALUES (12, 'https://gravatar.zeruns.tech/avatar/2aeb599ab872efb092bce259f75d6154?s=256&d=wavatar', '大包子', '1', '18812341234', '2021-12-19 11:59:19', '', 0, 0, 0);
INSERT INTO `user` VALUES (13, 'https://www.baidu.com/img/flexible/logo/pc/result@2.png', '大包子', '123', '13112341234', '2021-12-25 14:28:40', '', 0, 0, 0);
INSERT INTO `user` VALUES (15, 'https://kjava.com/zs/image/IwYyeT', '哈哈哈', '123456', '13312341234', '2021-12-27 11:15:52', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (16, 'https://kjava.com/zs/image/OooOTm', 'LCUser-557d', '', '13812341234', '2021-12-27 11:29:27', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (17, 'https://kjava.com/zs/image/KSDaC5', '哈哈哈好', '123', '13912341234', '2021-12-27 11:32:41', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (18, NULL, '1', '1', '1', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (19, 'https://kjava.com/zs/image/OooOTm', 'LCUser-08X4', '123', '13412341234', '2022-01-03 10:34:18', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (20, 'https://kjava.com/zs/image/OooOTm', 'LCUser-5jae', '199', '19912341234', '2022-01-03 10:36:47', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (21, 'https://kjava.com/zs/image/OooOTm', 'LCUser-63Xr', '123', '13712341234', '2022-01-03 10:38:25', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (22, 'https://kjava.com/zs/image/OooOTm', 'LCUser-7h7Y', '123456', '15612341234', '2022-01-03 12:08:53', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (23, 'http://127.0.0.1:8088/2022/01/03/9fceb1c0-0891-4e1e-a62d-6e9fe8277fb9.jpeg', '大泡泡', '123', '18212341234', '2022-01-03 13:12:53', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (24, 'http://127.0.0.1:8088/2022/01/03/ae8aa589-63ae-4e6d-abd7-496b75651488.jpeg', '破败', '6666', '18866666666', '2022-01-03 14:27:42', '', NULL, NULL, NULL);
INSERT INTO `user` VALUES (25, 'http://127.0.0.1:8088/2022/01/04/7fbeeb1f-eaac-4538-a9cd-94a8f7f59a8a.jpeg', 'xa', '123', '18912342134', '2022-01-04 02:02:33', '', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pic` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `createdTime` datetime DEFAULT NULL,
  `like` int(255) DEFAULT NULL,
  `phoneNumber` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of work
-- ----------------------------
BEGIN;
INSERT INTO `work` VALUES (1, 'https://www.qinqinghu.top/static/upload/1635648215296_mmexport1628866204399.jpg', '真的好有趣，一定要好好地生活啊！', '2021-11-14 11:14:00', 2, '13012341234');
INSERT INTO `work` VALUES (2, 'https://www.qinqinghu.top/static/upload/1635648215296_mmexport1628866204399.jpg', '哈哈哈', '2021-12-14 11:14:00', 10, '13012341234');
INSERT INTO `work` VALUES (3, 'https://kjava.com/zs/image/OTqzaj', 'hi', '2021-11-14 11:14:00', 13, '13012341234');
INSERT INTO `work` VALUES (4, 'https://kjava.com/zs/image/OTqzaj', '123', '2021-12-25 12:04:17', 0, '13112341234');
INSERT INTO `work` VALUES (7, 'https://www.baidu.com/img/flexible/logo/pc/result@2.png', '123', '2021-12-25 14:43:19', 15, '13112341234');
INSERT INTO `work` VALUES (8, 'https://t8.baidu.com/it/u=3055708618,1010707372&fm=173&app=49&f=JPEG?w=312&h=208&s=35BB5F95564B454B140CBC7A03009031', '你喜欢看这个吗', '2021-12-25 14:44:10', 5, '13112341234');
INSERT INTO `work` VALUES (9, 'https://kjava.com/zs/image/k6EAIE', '哈哈哈哈哈', '2021-12-27 07:56:04', 1, '13012341234');
INSERT INTO `work` VALUES (10, 'https://kjava.com/zs/image/IwYyeT', '新换的头像好看吗？', '2021-12-27 11:18:32', 1, '13312341234');
INSERT INTO `work` VALUES (11, 'https://kjava.com/zs/image/OLZAwx', 'Hi', '2021-12-27 11:36:57', 2, '13912341234');
INSERT INTO `work` VALUES (13, 'http://127.0.0.1:8088/2022/01/02/5d3d1f74-810a-40db-a0cd-e8b1665fb791.jpeg', 'hi', '2022-01-02 12:36:31', 2, '13012341234');
INSERT INTO `work` VALUES (14, 'http://127.0.0.1:8088/2022/01/03/2b9c4354-f2e3-40ec-ba7b-769eefc625cc.jpeg', 'hi', '2022-01-03 00:18:03', 0, '13012341234');
INSERT INTO `work` VALUES (15, 'http://127.0.0.1:8088/2022/01/03/6aea5ac6-95cb-43f1-a498-2d9a8f662495.jpg', 'aloha', '2022-01-03 00:54:49', 1, '13012341234');
INSERT INTO `work` VALUES (16, 'http://127.0.0.1:8088/2022/01/03/852f4dcf-0551-4c5e-b9f8-ee393efc5128.png', '1', '2022-01-03 00:56:34', 0, '13012341234');
INSERT INTO `work` VALUES (17, 'http://127.0.0.1:8088/2022/01/03/4f6a532f-c494-432b-9f3d-b1ad92a3629f.png', '1', '2022-01-03 00:56:40', 9, '13012341234');
INSERT INTO `work` VALUES (18, 'http://127.0.0.1:8088/2022/01/03/ea9417c6-7b80-458a-abd1-52bac5490e20.jpeg', 'hi', '2022-01-03 01:02:57', 0, '13012341234');
INSERT INTO `work` VALUES (19, 'http://127.0.0.1:8088/2022/01/03/ed22dd8f-a69c-47db-a9ad-f147b56d779a.jpeg', 'test2', '2022-01-03 01:45:21', 10, '13012341234');
INSERT INTO `work` VALUES (20, 'http://127.0.0.1:8088/2022/01/03/219ba8af-30e5-4f0a-bab5-e0d4360943c0.jpeg', 'hali', '2022-01-03 10:23:09', 0, '13012341234');
INSERT INTO `work` VALUES (21, 'http://127.0.0.1:8088/2022/01/03/f85dfdec-e957-4acb-ae2c-6f86e249842f.jpeg', 'logoh', '2022-01-03 10:25:13', 0, '13012341234');
INSERT INTO `work` VALUES (22, 'http://127.0.0.1:8088/2022/01/03/bcd579ae-2c33-4c6b-95e4-6a380ac5d86e.jpeg', 'hi', '2022-01-03 10:35:24', 0, '13412341234');
INSERT INTO `work` VALUES (23, 'http://127.0.0.1:8088/2022/01/03/04fedbfd-c7c9-4ee0-8e8d-93174f7c1b7f.jpeg', '', '2022-01-03 10:36:55', 1, '19912341234');
INSERT INTO `work` VALUES (24, 'http://127.0.0.1:8088/2022/01/03/2ac188f2-21a7-402c-bbf9-4642c43548ac.jpeg', '', '2022-01-03 10:38:32', 3, '13712341234');
INSERT INTO `work` VALUES (25, 'http://127.0.0.1:8088/2022/01/03/6a7fa4a9-43bc-4558-a365-8dc5aa8c88b4.jpeg', '666', '2022-01-03 11:14:07', 20, '13012341234');
INSERT INTO `work` VALUES (26, 'http://127.0.0.1:8088/2022/01/03/46816375-2369-47a2-819e-994d8a6a82ac.jpeg', '终于弄好了！', '2022-01-03 13:13:05', 3, '18212341234');
INSERT INTO `work` VALUES (27, 'http://127.0.0.1:8088/2022/01/03/f77ca2e4-fb76-4c60-9fe1-50d45a90000e.jpeg', '信任', '2022-01-03 14:28:35', 1, '18866666666');
INSERT INTO `work` VALUES (28, 'http://127.0.0.1:8088/2022/01/04/81223988-7c30-4dee-87a4-3332f8e2fd42.png', 'ho', '2022-01-04 02:03:10', 1, '18912342134');
COMMIT;

-- ----------------------------
-- Table structure for workLike
-- ----------------------------
DROP TABLE IF EXISTS `workLike`;
CREATE TABLE `workLike` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phoneNumber` varchar(255) DEFAULT NULL,
  `workId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of workLike
-- ----------------------------
BEGIN;
INSERT INTO `workLike` VALUES (55, '13012341234', 25);
INSERT INTO `workLike` VALUES (56, '13012341234', 19);
INSERT INTO `workLike` VALUES (57, '13012341234', 15);
INSERT INTO `workLike` VALUES (58, '13012341234', 8);
INSERT INTO `workLike` VALUES (59, '15612341234', 25);
INSERT INTO `workLike` VALUES (60, '13012341234', 3);
INSERT INTO `workLike` VALUES (61, '13012341234', 24);
INSERT INTO `workLike` VALUES (62, '13012341234', 23);
INSERT INTO `workLike` VALUES (63, '13012341234', 13);
INSERT INTO `workLike` VALUES (64, '18212341234', 26);
INSERT INTO `workLike` VALUES (65, '13012341234', 26);
INSERT INTO `workLike` VALUES (66, '18866666666', 26);
INSERT INTO `workLike` VALUES (67, '18866666666', 27);
INSERT INTO `workLike` VALUES (68, '18912342134', 28);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
