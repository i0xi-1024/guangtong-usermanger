/*
 Navicat Premium Data Transfer

 Source Server         : 群晖
 Source Server Type    : MariaDB
 Source Server Version : 100337 (10.3.37-MariaDB)
 Source Host           : pan.i0xi.cn:3306
 Source Schema         : guangtong

 Target Server Type    : MariaDB
 Target Server Version : 100337 (10.3.37-MariaDB)
 File Encoding         : 65001

 Date: 01/08/2023 11:36:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `phone` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
  `left_type` int(11) NULL DEFAULT NULL COMMENT '左眼：0.近视   1.远视',
  `left_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '左眼度数',
  `right_type` int(11) NULL DEFAULT NULL COMMENT '右眼：0.近视   1.远视',
  `right_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '右眼度数',
  `left_astigmatism` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '左眼散光',
  `right_astigmatism` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '右眼散光',
  `left_axial` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '左眼轴向',
  `right_axial` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '右眼轴向',
  `pupillary_distance` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '瞳距',
  `nasal_spacing` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '鼻距',
  `lens_brands` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '镜片品牌',
  `frames_brands` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '镜架品牌',
  `lens_prices` float(12, 2) NULL DEFAULT NULL COMMENT '镜片价格',
  `frames_prices` float(12, 2) NULL DEFAULT NULL COMMENT '镜架价格',
  `processing_prices` float(12, 2) NULL DEFAULT NULL COMMENT '加工收费',
  `rebates` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '折扣',
  `total_prices` float(12, 2) NULL DEFAULT NULL COMMENT '总计价格',
  `note` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT current_timestamp() ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `username_index`(`username`) USING BTREE COMMENT '姓名索引',
  INDEX `phone_index`(`phone`) USING BTREE COMMENT '手机号索引'
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
