import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.melloware.jintellitype.JIntellitype;

public class KeyboradTask extends Thread {
	private Robot robot = null;

	public void run() {

		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(20);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(7600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		System.out.println("计时结束");

		robot.keyPress(KeyEvent.VK_S);
		robot.delay(10);
		robot.keyRelease(KeyEvent.VK_S);

		JIntellitype.getInstance().cleanUp();
	}
}
