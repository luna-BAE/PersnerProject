package com.luna.homepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luna.homepage.model.service.GuestbookService;
import com.luna.homepage.model.vo.GuestbookVo;

@Controller
public class TestController {
	
	@Autowired
	GuestbookService guestbookService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index(Model model) {
		
		List<GuestbookVo> contentList = guestbookService.listUp();
		model.addAttribute("list",contentList);
		
		return "index";
	}
	
}
