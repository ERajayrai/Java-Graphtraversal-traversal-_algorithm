package Graphtransvarsiol;

import java.util.ArrayList;

public class G {
	static void addEdge(ArrayList<ArrayList<Integer>>adj,int v,int u) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	static void printGraph(ArrayList<ArrayList<Integer> > adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.println("/anAdjency List of VARTAX"+  i);
			System.out.println("head");
			for(int j=0;j<adj.get(i).size();i++) {
				 System.out.print(" -> "+adj.get(i).get(j));
				}
			}
		}
	public static void main(String[] args) {
		int V=5;
		   ArrayList<ArrayList<Integer> > adj  
           = new ArrayList<ArrayList<Integer> >(V);
		   addEdge(adj, 0, 1); 
	        addEdge(adj, 0, 4); 
	        addEdge(adj, 1, 2); 
	        addEdge(adj, 1, 3); 
	        addEdge(adj, 1, 4); 
	        addEdge(adj, 2, 3); 
	       // addEdge(adj, 3, 4); 
	          
	        printGraph(adj);
	}
}	