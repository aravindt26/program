package vasanth;

public class stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyStack s= new MyStack();
		s.push(10);
		s.push(20);
		s.show();
		s.peek();
		s.push(30);
		s.show();
		System.out.println("The element poped is "+s.pop());
		System.out.println("The element poped is "+s.pop());
		s.show();
		s.peek();		
		System.out.println("The element poped is "+s.pop());
		s.peek();
		System.out.println(s.pop());
		
	}

}
