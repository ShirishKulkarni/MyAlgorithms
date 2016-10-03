package org.leetcode.algorithms.core;

public class MyLambdaTest {

	public static void main(String[] args) {
		System.out.println("hello Lambda");

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable1>>>>");
			}
		};

		Runnable r2 = () -> System.out.println("Runnable>>>>2");

		r1.run();

		r2.run();
	}

}
