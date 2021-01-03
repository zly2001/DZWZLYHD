package com.accp.entity;

public class Chongzhi {
    private Integer cid;

    private String clientno;

    private String cztype;

    private Float cmoney;

    private String cbh;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getClientno() {
        return clientno;
    }

    public void setClientno(String clientno) {
        this.clientno = clientno == null ? null : clientno.trim();
    }

    public String getCztype() {
        return cztype;
    }

    public void setCztype(String cztype) {
        this.cztype = cztype == null ? null : cztype.trim();
    }

    public Float getCmoney() {
        return cmoney;
    }

    public void setCmoney(Float cmoney) {
        this.cmoney = cmoney;
    }

    public String getCbh() {
        return cbh;
    }

    public void setCbh(String cbh) {
        this.cbh = cbh == null ? null : cbh.trim();
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