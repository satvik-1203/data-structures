
public class main {
	public static void main(String[] args) {
		var list = new linkedlist();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addFirst(0);
		list.removeLast();
		list.insertAt(4, 10);
		list.print();
	}
}
