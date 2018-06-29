package vasanth;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int a=s.nextInt();
		
		int[] arr=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.print("Before Sort : ");
		for(int temp:arr)
		{
			System.out.print(temp+" ");
		}
		
		insertion(arr);
		System.out.println();
		
		System.out.print("After Sort : ");
		for(int temp1:arr)
		{
			System.out.print(temp1+" ");
		}

	}
	
	static void insertion(int[] array)
	{
		for(int i=1;i<array.length;i++)
		{
			int index=array[i];
			int j=i-1;
			while(j>=0 && array[j]>index)
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=index;
		}
	}

}
