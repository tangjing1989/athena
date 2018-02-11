/*
 Navicat Premium Data Transfer

 Source Server         : 本地mysql
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : 127.0.0.1:3306
 Source Schema         : athena

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 11/02/2018 17:37:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for RELTION_USER_DEPT
-- ----------------------------
DROP TABLE IF EXISTS `RELTION_USER_DEPT`;
CREATE TABLE `RELTION_USER_DEPT` (
  `RELATION_USER_DEPT_ID` int(11) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  `CRT_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`RELATION_USER_DEPT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for RELTION_USER_ROLE
-- ----------------------------
DROP TABLE IF EXISTS `RELTION_USER_ROLE`;
CREATE TABLE `RELTION_USER_ROLE` (
  `RELATION_USER_ROLE_ID` int(11) NOT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  `CRT_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`RELATION_USER_ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of RELTION_USER_ROLE
-- ----------------------------
BEGIN;
INSERT INTO `RELTION_USER_ROLE` VALUES (1, 1, 1, '2018-02-11 15:42:16', '1', '2018-02-11 15:42:22', '1');
COMMIT;

-- ----------------------------
-- Table structure for SYS_ACCOUNT
-- ----------------------------
DROP TABLE IF EXISTS `SYS_ACCOUNT`;
CREATE TABLE `SYS_ACCOUNT` (
  `ACCOUNT_ID` int(11) NOT NULL COMMENT '账户表主键ID',
  `ACCOUNT_CODE` varchar(255) DEFAULT NULL COMMENT '登录账号',
  `ACCOUNT_PASS` varchar(255) DEFAULT NULL COMMENT '登录密码',
  `USER_ID` int(11) DEFAULT NULL COMMENT '用户 ID',
  `CRT_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`ACCOUNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统账户表';

-- ----------------------------
-- Records of SYS_ACCOUNT
-- ----------------------------
BEGIN;
INSERT INTO `SYS_ACCOUNT` VALUES (1, 'admin', '000000', 1, '2018-02-08 17:04:12', '1', '2018-02-08 17:04:17', '1');
COMMIT;

-- ----------------------------
-- Table structure for SYS_DEPARTMENT
-- ----------------------------
DROP TABLE IF EXISTS `SYS_DEPARTMENT`;
CREATE TABLE `SYS_DEPARTMENT` (
  `DEPARTMENT_ID` int(11) NOT NULL COMMENT '部门表主键ID',
  `DEPARTMENT_CODE` varchar(255) DEFAULT NULL COMMENT '部门编码',
  `DEPARTMENT_NAME_CN` varchar(255) DEFAULT NULL COMMENT '部门中文名',
  `DEPARTMENT_NAME_EN` varchar(255) DEFAULT NULL COMMENT '部门英文名',
  `DEPARTMENT_PARENT` varchar(255) DEFAULT NULL,
  `CRT_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`DEPARTMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统账户表';

-- ----------------------------
-- Table structure for SYS_DEP_PERMISSION
-- ----------------------------
DROP TABLE IF EXISTS `SYS_DEP_PERMISSION`;
CREATE TABLE `SYS_DEP_PERMISSION` (
  `DEP_PERMISSION_ID` int(11) NOT NULL,
  `DEPARTMENT_ID` int(11) DEFAULT NULL,
  `MENU_ID` int(11) DEFAULT NULL,
  `CRT_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`DEP_PERMISSION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SYS_MENU
-- ----------------------------
DROP TABLE IF EXISTS `SYS_MENU`;
CREATE TABLE `SYS_MENU` (
  `MENU_ID` int(11) NOT NULL,
  `MENU_NAME_CN` varchar(255) DEFAULT NULL,
  `MENU_NAME_EN` varchar(255) DEFAULT NULL,
  `CRT_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SYS_ROLE
-- ----------------------------
DROP TABLE IF EXISTS `SYS_ROLE`;
CREATE TABLE `SYS_ROLE` (
  `ROLE_ID` int(11) NOT NULL,
  `ROLE_NAME_CN` varchar(255) DEFAULT NULL,
  `ROLE_NAME_EN` varchar(255) DEFAULT NULL,
  `ROLE_STATE` varchar(255) DEFAULT NULL COMMENT '角色状态',
  `CRT_DATE` datetime DEFAULT NULL COMMENT '创建人',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of SYS_ROLE
-- ----------------------------
BEGIN;
INSERT INTO `SYS_ROLE` VALUES (1, '系统管理员', 'Administor', '1', '2018-02-11 15:41:49', '1', '2018-02-11 15:41:54', '1');
COMMIT;

-- ----------------------------
-- Table structure for SYS_ROLE_PERMISSION
-- ----------------------------
DROP TABLE IF EXISTS `SYS_ROLE_PERMISSION`;
CREATE TABLE `SYS_ROLE_PERMISSION` (
  `ROLE_PERMISSION_ID` int(11) NOT NULL,
  `ROLE_ID` int(11) DEFAULT NULL,
  `MENU_ID` int(11) DEFAULT NULL,
  `CRT_DATE` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`ROLE_PERMISSION_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for SYS_USER
-- ----------------------------
DROP TABLE IF EXISTS `SYS_USER`;
CREATE TABLE `SYS_USER` (
  `USER_ID` int(11) NOT NULL COMMENT '用户 ID',
  `USER_NAME_CN` varchar(255) DEFAULT NULL COMMENT '用户中文名',
  `USER_NAME_EN` varchar(255) DEFAULT NULL COMMENT '用户英文名',
  `CRT_DATE` datetime DEFAULT NULL COMMENT '创建时间',
  `CRT_USER` varchar(255) DEFAULT NULL COMMENT '创建人',
  `UPT_DATE` datetime DEFAULT NULL COMMENT '修改时间',
  `UPT_USER` varchar(255) DEFAULT NULL COMMENT '修改人',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户表';

-- ----------------------------
-- Records of SYS_USER
-- ----------------------------
BEGIN;
INSERT INTO `SYS_USER` VALUES (1, '1', '1', '2018-02-01 15:59:37', '1', '2018-02-01 15:59:40', '1');
INSERT INTO `SYS_USER` VALUES (2, '1', '1', '2018-02-01 15:59:37', '1', '2018-02-01 15:59:40', '1');
INSERT INTO `SYS_USER` VALUES (3, '1', '1', '2018-02-01 15:59:37', '1', '2018-02-01 15:59:40', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
