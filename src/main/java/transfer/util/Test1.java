package transfer.util;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import transfer.entity.TmallConsume;

public class Test1 {

	private static String openUrl = "http://new-retail.coffee.proxy.dasouche.com/v1/taobao/dasouche?caller=new-retail";
	  public static void main(String[] args) throws Exception {
		  Map<String, Object> map = new HashMap<>();
			TmallConsume tmallConsume = new TmallConsume("10");
			String jsonStr = JSONObject.toJSONString(tmallConsume);
			jsonStr = "{\"method\":\"taobao.tmc.messages.consume\",\"params\":{\"quantity\":10}}";
			System.out.println(jsonStr);
//			map.put("params", tmallConsume);
//			map.put("method", TmallConsumeMessageEnum.CONSUME_MSG.getCode());
//			Object reponse = HttpOptimusUtils.sendPost(openUrl, map, "JSON");
			String reponse = HttpUtils.sendHttpPost(openUrl, jsonStr);
			System.out.println(reponse);
	}
}
