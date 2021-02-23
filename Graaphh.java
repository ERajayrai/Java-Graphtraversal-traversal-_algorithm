package Graphtransvarsiol;

import java.util.LinkedList;
import java.util.Scanner;

public class Graaphh {
	private LinkedList<Integer> adj[];
	
	public Graaphh(int V) {
		adj=new LinkedList[V];
		for(int i=0;i<V;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the vartax and edge");
		int v=sc.nextInt();
		int s=sc.nextInt();
		Graaphh graaph=new Graaphh(v);
		System.out.println("enter "+s+"  edge");
		for(int i=0;i<s;i++) {
			int source=sc.nextInt();
			int destination=sc.nextInt();
			graaph.addEdge(source, destination);
		}
		
		
	}

}
