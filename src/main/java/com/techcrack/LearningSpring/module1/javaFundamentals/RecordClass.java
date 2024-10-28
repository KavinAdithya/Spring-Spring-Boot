package com.techcrack.LearningSpring.module1.javaFundamentals;

record Person(int x, int y) {
	public Person{
		if (x < 5 && y < 5)
			throw new IllegalArgumentException("Unkown Data"); 	
	}
	
	public int square() {
		return (int) Math.pow(y, x);
	}
}
public class RecordClass {
	public static void main(String[] args) {
		Person person = new Person(5, 10);
		System.out.println(person.square());
	}
}
