package com.coolweather.app.modle;

public class City {
	
	private int id;
	private String cityName;
	private String cityPyName;
	private String cityCode;
	private String cityNum;
	private int provinceId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityPyName() {
		return cityPyName;
	}
	
	public void setCityPyName(String cityPyName) {
		this.cityPyName = cityPyName;
	}
	
	public String getCityCode() {
		return cityCode;
	}
	
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	
	public String getCityNum() {
		return cityNum;
	}
	
	public void setCityNum(String cityNum) {
		this.cityNum = cityNum;
	}
	
	public int getProvinceId() {
		return provinceId;
	}
	
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	
}
