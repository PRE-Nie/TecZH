package com.TecZH_boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.TecZH_boot.model.User;

@Mapper
public interface UserMapper {
	
	void dele(Long id);

	
	
	List selectAll();



	int insert(User user);
	

}
