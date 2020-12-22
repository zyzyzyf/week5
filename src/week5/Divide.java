package week5;
import java.util.Scanner;
public class Divide {
	public static int partition(int[] list){
		int j=0;
		for(int i=0;i<list.length;i++){
			if(list[i]<list[0]){
				j++;
			}
		}
		return j;
	}
	public static void main(String[] args){ 
		Scanner input=new Scanner(System.in);
		System.out.print("Enter list:");
		int n=input.nextInt();
		int[] list=new int[n];
		for(int i=0;i<n;i++){
			list[i]=input.nextInt();
		}
		int x=partition(list);
		System.out.print("After the partition.the list is ");
		for(int i=0;i<list.length;i++){
			if(list[i]<list[0]){
				System.out.print(list[i]+" ");
			}
		}
		System.out.print(list[0]+" ");
		for(int i=0;i<list.length;i++){
			if(list[i]>list[0]){
				System.out.print(list[i]+" ");
			}
		}
	}
}	
