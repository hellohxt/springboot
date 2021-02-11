//package com.fpx.xms.aop;
//
//import java.util.Enumeration;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//@Aspect
//@Component
//public class LogAspectConfig {
//	
//	private static final Logger logger = LoggerFactory.getLogger(LogAspectConfig.class);
//	
//	@Pointcut("execution(* com.fpx.xms.controller.*.*(..))")
//	public void webLog(){
//	}
//	/**
//	 * 前置通知
//	 * @Description
//	 * @param joinpoint
//	 */
//	@Before("webLog()")
//	public void doBefore(JoinPoint joinpoint){
//		//接收到请求，记录请求内容
//		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//		HttpServletRequest request = attributes.getRequest();
//		//记录请求内容
//		logger.info("URL:"+request.getRequestURL().toString());
//		logger.info("METHOD:"+request.getMethod());
//		logger.info("IP:"+request.getRemoteAddr());
//		Enumeration<String> enu = request.getParameterNames();
//		while (enu.hasMoreElements()) {
//			String name = (String) enu.nextElement();
//			logger.info("name:{},value:{}",name,request.getParameter(name));
//		}
//	}
//	
//	@AfterReturning(returning="res",pointcut="webLog()")
//    public void doAfter(Object res){
//   	 logger.info("Response:" + res);
//    }
//}
