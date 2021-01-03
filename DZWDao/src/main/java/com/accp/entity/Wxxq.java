package com.accp.entity;

public class Wxxq {
    private Integer xqid;

    private String inid;

    private String xqname;

    private Integer xqsl;

    private Integer spid;

    private Integer zt;

    private Float xmoney;

    private String xdate;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    public Integer getXqid() {
        return xqid;
    }

    public void setXqid(Integer xqid) {
        this.xqid = xqid;
    }

    public String getInid() {
        return inid;
    }

    public void setInid(String inid) {
        this.inid = inid == null ? null : inid.trim();
    }

    public String getXqname() {
        return xqname;
    }

    public void setXqname(String xqname) {
        this.xqname = xqname == null ? null : xqname.trim();
    }

    public Integer getXqsl() {
        return xqsl;
    }

    public void setXqsl(Integer xqsl) {
        this.xqsl = xqsl;
    }

    public Integer getSpid() {
        return spid;
    }

    public void setSpid(Integer spid) {
        this.spid = spid;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public Float getXmoney() {
        return xmoney;
    }

    public void setXmoney(Float xmoney) {
        this.xmoney = xmoney;
    }

    public String getXdate() {
        return xdate;
    }

    public void setXdate(String xdate) {
        this.xdate = xdate == null ? null : xdate.trim();
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