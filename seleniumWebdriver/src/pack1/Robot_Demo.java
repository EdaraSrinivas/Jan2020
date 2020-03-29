package pack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_Demo {

	public static void main(String[] args) throws IOException, AWTException {
		
		// Robot class can be implemented in java, to handle the window actions / operations by using the keyboard and mouse
		
		Runtime.getRuntime().exec("notepad.exe");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		
		// Multiple keys for single action
		/*robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);*/
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ALT);
		
		// Welcome to Java
		
		StringSelection str = new StringSelection("Welcome to Java");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}
}