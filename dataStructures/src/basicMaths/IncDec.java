package basicMaths;

import java.util.Scanner;

public class IncDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=1) {
			System.out.println(true);
			sc.close();
			return;
			
		}

		int decSize = n / 2;
		int incSize = n - decSize;
		int max = 0;
		int min = Integer.MAX_VALUE;
		boolean maxResult = false;
		boolean minResult = false;

		// Strictly Decreasing

		for (int j = 0; j < decSize; j++) {
			int minValue = sc.nextInt();
			if (minValue < min) {
				min = minValue;
				minResult = true;
			} else {
				minResult = false;
				break;
			}

		}
		// Strictly Increasing

		for (int i = 0; i < incSize; i++) {
			int maxValue = sc.nextInt(); // 9 //8

			if (maxValue > max) { // 9>0 T max=9 8>9
				maxResult = true;
				max = maxValue;
			} else {
				maxResult = false;
				break;
			}

		}
		if (minResult == true && maxResult == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		sc.close();

	}

}
