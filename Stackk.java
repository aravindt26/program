package vasanth;

public class Stackk {

	int[] s1=new int[5];
	int top=0;
	
	public void push(int a)
	{
		s1[top]=a;
		top++;
		for(int i=0;i<top;i++)
		{
			System.out.print(s1[i]+" ");
		}
		System.out.println();
	}
	
	public void pop()
	{
		top--;
		int ele;
		ele=s1[top];
		s1[top]=0;
		System.out.println("The element poped is "+ele);
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
		int p;
		p=s1[top-1];
		System.out.println("The peek element is "+p);		
	}
}
