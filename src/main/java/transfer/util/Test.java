package transfer.util;

import java.util.HashMap;
import java.util.Map;

//对接口进行测试  
public class Test {  
  private String url = "https://oapi.dingtalk.com/robot/";  
  private String charset = "utf-8";  
  private HttpClientUtil httpClientUtil = null;  
    
  public Test(){  
      httpClientUtil = new HttpClientUtil();  
  }  
    
  public void test(){  
      String httpOrgCreateTest = url + "send?access_token=cf09cae21229acb570dc92c15cae63508b7d0f4bc37fead35940d340eef67b74";  
      Map<String,Object> createMap = new HashMap<String,Object>();  
      Map<String,Object> content = new HashMap<String,Object>(); 
      content.put("content", "订餐啦");
      Map<String,Object> atMobiles = new HashMap<String,Object>(); 
      atMobiles.put("atMobiles", "[]");
      atMobiles.put("isAtAll", false);
      
      
      
      createMap.put("msgtype","text");  
      createMap.put("text",content);  
      createMap.put("at",atMobiles);  
      String httpOrgCreateTestRtn = httpClientUtil.doPost(httpOrgCreateTest,createMap,charset);  
      System.out.println("result:"+httpOrgCreateTestRtn);  
  }  
    
  public static void main(String[] args){  
      Test main = new Test();  
      main.test();  
  }  
}  
