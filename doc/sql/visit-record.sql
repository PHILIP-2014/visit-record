--
--create db
--

CREATE DATABASE  IF NOT EXISTS `visit-record`;
USE `visit-record`;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user` COMMENT '用户基础表';
CREATE TABLE `user` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '姓名',
  `phone` varchar(20) NOT NULL DEFAULT '' COMMENT '联系方式',
  `password` varchar(20) NOT NULL DEFAULT '' COMMENT '密码',
  `age` int(5) DEFAULT NULL COMMENT '年龄',
  `address` varchar(40) DEFAULT NULL COMMENT '住址',
  `type` int(4) DEFAULT NULL COMMENT '类型: \n 0:同工 \n 1:朋友男, 2:朋友女 \n 3:弟兄, 4:姊妹 \n 5:男孩, 6:女孩',
  `gmt_created` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1001 DEFAULT CHARSET=latin1;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record` COMMENT '反馈记录表';
CREATE TABLE `record` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `uid_target` bigint(10) NOT NULL DEFAULT 0l COMMENT '被探访者ID',
  `uid_visitor` bigint(10) NOT NULL DEFAULT 0l COMMENT '探访者ID',
  `visitors` varchar(20) DEFAULT NULL COMMENT '随从探访者IDs',
  `gmt_visit` datetime DEFAULT NULL COMMENT '探访时间',
  `logs` varchar(150) DEFAULT NULL DEFAULT '' COMMENT '情况日志记录',
  `is_visited` tinyint(1) DEFAULT 0 COMMENT '已探访',
  `gmt_created` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Table structure for table `require`
--

DROP TABLE IF EXISTS `require` COMMENT '需求记录表';
CREATE TABLE `require` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '需求ID',
  `uid_target` bigint(10) NOT NULL DEFAULT 0l COMMENT '需探访者ID',
  `gmt_deadline` datetime DEFAULT NULL COMMENT '截止时间',
  `reason` varchar(50) DEFAULT '' COMMENT '缘由记录',
  `is_token` tinyint(1) DEFAULT 0 COMMENT '已被领取',
  `gmt_created` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Table structure for table `agenda`
--

DROP TABLE IF EXISTS `agenda` COMMENT '日程记录表';
CREATE TABLE `agenda` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '日程ID',
  `uid` bigint(10) NOT NULL DEFAULT 0 COMMENT '用户ID',
  `title` varchar(20) NOT NULL DEFAULT '' COMMENT '标题',
  `description` varchar(40) DEFAULT NULL COMMENT '详情描述',
  `gmt_start` datetime DEFAULT NULL COMMENT '开始时间',
  `gmt_end` datetime DEFAULT NULL COMMENT '结束时间',
  `address` varchar(40) DEFAULT NULL COMMENT '地点',
  `is_disabled` tinyint(1) NOT NULL DEFAULT 0 COMMENT '已废除',
  `gmt_created` datetime DEFAULT NULL,
  `gmt_modify` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
