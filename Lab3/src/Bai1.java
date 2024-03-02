
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// Khai báo đối tượng Scanner để nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên từ bàn phím
        System.out.println("Nhập số nguyên:");
        int N = scanner.nextInt();

        // Khai báo và khởi tạo biến boolean để lưu trạng thái của số nguyên tố
        boolean ok = true;

        // Sử dụng vòng lặp for để kiểm tra xem số đó có chia hết cho bất kỳ số nào từ 2 đến số đó trừ 1 hay không
        for (int i = 2; i < N - 1; i++) {
            if (N % i == 0) {
                ok = false;
                break;
            }
        }

        // Kiểm tra biến ok để biết N có phải là số nguyên tố hay không
        if (ok) {
            System.out.println(N + " là số nguyên tố");
        } else {
            System.out.println(N + " không phải là số nguyên tố");
        }

	}

}
