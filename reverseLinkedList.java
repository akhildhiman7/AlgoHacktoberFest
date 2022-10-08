import java.util.*;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
	ListNode (int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
    public static void main(String [] args) {
		ListNode head = getLinkedListFromList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
		head = reverseLinkedList(head);
		printLinkedList(head);
	}

	public static void printLinkedList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
            head = head.next;
		}
        System.out.print("X");
	}

	public static ListNode linkedListWorker(List<Integer> arr, int i, int n) {
		if (i >= n) {
			return null;
		}
		return new ListNode(arr.get(i), linkedListWorker(arr, i+1, n)); 
	}

	public static ListNode getLinkedListFromList(List<Integer> arr) {
		return linkedListWorker(arr, 0, arr.size());
	}

	public static ListNode reverseLinkedList(ListNode head) {
		ListNode curr = head, prev = null;

		while (curr != null) {
			ListNode temp = curr.next;
			curr.next =  prev;
			prev = curr;
			curr = temp;
		}

		return prev;
	}
}

