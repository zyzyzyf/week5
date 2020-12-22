package week5;
import java.util.Scanner;
public class Coupon {
	public static void main(String[] args)
	{
		String[] number1= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] number4={"Spades","Clubs","Hearts","Diamonds"};
		int[] n={0,0,0,0};
		int count=0;
		while(true)
		{
			count++;
			int number2=(int)Math.round((Math.random()*4));
			int number3=(int)Math.round((Math.random()*13));
			if(n[0]==1 && n[1]==1 && n[2]==1 && n[3]==1)
			{
				break;
			}else{
				if(n[number2]==0){
					System.out.println(number1[number3]+" of "+number4[number2]);
					n[number2]=1;
				}
				
			}
		}
		System.out.println("Number of picks:"+count);
	}
}
