
import javax.swing.*;


public class GraphicHelloWorld {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Graphicl Hello");
		JLabel label = new JLabel("Hello world!",
				JLabel.CENTER);
		frame.add(label);
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
