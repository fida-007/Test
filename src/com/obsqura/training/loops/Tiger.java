package com.obsqura.training.loops;

public class Tiger extends Animal {
	
	String color = "white";
	
	public void display() {
		super.display();
		System.out.println("Tiger class");
	}
	
	
	void printColor(){
		System.out.println(super.color);
		System.out.println(color);
	}
	
	Tiger(){
		super();
	}
	
	public static void main(String[] args) {
		Tiger tr = new Tiger();
		tr.display();
		tr.printColor();
		
	}

}
