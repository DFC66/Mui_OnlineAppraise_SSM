/*
Navicat MySQL Data Transfer

Source Server         : SSM
Source Server Version : 50644
Source Host           : localhost:3306
Source Database       : onlineappraise

Target Server Type    : MYSQL
Target Server Version : 50644
File Encoding         : 65001

Date: 2019-09-18 15:13:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `mname` varchar(40) NOT NULL,
  `cname` varchar(50) NOT NULL,
  `tname` varchar(10) NOT NULL,
  `Imageurl` varchar(255) DEFAULT NULL,
  `wholeAppraise` decimal(10,2) DEFAULT '0.00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('0', '计算机', '数据库', '蔡老师', 'http://172.27.35.1:8080/OnlineAppraise_war_exploded/upload/Q06L5YrGNc.png', '8.68');
INSERT INTO `message` VALUES ('1', '计算机', 'C语言', '苏老师', 'http://172.27.35.1:8080/OnlineAppraise_war_exploded/upload/Q06L5YrGNc.png', '8.86');
INSERT INTO `message` VALUES ('3', '物流', '高数1', '杨老师', 'http://172.27.35.1:8080/OnlineAppraise_war_exploded/upload/XJY78QDt4D.png', '8.83');
INSERT INTO `message` VALUES ('4', '电气', '电模1', '黄老师', 'http://172.27.35.1:8080/OnlineAppraise_war_exploded/upload/cGqFZ9w6G0.png', '8.14');
INSERT INTO `message` VALUES ('5', '外国语', '英语2', '蔡老师', 'http://172.27.35.1:8080/OnlineAppraise_war_exploded/upload/kl7hYOyRoV.png', '8.43');
INSERT INTO `message` VALUES ('6', '工商管理', '礼仪学', '王老师', 'http://172.27.35.1:8080/OnlineAppraise_war_exploded/upload/Q06L5YrGNc.png', '0.00');
INSERT INTO `message` VALUES ('7', '工商管理', '经济学', '丁老师', 'http://172.27.35.1:8080/OnlineAppraise_war_exploded/upload/uubLf51LeV.png', '0.00');
INSERT INTO `message` VALUES ('9', '有机化学', '物理学', '唐老师', 'http://172.27.35.1:8080/OnlineAppraise_war_exploded/upload/A2o8Eaaumd.png', '8.43');

-- ----------------------------
-- Table structure for result
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `id` int(10) NOT NULL,
  `user_id` varchar(20) NOT NULL,
  `m_name` varchar(40) NOT NULL,
  `c_name` varchar(50) NOT NULL,
  `t_name` varchar(10) NOT NULL,
  `appraise1` smallint(3) NOT NULL,
  `appraise2` smallint(3) NOT NULL,
  `appraise3` smallint(3) NOT NULL,
  `appraise4` smallint(3) NOT NULL,
  `appraise5` smallint(3) NOT NULL,
  `appraise6` smallint(3) NOT NULL,
  `appraise7` smallint(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of result
-- ----------------------------
INSERT INTO `result` VALUES ('1', '123', '计算机', 'C语言', '苏老师', '10', '10', '10', '6', '10', '10', '6');
INSERT INTO `result` VALUES ('1', 'a', '计算机', 'C语言', '苏老师', '10', '10', '10', '6', '10', '10', '6');
INSERT INTO `result` VALUES ('0', 'a', '计算机', '数据库', '蔡老师', '10', '10', '10', '10', '10', '10', '10');
INSERT INTO `result` VALUES ('3', 'a', '物流', '高数1', '杨老师', '9', '8', '7', '9', '6', '10', '7');
INSERT INTO `result` VALUES ('5', 'a', '外国语', '英语', '蔡老师', '9', '10', '8', '10', '6', '7', '10');
INSERT INTO `result` VALUES ('4', 'qwe', '电气', '电模1', '黄老师', '10', '9', '7', '8', '9', '6', '8');
INSERT INTO `result` VALUES ('0', 'qwe', '计算机', '数据库', '蔡老师', '6', '6', '6', '6', '6', '6', '6');
INSERT INTO `result` VALUES ('5', 'qwe', '外国语', '英语', '蔡老师', '8', '9', '6', '8', '9', '10', '8');
INSERT INTO `result` VALUES ('3', 'qwe', '物流', '高数1', '杨老师', '10', '10', '10', '10', '10', '10', '10');
INSERT INTO `result` VALUES ('0', 'qwe', '计算机', '数据库', '蔡老师', '10', '10', '10', '10', '10', '10', '10');
INSERT INTO `result` VALUES ('9', 'qwe', '有机化学', '物理学', '唐老师', '10', '9', '8', '8', '8', '9', '7');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `my_id` varchar(20) NOT NULL,
  `my_pw` varchar(30) NOT NULL,
  PRIMARY KEY (`my_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1');
INSERT INTO `user` VALUES ('123', '123');
INSERT INTO `user` VALUES ('a', 'a');
INSERT INTO `user` VALUES ('qwe', 'qwe');
