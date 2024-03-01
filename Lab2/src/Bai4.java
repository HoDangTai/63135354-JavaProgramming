

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
        // Khai báo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Khai báo và khởi tạo biến chọn chức năng
        int chon = 0;

        // Tạo vòng lặp while để lặp lại menu
        while (true) {
            // Gọi phương thức menu để xuất ra màn hình thực đơn
            menu();

            // Nhập số chọn chức năng từ bàn phím
            System.out.println("Chọn chức năng: ");
            chon = scanner.nextInt();

            // Sử dụng lệnh switch để gọi đến các phương thức tương ứng
            switch (chon) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc ứng dụng");
                    return; // Thoát khỏi chương trình
                default:
                    System.out.println("Chức năng không hợp lệ");
                    break;
            }
        }
    }

    // Phương thức menu để xuất ra màn hình thực đơn
    public static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }

    // Phương thức giaiPTB1 để giải phương trình bậc nhất
    public static void giaiPTB1() {
        // Chứa mã của bài 1
        // Khai báo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a và b từ bàn phím
        System.out.println("Nhập hệ số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b:");
        double b = scanner.nextDouble();

        // Kiểm tra các trường hợp và in ra nghiệm
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }

    // Phương thức giaiPTB2 để giải phương trình bậc hai
    public static void giaiPTB2() {
        // Chứa mã của bài 2
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

    // Phương thức tinhTienDien để tính tiền điện
    public static void tinhTienDien() {
        // Chứa mã của bài 3
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
