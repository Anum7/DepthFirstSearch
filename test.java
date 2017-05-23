
public class test {
	public static void main(String[] args)
	{
	AdjListGraph theGraph = new AdjListGraph(6);
	theGraph.addVertex('A'); // 0 (start for dfs)
	theGraph.addVertex('B'); // 1
	theGraph.addVertex('C'); // 2
	theGraph.addVertex('D'); // 3
	theGraph.addVertex('E'); // 4
	theGraph.addVertex('F'); // 5 
	theGraph.addEdge(0, 1); // AB
	theGraph.addEdge(0, 2); // AC
	theGraph.addEdge(1, 3); // BD
	theGraph.addEdge(2, 4); // CE
	theGraph.addEdge(2, 3); // CD
	theGraph.addEdge(0, 3); // AD
	theGraph.addEdge(3, 4); // DE
	theGraph.addEdge(3, 5); // DE
	System.out.print("dfs visits:----------------------- ");
	theGraph.dfs();
	System.out.println();
	} // end main()
}
