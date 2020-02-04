import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

public class Main {
	private static final int GLOBAL_HOT_KEY_1 = 1;
	private static boolean isKeydown = false;

	public static void main(String[] args) {
		JIntellitype.getInstance().registerHotKey(GLOBAL_HOT_KEY_1, 0, 13);
		JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
			public void onHotKey(int markCode) {
				if (markCode == GLOBAL_HOT_KEY_1 && isKeydown == false) {
					new KeyboardTask().start();
					JIntellitype.getInstance().unregisterHotKey(GLOBAL_HOT_KEY_1);
					isKeydown = true;
					System.out.println("开始计时");
				}
			}
		});
	}
}
