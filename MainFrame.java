package color.change;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame implements ActionListener {
	JFrame frame;
	
	public static void main(String[] args) {
		MainFrame MyFrame = new MainFrame();
		MyFrame.go();
	}

		public void go(){
			frame = new JFrame("Draw Panel !");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton button = new JButton("Change color");
			button.addActionListener(this);
			
			MyDrawPanel drawPanel = new MyDrawPanel();
			
			frame.getContentPane().add(BorderLayout.SOUTH, button);
			frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
			frame.setSize(300, 300);
			frame.setVisible(true);
			frame.setLocationRelativeTo(null);
			
		}

	
		public void actionPerformed(ActionEvent arg0) {
			frame.repaint();
			
		}
	
	
}
