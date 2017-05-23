import java.util.*;
import java.io.*;

public class AdjListGraph {
	private int nVerts; 	//Number of vertices 
	// Array  of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];
	
	private int index=0; // // COMMENT: index is used to represent the index of each new added noe
	
	//Constructor 
	AdjListGraph(int n){
		nVerts = n;
		adj = new LinkedList[n];
		for (int i=0; i<n; ++i){
			adj[i] = new LinkedList();
		}
	}
	
	//Function to add an edge into the graph
	void addEdge(int v, int w ){
		adj[v].add(w);		// Add w to v's list.
	}
	
	//Function to add a Vertex
	public void addVertex(char l)
	   {
	   adj[index++] = new LinkedList<Integer> ();
	   }	

	// A function used by DFS
    void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v+" ");
 
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }
 
    // The function to do DFS traversal. It uses recursive DFSUtil()
    void dfs()
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[nVerts];
 
        // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        for (int i=0; i<nVerts; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }
}
