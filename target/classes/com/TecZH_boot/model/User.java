package com.TecZH_boot.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class User {

	private int id ;
	private String mobile;
	private String password;
	private Date createtime;
	@JsonIgnore
	private Date updatetime;
	@JsonIgnore
	private int isdel;
	private String nickname;
    private String email;

	
	
}
