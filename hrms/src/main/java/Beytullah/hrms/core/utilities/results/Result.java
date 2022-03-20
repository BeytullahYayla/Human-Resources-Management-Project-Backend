package Beytullah.hrms.core.utilities.results;

public class Result {//This class contains our message and success status
	
	private boolean success;
	private String message;
	
	public Result(boolean success) {//We may want to send just success info
		this.success=success;
		
	}
	public Result(boolean success,String message) {//Or with message info
		this(success);
		this.message=message;
	}
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return this.message;
	}

}
