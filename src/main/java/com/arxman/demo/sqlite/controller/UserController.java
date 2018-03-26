package com.arxman.demo.sqlite.controller;

import com.arxman.demo.sqlite.entities.User;
import com.arxman.demo.sqlite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {

        List<User> allUsers = new ArrayList<>();
        Iterable<User> users = repository.findAll();

        for (User user : users) {
            allUsers.add(user);
        }

        return allUsers;
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser() {

		User user = new User();
		user.setEmail("FBI@ariman.com");
		user.setFirstName("Miku");
		user.setLastName("Ariman");
		user.setMobile("9090950");
		user.setPassword("abc123");
		user.setUserName("tester");

		repository.save(user);

		return "Saved "+user.toString();
    }
    
}