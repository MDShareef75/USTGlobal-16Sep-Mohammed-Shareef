package com.ust.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.springcore.di.Hello;
import com.ust.springcore.di.Pet;

public class XMLComponentScanApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Hello hello = context.getBean(Hello.class);
		hello.setMsg("Hello Iam shareef");
		System.out.println(hello.getMsg());
		
		Pet pet = context.getBean(Pet.class);
		pet.setName("siri");
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
	}
}
