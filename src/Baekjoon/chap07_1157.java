package Baekjoon;

import java.util.Scanner;

public class chap07_1157 {
	public static void main(String[] args) {
		int[] count_arr = new int[26];

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		str = str.toUpperCase();

//		System.out.println(str);

		for (int i = 0; i < count_arr.length; i++) {
			System.out.println(Integer.parseInt(str.charAt(i)));
		}
	}
}
