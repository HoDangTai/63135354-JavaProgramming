package baitapnhomJavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vidu3 extends JFrame implements ActionListener{
	
	// Các thành phần của giao diện
    private JTextField displayField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
	
    // Biến lưu trữ toán hạng và toán tử
    private double firstOperand;
    private char operator;

    public vidu3() {
        // Cấu hình cửa sổ
        setTitle("Máy Tính Đơn Giản");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình
        setLayout(new BorderLayout());

        // Tạo trường hiển thị
        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        // Tạo các nút
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }
        addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);

        multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);

        divideButton = new JButton("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);
        buttonPanel.add(equalsButton);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton clickedButton = (JButton) source;
            String buttonText = clickedButton.getText();
            if (Character.isDigit(buttonText.charAt(0))) {
                // Nếu nhấn nút số
                displayField.setText(displayField.getText() + buttonText);
            } else if (buttonText.equals("C")) {
                // Xóa trường hiển thị
                displayField.setText("");
            } else if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
                // Nút toán tử
                firstOperand = Double.parseDouble(displayField.getText());
                operator = buttonText.charAt(0);
                displayField.setText("");
            } else if (buttonText.equals("=")) {
                // Tính kết quả
                double secondOperand = Double.parseDouble(displayField.getText());
                double result = 0;
                switch (operator) {
                    case '+':
                        result = firstOperand + secondOperand;
                        break;
                    case '-':
                        result = firstOperand - secondOperand;
                        break;
                    case '*':
                        result = firstOperand * secondOperand;
                        break;
                    case '/':
                        if (secondOperand != 0) {
                            result = firstOperand / secondOperand;
                        } else {
                            JOptionPane.showMessageDialog(this, "Không thể chia cho 0", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                }
                displayField.setText(String.valueOf(result));
            }
        }
    }
	public static void main(String[] args) {
		SwingUtilities.invokeLater(vidu3::new);

	}

}
