package Baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class chap07_1157 {
	public static void main(String[] args) {
		int[] count_arr = new int[26];
		int index = 0;
		
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		str = str.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < count_arr.length; j++) {
				if(str.charAt(i) == (65 + j)) {
					count_arr[j]++;
				}
			}
		}
		
		int max = count_arr[0];
		for(int i = 1; i < count_arr.length; i++) {
			if(max < count_arr[i]) {
				max = count_arr[i];
				index = i;
			}
		}
		
		Arrays.sort(count_arr);
		
		System.out.println(count_arr.getClass().getName());
//		if(count_arr[count_arr.length] == count_arr[(count_arr.length)-1])
//			System.out.println("?");
//		else
//			System.out.println('A' + index);
		
		
		
		System.out.println(Arrays.toString(count_arr));
		System.out.println(index);
	}
}
