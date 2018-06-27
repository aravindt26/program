package vasanth;

public class queue {

	public static void main(String[] args) {
		
		MyQueue q=new MyQueue();
		q.delete();
		q.insert(5);
		q.insert(10);
		q.insert(15);
		q.insert(20);
		q.insert(25);
		q.insert(30);
		q.delete();
		q.delete();
		q.delete();
		q.insert(30);
		q.insert(35);
		q.show();

	}

}
