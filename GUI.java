import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class GUI {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("Press Me");
		f.setLayout(new BorderLayout());
		f.add(b,BorderLayout.CENTER);
		b.addActionListener(
				event -> System.out.println("Button...." + event.getActionCommand()));
		
		f.pack();
		
		f.setVisible(true);
	}
}
