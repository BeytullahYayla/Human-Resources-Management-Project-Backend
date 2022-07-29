package Beytullah.hrms.core.utilities.results;

public class DataResult<T> extends Result {//Generic Class

	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data=data;
		//Super provides us to invoke base classes constructors
		// TODO Auto-generated constructor stub
	}
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
	}
	public T getData() {
		return this.data;
	}

	

}
