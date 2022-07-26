package com.interview.user.details.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.interview.user.details.service.UserServiceImpl;

/**
 * @author khaja
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@GetMapping("/users/{pageNo}/{pageSize}")
	public String getPaginatedUsers(@PathVariable int pageNo, 
	        @PathVariable int pageSize,Model model) {
	    model.addAttribute("users",userService.findPaginated(pageNo, pageSize));
	    return "view";
	}
	
	@GetMapping("/users/sort/{pageNo}/{pageSize}")
	public String getPaginatedUsersAndSortByIdAndName(@PathVariable int pageNo, 
	        @PathVariable int pageSize, @RequestParam String sort,Model model) {
		List<String> list = Arrays.asList(sort.split(","));
	    model.addAttribute("users",userService.findPaginated(pageNo, pageSize,list.get(0),list.get(1)));
	    return "view";
	}
	
	@GetMapping("/users/filter/name")
	public String getPaginatedUsersAndFilteredByName(@RequestParam String name,Pageable pageable,Model model) {
	    model.addAttribute("users",userService.findSearchByName(name,pageable));
	    return "view";
	}
	@GetMapping("/users/filter/age")
	public String getPaginatedUsersAndFilteredByAge(@RequestParam Integer age,Pageable pageable,Model model) {
	    model.addAttribute("users",userService.findSearchByAge(age,pageable));
	    return "view";
	}

}
