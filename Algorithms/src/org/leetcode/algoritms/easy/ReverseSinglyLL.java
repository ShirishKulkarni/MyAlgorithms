package org.leetcode.algoritms.easy;

public class ReverseSinglyLL {

	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode head = l;
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		// l.next.next.next = new ListNode(4);
		// l.next.next.next.next = new ListNode(5);
		// l.next.next.next.next.next = new ListNode(6);
		// l = l.next.next;
		// oddEvenList(l);
		System.out.println(reverseListRec(l));

		// // System.out.println(l);

	}

	public static ListNode reverseList(ListNode head) {
		

		ListNode cur = head;
		ListNode prev = null;

		while (cur != null) {
			ListNode next = cur.next;
			cur.next = prev;

			prev = cur;
			cur = next;

		}
		head = prev;
		

		return head;
	}
	
	public static ListNode reverseListRec(ListNode head) {
		System.out.println(head);

		if(head==null||head.next==null)
			return head;
		ListNode p = reverseList(head.next);
	    head.next.next = head;
	    head.next = null;
	    return p;
		

		
	}

}
