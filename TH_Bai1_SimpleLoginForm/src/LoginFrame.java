import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField acc;
	private JTextField pass;

	
	public LoginFrame() {
		setFont(null);
		setTitle("ĐĂNG NHẬP HỆ THỐNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên Đăng Nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(25, 27, 137, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật Khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(25, 91, 116, 32);
		contentPane.add(lblMtKhu);
		
		acc = new JTextField();
		acc.setBounds(185, 24, 213, 43);
		contentPane.add(acc);
		acc.setColumns(10);
		
		pass = new JTextField();
		pass.setColumns(10);
		pass.setBounds(185, 80, 213, 43);
		contentPane.add(pass);
		
		JButton btnLogin = new JButton("ĐĂNG NHẬP");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(148, 164, 137, 62);
		contentPane.add(btnLogin);
	}
	
	void XuLyDangNhap() {
		String Str_acc = acc.getText();
		String Str_pass = pass.getText();
		if(Str_acc.equals("63CNTT") && Str_pass.equals("123")) {
			HomeFrame homeFrame = new HomeFrame();
			homeFrame.setVisible(true);
			this.setVisible(false);
		}else {
			acc.setText("");
			pass.setText("");
			JOptionPane hopthoai = new JOptionPane();
			hopthoai.showMessageDialog(this, "Đăng Nhập Thất Bại");
			
		}
	}
}
