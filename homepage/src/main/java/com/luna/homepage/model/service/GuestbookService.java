package com.luna.homepage.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luna.homepage.model.mapper.GuestbookMapper;
import com.luna.homepage.model.vo.GuestbookVo;

@Service
public class GuestbookService {

	@Autowired
	GuestbookMapper guestbookMapper;

	public List<GuestbookVo> listUp() {
		return guestbookMapper.listUp();
	}
	
	
	
}
