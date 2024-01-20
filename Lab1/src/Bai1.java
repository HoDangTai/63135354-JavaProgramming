/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.println("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		
		System.out.printf("%s %.2f diem", hoTen, diemTB);
	}

}
