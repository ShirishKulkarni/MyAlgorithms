package org.leetcode.algoritms.easy;

public class DeleteNodeInALinkedList {
	public static void main(String[] args) {

		ListNode l = new ListNode(1);
		ListNode head = l;
		l.next = new ListNode(2);
		l.next.next = new ListNode(3);
		l.next.next.next = new ListNode(4);
		l.next.next.next.next = new ListNode(5);
		l = l.next.next;
		deleteNode(l);

		System.out.println(head);

	}

	public static void deleteNode(ListNode node) {

		ListNode temp = node;
		if (temp != null) {
			while (temp.next != null) {
				temp.val = temp.next.val;
				if(temp.next.next==null){
					temp.next=null;
					break;
				}
				temp = temp.next;
			}
			
		}
		System.out.println(temp);

	}
}
