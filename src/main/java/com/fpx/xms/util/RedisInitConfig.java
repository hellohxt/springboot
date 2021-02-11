//package com.fpx.xms.util;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
//import org.springframework.stereotype.Component;
//
//import redis.clients.jedis.JedisPoolConfig;
//
//@Component
//public class RedisInitConfig {
//	
//	@Bean
//	public JedisPoolConfig jedisPoolConfig() {
//		JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//		jedisPoolConfig.setMaxTotal(100);
//		jedisPoolConfig.setMaxIdle(100);
//		jedisPoolConfig.setMaxWaitMillis(3000L);
//		jedisPoolConfig.setMinIdle(0);
//		jedisPoolConfig.setTestOnBorrow(false);
//		return jedisPoolConfig;
//	}
//
//	@Bean
//	public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig jedisPoolConfig) {
//		JedisConnectionFactory factory = new JedisConnectionFactory();
//		factory.setHostName("127.0.0.1");
//		factory.setPort(6379);
//		factory.setPoolConfig(jedisPoolConfig);
//		return factory;
//	}
//
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Bean
//	public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory) {
//		final RedisTemplate template = new RedisTemplate();
//		template.setConnectionFactory(jedisConnectionFactory);
//		template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
//		template.setHashKeySerializer(template.getStringSerializer());
//		template.setKeySerializer(template.getStringSerializer());
//		template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//		return template;
//	}
//
//}
