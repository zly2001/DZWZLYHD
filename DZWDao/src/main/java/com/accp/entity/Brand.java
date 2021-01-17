package com.accp.entity;

public class Brand {
	private Integer brandid;

	private String brandname;

	private String brandfirstzm;

	private String column1;

	private String column2;

	private String column3;

	private String column4;

	public Integer getBrandid() {
		return brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname == null ? null : brandname.trim();
	}

	public String getBrandfirstzm() {
		return brandfirstzm;
	}

	public void setBrandfirstzm(String brandfirstzm) {
		this.brandfirstzm = brandfirstzm == null ? null : brandfirstzm.trim();
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

	public Brand() {

	}

	public Brand(Integer brandid, String brandname, String brandfirstzm, String column1, String column2, String column3,
			String column4) {
		super();
		this.brandid = brandid;
		this.brandname = brandname;
		this.brandfirstzm = brandfirstzm;
		this.column1 = column1;
		this.column2 = column2;
		this.column3 = column3;
		this.column4 = column4;
	}
}