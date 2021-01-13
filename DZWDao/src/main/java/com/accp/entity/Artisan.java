package com.accp.entity;

import java.util.Date;

public class Artisan extends ArtisanKey {
    private String aphone;

    private Integer sid;

    private Integer tid;

    private String aname;

    private Integer asex;

    private String address;

    private String acaid;

    private String acraft;

    private Integer azt;

    private String alzyy;

    private Date alzday;

    private String column1;

    private String column2;

    private String column3;

    private String column4;
    
    //张来遇写的技工星级对象用于储存单个技工星级信息
    private Stars Stars;

    public Stars getStars() {
		return Stars;
	}

	public void setStars(Stars stars) {
		Stars = stars;
	}

	public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public Integer getAsex() {
        return asex;
    }

    public void setAsex(Integer asex) {
        this.asex = asex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAcaid() {
        return acaid;
    }

    public void setAcaid(String acaid) {
        this.acaid = acaid == null ? null : acaid.trim();
    }

    public String getAcraft() {
        return acraft;
    }

    public void setAcraft(String acraft) {
        this.acraft = acraft == null ? null : acraft.trim();
    }

    public Integer getAzt() {
        return azt;
    }

    public void setAzt(Integer azt) {
        this.azt = azt;
    }

    public String getAlzyy() {
        return alzyy;
    }

    public void setAlzyy(String alzyy) {
        this.alzyy = alzyy == null ? null : alzyy.trim();
    }

    public Date getAlzday() {
        return alzday;
    }

    public void setAlzday(Date alzday) {
        this.alzday = alzday;
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
}