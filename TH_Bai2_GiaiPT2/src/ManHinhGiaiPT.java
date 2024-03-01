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

public class ManHinhGiaiPT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField kq1;
	private JTextField kq2;
	private JButton btnGiai;

	public ManHinhGiaiPT() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X^2 +");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(103, 71, 59, 51);
		contentPane.add(lblNewLabel);
		
		a = new JTextField();
		a.setBounds(31, 73, 59, 51);
		contentPane.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(172, 73, 59, 51);
		contentPane.add(b);
		
		JLabel lblNewLabel_1 = new JLabel("X +");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(250, 71, 46, 51);
		contentPane.add(lblNewLabel_1);
		
		c = new JTextField();
		c.setColumns(10);
		c.setBounds(310, 73, 55, 51);
		contentPane.add(c);
		
		lblNewLabel_2 = new JLabel("Nhập phương trình cần giải");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(31, 27, 284, 30);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("X1 =");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(31, 170, 46, 51);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("X2 =");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(31, 231, 46, 51);
		contentPane.add(lblNewLabel_4);
		
		kq1 = new JTextField();
		kq1.setEditable(false);
		kq1.setColumns(10);
		kq1.setBounds(120, 170, 111, 51);
		contentPane.add(kq1);
		
		kq2 = new JTextField();
		kq2.setEditable(false);
		kq2.setColumns(10);
		kq2.setBounds(120, 231, 111, 51);
		contentPane.add(kq2);
		
		btnGiai = new JButton("GIẢI");
		btnGiai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyTinhToan();
			}
		});
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGiai.setBounds(323, 187, 127, 64);
		contentPane.add(btnGiai);
	}
	
	void XuLyTinhToan() {
		String Str_A = a.getText();
		String Str_B = b.getText();
		String Str_C = c.getText();
		Double A = Double.parseDouble(Str_A);
		Double B = Double.parseDouble(Str_B);
		Double C = Double.parseDouble(Str_C);
		
		if (A == 0) {
            if (B == 0) {
            	a.setText("");
    			b.setText("");
    			c.setText("");
    			kq1.setText(null);
    			kq2.setText(null);
    			JOptionPane hopthoai = new JOptionPane();
    			hopthoai.showMessageDialog(this, "Phương trình vô nghiệm");
            } else {
            	a.setText("");
    			b.setText("");
    			c.setText("");
    			kq1.setText(null);
    			kq2.setText(null);
    			JOptionPane hopthoai = new JOptionPane();
    			hopthoai.showMessageDialog(this, "Phương trình có 1 nghiệm: "+(-C/B));
            }
        }

        Double delta = B * B - 4 * A * C;
        Double x1, x2;

        if (delta > 0) {
            x1 = (Double) ((-B + Math.sqrt(delta)) / (2 * A));
            x2 = (Double) ((-B - Math.sqrt(delta)) / (2 * A));
            a.setText("");
			b.setText("");
			c.setText("");
            kq1.setText(String.valueOf(x1));
            kq2.setText(String.valueOf(x2));	
        } else if (delta == 0) {
            x1 = (-B / (2 * B));
            x2= x1;
            a.setText("");
			b.setText("");
			c.setText("");
            kq1.setText(String.valueOf(x1));
            kq2.setText(String.valueOf(x2));
        } else {
        	a.setText("");
			b.setText("");
			c.setText("");
			kq1.setText(null);
			kq2.setText(null);
			JOptionPane hopthoai = new JOptionPane();
			hopthoai.showMessageDialog(this, "Phương trình vô nghiệm");
        }
    
	}

}
