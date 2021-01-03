package com.accp.entity;

public class Items {
    private Integer itemsid;

    private Integer itemstypeid;

    private String itemsname;

    private String itemsprice;

    private String itemsxh;

    private String itemstime;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public Integer getItemstypeid() {
        return itemstypeid;
    }

    public void setItemstypeid(Integer itemstypeid) {
        this.itemstypeid = itemstypeid;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname == null ? null : itemsname.trim();
    }

    public String getItemsprice() {
        return itemsprice;
    }

    public void setItemsprice(String itemsprice) {
        this.itemsprice = itemsprice == null ? null : itemsprice.trim();
    }

    public String getItemsxh() {
        return itemsxh;
    }

    public void setItemsxh(String itemsxh) {
        this.itemsxh = itemsxh == null ? null : itemsxh.trim();
    }

    public String getItemstime() {
        return itemstime;
    }

    public void setItemstime(String itemstime) {
        this.itemstime = itemstime == null ? null : itemstime.trim();
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