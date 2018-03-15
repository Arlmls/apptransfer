package transfer.util;

import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//创建的类名根据需要定义，但一定要实现ServletContextListener接口  
public class DingDing implements ServletContextListener {  

    
  @Override  
  public void contextInitialized(ServletContextEvent arg0) {  
//	  Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//		        public void run() {
//		            System.out.println("11232");
//		        }
//		}, 2000, 1000);  
				System.out.println("hahha");
  }  
    
  @Override  
  public void contextDestroyed(ServletContextEvent arg0) {  
      // TODO Auto-generated method stub  
        
  }  

    
}  