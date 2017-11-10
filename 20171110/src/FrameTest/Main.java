package FrameTest;
import java.awt.*;

class FrameTest extends Frame{
	public FrameTest() {
		super("두 번째 프레임입니다.");
		setBounds(100,100,300,300);
		setVisible(true);
	}
}

public class Main {
	public static void main(String[] args) {
		FrameTest obj = new FrameTest();
	}
}
