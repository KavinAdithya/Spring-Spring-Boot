package com.techcrack.LearningSpring.xmlConfigurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//
//@Component
//@Primary
public class Student {
//	@Autowired
	private String name;
	
	private int age;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getCourse()=" + getCourse() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	private Course course;
	
	public Student(Course course) {
		this.course = course;
	}
	
	public void warmup() {
		System.out.println("Fetching... Student....");
	}
	
	public void destroy() {
		System.out.println("Clean up...Student...");
	}
}
