package com.accp.entity;

import java.util.Date;

public class Employee {
    private String employeeid;

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

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    private String ename;
    
    private Position position;
    
    public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}	
    
    public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	private Department department;

  

	public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone == null ? null : ephone.trim();
    }

    public String getEpwd() {
        return epwd;
    }

    public void setEpwd(String epwd) {
        this.epwd = epwd == null ? null : epwd.trim();
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
        this.ecreid = ecreid == null ? null : ecreid.trim();
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress == null ? null : eaddress.trim();
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
        this.eyunayin = eyunayin == null ? null : eyunayin.trim();
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1 == null ? null : column1.trim();
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2 == null ? null : column2.trim();
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3 == null ? null : column3.trim();
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4 == null ? null : column4.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", ephone=" + ephone + ", epwd=" + epwd + ", esex=" + esex
				+ ", ecreid=" + ecreid + ", eaddress=" + eaddress + ", etrytimes=" + etrytimes + ", elaimes=" + elaimes
				+ ", ezuant=" + ezuant + ", eyunayin=" + eyunayin + ", phone1=" + phone1 + ", email=" + email
				+ ", deid=" + deid + ", statusid=" + statusid + ", positionid=" + positionid + ", column1=" + column1
				+ ", column2=" + column2 + ", column3=" + column3 + ", column4=" + column4 + ", ename=" + ename
				+ ", position=" + position + ", department=" + department + ", getPosition()=" + getPosition()
				+ ", getDepartment()=" + getDepartment() + ", getEmployeeid()=" + getEmployeeid() + ", getEphone()="
				+ getEphone() + ", getEpwd()=" + getEpwd() + ", getEsex()=" + getEsex() + ", getEcreid()=" + getEcreid()
				+ ", getEaddress()=" + getEaddress() + ", getEtrytimes()=" + getEtrytimes() + ", getElaimes()="
				+ getElaimes() + ", getEzuant()=" + getEzuant() + ", getEyunayin()=" + getEyunayin() + ", getPhone1()="
				+ getPhone1() + ", getEmail()=" + getEmail() + ", getDeid()=" + getDeid() + ", getStatusid()="
				+ getStatusid() + ", getPositionid()=" + getPositionid() + ", getColumn1()=" + getColumn1()
				+ ", getColumn2()=" + getColumn2() + ", getColumn3()=" + getColumn3() + ", getColumn4()=" + getColumn4()
				+ ", getEname()=" + getEname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    
}