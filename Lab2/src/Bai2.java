

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bai2 {
	public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b và c từ bàn phím
        System.out.println("Nhập hệ số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c:");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
            	System.out.println("Phương trình vô nghiệm");
            } else {
            	System.out.println("Phương trình có 1 nghiệm: "+(-c/b));
            }
        }else {
	        // Tính delta
	        double d = b * b - 4 * a * c;
	
	        // Kiểm tra các trường hợp và in ra nghiệm
	        if (d > 0) {
	            double x1 = (-b + Math.sqrt(d)) / (2 * a);
	            double x2 = (-b - Math.sqrt(d)) / (2 * a);
	            System.out.println("Phương trình có hai nghiệm phân biệt x1 = " + x1 + " và x2 = " + x2);
	        } else if (d == 0) {
	            double x = -b / (2 * a);
	            System.out.println("Phương trình có nghiệm kép x = " + x);
	        } else {
	            double realPart = -b / (2 * a);
	            double imagPart = Math.sqrt(-d) / (2 * a);
	            System.out.println("Phương trình có hai nghiệm phức x1 = " + realPart + " + " + imagPart + "i và x2 = " + realPart + " - " + imagPart + "i");
	        }
        }
    }
}
