package com.TecZH_boot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.TecZH_boot.mapper.UserMapper;
import com.TecZH_boot.model.User;
import com.TecZH_boot.service.UserService;

import utils.BaseResult;
import utils.ListResult;



@Service
public class UserServiceImpl implements UserService {

	
	
	@Resource
	private UserMapper userMapper;
	
	
	@Override
	public void delete(Long id) {
		userMapper.dele(id);	
	}

	@Override
	public ListResult selectAll() {
	     
		return ListResult.success("提取刘盈成功", userMapper.selectAll());
	}

	@Override
	public BaseResult insert(User user) {
	int userid = userMapper.insert(user);
	System.out.println(userid);
		return BaseResult.success1("添加成功");
	}

}
