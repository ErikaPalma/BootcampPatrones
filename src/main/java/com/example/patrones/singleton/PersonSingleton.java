package com.example.patrones.singleton;

public class PersonSingleton {

	   private static  PersonSingleton instance;
	   
	   private String name;
	   private int age;

	   private PersonSingleton() {}

	   public static PersonSingleton getInstance() {
	       if (instance == null) {
	           instance = new PersonSingleton();
	       }
	       return instance;
	   }
	   
	   public void singletonOperation() {
		   System.out.println("Persona");
	   }
	}