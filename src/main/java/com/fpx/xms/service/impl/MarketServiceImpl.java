package com.fpx.xms.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import com.fpx.xms.core.MarketCoreService;
import org.springframework.stereotype.Service;

import com.fpx.xms.mapper.MarketMapper;
import com.fpx.xms.service.MarketService;

@Service
public class MarketServiceImpl implements MarketService{

	@Resource
	private MarketMapper mapper;

	@Resource
	private MarketCoreService coreService;
//	@Resource
//	private RedisUtils redisUtils;

	@Override
	public String selectByName(String name) {
		/*Object object = redisUtils.get(name);
		if(object!=null){
			String value = (String) object;
			return value;
		}*/
		String name1 = "万千";
		int age = 10;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 5);
		map.put("name", name1);
		map.put("age", age);
		mapper.insert(map);
		int i = 1/0;
		String userName = mapper.selectByName(name);
		//redisUtils.set(name, userName);
		return userName;
	}
	@Override
	public void insert(String name, Integer age) {
		// TODO Auto-generated method stub
		HashMap<String, Object> stringObjectHashMap = new HashMap<>();

		stringObjectHashMap.put("name",name);
		stringObjectHashMap.put("age",age);
		stringObjectHashMap.put("perm","perm");
		mapper.insert(stringObjectHashMap);


		coreService.insert("core",10);
	}
@Override
public void delete(String name) {
	// TODO Auto-generated method stub
	mapper.delete(name);
}
@Override
public String getAll(String name) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public void hset(String key, String hashKey, String value) throws Exception {
	// TODO Auto-generated method stub

}
@Override
public void hdel(String key, String hashKey) throws Exception {
	// TODO Auto-generated method stub

}
@Override
public void deleteAllKey(String key) {
	// TODO Auto-generated method stub

}



}
