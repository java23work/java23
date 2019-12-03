package com.zhiyou.model;

import org.omg.CORBA.StringHolder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin {
	
	private int admin_id;
	private String accounts;
	private String password;
	private String admin_remark;
	
	
}
