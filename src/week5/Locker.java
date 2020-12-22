package week5;
import java.util.Scanner;
public class Locker {
	public static void main(String[] args){
		boolean[] locker=new boolean[110];
		for(int i=1;i<=100;i++) locker[i]=true;
		for(int i=2;i<=100;i++){
			for(int j=i;j<=100;j+=i-1){
				locker[j]=!locker[j];
			}
		}
		for(int i=1;i<=100;i++){
			if(locker[i]) System.out.println("L"+i);
		}
	}
}
