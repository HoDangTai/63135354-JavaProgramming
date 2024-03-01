

import java.util.Scanner;

public class Bai3 {
	 public static void main(String[] args) {
	        // Khai báo đối tượng Scanner để nhập dữ liệu
	        Scanner scanner = new Scanner(System.in);

	        // Nhập số điện sử dụng từ bàn phím
	        System.out.println("Nhập số điện sử dụng của tháng:");
	        int soDien = scanner.nextInt();

	        // Khai báo và khởi tạo biến tiền điện
	        int tien = 0;

	        // Áp dụng công thức tính tiền điện theo phương pháp lũy tiến
	        if (soDien < 50) {
	            tien = soDien * 1000;
	        } else {
	            tien = 50 * 1000 + (soDien - 50) * 1200;
	        }

	        // In ra kết quả trên màn hình
	        System.out.println("Tiền điện của tháng là: " + tien);
	    }
}
