package week5;
import java.util.Scanner;
public class distinctNumber {
	public static void main(String[] args){
		int s=11;
		int[] number=new int[s];
	    Scanner input=new Scanner(System.in);
	    System.out.print("Enter ten numbers:");
	    int c=0;
	    for(int i=1;i<11;i++){
	    	int count=0;
	    	int temp=input.nextInt();
	    	for(int j=1;j<i;j++){
	    		if(temp==number[j]){
	    			count++;
	    			break;
	    		}
	    	}
	    	if(count==0){
    			number[i]=temp;
    			c++;
    		}
	    }
	    System.out.println("The number of distinct number is "+c);
	    System.out.print("The distinct number are ");
	    for(int i=1;i<11;i++){
	    	if(number[i]>0){
	    		System.out.print(number[i]+" ");
		    }
	    }
	    System.out.println();
	}
}
