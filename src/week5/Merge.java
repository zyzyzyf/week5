package week5;
import java.util.Scanner;
public class Merge {
	public static int[] merge(int[] list1,int[] list2)
	{
		int[] list=new int[list1[0]+list2[0]];
		int i=1,j=1,k=-1;
		while(i!=(list1[0])||j!=(list2[0]))
		{
			if(i==list1[0]){
				k++;
				list[k]=list2[j];
				j++;
			}
			else if(j==list2[0]){
				k++;
				list[k]=list1[i];
				i++;
			}
			else if(list1[i]>list2[j])
			{
				k++;
				list[k]=list2[j];
				j++;
			}
			else{
				k++;
				list[k]=list1[i];
				i++;
			}
		}
		return list;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter list1:");
		int n=input.nextInt();
		int[] list1=new int[n+1];
		list1[0]=n;
		for(int i=1;i<n+1;i++) list1[i]=input.nextInt();
		
		System.out.print("Enter list2:");
		int m=input.nextInt();
		int[] list2=new int[m+1];
		list2[0]=m;
		for(int i=1;i<m+1;i++) list2[i]=input.nextInt();
		
		
		int[] list=merge(list1,list2);
		System.out.print("The merged list is ");
		for(int i=0;i<(list1[0]+list2[0]-1);i++) System.out.print(list[i]+" ");
		System.out.println("");

	}

}

