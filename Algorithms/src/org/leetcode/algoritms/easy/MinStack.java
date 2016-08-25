package org.leetcode.algoritms.easy;

public class MinStack {

	

	public static void main(String[] args) {
		MinStack s = new MinStack();
		s.push(10);
		s.push(20);
		s.push(45);
		s.push(1);
		//System.out.println(s.top);
		s.pop();
		//System.out.println(s.top);
		//System.out.println(s.getMin());
	}

	Node top;
	public void push(int x) {
		

		if (top == null) {
			top = new Node();
			top.value = x;
			top.min = x;

		} else {
			Node temp = new Node();
			temp.value = x;
			if (top.min > x) {
				temp.min = x;
			} else {
				temp.min = top.min;
			}

			top.next = temp;
			temp.prev = top;
			top = temp;

		}
		//System.out.println(x + "is pushed!");
	}

	public void pop() {
		if (top != null) {
			if (top.prev == null) {
				//System.out.println(top.value + "is popped!");
				top = null;

				return;
			} else {
				Node temp = top.prev;
				//System.out.println(top.value + "is popped!");
				temp.next = null;
				top.prev = null;
				top = temp;
				return;
			}
		} else {
			//System.out.println("empty stack!");
			return;
		}

	}

	public int top() {
		if (top != null) {
			//System.out.println(top.value + "is on top!");

			return top.value;
		} else
			throw new NullPointerException();
	}

	public int getMin() {
		if (top != null) {
			//System.out.println(top.min + "is on min!");
			return top.min;
		} else
			throw new NullPointerException();

	}
}

class Node {
	int value;
	int min;
	Node next;
	Node prev;
	
	
	
	
}
