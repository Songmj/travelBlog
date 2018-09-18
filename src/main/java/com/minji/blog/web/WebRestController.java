package com.minji.blog.web;

import javax.annotation.Resource;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minji.blog.domain.model.entity.Hello;
import com.minji.blog.infrastructure.dao.HelloDao;

@RestController
public class WebRestController {
	
	@Resource
	private HelloDao helloDao;
	
	@RequestMapping("/add")
	public Hello add(Hello hello) {
		
		Hello helloData = helloDao.save(hello);
		
		return helloData;
	}
	
	@RequestMapping("/list")
	public List<Hello> list(Model model){
		List<Hello> helloList = helloDao.findAll();
		
		return helloList;
	}
	
	@GetMapping("/")
	public String index() {

		return "HelloWorld";
	}
}
