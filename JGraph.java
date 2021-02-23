package Graphtransvarsiol;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JGraph {
	
	private LinkedList<Integer>adj[];
	public JGraph(int v) {
		adj=new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int source,int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	public int bfs(int source,int desination) {
		boolean vis []=new boolean[adj.length];
		int parent[]=new int[adj.length];
		Queue<Integer> q=new LinkedList<>();
		q.add(source);
		parent[source]=-1;
		vis[source]=true;
		while(!q.isEmpty()) {
			int curl=q.poll();
			if(curl==desination) break;
			for(int nib:adj[curl]) {
				if(!vis[nib]) {
					q.add(nib);
					vis[nib]=true;
					parent[nib]=curl;
				}
			}
		}
		int curl=desination;
		int distance=0;
		while(parent[curl]!=-1) {
			System.out.println(curl+" ->  ");
			curl=parent[ curl];
			distance++;
		}
		return distance;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter vartaxses and edges");
		int v=sc.nextInt();
		int e=sc.nextInt();
		JGraph graph=new JGraph(v);
		System.out.println("Enter"+e+"  Edges");
		for(int i=0;i<e;i++) {
			int source=sc.nextInt();
			int desination=sc.nextInt();

		}
		
		
		
		sc.close();
	}

}
