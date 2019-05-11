package ReviewFinalExam;

import java.util.Scanner;

public class Hello {
	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("enter new word!");
		String s=input.nextLine();
		String arr[] = s.split(" ");
		String result="";
		for(int i=0;i<arr.length;i++) {
			result+= reverseString(arr[i])+" ";
		}
		System.out.println(result);
		
	}
	private static String reverseString(String model) {
		char[] sTemp = model.toCharArray();
		int l=sTemp.length;
		String result ="";
		for(int i=0; i<l/2;i++) {
			char tmp=sTemp[i];
			sTemp[i]=sTemp[l-i-1];
			sTemp[l-i-1]=tmp;
		}
		for(int i=0; i<sTemp.length;i++) {
			result+=sTemp[i];
		}

		return result;
	}

}
