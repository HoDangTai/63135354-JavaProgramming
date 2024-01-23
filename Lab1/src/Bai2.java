/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chiều dài: ");
		int dai = scanner.nextInt();
		System.out.println("Nhập chiều rộng: ");
		int rong = scanner.nextInt();
		int chuvi = (dai+rong)*2;
		int dientich = dai*rong;
		
		System.out.printf("chu vi hinh chu nhat %d\n",chuvi);
		System.out.printf("dien tich hinh chu nhat: %d\n", dientich);
		System.out.printf("canh nho nhat la %s\n",Math.min(dai,rong));
	}

}
