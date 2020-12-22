package week5;
import java.util.Scanner;
public class numberOfTimes {
	public static void main(String[] args){
		int s=102;
		int[] number=new int[s];
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter the integers between 1 and 100:");
	    int temp=input.nextInt();
	    while(temp>0){
	    	number[temp]++;
	    	temp=input.nextInt();
	    }
	    int i=1;
	    while(i<101){
	    	if(number[i]>1){
	    		System.out.println(i+" occur "+number[i]+" times");
	    	}else if(number[i]==1){
	    		System.out.println(i+" occur "+number[i]+" time");
	    	}
	    	i++;
	    }  
	}
}