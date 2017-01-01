package ds.stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("Panku"));

	}
	
	public static String reverseString(String str){
		int stackSize = str.length();
		Stack theStack = new Stack(stackSize);
		
		for(int i=0;i<stackSize; i++){
			char c = str.charAt(i);
			theStack.push(c);
		}
		
		String result = "";
		
		for(int i=0;i<stackSize;i++){
			char c = theStack.pop();
			result += c;
		}
		
		return result;
		
	}

}
