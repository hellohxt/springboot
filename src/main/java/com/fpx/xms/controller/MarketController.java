package com.fpx.xms.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fpx.xms.domain.UserDTO;
import com.fpx.xms.service.MarketService;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

@Controller
public class MarketController {
	
	private static final Logger logger = LoggerFactory.getLogger(MarketController.class);
	
	@Resource
	private MarketService service;
	
	@RequestMapping("/select")
	@ResponseBody
	public String index(String name){
		String value = service.selectByName(name);
		return value;
	}
	
	@RequestMapping("/insert")
	@ResponseBody
	public void insert(String name,Integer age){
		service.insert(name,age);


		
	}
	
	@RequestMapping("/hset")
	@ResponseBody
	public void hset(String key,String hashKey,String value) throws Exception{
		service.hset(key,hashKey,value);
		
	}
	
	@RequestMapping("/hdel")
	@ResponseBody
	public void hdel(String key,String hashKey) throws Exception{
		service.hdel(key,hashKey);
		
	}
	
	@RequestMapping("/deleteAllKey")
	@ResponseBody
	public void deleteAllKey(String key){
		service.deleteAllKey(key);
		
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public void delete(String name){
		service.delete(name);
		
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public void getAll(String name){
		service.getAll(name);
	}
	

}
