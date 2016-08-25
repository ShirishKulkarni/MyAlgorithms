package org.leetcode.algoritms.easy;

public class RemoveLinkedListElements {

	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode head = l;
		l.next = new ListNode(2);
		l.next.next = new ListNode(2);
		l.next.next.next = new ListNode(1);
		// l.next.next.next.next = new ListNode(5);
		// l = l.next.next;
		removeElements(l, 2);

		// // System.out.println(l);

	}

	public static ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			if (head.val == val) {
				return null;
			} else {
				return head;
			}
		}
		ListNode temp = head;
		while (temp != null && temp.val == val) {
			temp = temp.next;
			head.next = null;
			head = temp;
		}

		ListNode cur = head;
		ListNode prev = head;

		while (cur != null) {
			if (cur.val != val) {
				prev = cur;
				cur = cur.next;

			} else {

				prev.next = cur.next;
				cur.next = null;
				cur = prev.next;

			}
		}

		System.out.println(head);

		return head;

	}

}
