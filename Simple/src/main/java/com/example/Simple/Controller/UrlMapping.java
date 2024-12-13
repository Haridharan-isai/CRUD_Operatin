package com.example.Simple.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import  com.example.Simple.Model.UserInfo;
import com.example.Simple.service.UserService;

@RestController

public class UrlMapping{
	@Autowired
	UserService service;
	//@RequestMapping(method = RequestMethod.GET, value = "welcome")
	@GetMapping("welcome")
	public String welcome(){
		return "Welcome to Spring boot project";
	}
	@GetMapping("greet/{user}")
	public String greetUser(@PathVariable String user) {
		return "Welcome " + user;
	}
	@GetMapping("greetingWithParam")
	public String greetUser(@RequestParam String name, String address) {
		return "Hello " + name  + " from " + address;
	} 
	
}
