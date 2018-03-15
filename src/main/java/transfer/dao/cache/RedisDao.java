package transfer.dao.cache;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import transfer.entity.Seckill;

/**
 * 
 * @author lcg
 *
 */
public class RedisDao {
   
	private final JedisPool jedisPool;
	
	public RedisDao(String ip,int port) {
		jedisPool = new JedisPool(ip,port);
	}
	
	private RuntimeSchema<Seckill> schema = RuntimeSchema.createFrom(Seckill.class);
	
	public Seckill getSeckill(long seckillId) {
	  try {	
		Jedis jedis = jedisPool.getResource();
		try {
			String key = "seckill:" + seckillId;
			//并没有实现哪部序列化操作
			//采用自定义的序列化
			//protostuff：pojo.
			byte[] bytes = jedis.get(key.getBytes());
			//缓存重获取得
			if(bytes != null) {
				Seckill seckill = schema.newMessage();
				ProtostuffIOUtil.mergeFrom(bytes, seckill, schema);
				//seckill被返序列化
				return seckill;
			}
		  }finally{
			jedis.close();
		  }
	  }catch(Exception e) {
		  
	  }
		return null;	
	}
	
	public String putSeckill(Seckill seckill) {
	  try{
		Jedis jeids = jedisPool.getResource();
		try {
			String key = "seckill" + seckill.getSeckillId();
			byte[] bytes = ProtostuffIOUtil.toByteArray(seckill, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
			//超时缓存
			int timeout = 60 * 60;  //1小时
			String result = jeids.setex(key.getBytes(), timeout, bytes);
			return result;
		}finally {
			jeids.close();
		}
	  }catch(Exception e) {
		  
	  }	
		return null;
	}
}
