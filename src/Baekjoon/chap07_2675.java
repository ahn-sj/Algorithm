package Baekjoon;

import java.util.Scanner;

public class chap07_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < max; i++) {
			String str = sc.nextLine();
			
			for(int j = 0; j < str.length(); j++) {
				System.out.println(str);
			}
		}
	}

}
