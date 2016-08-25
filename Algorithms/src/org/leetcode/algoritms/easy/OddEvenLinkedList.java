package org.leetcode.algoritms.easy;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {

	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode head = l;
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		// l.next.next.next = new ListNode(4);
		// l.next.next.next.next = new ListNode(5);
		// l.next.next.next.next.next = new ListNode(6);
		// l = l.next.next;
	//	oddEvenList(l);
		System.out.println(lengthOfLastWord(" "));
		
		

		// // System.out.println(l);

	}

	public static ListNode oddEvenList(ListNode head) {

		if (head != null && head.next != null && head.next.next != null) {
			ListNode ptr1 = head;
			ListNode ptr2 = head.next;
			List<ListNode> lst = new ArrayList<ListNode>();
			int n = 1;
			while (ptr1 != null || ptr2 != null) {
				if (n % 2 == 1) {

					if (ptr2 != null) {
						ptr1.next = ptr2.next;
					} else {
						ptr1.next = null;
					}
					ptr1 = ptr1.next;

				} else {
					System.out.println(">>" + ptr2.val);
					lst.add(ptr2);
					if (ptr1 != null) {
						ptr2.next = ptr1.next;
					} else {
						ptr2.next = null;
					}
					ptr2 = ptr2.next;

				}

				n++;
			}
			ptr1 = head;
			while (ptr1.next != null) {
				ptr1 = ptr1.next;
			}
			for (ListNode node : lst) {
				ptr1.next = node;
				ptr1 = ptr1.next;
			}

		}
		// System.out.println(head);
		return head;

	}

	public static int lengthOfLastWord(String s) {

		
		if (s == null||"".equals(s)) {
			return 0;
		}
		char[] arr=s.trim().toCharArray();
		
		int i=arr.length-1;
		if(arr.length==1&&arr[i]!=' '){
			return 1;
		}
		int len=0;
		for(i=arr.length-1;i>0;i--){
			if(arr[i]==' '){
				break;
			}
			len++;
		}
		return len;
	}
}
