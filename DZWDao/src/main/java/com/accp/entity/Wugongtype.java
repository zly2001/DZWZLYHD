package com.accp.entity;

public class Wugongtype {
    private Integer wugongtypeid;

    private String wugongtypename;

    private Integer type;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    public Integer getWugongtypeid() {
        return wugongtypeid;
    }

    public void setWugongtypeid(Integer wugongtypeid) {
        this.wugongtypeid = wugongtypeid;
    }

    public String getWugongtypename() {
        return wugongtypename;
    }

    public void setWugongtypename(String wugongtypename) {
        this.wugongtypename = wugongtypename == null ? null : wugongtypename.trim();
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