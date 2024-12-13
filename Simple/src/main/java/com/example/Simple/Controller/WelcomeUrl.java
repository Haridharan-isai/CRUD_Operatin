package com.example.Simple.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("welcome/")
public class WelcomeUrl{
	@GetMapping("greet/{user}")
	public String greetUser(@PathVariable String user) {
		return "Welcome to spring boot " + user;
	}
}
