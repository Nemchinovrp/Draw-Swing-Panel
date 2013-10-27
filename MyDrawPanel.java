package color.change;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g){
		String str = "by Roman Nemchinov";
		g.fillRect(0, 0, this.getWidth(),this.getHeight());
		
		int red = (int) (Math.random() *255);
		int green = (int) (Math.random()*255);
		int blue = (int) (Math.random()*255);
		
		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillRect(30, 30, 70, 70);
		g.fillOval(140, 25, 80, 80);
		g.drawString(str, 80, 230);
		g.fillRoundRect(30,110 , 70, 70, 30, 30);
		g.fillArc(140, 110, 70, 70, 250, 250);
	}
	
}
