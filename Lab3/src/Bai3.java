
import java.util.Scanner;
import java.util.Arrays;

public class Bai3 {

	public static void main(String[] args) {
		// Khai báo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng từ bàn phím
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();

        // Khai báo và khởi tạo mảng số nguyên
        int[] a = new int[n];

        // Nhập các giá trị của mảng từ bàn phím
        System.out.println("Nhập các giá trị của mảng:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(a);

        // Xuất mảng vừa nhập ra màn hình
        System.out.println("Mảng vừa nhập là:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // Xuống dòng

        // Khai báo và khởi tạo biến để lưu giá trị nhỏ nhất của mảng
        int min = a[0];

        // Xuất phần tử có giá trị nhỏ nhất ra màn hình
        System.out.println("Phần tử có giá trị nhỏ nhất của mảng là: " + min);

        // Khai báo và khởi tạo biến để lưu tổng và số đếm các phần tử chia hết cho 3
        int sum = 0;
        int count = 0;

        // Duyệt mảng và kiểm tra từng phần tử
        for (int i = 0; i < n; i++) {
            // Nếu phần tử thứ i chia hết cho 3
            if (a[i] % 3 == 0) {
                // Cộng vào tổng
                sum += a[i];
                // Tăng số đếm
                count++;
            }
        }

        // Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
        // Nếu không có phần tử nào chia hết cho 3, in ra thông báo
        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + avg);
        } else {
            System.out.println("Không có phần tử nào chia hết cho 3");
        }

	}

}
