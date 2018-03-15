package transfer.dao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import transfer.entity.Seckill;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * @author lcg
 * spring-test，junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit  spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

	@Autowired
	SeckillDao seckillDao;
	

//	@Test
	public void testQueryById() throws Exception{
		Long seckillId = 1000l;
		Seckill seckill = seckillDao.queryById(seckillId);
		System.out.println(seckill.getName());
		System.out.println(seckill);
	}
	
	@Test
	@Transactional(rollbackFor = Exception.class)
	public void testReduceNumber() throws Exception{
		Date seckillTime = new Date();
		int updateCount = seckillDao.reduceNumber(1000l, seckillTime);
		System.out.println(updateCount);
		main2();
	}
	
//	@Test
	public void testQueryAll() throws Exception{
		/**
		 * java没有保存行参的记录：queryAll(int offset,int limit) -> queryAll(arg0,,arg1);
		 */
		List<Seckill> seckill = seckillDao.queryAll(0, 100);
		for(Seckill sec:seckill) {
			System.out.println(sec);
		}
	}
	
	public static void main2(){
		try {
			int a = 0;
			int b = 3/a;
		}catch(Exception e) {
			System.out.println("测一下，测试下");
			throw e;
		}
	}
	
	public static void main(String[] args) throws Exception {
		try {
		 main2();
		 System.out.println(123);
		}catch(Exception e) {
			System.out.println(456);
			System.out.println(e);
		}
	}
	
}
