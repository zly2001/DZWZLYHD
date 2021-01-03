package com.accp.entity;

import java.util.Date;

public class Fangong {
    private Integer fid;

    private String inid;

    private Integer wugongtypeid;

    private Float fprice;

    private String fdesc;

    private Date fangongdate;

    private Integer fangongtype;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getInid() {
        return inid;
    }

    public void setInid(String inid) {
        this.inid = inid == null ? null : inid.trim();
    }

    public Integer getWugongtypeid() {
        return wugongtypeid;
    }

    public void setWugongtypeid(Integer wugongtypeid) {
        this.wugongtypeid = wugongtypeid;
    }

    public Float getFprice() {
        return fprice;
    }

    public void setFprice(Float fprice) {
        this.fprice = fprice;
    }

    public String getFdesc() {
        return fdesc;
    }

    public void setFdesc(String fdesc) {
        this.fdesc = fdesc == null ? null : fdesc.trim();
    }

    public Date getFangongdate() {
        return fangongdate;
    }

    public void setFangongdate(Date fangongdate) {
        this.fangongdate = fangongdate;
    }

    public Integer getFangongtype() {
        return fangongtype;
    }

    public void setFangongtype(Integer fangongtype) {
        this.fangongtype = fangongtype;
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