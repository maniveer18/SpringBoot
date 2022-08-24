package com.CountryRestService.demo.Beans;

public class Country {
 int id;
 public Country(int id, String countryName, String countryCaptial) {
	super();
	this.id = id;
	this.countryName = countryName;
	this.countryCaptial = countryCaptial;
}
String countryName;
 String countryCaptial;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public String getCountryCaptial() {
	return countryCaptial;
}
public void setCountryCaptial(String countryCaptial) {
	this.countryCaptial = countryCaptial;
}
}
