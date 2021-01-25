package org.sid.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.sid.dao.UserRepository;
import org.sid.entities.Role;
import org.sid.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class SecurityController {

	
	@Autowired
	private UserRepository usrep ;
	

	@RequestMapping(value = "/dashtest")
	public String home(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String email = auth.getName();
		model.addAttribute("email",email);
		model.addAttribute("auth",auth.getPrincipal());
		return "dash";
	}
	
	@RequestMapping(value="/login") 
	public String signIn(Model model) { 
		List<User> users = usrep.findAll(); 
		model.addAttribute("tabUsers", users);
		return "login"; 
	}
	
	@GetMapping(value="/register") 
	public String signup(Model model) { 
		User user = new User();
		model.addAttribute("user", user);
		return "register"; 
	}
	
	@PostMapping(value = "/register_success")
	public String processRegistration(User user){	
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		Collection<Role> collection =  new ArrayList<Role>() ;
		Role role_user = new Role("USER");
		collection.add(role_user);
		user.setRoles(collection);
		
		usrep.save(user);
		return "/register_success";
	} 

	
	
}
