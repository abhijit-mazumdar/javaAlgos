package ds.queue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue newQue = new Queue(5);
		newQue.insert(100);
		newQue.insert(200);
		newQue.insert(300);
		newQue.insert(400);
		newQue.insert(500);
		newQue.insert(600);
		newQue.view();

	}

}
