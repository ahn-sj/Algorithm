package Baekjoon;

import java.util.Scanner;

public class chap07_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int max = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		
		for(int i = 0; i < max+1; i++) {
			
			sum += Integer.parseInt(str, str.charAt(i));
		}
		System.out.println(sum);
	}

}
