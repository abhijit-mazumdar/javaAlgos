package ds.queue;

public class Queue {

	private int maxSize;
	private int[] queueArray;
	private int head;
	private int rear;
	private int nItems;
	
	public Queue(int size){
		this.maxSize = size;
		this.queueArray = new int[size];
		this.head = 0;
		this.rear = -1;
		this.nItems = 0;
		}
	
	public boolean isFull(){
		return nItems==maxSize;
	}
	
	public boolean isEmpty(){
		return nItems==0;
	}
	
	public void insert(int element){
		if(isFull()){
			System.out.println("The queue is full.");
		} else {
			rear++;
			queueArray[rear] = element;
			nItems++;
		}
	}
	
	public int remove(){
		if(isEmpty()){
			System.out.println("This queue is empty.");
			return 0;
		} else {
			int temp = queueArray[head];
			head++;
			nItems--;
			return temp;
		}
	}
	
	public void view(){
		System.out.print("[");
		for(int i=0;i<queueArray.length;i++){
			System.out.print(queueArray[i] + " ");
		}
		System.out.println("]");
	}
}
