package transfer.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lcg
 *
 */
@Component
public class TaskImpl implements TaskService{
	@Scheduled(cron=" 0 3/1 * * * ? ")
	public void excute(){
		try {
//			ChatbotSend.sendEatMsg("0");
			System.out.println("************测试下日志打印**************");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
