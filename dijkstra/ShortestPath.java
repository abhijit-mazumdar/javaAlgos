package dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

//function DijkstraAlgorithm(Graph, source)
//
//distance[source] = 0
//create vertex queue Q
//
//for v in Graph
//	distance[v] = inf
//	predecessor[v] = undefined  // previous node in the shortest path
//	add v to Q
//
//while Q not empty
//	u = vertex in Q with min distance 
//	remove u from Q
//
//	for each neighbor v of u
//		tempDist = distance[u] + distBetween(u,v)
//		if tempDist < distance[v]
//			distance[v] = tempDist
//			predecessor[v] = u
//
//return distance[]  // contains the shortest distances from source to other nodes


public class ShortestPath {

	public void computePaths(Vertex sourceVertex){
		sourceVertex.setMinDistance(0);
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceVertex);
		
		while(!priorityQueue.isEmpty()){
			Vertex actualVertex = priorityQueue.poll();
			
			for(Edge edge : actualVertex.getAdjacenciesList()){
				Vertex v = edge.getTargetVertex();
				Double newDistance = v.getMinDistance() + edge.getWeight();
				
				if(newDistance < v.getMinDistance()){
					priorityQueue.remove(v);
					v.setMinDistance(newDistance);
					v.setPredecessor(actualVertex);
					priorityQueue.add(v);
				}
			}
		}
		
	}
	
	public List<Vertex> getShortestPathTo(Vertex targetVertex){
		List<Vertex> path = new ArrayList<>();
		
		for(Vertex vertex = targetVertex; vertex!=null; vertex = vertex.getPredecessor()){
			path.add(vertex);
		}
		Collections.reverse(path);
		
		return path;
	}
}
