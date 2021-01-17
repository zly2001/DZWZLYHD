package com.accp.entity;

import java.util.Date;

public class Function {

	private Integer fid;

	private String fcode;
	
	private String fname;
	
	private Integer fpid;
	
	private Date createdate;
	
	private Function fpida;

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

	public Integer getFpid() {
		return fpid;
	}

	public void setFpid(Integer fpid) {
		this.fpid = fpid;
	}

	public Function getFpida() {
		return fpida;
	}

	public void setFpida(Function fpida) {
		this.fpida = fpida;
	}

	@Override
	public String toString() {
		return "Function [fid=" + fid + ", fcode=" + fcode + ", fname=" + fname + ", fpid=" + fpid + ", fpida=" + fpida
				+ ", createdate=" + createdate + ", getFid()=" + getFid() + ", getFcode()=" + getFcode()
				+ ", getFname()=" + getFname() + ", getCreatedate()=" + getCreatedate() + ", getFpid()=" + getFpid()
				+ ", getFpida()=" + getFpida() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
