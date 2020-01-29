package com.makotojava.intro;
import java.util.Locale;
import java.util.logging.Logger;


public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private int height;
	private int weight;
	private String eyeColor;
	private String gender;
	
	public Person(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.gender = gender;
	}
	
	 public String getName() {
		return firstName.concat(" ").concat(lastName);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		int ret = height;
			if (Locale.getDefault().equals(Locale.US))
				ret /= 2.54; 
		return ret;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	Logger l = Logger.getLogger(Person.class.getName()); 
}

