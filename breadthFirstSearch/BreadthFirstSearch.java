package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public void bfs(Vertex root){
		Queue<Vertex> queue = new LinkedList<Vertex>();
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()){
			Vertex extractedVertex = queue.remove();
			extractedVertex.setVisited(true);
			System.out.println("" + extractedVertex);
			
			for(Vertex v : extractedVertex.getNeighborList() ){
				if(!v.isVisited()){
					queue.add(v);
					v.setVisited(true);
				}
			}
			
		}
		
	}
}
