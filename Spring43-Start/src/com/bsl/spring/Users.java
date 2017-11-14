package com.bsl.spring;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Users {
	private String name;
	private String address;
	private String memo;
	
	@Override
	public String toString() {
		return "Users [name=" + name + ", address=" + address + ", memo=" + memo + "]";
	}
	
	
}
