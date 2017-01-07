package cycleDetection;

import java.util.List;

//Uses depth first search to detect cycles in graph

public class CycleDetection {
	
	public void detectCycle(List<Vertex> vertexList){
		for(Vertex v : vertexList){
			if(!v.isVisited()){
				dfs(v);
			}
		}
	}

	private void dfs(Vertex v) {
		// TODO Auto-generated method stub
		
		System.out.println("Running depth first search on vertex: " + v);
		v.setBeingVisited(true);
		
		for(Vertex vertex : v.getAdjacenciesList()){
			System.out.println("Visiting neighbors of this vertex: " + vertex);
			if(vertex.isBeingVisited()){
				System.out.println("Cycle detected!");
				return;
			}
		if(!vertex.isVisited()){
			System.out.println("Visiting neighbors of " + vertex + " recursively");
			vertex.setVisited(true);
			dfs(vertex);
		}
		
		vertex.setBeingVisited(false);
		vertex.setVisited(true);
			
		}
		
	}

}
