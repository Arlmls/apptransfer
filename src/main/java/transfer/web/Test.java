package transfer.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import transfer.entity.Seckill;
import transfer.exception.SeckillCloseException;
import transfer.util.HttpClientUtil;
import transfer.util.HttpUtils;

//public class Test implements ApplicationListener<ContextRefreshedEvent>{
//	@Override 
//	public void onApplicationEvent(ContextRefreshedEvent event) {  
//	        if(event.getApplicationContext().getParent() == null ) {  
//	            System.out.println("hhahhaahhha");
//	        }  
//	    }  
//}
//
//
public class Test{
//	@PostConstruct
//	public void onApplicationEvent() throws InterruptedException {  
//		
//		 
//	     new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				do {
//				 try {
//					   Thread.sleep(10000);
//					    Map<String,Object> map = new HashMap<String,Object>();
//						map.put("method", "好的");
//						System.out.println(567);
//						Thread.sleep(10000);
////						HttpUtils.sendHttpPost("http://blog.csdn.net/ye1992", "{\"aaa\":123}");
//				  }	catch(Exception e) {
//					  try {
//						Thread.sleep(10000);
//					} catch (InterruptedException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				  }	
//				}while(true);
//			}
//	    	 
//	     }).start();
//	     
//		System.out.println("******************************");
//	}       
	public static void main(String[] args) {
		try {
			
			try {
				if(true) {
				  int q = 1/0;
				  System.out.println(SimpleDateFormat.getDateInstance().format(new Date()));
				  System.out.println(33);
				}
			}catch(SeckillCloseException e1) {
				System.out.println(99);
			}
			System.out.println("geg");
		}catch(Exception e) {
			System.out.println(123);
		}
		
		
	}
	
	
}
