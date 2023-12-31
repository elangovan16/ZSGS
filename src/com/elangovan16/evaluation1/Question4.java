package com.elangovan16.evaluation1;

import java.util.Scanner;

public class Question4 {// print pattern
	// ZOHOISHIRING,ZOHOOOISHIRING
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Enter Rows : ");
		int n = sc.nextInt();
		if(n==1) {
			System.out.println(str);
			return;
		}
		char[][] ans = new char[n][str.length()/2+1];
		int index = 0;
		int i = 0;
		int j = 0;
		boolean flag = true;
		while (index<str.length()) {
			if (flag) {
				ans[i][j] = str.charAt(index++);
				i++;
				if (i == n - 1) {
					flag = false;
				}
			} else {
				ans[i][j] = str.charAt(index++);
				i--;
				j++;
				if (j % (n - 1) == 0) {
					flag = true;
				}
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < ans[0].length; j++) {
				if (ans[i][j] != '\u0000') {
					System.out.print(ans[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
