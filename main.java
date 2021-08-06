
public class main {
	public static void main(String[] args) {

		// Linked List testing ------------
		// var list = new linkedlist();
		// list.addLast(1);
		// list.addLast(2);
		// list.addLast(3);
		// list.addFirst(0);
		// list.removeLast();
		// list.insertAt(4, 10);
		// list.print();

		//

		var tree = new Tree();
		tree.insert(10);
		tree.insert(9);
		tree.insert(8);
		tree.insert(11);
		tree.insert(12);
		System.out.println(tree.kDistance(2).toString());
	}
}
