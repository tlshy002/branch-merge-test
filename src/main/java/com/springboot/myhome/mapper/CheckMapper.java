package com.springboot.myhome.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CheckMapper {
	Integer checkDupId(String id);
}
