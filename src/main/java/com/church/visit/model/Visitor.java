package com.church.visit.model;

/**
 * Visitor
 */
public class Visitor extends Base {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**记录ID*/
	private Long rid;
	/**探访者ID*/
	private Long uid;

	public Visitor(){
	}

	public void setRid(Long value) {
		this.rid = value;
	}
	
	public Long getRid() {
		return this.rid;
	}
	public void setUid(Long value) {
		this.uid = value;
	}
	
	public Long getUid() {
		return this.uid;
	}

}

