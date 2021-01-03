package com.accp.entity;

import java.util.Date;

public class Cashiers {
    private String casid;

    private String inid;

    private Float cassprice;

    private Float shisprice;

    private String paymenttemp;

    private Date casdate;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    public String getCasid() {
        return casid;
    }

    public void setCasid(String casid) {
        this.casid = casid == null ? null : casid.trim();
    }

    public String getInid() {
        return inid;
    }

    public void setInid(String inid) {
        this.inid = inid == null ? null : inid.trim();
    }

    public Float getCassprice() {
        return cassprice;
    }

    public void setCassprice(Float cassprice) {
        this.cassprice = cassprice;
    }

    public Float getShisprice() {
        return shisprice;
    }

    public void setShisprice(Float shisprice) {
        this.shisprice = shisprice;
    }

    public String getPaymenttemp() {
        return paymenttemp;
    }

    public void setPaymenttemp(String paymenttemp) {
        this.paymenttemp = paymenttemp == null ? null : paymenttemp.trim();
    }

    public Date getCasdate() {
        return casdate;
    }

    public void setCasdate(Date casdate) {
        this.casdate = casdate;
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