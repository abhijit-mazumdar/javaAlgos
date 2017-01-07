package breadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int data;
	private boolean visited;
	private List<Vertex> neighborList;
	
	public Vertex(int data){
		this.data= data;
		this.neighborList = new ArrayList<Vertex>();
		
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighborList() {
		return neighborList;
	}

	public void addNeighborList(Vertex neighbor) {
		this.neighborList.add(neighbor);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + this.data;
	}
	
	
	

}
