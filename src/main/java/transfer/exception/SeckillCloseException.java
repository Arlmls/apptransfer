package transfer.exception;


/**
 * 秒杀关闭异常，当秒杀结束时用户还要进行秒杀就会出现这个异常
 * 
 */
public class SeckillCloseException extends SeckillException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8781610744029070195L;
	public SeckillCloseException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
