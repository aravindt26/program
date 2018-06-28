package vasanth;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int a=s.nextInt();
		
		int[] arr= new int[a];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<a;i++)
		{
			int b=s.nextInt();
			arr[i]=b;
		}
		
		System.out.print("Befor sorting : ");
		for(int temp:arr)
		{
			System.out.print(temp+" ");
		}
		
		bubble(arr);
		System.out.println();
		
		System.out.print("After sorting : ");
		for(int temp1:arr)
		{
			System.out.print(temp1+" ");
		}
	}
	
	static void bubble(int[] array)
	{
		int temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=1;j<array.length-i;j++)
			{
				if(array[j-1]>array[j])
				{
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
	}

}	
