package baitapnhomJavaSwing;
import javax.swing.*;


public class vidu2 {

	

	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu Example");
        JMenuBar menuBar = new JMenuBar();


        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");


        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);


        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

}
