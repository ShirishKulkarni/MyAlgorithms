package org.leetcode.algoritms.easy;

public class SwapPairsInList {

	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode head = l;
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		l.next.next.next = new ListNode(4);
		l.next.next.next.next = new ListNode(5);
		// l.next.next.next.next.next = new ListNode(6);
		// l = l.next.next;
		// oddEvenList(l);

		System.out.println(l);
		System.out.println(swapPairs(l));

		// // System.out.println(l);

	}

	public static ListNode swapPairs(ListNode head) {

		if (head != null && head.next != null) {
			ListNode prev = head;
			ListNode cur = head.next;
			ListNode third = cur;
			head = head.next;
			while (prev != null && prev.next != null) {

				prev.next = cur.next;
				cur.next = prev;
				third = prev;
				prev = prev.next;
				if (prev != null) {
					cur = prev.next;
					if(cur!=null){
						third.next = cur;
					}else{
						third.next = prev;
					}
				}

			}

		}

		return head;
	}

}
