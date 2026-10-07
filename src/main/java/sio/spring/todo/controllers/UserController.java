package sio.spring.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sio.spring.todo.entities.User;
import sio.spring.todo.repositories.UserMemoryRepository;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserMemoryRepository userRepository;

	@GetMapping
	public String index(Model model) {
		List<User> users = userRepository.findAll();
		model.addAttribute("users", users);
		return "/users/index";
	}
}
