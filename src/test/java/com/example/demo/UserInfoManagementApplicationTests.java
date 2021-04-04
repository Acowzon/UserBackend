package com.example.demo;

import com.example.demo.entity.UserBean;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserInfoManagementApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
		UserBean userPojo = this.userService.getUserInfo("2");
		System.out.println(userPojo.toString());
	}

}
