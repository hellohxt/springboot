package com.fpx.xms.mapper;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MarketMapper {
	
	String selectByName(@Param("name") String name);
	
	void insert(Map<String, Object> map);

    void delete(@Param("name") String name);
}
