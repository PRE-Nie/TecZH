package com.TecZH_boot.service;

import java.util.List;

import com.TecZH_boot.model.User;

import utils.BaseResult;
import utils.ListResult;

public interface UserService {
	
	
	void delete(Long id);

	ListResult selectAll();

	BaseResult insert(User user);
	

}
