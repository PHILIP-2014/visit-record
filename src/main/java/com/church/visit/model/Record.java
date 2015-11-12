package com.church.visit.model;

import java.sql.Date;

public class Record extends Base {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long uidTarget;
	
	private Date gmtVisit;
	
	private String logs;
	
	private Boolean isVisited;

	public Long getUidTarget() {
		return uidTarget;
	}

	public void setUidTarget(Long uidTarget) {
		this.uidTarget = uidTarget;
	}

	public Date getGmtVisit() {
		return gmtVisit;
	}

	public void setGmtVisit(Date gmtVisit) {
		this.gmtVisit = gmtVisit;
	}

	public String getLogs() {
		return logs;
	}

	public void setLogs(String logs) {
		this.logs = logs;
	}

	public Boolean getIsVisited() {
		return isVisited;
	}

	public void setIsVisited(Boolean isVisited) {
		this.isVisited = isVisited;
	}
	
}
