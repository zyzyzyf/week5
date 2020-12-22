package week5;
import java.util.Arrays;
import java.util.Scanner;
public class CharacterSort {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=input.next();
		System.out.println(sort(s));
	}
	public static String sort(String s){
		int len=s.length();
		char[] chars=new char[len];
		for(int i=0;i<len;i++){
			chars[i]=s.charAt(i);
		}
		char temp;
		for(int i=0;i<len;i++){
			for(int j=0;j<len-1;j++){
				if(chars[j]>chars[j+1]){
					temp=chars[j];
					chars[j]=chars[j+1];
					chars[j+1]=temp;
				}
			}
		}
		String ss=new String(chars);
	    return ss;
	}
}

