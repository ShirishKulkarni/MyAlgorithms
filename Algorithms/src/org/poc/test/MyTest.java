package org.poc.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		
		System.out.println(l);
		l.remove(l.size()-1);
		System.out.println(l);
	}

}
