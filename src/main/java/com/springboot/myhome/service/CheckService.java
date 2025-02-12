package com.springboot.myhome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.myhome.mapper.CheckMapper;

@Service
public class CheckService {
	@Autowired
	private CheckMapper checkMapper;
	
	public Integer checkDupId(String id) {
		return this.checkMapper.checkDupId(id);
	}
}
