package vasanth;

public class MyStack {
	
	int[] s1=new int[5];
	int top=0;
	
	public void push(int a)
	{
		if(top<5)
		{
			s1[top]=a;
			top++;
		}
		else
		{
			System.out.println("Stack is full");
		}
	} 
	
	public int pop()
	{

		int ele=0;
		if(isempty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			top--;
			ele=s1[top];
			s1[top]=0;
		}
		return ele;
		
	}
	
	public void show()
	{
		if(top>0)
		{
			
			for(int i=0;i<top;i++)
			{
				System.out.print(s1[i]+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Stack is empty");
		}
	}
	
	public void peek()
	{
		if(top>0)
		{
			int p;
			p=s1[top-1];
			System.out.println("The peek element is "+p);		
		}
		else
		{
			System.out.println("Stack is empty");
		}
	}
	
	public boolean isempty()
	{
		return top<=0;
	}
	
}