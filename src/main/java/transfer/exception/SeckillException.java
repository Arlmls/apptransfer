package transfer.exception;

/**
 * 秒杀相关的所有业务异常
 * 
 */
public class SeckillException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8136099046923049603L;

	public SeckillException(String message) {
		super(message);
	}

	public SeckillException(String message, Throwable cause) {
      super(message, cause);
  }
}
