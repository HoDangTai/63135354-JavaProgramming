
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// Khai báo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng sinh viên từ bàn phím
        System.out.println("Nhập số lượng sinh viên:");
        int n = scanner.nextInt();

        // Khai báo và khởi tạo 2 mảng họ tên và điểm của sinh viên
        String[] hoTen = new String[n];
        double[] diem = new double[n];

        // Nhập các giá trị của 2 mảng từ bàn phím
        System.out.println("Nhập họ tên và điểm của sinh viên:");
        for (int i = 0; i < n; i++) {
        	System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ tên:");
            hoTen[i] = scanner.next();
            System.out.println("Điểm:");
            diem[i] = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng thừa sau khi nhập điểm
        }

        // Xuất 2 mảng đã nhập ra màn hình, mỗi sinh viên có thêm học lực
        System.out.println("Danh sách sinh viên đã nhập là:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + xetHocLuc(diem[i])); 
        }

        // Sắp xếp 2 mảng theo điểm của sinh viên tăng dần
        sapXep(hoTen, diem); 

        // Xuất 2 mảng đã sắp xếp ra màn hình
        System.out.println("Danh sách sinh viên đã sắp xếp theo điểm tăng dần là:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + xetHocLuc(diem[i]));
        }
	}
	public static String xetHocLuc(double diem) {
        
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
	
	public static void sapXep(String[] hoTen, double[] diem) {
        for (int i = 0; i < diem.length - 1; i++) {
            // Tìm vị trí của phần tử nhỏ nhất từ i đến cuối mảng
            int minIndex = i;
            for (int j = i + 1; j < diem.length; j++) {
                if (diem[j] < diem[minIndex]) {
                    minIndex = j;
                }
            }
            // Đổi chỗ phần tử nhỏ nhất với phần tử thứ i
            double temp = diem[i];
            diem[i] = diem[minIndex];
            diem[minIndex] = temp;

            // Đổi chỗ họ tên tương ứng
            String tempName = hoTen[i];
            hoTen[i] = hoTen[minIndex];
            hoTen[minIndex] = tempName;
        }
	}    
}
