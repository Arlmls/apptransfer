package transfer.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 钉钉机器人工具类
 * @author lcg
 *
 */
public class ChatbotSend {
//	https://webalfa.dingtalk.com
	private static final Logger log = LoggerFactory.getLogger(ChatbotSend.class);
	public static String WEBHOOK_TOKEN = "https://oapi.dingtalk.com/robot/send?access_token=cf09cae21229acb570dc92c15cae63508b7d0f4bc37fead35940d340eef67b74";
//	public static String WEBHOOK_TOKEN = "http://new-retail.coffee.proxy.dasouche.com/v1/taobao/dasouche?caller=new-retail";
	public static void sendEatMsg(String type) throws Exception {

		HttpClient httpclient = HttpClients.createDefault();

		HttpPost httppost = new HttpPost(WEBHOOK_TOKEN);
		httppost.addHeader("Content-Type", "application/json; charset=utf-8");

		String textMsg = null;
        String time = SimpleDateFormat.getDateInstance().format(new Date());
		if ("0".equals(type)) {
			textMsg = "{\n" + "    \"msgtype\": \"text\", \n" + "    \"text\": {\n"
					+ "        \"content\": \"友情提示:不早啦，该睡觉啦\"\n" + "    }, \n" + "    \"at\": {\n"
					+ "        \"atMobiles\": [\n" + "            \"18868832084\", \n" + "            \"18368102275\"\n"
					+ "        ], \n" + "        \"isAtAll\": true\n" + "    }\n" + "}";
		} else if ("1".equals(type)) {
			textMsg = "{\n" + 
					"    \"msgtype\": \"link\", \n" + 
					"    \"link\": {\n" + 
					"        \"text\": \"重要的事说一遍，强按触发🔘\", \n" + 
					"        \"title\": \"点餐啦！！！\", \n" + 
					"        \"picUrl\": \"\", \n" + 
					"        \"messageUrl\": \"https://meican.com/index\"\n" + 
					"    }\n" + 
					"}";
		}else if ("2".equals(type)) {
			textMsg = "{\n" + "    \"msgtype\": \"text\", \n" + "    \"text\": {\n"
					+ "        \"content\": \"友情提示:👆👆👆\"\n" + "    }, \n" + "    \"at\": {\n"
					+ "        \"atMobiles\": [\n" + "            \"18868832084\", \n" + "            \"18368102275\"\n"
					+ "        ], \n" + "        \"isAtAll\": true\n" + "    }\n" + "}";
		}
		
		StringEntity se = new StringEntity(textMsg, "utf-8");
		httppost.setEntity(se);

		HttpResponse response = httpclient.execute(httppost);
		if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			String result = EntityUtils.toString(response.getEntity(), "utf-8");
			log.info(result);
		}
	}
}
