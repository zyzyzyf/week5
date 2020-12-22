package week5;
import java.util.Scanner;
public class classRank {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int number=input.nextInt();
		String[] name=new String[number];
		double[] grade=new double[number];
		System.out.println("Enter the student's name and grade:");
		for(int i=0;i<number;i++){
			 name[i]=input.next();
			 grade[i]=input.nextDouble();
			 
		}
		for(int i=0;i<number-1;i++){
			double currentMax=grade[i];
			int currentMaxIndex=i;
			String currentName=name[i];
			for(int j=i+1;j<number;j++){
				if(currentMax<grade[j]){
					currentMax=grade[j];
					currentMaxIndex=j;
					currentName=name[j];
				}
			}
			
			if(currentMaxIndex!=i){
				grade[currentMaxIndex]=grade[i];
				grade[i]=currentMax;
				name[currentMaxIndex]=name[i];
				name[i]=currentName;
			}
			System.out.println("第"+(i+1)+"名是： "+name[i]);
		}
		System.out.println("第"+number+"名是： "+name[number-1]);
		
	}
}
