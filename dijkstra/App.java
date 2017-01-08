package dijkstra;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		
		vertex0.addNeighbor(new Edge(1,vertex0,vertex1));
		vertex0.addNeighbor(new Edge(1,vertex0,vertex2));
		vertex1.addNeighbor(new Edge(1,vertex1,vertex2));
		
		ShortestPath shortestPath = new ShortestPath();
		shortestPath.computePaths(vertex0);
		
		System.out.println(shortestPath.getShortestPathTo(vertex2));

	}

}
