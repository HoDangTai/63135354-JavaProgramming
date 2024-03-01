import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField kq;
	

	
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Máy tính đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 198, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(10, 85, 198, 36);
		contentPane.add(lblNhpSTh);
		
		a = new JTextField();
		a.setFont(new Font("Tahoma", Font.PLAIN, 16));
		a.setBounds(205, 13, 210, 36);
		contentPane.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setFont(new Font("Tahoma", Font.PLAIN, 16));
		b.setColumns(10);
		b.setBounds(205, 85, 210, 36);
		contentPane.add(b);
		
		JButton cong = new JButton("CỘNG");
		cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyCong();
			}
		});
		cong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cong.setBounds(23, 233, 84, 45);
		contentPane.add(cong);
		
		JButton tru = new JButton("TRỪ");
		tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyTru();
			}
		});
		tru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tru.setBounds(141, 233, 84, 45);
		contentPane.add(tru);
		
		JButton nhan = new JButton("NHÂN");
		nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyNhan();
			}
		});
		nhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		nhan.setBounds(261, 233, 84, 45);
		contentPane.add(nhan);
		
		JButton chia = new JButton("CHIA");
		chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyChia();
			}
		});
		chia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chia.setBounds(373, 233, 84, 45);
		contentPane.add(chia);
		
		JLabel lblKte = new JLabel("Kết quả tính toán");
		lblKte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKte.setBounds(23, 347, 198, 36);
		contentPane.add(lblKte);
		
		kq = new JTextField();
		kq.setForeground(new Color(0, 0, 0));
		kq.setBackground(new Color(255, 255, 255));
		kq.setEnabled(false);
		kq.setFont(new Font("Tahoma", Font.PLAIN, 16));
		kq.setColumns(10);
		kq.setBounds(177, 347, 210, 36);
		contentPane.add(kq);
	}
	
	void XuLyCong() {
		String Str_A = a.getText();
		String Str_B = b.getText();
		Double A = Double.parseDouble(Str_A);
		Double B = Double.parseDouble(Str_B);
		
		Double KQ= A+B;
		
		kq.setText(String.valueOf(KQ));
		
	}
	void XuLyTru() {
		String Str_A = a.getText();
		String Str_B = b.getText();
		Double A = Double.parseDouble(Str_A);
		Double B = Double.parseDouble(Str_B);
		
		Double KQ= A-B;
		
		kq.setText(String.valueOf(KQ));
	}
	void XuLyNhan() {
		String Str_A = a.getText();
		String Str_B = b.getText();
		Double A = Double.parseDouble(Str_A);
		Double B = Double.parseDouble(Str_B);
		
		Double KQ= A*B;
		
		kq.setText(String.valueOf(KQ));	
	}
	void XuLyChia() {
		String Str_A = a.getText();
		String Str_B = b.getText();
		Double A = Double.parseDouble(Str_A);
		Double B = Double.parseDouble(Str_B);
		if (B!=0) {
			Double KQ= A/B;
			kq.setText(String.valueOf(KQ));
		}else {
			kq.setText("Không thể chia cho không!");
		}
		
	}
}
