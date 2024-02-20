/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap a: ");
		int a = scanner.nextInt();
		System.out.println("nhap b: ");
		int b = scanner.nextInt();
		System.out.println("nhap c: ");
		int c = scanner.nextInt();
		
		double delta = Math.pow(b,2) - 4*a*c;
		System.out.printf("delta = %.3f\n", delta);
		System.out.printf("can bac hai cua delta la: %.3f\n", Math.sqrt(delta));
		
		
		
	}

}
;