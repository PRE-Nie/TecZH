package utils;

import lombok.Data;

@Data
public class BaseResult {
    private int code;
	private String message;
//	private T bt;
	
	static BaseResult x ;
	
	public static BaseResult error(String message) {
		x = new BaseResult();
		x.setCode(1);
		x.setMessage(message);
		return x;
	}

	public static BaseResult success1(String message) {
		// TODO Auto-generated method stub
	    x = new BaseResult();
		x.setCode(0);
		x.setMessage(message);
		return x;
	}
	
	
	
}
