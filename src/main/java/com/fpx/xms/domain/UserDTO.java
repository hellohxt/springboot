package com.fpx.xms.domain;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserDTO {


	private static UserDTO userDTO = new UserDTO();

	private UserDTO(){
		System.out.println("初始化");
	}

	public static UserDTO getUserDTO(){
	return userDTO;
	}

	private Integer id;
	private String username;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}

class Test{
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		Constructor<UserDTO> declaredMethod = UserDTO.class.getDeclaredConstructor();
		declaredMethod.setAccessible(true);
		UserDTO userDTO = declaredMethod.newInstance();
	}
}