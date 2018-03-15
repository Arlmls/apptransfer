package transfer.timereat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import transfer.util.HttpUtils;

public class TimerEatDingDing {
    private static final Logger log = LoggerFactory.getLogger(TimerEatDingDing.class);
	private static final String httpsUrl = "https://oapi.dingtalk.com/robot/send?access_token=cf09cae21229acb570dc92c15cae63508b7d0f4bc37fead35940d340eef67b74";
	public static void main(String[] args) throws InterruptedException {
		String sendMsg = "{\n" + 
				"    \"msgtype\": \"text\", \n" + 
				"    \"text\": {\n" + 
				"        \"content\": \"我就是我, 是不一样的烟火\"\n" + 
				"    }, \n" + 
				"    \"at\": {\n" + 
				"        \"atMobiles\": [\n" + 
				"            \"156xxxx8827\", \n" + 
				"            \"189xxxx8325\"\n" + 
				"        ], \n" + 
				"        \"isAtAll\": false\n" + 
				"    }\n" + 
				"}";
		while(true) {
		try { 
				HttpUtils.sendHttpPost(httpsUrl, sendMsg);
			} catch (Exception e) {
				log.info("失败", e);
			}
			Thread.sleep(3000);
	}
	}
}
