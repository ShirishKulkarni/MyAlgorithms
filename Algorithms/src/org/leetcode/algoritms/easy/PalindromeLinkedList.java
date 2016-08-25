package org.leetcode.algoritms.easy;

public class PalindromeLinkedList {

	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode head = l;
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		l.next.next.next = new ListNode(4);
		l.next.next.next.next = new ListNode(5);
		System.out.println(head);
		//System.out.println(isPalindrome(l));

	}

	
	

}

class MyListNode {
	int val;
	ListNode next;
	static int size;

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

	MyListNode(int x) {
		val = x;
		size++;
	}
	
public static boolean isPalindrome(MyListNode head) {
	boolean res=true;
	if(head!=null&&head.next!=null){
		
	}
	return res;
		
	}
	

}
