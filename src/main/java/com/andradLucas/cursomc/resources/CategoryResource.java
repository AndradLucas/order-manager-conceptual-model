package com.andradLucas.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/* this class is a rest controller with "/categories" as endpoint"*/
@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String list() {
		return "REST works!";
	}

}
