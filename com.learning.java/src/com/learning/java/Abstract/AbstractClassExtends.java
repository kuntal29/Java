package com.learning.java.Abstract;

public class AbstractClassExtends extends AbstractClass {

	public static void main(String[] args) {
		AbstractClassExtends obj = new AbstractClassExtends();
		obj.display();

	}

	@Override
	void display() {
		System.out.println("Abstract method of abtract class");
		
		
	}

}
