package vasanth;

public class MyQueue {
	
	int[] q1=new int[5];
	int front=0;
	int rear=0;
	int size=0;
	
	public void insert(int a)
	{
		if(!isFull())
		{
			q1[rear]=a;
			rear=(rear+1)%5;
			size++;
		}
		else
		{
			System.out.println("Queue is Full");
		}
		
	}
	
	public int delete()
	{
		int ele=q1[front];
		if(!isEmpty())
		{ 
			front=(front+1)%5;
			size--;
		}
		else
		{
			System.out.println("Queue is Empty");
		}
		return ele;
	}
	
	public void show()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(q1[(front+i)%5]+" ");
		}
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public boolean isFull()
	{
		return size==5;
	}

}
