package com.RestService.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUser(@RequestParam(value="pageno") int pageno,@RequestParam(value="limit") int limit) {
		return "Http get request is send for the page:"+pageno +"and the limit is:"+limit;
	}
	//Geeting the user id
	@GetMapping(path="/{userID}")
	public String getUsers(@PathVariable String userID) {
		return "Http get request is send for userId:"+userID;
	}
	@PutMapping
	public String updateUser() {
		return "Http put request is send";
	}

	@PostMapping
	public String createUser() {
		return "Http post request is send";
	}

	@DeleteMapping
	public String deleteUser() {
		return "Http delete request is send";
	}


}
