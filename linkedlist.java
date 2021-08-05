/*

Author: Satvik.
Title: LinkedList

This is a simple linkedlist with the following methods: 

		- addFirst(value: int) 
			* Time complexity O(1)
		- addLast(value: int)
			* Time complexity O(1)
		- removeFirst()
			* Time complexity O(1)
		- removeLast()
			* Time complexity O(n)
		- insertAt(index:int, value:int)
			* Time complexity O(n)
		- print()
			* Time complexity O(n)

*/

public class linkedlist {

	class Node {

		int value;
		Node next = null;

		public Node(int value) {
			this.value = value;
		}
	}

	private int length = 0;

	private Node first = null;
	public Node last = null;

	// prints the linkedList

	public void print() {
		Node current = first;
		while (current != null) {
			System.out.print(current.value);
			if (current.next != null)
				System.out.print("->");
			current = current.next;
		}
	}

	public void addLast(int value) {
		Node node = new Node(value);
		length++;
		if (this.first == null) {
			this.first = this.last = node;
			return;
		}
		last.next = node;
		last = last.next;

		// 1 -> 2 0
		// 1 -> 2 -> 0
		// just link last to 0
	}

	public void addFirst(int value) {

		length++;

		Node node = new Node(value);

		if (this.first == null) {
			this.first = this.last = node;
			return;
		}

		node.next = first;
		first = node;

		// 0 1 -> 2
		// 0 -> 1 -> 2
		// just link 0 to first

	}

	public void removeFirst() {
		if (first == null)
			return;

		length--;

		if (first.next == null) {
			first = last = null;
			return;
		}
		first = first.next;

	}

	public void removeLast() {
		if (first == null)
			return;

		length--;

		if (first.next == null) {
			first = last = null;
			return;
		}
		Node current = first;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		last = current;
	}

	public void insertAt(int index, int value) {
		if (index > length + 1 || index < 0)
			return;
		if (index == 0) {

			addFirst(value);
			return;
		}
		if (index == length + 1) {

			addLast(value);
			return;

		}

		length++;
		Node current = first;
		Node node = new Node(value);
		for (int i = 0; i < index - 1; i++) {
			current = current.next;
		}
		Node temp = current.next;
		current.next = node;
		current.next.next = temp;

	}

}
