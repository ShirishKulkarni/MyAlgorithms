package org.leetcode.algorithms.core;

public class Cat implements test1,test2{

	
	public static int a=30;
	
	public static void main(String[] args) {
		
		
		 
		Cat t1=new Cat();
				
		System.out.println(Cat.a);
	}

	@Override
	public void run() {
		
	}

}


interface test1{
	
	int a=10;
	void run();
}


interface test2{
	
	int a=20;
	void run();
}