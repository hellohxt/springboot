//package com.fpx.xms.exception;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@ControllerAdvice
//public class ExceptionHandleController {
//	
//	@ExceptionHandler(RuntimeException.class)
//	@ResponseBody
//	public Map<String,Object> exceptiopnHandle(){
//		Map<String,Object> map = new HashMap<String, Object>();
//		map.put("errorcode","500");
//		map.put("errormsg", "访问错误!");
//		return map;
//	}
//
//}
