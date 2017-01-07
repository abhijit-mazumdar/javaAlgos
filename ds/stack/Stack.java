package ds.stack;

public class Stack {

	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public boolean isFull(){
		return (maxSize-1 == top);
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void push(char i){
		if(isFull()){
			System.out.println("The stack is full.");
		} else {
			top++;
			stackArray[top] = i;
		}
	}
	
	public char pop(){
		if(isEmpty()){
			System.out.println("The stack is empty");
			return 'O';
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
}
