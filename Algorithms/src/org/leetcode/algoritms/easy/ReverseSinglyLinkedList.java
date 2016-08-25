package org.leetcode.algoritms.easy;

public class ReverseSinglyLinkedList {

	public static ListNode reverseList(ListNode head) {

		if (head != null && head.next != null) {
			
			ListNode ptr1 = head;
			ListNode ptr2 = head.next;
			if (ptr2.next == null) {
				head=ptr2;
				ptr1.next=null;
				ptr2.next=ptr1;
			} else {
				ListNode ptr3 = ptr2.next;
				while (ptr2 != null) {
					ptr2.next = ptr1;
					ptr1 = ptr2;
					ptr2 = ptr3;
					if (ptr2 != null) {
						ptr3 = ptr2.next;
					}
				}
				head.next=null;
				head=ptr1;
				}

		}
		return head;

	}

	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode head = l;
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		l.next.next.next = new ListNode(4);
		l.next.next.next.next = new ListNode(5);
		System.out.println(head);
		head = reverseList(l);

		System.out.println(head);

	}

}
