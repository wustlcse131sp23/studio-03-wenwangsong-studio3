package studio3;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Iterator;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("What's the maximum of the range in which you want to find prime numbers?");
		int n = sc.nextInt();
		int [] arr0 = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			arr0[i] = i ;
		}
		for (int a = 2; a < n + 1; a++) {
			if ( arr0[a] != 0) {
				for (int b = a * 2 ; b < n + 1; b = b + a) {
					arr0 [b] = 0;
				}
			}
		}
		for (int i = 0; i < n + 1; i++) {
			if ( arr0[i] != 0 && arr0[i] != 1) {
				System.out.print(arr0[i] + " ");;
			}
		}	
		

	}

}
