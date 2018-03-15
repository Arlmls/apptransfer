package transfer.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class HttpUtils {
    
	public static String sendHttpPost(String httpsUrl,String sendMsg) throws Exception{
		return sendHttpPost(httpsUrl,sendMsg,"application/json;charset=UTF-8");
	}
	
	public static String sendHttpPost(String httpsUrl,String sendMsg,String contentType) throws Exception{
		PostMethod postMethod = null;
		int status = 0;
		String responseBody = "";
		try {
			postMethod = new PostMethod();
			postMethod.setRequestHeader("Content-Type", contentType);
			postMethod.setRequestEntity(new StringRequestEntity(sendMsg,contentType,"UTF-8"));
			System.out.println(123);
			status = getHttpClient().executeMethod(postMethod);
			System.out.println(123);
			if(200 == status) {
				responseBody = new String(postMethod.getResponseBodyAsString().getBytes("UTF-8"),"UTF-8");
				System.out.println("返回内容" + responseBody);
			}else {
				System.out.println("返回内容" + responseBody);
				throw new Exception();
			}
		}catch(Exception e) {
			throw new Exception();
		}finally {
			if(null != postMethod) {
				postMethod.releaseConnection();
			}
		}
		return responseBody;
	}
	
	
	public static HttpClient getHttpClient() throws Exception{
		HttpClient client = null;
		client = new HttpClient();
		client.getHttpConnectionManager().getParams().setConnectionTimeout(60000);
		client.getHttpConnectionManager().getParams().setSoTimeout(60000);
		return client;
	}
}
