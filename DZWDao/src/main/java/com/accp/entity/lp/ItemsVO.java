package com.accp.entity.lp;

public class ItemsVO {
	private int itemsid;
	private String Brandname;
	private String itemsname;
	private String itemsprice;
	private String itemsxh;
	private String itemstime;
	private String firmname;
	public ItemsVO() {}
	
	public ItemsVO(int itemsid, String brandname, String itemsname, String itemsprice, String itemsxh, String itemstime,
			String firmname) {
		super();
		this.itemsid = itemsid;
		Brandname = brandname;
		this.itemsname = itemsname;
		this.itemsprice = itemsprice;
		this.itemsxh = itemsxh;
		this.itemstime = itemstime;
		this.firmname = firmname;
	}

	public int getItemsid() {
		return itemsid;
	}
	public void setItemsid(int itemsid) {
		this.itemsid = itemsid;
	}
	public String getBrandname() {
		return Brandname;
	}
	public void setBrandname(String brandname) {
		Brandname = brandname;
	}
	public String getItemsname() {
		return itemsname;
	}
	public void setItemsname(String itemsname) {
		this.itemsname = itemsname;
	}
	public String getItemsprice() {
		return itemsprice;
	}
	public void setItemsprice(String itemsprice) {
		this.itemsprice = itemsprice;
	}
	public String getItemsxh() {
		return itemsxh;
	}
	public void setItemsxh(String itemsxh) {
		this.itemsxh = itemsxh;
	}
	public String getItemstime() {
		return itemstime;
	}
	public void setItemstime(String itemstime) {
		this.itemstime = itemstime;
	}
	public String getFirmname() {
		return firmname;
	}
	public void setFirmname(String firmname) {
		this.firmname = firmname;
	}
	
}
