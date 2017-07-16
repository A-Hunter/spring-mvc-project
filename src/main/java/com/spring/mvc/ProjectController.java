package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@RequestMapping("/add")
	public String addProject(){
		return "add_project";
	}

	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String saveProject(){
		System.out.println("invoking saveProject");
		return "add_project";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi"})
	public String saveMultiYearProject(){
		System.out.println("invoking saveMultiYearProject");
		return "add_project";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST, params={"type=multi","special"})
	public String saveSpecialProject(){
		System.out.println("invoking saveSpecialProject");
		return "add_project";
	}

}
