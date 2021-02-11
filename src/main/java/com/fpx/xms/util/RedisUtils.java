//package com.fpx.xms.util;
//
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.util.CollectionUtils;
//
//
//@Component
//@SuppressWarnings({"rawtypes","unchecked"})
//public class RedisUtils {
//	
//	
//	@Autowired
//	private RedisTemplate redisTemplate;
//	
//	 /**
//	    * 设置指定 key 的值
//	    * @param key
//	    * @param value
//	    */
//	public boolean set(String key, String value) {
//		   try {
//			   redisTemplate.opsForValue().set(key, value);
//			   return true;
//		} catch (Exception e) {
//			   return false;		
//		}
//	    
//	   }
//
//	   /**
//	    * 获取指定 key 的值
//	    * @param key
//	    * @return
//	    */
//	   public Object get(String key) {
//           return key==null?null:redisTemplate.opsForValue().get(key);	     
//	   }
//	   
//	   /**
//	    * 获取所以key
//	    * @param key
//	    * @return
//	    */
//	   public Object getAll(String key) {
//          Set<String> keys =  redisTemplate.keys(key.concat("*"));
//          return keys;
//	   }
//	   
//	   
//	   /**
//	     * 删除缓存
//	     *
//	     * @param key 可以传一个值 或多个
//	     */
//	    public void del(String... key) {
//	        if (key != null && key.length > 0) {
//	            if (key.length == 1) {
//	                redisTemplate.delete(key[0]);
//	            } else {
//	                redisTemplate.delete(CollectionUtils.arrayToList(key));
//	            }
//	        }
//	    }
//	    
//	    /**
//	     * 根据hashKeys删除缓存
//	     *
//	     * @param key 可以传一个值 或多个
//	     */
//	    public void hDel(String key, Object hashKeys) {
//	       redisTemplate.opsForHash().delete(key, hashKeys);
//	    }
//	    
//	    /**
//	     *  
//	     * @Description 设置缓存以及缓存失效时间
//	     * @param key
//	     * @param hashKey
//	     * @param value
//	     * @param timeout
//	     * @throws Exception
//	     */
//	    public void hset(String key, String hashKey, String value, Long timeout) throws Exception {
//	        try {
//	            redisTemplate.opsForHash().put(key, hashKey, value);
//	            redisTemplate.expire(key, timeout, TimeUnit.HOURS);
//	        } catch (Exception e) {
//	          throw new Exception();
//	        }
//	    }
//	    
//	    
//	    /**
//	     *  
//	     * @Description 删除指定缓存
//	     * @param key
//	     * @param hashKey
//	     * @param value
//	     * @param timeout
//	     * @throws Exception
//	     */
//	    public void hdel(String key, String hashKey) throws Exception {
//	        try {
//	            redisTemplate.opsForHash().delete(key, hashKey);
//	        } catch (Exception e) {
//	          throw new Exception();
//	        }
//	    }
//	    
//	    
//	    public void deleteAllKey(String key) {
//	        try {
//	            redisTemplate.opsForHash().delete(key);
//	        } catch (Exception e) {
//	        }
//	        try {
//	            redisTemplate.delete(key);
//	        } catch (Exception e) {
//	        }
////	        try {
////	            Set<String> keySet = redisTemplate.keys(key + "*");
////	            if (keySet != null && !keySet.isEmpty()) {
////	                redisTemplate.delete(keySet);
////	            }
////	        } catch (Exception e) {
////	        }
//	    }
//
//
//}
