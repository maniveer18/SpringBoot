package com.CountryRestService.demo.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.CountryRestService.demo.Beans.Country;
import com.CountryRestService.demo.Controllers.AddResponse;
@Component
public class CountryService {
	static HashMap<Integer,Country> countryMap;
	
	public CountryService()
	{
		countryMap =new HashMap<Integer,Country>();
		Country indiacountry=new Country(1,"India","Delhi");
		Country ukcountry=new Country(2,"UK","London");
		Country usacountry=new Country(3,"Usa","Washington");
		Country canadacountry=new Country(4,"Canada","Toronto");
		 countryMap.put(1, indiacountry);
		 countryMap.put(2, ukcountry);
		 countryMap.put(3, usacountry);
		 countryMap.put(4, canadacountry);
		
		
	}
	public List getAllCountires() {
		List countries=new ArrayList(countryMap.values());
		return countries;
	}
	public Country getCountryById(int id) {
		Country country=countryMap.get(id);
		return country;
		
	}
	public Country getCountryByName(String Name) {
		Country country=null;
		for(int i:countryMap.keySet()) {
			if(countryMap.get(i).getCountryName().equals(Name)) {
				country=countryMap.get(i);
			}
		}
		return country;
	}
	public Country addCountry(Country  country) {
		country.setId(getMaxId());
		countryMap.put(country.getId(), country);
		return country;
		
	}
	private  static int getMaxId() {
		// TODO Auto-generated method stub.
		int max=0;
		for(int id:countryMap.keySet())
			if(max<=id)
				max=id;
		return max+1;
	}
	public Country updateCountry(Country country) {
		if(country.getId()>0)
			countryMap.put(country.getId(), country);
		return country;
	}
	public AddResponse deleteCountry(int id) {
		countryMap.remove(id);
		AddResponse res=new AddResponse();
		res.setId(id);
		res.setMessage("Message Deleted.....");
		return res;
	}

}
