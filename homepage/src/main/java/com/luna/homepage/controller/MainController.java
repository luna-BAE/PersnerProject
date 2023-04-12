package com.luna.homepage.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.luna.homepage.model.service.GuestbookService;
import com.luna.homepage.model.service.StudioService;
import com.luna.homepage.model.vo.GuestbookVo;
import com.luna.homepage.model.vo.StudioVo;

@Controller
public class MainController {
	
	@Autowired
	GuestbookService guestbookService;
	
	@Autowired
	StudioService studioService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		
		return "home";
	}
	
	@RequestMapping(value="studio/studioList/dump", method = RequestMethod.GET)
	public String detail() {
		
		return "studio/studioList/dump";
	}
	
	// 사진 로딩 테스트용
	@RequestMapping(value="studio/studioList", method = RequestMethod.GET)
	public String img(Model model) {
		
		List<Map<String, String>> studioDataList = new ArrayList<Map<String, String>>();
		Map<String, String> data = null;
		
		List<StudioVo> studioList = studioService.listUpStudio();
		
		for ( StudioVo list : studioList ) {
			data = new HashMap<String, String>();
			data.put("studioName", list.getStudioName());
			data.put("studioPhoto", list.getStudioPhoto());
			data.put("studioAdd", list.getStudioAdd());
			studioDataList.add(data);
		}
		
		model.addAttribute("studioList",studioList);
		
		return "studio/studioList";
	}
	
	@RequestMapping(value="/guestbook", method = RequestMethod.GET)
	public String guestbook() {
		
		return "guestbook/guestbookList";
	}
	
}
