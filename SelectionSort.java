package vasanth;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		int a=s.nextInt();
		
		int[] arr=new int[a];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.print("Before Sorting : ");
		for(int temp:arr)
		{
			System.out.print(temp+" ");
		}
		
		selection(arr);
		System.out.println();
		
		System.out.print("After Sorting : ");
		for(int temp1:arr)
		{
			System.out.print(temp1+" ");
		}

	}
	
	static void selection(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[index]>array[j])
				{
					index=j;
				}
			}
			int small=array[index];
			array[index]=array[i];
			array[i]=small;
		}
	}

}
