package week5;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten numbers:");
		double[] number=new double[10];
		for(int i=0;i<10;i++){
			number[i]=input.nextDouble();
		}
		
		for(int i=0;i<9;i++){
			for(int j=0;j<9-i;j++){
				if(number[j]>number[j+1]){
					double temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		for(int i=0;i<10;i++){
			System.out.print(number[i]+" ");
		}
	}
	
	
}
