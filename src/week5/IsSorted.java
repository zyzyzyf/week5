package week5;
import java.util.Scanner;
public class IsSorted {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter List: ");
		int number=input.nextInt();
		int[] list=new int[number];
		for(int i=0;i<number;i++){
			list[i]=input.nextInt();
		}
		if(isSorted(list)){
			System.out.print("The list is already sorted");
		}
		else{
			System.out.print("The list is not sorted");
		}
		
	}
	public static boolean isSorted(int[] list){
		int flag=0;
		for(int i=0;i<list.length-1;i++){
			if(list[i]>list[i+1]){
				flag=1;
				break;
			}
		}
		if(flag==0) return true;
		else return false;
	}
}
