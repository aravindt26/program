package vasanth;

import java.util.EmptyStackException;
import java.util.Stack;

public class stack_implementation {

	public static void main(String[] args) {
		
		Stack st=new Stack();
		
		System.out.println("Stack : "+st);
		
		stackpush(st,42);
		stackpush(st,84);
		stackpush(st,100);
		stackpop(st);
		stackpop(st);
		stackpeek(st);
		stacksearch(st,42);
		
	}
	
	static void stackpush(Stack s, int a)
	{
		s.push(a);
		System.out.println("Push ("+a+")");
		System.out.println("Stack : "+s);
	}
	
	static void stackpop(Stack s)
	{
		System.out.print("Pop --> ");
		Integer a=(Integer)s.pop();
		System.out.println(a);
		System.out.println("Stack : "+s);
	}
	
	static void stackpeek(Stack s)
	{
		Integer a=(Integer)s.peek();
		System.out.println("Top Element : "+a);
	}
	
	static void stacksearch(Stack s,int a)
	{
		Integer pos=(Integer)s.search(a);
		if(pos==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element "+a+" is at position "+pos);
		}
	}

}
