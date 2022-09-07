package com.lab0.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Greeter obj = (Greeter) applicationContext.getBean(Greetings.class);
		
		System.out.println(obj.getGreeting());
		//SpringApplication.run(Application.class, args);
		
	}

}
