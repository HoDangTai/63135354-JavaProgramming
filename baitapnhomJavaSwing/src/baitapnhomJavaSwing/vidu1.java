/**
 * 
 */
package baitapnhomJavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 */
public class vidu1 extends JFrame{
	
	// Khai báo các thành phần Swing
    private JButton button;
    private JLabel label;
    
	public vidu1() {
		// Gọi hàm khởi tạo của lớp cha
        super("Simple Swing Example");

        // Tạo một nút và một nhãn
        button = new JButton("Nhan vao day");
        label = new JLabel("Hello, Day la vi du ve JavaSwing");

        // Tạo một bộ lắng nghe sự kiện cho nút
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Thay đổi nội dung của nhãn khi nút được nhấn
                label.setText("Day la van ban sau khi ban nhan vao nut");
            }
        });

        // Tạo một bảng để chứa các thành phần
        JPanel panel = new JPanel();
        // Thêm nút và nhãn vào bảng
        panel.add(button);
        panel.add(label);

        // Thêm bảng vào cửa sổ
        add(panel);

        // Đặt kích thước và vị trí của cửa sổ
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Đặt hành động khi đóng cửa sổ
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Hiển thị cửa sổ
        setVisible(true);
	}

	
	public static void main(String[] args) {
		vidu1 example = new vidu1();

	}

}
