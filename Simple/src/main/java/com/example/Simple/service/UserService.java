package com.example.Simple.service;
import org.springframework.stereotype.Service;
import  com.example.Simple.Model.UserInfo;
@Service
	public class UserService {
		public  UserService(UserInfo user){
			System.out.println("UserService - saveUser method invoked");
			UserInfo savedUser = new UserInfo();
			savedUser.setUserId(1);
			savedUser.setName(user.getName() + " - verified");
			savedUser.setAddress(user.getAddress() + " - verified");
			if(user.getAge() >18)
				savedUser.setAge(user.getAge());
			return;
		}
	}