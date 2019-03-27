package com.itheima.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;



/**
 * 区域
 */

public class Region implements java.io.Serializable {
	// Fields
    
//	
//	CREATE TABLE `bc_region` (
//			  `tid` INT(11) NOT NULL AUTO_INCREMENT,
//			  `orgid` VARCHAR(32) NOT NULL,
//			  `orgCode` VARCHAR(32) NOT NULL,
//			  `virtualCode` VARCHAR(32) NOT NULL,
//			  `orgName` VARCHAR(255) NOT NULL,
//			  `parentOrgid` VARCHAR(32) NOT NULL,
//			  `inputTime` DATETIME DEFAULT NULL,
//			  `orgDesc` VARCHAR(255) DEFAULT NULL,
//			  `updateTime` DATETIME DEFAULT NULL,
//			  PRIMARY KEY (`tid`)
//			) ENGINE=INNODB AUTO_INCREMENT=613 DEFAULT CHARSET=utf8;
	
	private int tid;
	private String orgid;
	private String orgCode;
	private String virtualCode;
	private String orgName;
	private String parentOrgid;
	private String inputTime;
	private String orgDesc;
	private String updateTime;

	public Region() {
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getOrgid() {
		return orgid;
	}
	public void setOrgid(String orgid) {
		this.orgid = orgid;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getVirtualCode() {
		return virtualCode;
	}
	public void setVirtualCode(String virtualCode) {
		this.virtualCode = virtualCode;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getParentOrgid() {
		return parentOrgid;
	}
	public void setParentOrgid(String parentOrgid) {
		this.parentOrgid = parentOrgid;
	}
	public String getInputTime() {
		return inputTime;
	}
	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}
	public String getOrgDesc() {
		return orgDesc;
	}
	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Region [tid=" + tid + ", orgid=" + orgid + ", orgCode=" + orgCode + ", virtualCode=" + virtualCode
				+ ", orgName=" + orgName + ", parentOrgid=" + parentOrgid + ", inputTime=" + inputTime + ", orgDesc="
				+ orgDesc + ", updateTime=" + updateTime + "]";
	}
	public Region( String orgid, String orgCode, String virtualCode, String orgName, String parentOrgid,
			String inputTime, String orgDesc, String updateTime) {
		super();
		
		this.orgid = orgid;
		this.orgCode = orgCode;
		this.virtualCode = virtualCode;
		this.orgName = orgName;
		this.parentOrgid = parentOrgid;
		this.inputTime = inputTime;
		this.orgDesc = orgDesc;
		this.updateTime = updateTime;
	}
    
	


}