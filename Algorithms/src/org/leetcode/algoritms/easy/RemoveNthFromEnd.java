package org.leetcode.algoritms.easy;

public class RemoveNthFromEnd {

	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode head = l;
		l.next = new ListNode(2);
		// l.next.next = new ListNode(3);
		// l.next.next.next = new ListNode(4);
		// l.next.next.next.next = new ListNode(5);
		removeNthFromEnd(l, 1);

		// // System.out.println(l);

	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		//System.out.println(head);
		if (head == null || (head.next == null && n == 1)) {
			//System.out.println(">");
			return null;
		} else {
			ListNode ptr1 = head;
			ListNode ptr2 = head;

			ListNode ptr3 = head;

			while (ptr1 != null) {
				ptr1 = ptr1.next;

				if (n <= 0) {
					ptr2 = ptr2.next;
				}
				if (n < 0) {
					ptr3 = ptr3.next;
				}
				n--;
			}
			if (ptr2 == head) {
				head = head.next;
				ptr2.next = null;
			}
			else {
				ptr3.next=ptr2.next;
				ptr2.next=null;

			}
		//	System.out.println("ptr2>"+ptr2.val);
		//	System.out.println("head>"+head);
			return head;
		}
	}

}
