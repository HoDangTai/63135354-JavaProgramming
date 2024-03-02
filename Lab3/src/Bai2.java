


public class Bai2 {

	public static void main(String[] args) {
		// Sử dụng vòng lặp for ngoài để chạy từ 1 đến 9
        for (int i = 1; i <= 9; i++) {
            // Sử dụng vòng lặp for trong để chạy từ 1 đến 10
            for (int j = 1; j <= 10; j++) {
                // Xuất ra màn hình bảng nhân i
                System.out.printf("%d x %d = %d", i, j, i * j);
                System.out.println(); // Xuống dòng
            }
            System.out.println(); // Xuống dòng để tạo khoảng cách giữa các bảng nhân
        }

	}

}
