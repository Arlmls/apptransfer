package transfer.exception;

/**
 * 重复秒杀异常，是一个运行期异常，不需要我们手动try catch
 * Mysql只支持运行期异常的回滚操作
 * 
 */
public class RepeatKillException extends SeckillException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8585873256169486078L;

	public RepeatKillException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
	}

}
