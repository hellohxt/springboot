package com.fpx.xms.service;

public interface MarketService {

	
	 String selectByName(String name);
	 
	 void insert(String name, Integer age);

	void delete(String name);

	String getAll(String name);

	void hset(String key, String hashKey, String value) throws Exception;

	void hdel(String key, String hashKey)throws Exception;

	void deleteAllKey(String key);
	 
	
}
