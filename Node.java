package Graphtransvarsiol;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Node {
	 private static Node root1;
	public int data ;
	 Node left;
	 Node right;
	public static void main(String[] args) { 
		//Scanner sc=new Scanner(System.in);
		
		Node root= new Node();
		root.data=1;
		root.left=new Node();
		root.right=new Node();	
		root.left.data=2;
		
		root.right.data=3;
		root1.left.data=4;
		root1.right.data=5;
		
		
		Queue<Node> q=new LinkedList<Node>();
		 if(root!=null) {
			 q.add(root );
			 
		 }
		 if(root1!=null) {
			 q.add(root1);
		 }
		 
		 while(q.size()>0) {
			 Node node=q.remove();
			 
			 if(node.left!=null)
				 q.add(node.left);
			 if(node.right!=null)
				 q.add(node.right);
			 System.out.println(node.data);
		 }
		  
		 
	
	
	}	 
		
	

}
