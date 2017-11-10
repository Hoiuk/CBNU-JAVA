package PanelTest;
import java.awt.*;

public class PanelTest  extends Frame{
	public PanelTest(String str) {
		super(str);
		Panel panel1 = new Panel();
		panel1.setBackground(Color.LIGHT_GRAY);
		add(panel1);
		setSize(300,300);
		setVisible(true);
	}
}
