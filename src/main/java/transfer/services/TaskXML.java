package transfer.services;

import transfer.util.ChatbotSend;

/**
 * 点餐友情提醒类
 * @author lcg
 *
 */
public class TaskXML {
	public void excuteee() {
		try {
			System.out.println("发送点餐");
			ChatbotSend.sendEatMsg("1");
			Thread.sleep(500);
			ChatbotSend.sendEatMsg("2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
