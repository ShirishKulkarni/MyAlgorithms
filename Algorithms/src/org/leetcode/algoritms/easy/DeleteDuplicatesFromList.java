package org.leetcode.algoritms.easy;

public class DeleteDuplicatesFromList {

	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next= new ListNode(2);
		System.out.println(head);
		head = deleteDuplicates(head);
		System.out.println(head);
	}

	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		} else {
			ListNode cur = head.next;
			ListNode prev = head;

			while (cur != null) {

				if (cur.val == prev.val) {
					prev.next = cur.next;
					cur = cur.next;
				} else {
					prev = prev.next;
					cur = prev.next;
				}
				// System.out.println(head);

			}
			return head;

		}

	}
}

class ListNode {
	int val;
	ListNode next;
	
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

	ListNode(int x) {
		val = x;
		}
}
