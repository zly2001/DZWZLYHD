package com.accp.entity;

import java.util.Date;

public class EmployeeVO {
	private String employeeid;

    public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getEphone() {
		return ephone;
	}

	public void setEphone(String ephone) {
		this.ephone = ephone;
	}

	public String getEpwd() {
		return epwd;
	}

	public void setEpwd(String epwd) {
		this.epwd = epwd;
	}

	public Integer getEsex() {
		return esex;
	}

	public void setEsex(Integer esex) {
		this.esex = esex;
	}

	public String getEcreid() {
		return ecreid;
	}

	public void setEcreid(String ecreid) {
		this.ecreid = ecreid;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public Date getEtrytimes() {
		return etrytimes;
	}

	public void setEtrytimes(Date etrytimes) {
		this.etrytimes = etrytimes;
	}

	public Date getElaimes() {
		return elaimes;
	}

	public void setElaimes(Date elaimes) {
		this.elaimes = elaimes;
	}

	public Integer getEzuant() {
		return ezuant;
	}

	public void setEzuant(Integer ezuant) {
		this.ezuant = ezuant;
	}

	public String getEyunayin() {
		return eyunayin;
	}

	public void setEyunayin(String eyunayin) {
		this.eyunayin = eyunayin;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getDeid() {
		return deid;
	}

	public void setDeid(Integer deid) {
		this.deid = deid;
	}

	public Integer getStatusid() {
		return statusid;
	}

	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}

	public Integer getPositionid() {
		return positionid;
	}

	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDename() {
		return dename;
	}

	public void setDename(String dename) {
		this.dename = dename;
	}

	public String getPositionname() {
		return positionname;
	}

	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}

	private String ephone;

    private String epwd;

    private Integer esex;

    private String ecreid;

    private String eaddress;
    
    private Date etrytimes;

    private Date elaimes;

    private Integer ezuant;

    private String eyunayin;

    private String phone1;

    private String email;

    private Integer deid;

    private Integer statusid;

    private Integer positionid;
    
    private String ename;
    
    private String dename;
    
    private String positionname;

	public EmployeeVO(String employeeid, String ephone, String epwd, Integer esex, String ecreid, String eaddress,
			Date etrytimes, Date elaimes, Integer ezuant, String eyunayin, String phone1, String email, Integer deid,
			Integer statusid, Integer positionid, String ename, String dename, String positionname) {
		super();
		this.employeeid = employeeid;
		this.ephone = ephone;
		this.epwd = epwd;
		this.esex = esex;
		this.ecreid = ecreid;
		this.eaddress = eaddress;
		this.etrytimes = etrytimes;
		this.elaimes = elaimes;
		this.ezuant = ezuant;
		this.eyunayin = eyunayin;
		this.phone1 = phone1;
		this.email = email;
		this.deid = deid;
		this.statusid = statusid;
		this.positionid = positionid;
		this.ename = ename;
		this.dename = dename;
		this.positionname = positionname;
	}
    
    public EmployeeVO() {};

}
