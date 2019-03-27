
CREATE TABLE `t_sys_org` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `orgid` varchar(32) NOT NULL,
  `orgCode` varchar(20) DEFAULT NULL,
  `virtualCode` varchar(80) NOT NULL,
  `orgName` varchar(255) DEFAULT NULL,
  `parentOrgid` varchar(32) NOT NULL,
  `orgDesc` varchar(255) DEFAULT NULL,
  `inputTime` varchar(80) NOT NULL,
  `updateTime` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`tid`),
  UNIQUE KEY `orgid` (`orgid`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8;


