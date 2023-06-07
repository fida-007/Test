package com.obsqura.training.loops;

public class B {

	
  public static void main(String[] args) {
	 
	  A obj1 = new A();
	  obj1.display();
	  
	  B obj2 = new B();
	  int sum = obj2.sum(10, 20);
	  System.out.println("sum:"+ sum);
}
  
  
  int sum(int a,int b) {
	  
	  int c = a + b;
	  return c;
  }
}
