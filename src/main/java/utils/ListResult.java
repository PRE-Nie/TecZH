package utils;


import java.util.List;

import lombok.Data;

@Data
public class ListResult {

	private int code;
	private String message;
	private List list;
	private static ListResult x;
	
	public static ListResult success(String message,List list){
		x = new ListResult();
		x.setCode(0);
		x.setMessage(message);
		x.setList(list);
		return x;
	}
	
}
