package com.luna.homepage.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.luna.homepage.model.vo.GuestbookVo;

@Mapper
public interface GuestbookMapper {

	List<GuestbookVo> listUp();

}
