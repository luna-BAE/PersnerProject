package com.luna.homepage.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luna.homepage.model.mapper.StudioMapper;
import com.luna.homepage.model.vo.StudioVo;

@Service
public class StudioService {
	
	@Autowired
	StudioMapper studioMapper;
	
	public List<StudioVo> listUpStudio(){
		return studioMapper.listUpStudio();
	};

}
