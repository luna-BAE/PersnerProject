package com.luna.homepage.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.luna.homepage.model.vo.StudioVo;

@Mapper
public interface StudioMapper {

	List<StudioVo> listUpStudio();

}
