/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập cạnh của khối lập phương: ");
		int canh = scanner.nextInt();
		int thetich = (int) Math.pow(canh,3);
		
		System.out.printf("the tich hinh lap phuong: %d",thetich);
		
	}
}
