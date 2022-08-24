package com.CountryRestService.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CountryRestService.demo.Beans.Country;
import com.CountryRestService.demo.Services.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	CountryService countryservice;
	@GetMapping("/getcountries")
	public List getAllCountires() {
		return countryservice.getAllCountires();
	}
	@GetMapping("/getcountries/{id}")
	public Country getCountryById(@PathVariable(value="id") int id) {
		return countryservice.getCountryById(id);
	}
	@GetMapping("/getcountries/countryname")
	public Country getCountryByName(@RequestParam(value="name") String name) {
		return countryservice.getCountryByName(name);
	}
	@PostMapping("/addcountry")
	public Country addCountry(@RequestBody Country country) {
		return countryservice.addCountry(country);
	}
	@PutMapping("/updatecountry")
	public Country updateCountry(@RequestBody Country country) {
		return countryservice.updateCountry(country);
	}
	@DeleteMapping("/getcountries/{id}")
	public AddResponse deleteCountry(@PathVariable(value="id")int id) {
		return countryservice.deleteCountry(id);
	}
	
}
