package com.lab0.helloworld;

public class Greetings implements Greeter{
    
	private String name;
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getGreeting(){
        return "Hello world from " + name +"!";
    }
    
}
