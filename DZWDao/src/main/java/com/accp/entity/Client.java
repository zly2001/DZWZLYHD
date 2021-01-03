package com.accp.entity;

import java.util.Date;

public class Client {
    private String clientno;

    private String employeeid;

    private String cliname;

    private String cliphone;

    private String cliaddress;

    private Date clidate;

    private Integer mid;

    private Float baifb;

    private Date rhdate;

    private Float yue;

    private String sfz;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    private String khbz;

    public String getClientno() {
        return clientno;
    }

    public void setClientno(String clientno) {
        this.clientno = clientno == null ? null : clientno.trim();
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    public String getCliname() {
        return cliname;
    }

    public void setCliname(String cliname) {
        this.cliname = cliname == null ? null : cliname.trim();
    }

    public String getCliphone() {
        return cliphone;
    }

    public void setCliphone(String cliphone) {
        this.cliphone = cliphone == null ? null : cliphone.trim();
    }

    public String getCliaddress() {
        return cliaddress;
    }

    public void setCliaddress(String cliaddress) {
        this.cliaddress = cliaddress == null ? null : cliaddress.trim();
    }

    public Date getClidate() {
        return clidate;
    }

    public void setClidate(Date clidate) {
        this.clidate = clidate;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Float getBaifb() {
        return baifb;
    }

    public void setBaifb(Float baifb) {
        this.baifb = baifb;
    }

    public Date getRhdate() {
        return rhdate;
    }

    public void setRhdate(Date rhdate) {
        this.rhdate = rhdate;
    }

    public Float getYue() {
        return yue;
    }

    public void setYue(Float yue) {
        this.yue = yue;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz == null ? null : sfz.trim();
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

    public String getKhbz() {
        return khbz;
    }

    public void setKhbz(String khbz) {
        this.khbz = khbz == null ? null : khbz.trim();
    }
}