import java.util.LinkedList;
import java.util.List;

// Binary search tree
// left smaller than right and parent. 

/* 

     9 -> parent
    /  \
   8	10 -> siblings (left smaller than right and parent)

*/
public class Tree {

	class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	Node root = null;

	// Insert (value: int) Time complexity: -
	// standard O(log n) worst case O(n)

	public void insert(int value) {
		if (root == null) {
			root = new Node(value);
			return;
		}

		Node current = root;
		Node node = new Node(value);
		while (current != null) {
			if (current.value <= value) {
				if (current.right == null) {
					current.right = node;
					return;
				}
				current = current.right;
			}
			if (current.value > value) {

				if (current.left == null) {
					current.left = node;
					return;
				}
				current = current.left;
			}
		}
	}

	// search (value: int) Time complexity: -
	// standard O(log n) worst case O(n)

	public boolean search(int value) {
		return search(root, value);
	}

	private boolean search(Node root, int value) {
		if (root == null) {
			return false;
		}
		if (root.value == value) {
			return true;
		}

		if (root.value <= value) {
			return search(root.right, value);
		}

		return search(root.left, value);

	}

	// height() Time complexity:
	// O(n)

	public int height() {

		return height(root);
	}

	private int height(Node node) {
		if (node == null)
			return 0;

		return (1 + Math.max(height(node.right), height(node.left)));
	}

	// Find min value in the tree

	public int findMin() {

		return findMin(root);
	}

	private int findMin(Node node) {
		if (node == null)
			return 0;
		if (node.left == null)
			return node.value;

		return findMin(node.left);
	}

	public List<Integer> kDistance(int k) {
		var nodes = new LinkedList<Integer>();
		return kDistance(root, k, 0, nodes);
	}

	public List<Integer> kDistance(Node node, int k, int currentDistance, List<Integer> nodes) {
		if (node == null)
			return null;

		if (currentDistance == k)
			nodes.add(node.value);

		kDistance(node.left, k, currentDistance + 1, nodes);
		kDistance(node.right, k, currentDistance + 1, nodes);

		return nodes;
	}
}
