package com.accp.entity;

import java.util.Date;
import java.util.List;


public class Function {
	private Integer fid;

	private String fcode;

	private String fname;

	private Integer fpid;

	private Date createdate;

	// 父级
	private Function fpida;
	
	// 子级
	private List<Function> FunctionFater;

	public List<Function> getFunctionFater() {
		return FunctionFater;
	}

	public void setFunctionFater(List<Function> functionFater) {
		FunctionFater = functionFater;
	}

	public Function getFpida() {
		return fpida;
	}

	public void setFpida(Function fpida) {
		this.fpida = fpida;
	}

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
		this.fcode = fcode == null ? null : fcode.trim();
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname == null ? null : fname.trim();
	}

	public Integer getFpid() {
		return fpid;
	}

	public void setFpid(Integer fpid) {
		this.fpid = fpid;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
}