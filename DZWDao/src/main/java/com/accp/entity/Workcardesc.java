package com.accp.entity;

import java.util.Date;

public class Workcardesc {
    private Integer workcarjlid;

    private String inid;

    private Integer wid;

    private Date workcarfirstdate;

    private Date workcarenddate;

    private String firstaddress;

    private String endaddress;

    private Float zgls;

    private Integer type;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    public Integer getWorkcarjlid() {
        return workcarjlid;
    }

    public void setWorkcarjlid(Integer workcarjlid) {
        this.workcarjlid = workcarjlid;
    }

    public String getInid() {
        return inid;
    }

    public void setInid(String inid) {
        this.inid = inid == null ? null : inid.trim();
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Date getWorkcarfirstdate() {
        return workcarfirstdate;
    }

    public void setWorkcarfirstdate(Date workcarfirstdate) {
        this.workcarfirstdate = workcarfirstdate;
    }

    public Date getWorkcarenddate() {
        return workcarenddate;
    }

    public void setWorkcarenddate(Date workcarenddate) {
        this.workcarenddate = workcarenddate;
    }

    public String getFirstaddress() {
        return firstaddress;
    }

    public void setFirstaddress(String firstaddress) {
        this.firstaddress = firstaddress == null ? null : firstaddress.trim();
    }

    public String getEndaddress() {
        return endaddress;
    }

    public void setEndaddress(String endaddress) {
        this.endaddress = endaddress == null ? null : endaddress.trim();
    }

    public Float getZgls() {
        return zgls;
    }

    public void setZgls(Float zgls) {
        this.zgls = zgls;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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