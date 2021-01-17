package com.accp.entity;

import java.util.Date;

public class Function {
	
	private Integer fid;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFcode() {
		return fcode;
	}
	public void setFcode(String fcode) {
		this.fcode = fcode;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	private String fcode;
	private String fname;
	private Integer fpid;
	public Integer getFpid() {
		return fpid;
	}
	public void setFpid(Integer fpid) {
		this.fpid = fpid;
	}
	private Function fpida;
	public Function getFpida() {
		return fpida;
	}
	public void setFpida(Function fpida) {
		this.fpida = fpida;
	}
	private Date createdate;
}
