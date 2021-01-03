package com.accp.entity;

public class Workcar {
    private Integer wid;

    private Integer statusid;

    private String caid;

    private String cztype;

    private String cbrand;

    private String czt;

    private Float ccglj;

    private Float mglj;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public String getCaid() {
        return caid;
    }

    public void setCaid(String caid) {
        this.caid = caid == null ? null : caid.trim();
    }

    public String getCztype() {
        return cztype;
    }

    public void setCztype(String cztype) {
        this.cztype = cztype == null ? null : cztype.trim();
    }

    public String getCbrand() {
        return cbrand;
    }

    public void setCbrand(String cbrand) {
        this.cbrand = cbrand == null ? null : cbrand.trim();
    }

    public String getCzt() {
        return czt;
    }

    public void setCzt(String czt) {
        this.czt = czt == null ? null : czt.trim();
    }

    public Float getCcglj() {
        return ccglj;
    }

    public void setCcglj(Float ccglj) {
        this.ccglj = ccglj;
    }

    public Float getMglj() {
        return mglj;
    }

    public void setMglj(Float mglj) {
        this.mglj = mglj;
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