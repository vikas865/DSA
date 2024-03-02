package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

	private TreeNode node;

	public static class TreeNode {

		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {

			this.data = data;
			this.left = null;
			this.right = null;
			Math.max(data, data);

		}

	}

	public static void printNode(TreeNode node)
	{
		TreeNode temp=node;
		//TreeNode tempright=node;
		
		while(temp!= null)
		{
			System.out.println(temp.left.data);
			System.out.println(temp.right.data);
			temp=temp.left;
		}
		
	
		
			
			
			
		
	}
	
	
	
	
	public static void InOrderTraversal(TreeNode root)
	{
		
		if(root==null)
		{
			return;
		}
	
		
		InOrderTraversal(root.left);
		
		System.out.println(root.data+"->");
		
		InOrderTraversal(root.right);
		
			
			
			
		
	}

	
	public static void preOrderTraversal(TreeNode root)
	{
		
		if(root==null)
		{
			return;
		}
	
		System.out.println(root.data+"->");
		
		preOrderTraversal(root.left);
		
		
		
		preOrderTraversal(root.right);
		
			
			
			
		
	}
	
	
	
	
	public static void postOrderTraversal(TreeNode root)
	{
		
		if(root==null)
		{
			return;
		}
	
		
		
		postOrderTraversal(root.left);
		
		
		
		postOrderTraversal(root.right);
		
		System.out.println(root.data+"->");
		
			
			
			
		
	}
	
	
	

	public static void levelOrderTraversal(TreeNode root) {
		
		Queue<TreeNode> treequeue = new LinkedList<>();
		
		treequeue.add(root);
		while(!treequeue.isEmpty()) {
			
			TreeNode node=treequeue.poll();
			System.out.println(node.data);
			if(node.left!=null)
				treequeue.add(node.left);
			
			if(node.right!=null)
				treequeue.add(node.right);
			
			
		}
	}
	
	
	public static void main(String[] args) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		TreeNode leftnode = root.left;
		TreeNode rightnode = root.right;
		
		leftnode.left = new TreeNode(40);
		leftnode.right = new TreeNode(60);
		
		
		System.out.println(root.left.left.data);
		

		//printNode(root);
		System.out.println("---------InOr der------------");
		InOrderTraversal(root);

		System.out.println("---------PreOrder------------");
		preOrderTraversal(root);

		System.out.println("---------PostOrder------------");
		postOrderTraversal(root);
		
		System.out.println("---------levelOrderTraversal------------");
		levelOrderTraversal(root);
		
	}
}
