package transfer.dao;

import org.apache.ibatis.annotations.Param;

import transfer.entity.SuccessSeckilled;

/**
 * 
 * @author lcg
 *
 */
public interface SuccessSeckilledDao {

	/**
	 * 插入购买明细，可过滤重复
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	int insertSuccessSeckilled(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
	
	
    /**
     * 根据id查询SuccessSeckilled并携带秒杀产品对象实体
     * @param seckillId
     * @return
     */
	SuccessSeckilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
}
