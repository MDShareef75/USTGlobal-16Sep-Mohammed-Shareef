package com.ust.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {

	public Hello() {
	System.out.println("Hello object created");
	}
	
	private String msg;
	
	private Map<String, Integer> map;
	
	
	public Map<String, Integer> getMap() {
		return map;
	}

	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@PostConstruct //using annotations
	public void init() {
		System.out.println("Init method executing from hello");
	}
	
	@PreDestroy //using annotations //it will not execute until we close it //for "prototype" it will not destroy because it is not storing in container
	public void destroy() {
		System.out.println("Destroy method executing from hello");
	}
}
