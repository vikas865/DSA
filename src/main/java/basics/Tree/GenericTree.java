package basics.Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;
import java.util.Iterator;
import java.util.Queue;

public class GenericTree {

	private static class Node {
		int data;
		ArrayList<Node> children = new ArrayList<GenericTree.Node>();

	}

	public static class Tree implements Iterable<Integer> {
		Node root;

		public Tree(Node root) {
			this.root = root;
		}

		@Override
		public Iterator<Integer> iterator() {
			// TODO Auto-generated method stub
			Iterator<Integer> obj = new treeIterator(root);

			return obj;
		}

	}

	public static class treeIterator implements Iterator<Integer> {

		public treeIterator(Node root) {

		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub

			return false;
		}

		@Override
		public Integer next() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	public static Node makeTree(int[] arr) {

		Node root = null;
		Stack<Node> stk = new Stack<GenericTree.Node>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				stk.pop();
			} else {
				Node t = new Node();
				t.data = arr[i];
				if (stk.size() > 0) {
					stk.peek().children.add(t);

				} else {
					root = t;
				}
				stk.push(t);

			}

		}

		// System.out.println(root.data);
		// display(root);

		return root;

	}

	public static void display(Node node) {
		String str = node.data + "->";
		for (Node child : node.children) {
			str += child.data + ",";
		}
		str += ".";
		System.out.println(str);

		for (Node child : node.children) {
			display(child);
		}

		Tree t1 = new Tree(node);
		for (int val : t1) {
			System.out.println(val);
		}

		Iterator<Integer> itr = t1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static int size(Node node) {
		int cnt = 0;

		for (Node child : node.children) {
			int cs = size(child);
			cnt = cnt + cs;
		}

		cnt = cnt + 1;

		return cnt;

	}

	public static int Max(Node node) {
		int max = Integer.MIN_VALUE;

		for (Node child : node.children) {
			int d = Max(child);
			;
			// System.out.println("before" +d);
			max = Math.max(d, max);

			System.out.println("After" + max);
		}

		max = Math.max(node.data, max);

		return max;

	}

	public static int height(Node node) {
		int ht = -1;

		for (Node child : node.children) {
			int d = height(child);
			
			// System.out.println("before" +d);

			ht = Math.max(d, ht);

			System.out.println("After" + child.data + "height" + ht);
		}

		ht += 1;

		return ht;

	}

	public static String traversalPre(Node node) {
		String str = node.data + " ";
		System.out.println("Node pre " + str);
		for (Node child : node.children) {
			System.out.println("Edge pre " + node.data + " --> " + child.data);
			traversalPre(child);

		}

		return str;
	}

	public static String traversalPost(Node node) {
		String str = node.data + " ";

		for (Node child : node.children) {

			traversalPost(child);
			System.out.println("Edge post " + node.data + " --> " + child.data);

		}
		System.out.println("Node post " + node.data);

		return str;
	}

	public static void LevelOrderTraversal(Node node) {

		Queue<Node> que = new ArrayDeque<Node>();
		que.add(node);

		while (!que.isEmpty()) {

			node = que.remove();
			System.out.print(node.data+"->");
			for (Node child : node.children) {

				que.add(child);

			}
			

		}
		System.out.println(".");

	}

	public static void LevelOrderTraversalLineWise(Node node) {

		Queue<Node> que = new ArrayDeque<Node>();
		Queue<Node> cque = new ArrayDeque<Node>();
		que.add(node);
		
		while (!que.isEmpty() ) {
			
			node = que.remove();
			System.out.print(node.data+"->");
			
			for (Node child : node.children) {
				
				cque.add(child);
				

			}
			if(que.size()==0)
			{
			 que = cque;
			 cque = new ArrayDeque<Node>();
			System.out.println("");
			}
		}
		

	}

	
	
	public static void main(String[] args) {

		int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
				-1 };
		Node root = makeTree(arr);
//		System.out.println(root.data);
		display(root);
		
		System.out.println("-----------------size---------");
		System.out.println(size(root));

		System.out.println(Max(root));

		System.out.println("-----------------height---------");
		System.out.println(height(root));
		traversalPre(root);
		System.out.println("--------Traversal post-------------");
		traversalPost(root);

		System.out.println("-------Level Order   -------------");
		LevelOrderTraversal(root);
		System.out.println("--------LineWise-------------");
		LevelOrderTraversalLineWise(root);

	}

}
