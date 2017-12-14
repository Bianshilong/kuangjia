package com.xxx.model;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Teacher {
	
	private Integer id;
	private Integer tecId;
	private String tecName;
	private Short tecAge;
	
	private Integer tecTell;
	private Byte tecSex;
	private String tecAddr;
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tecId=" + tecId + ", tecName=" + tecName + ", tecAge=" + tecAge + ", tecTell="
				+ tecTell + ", tecSex=" + tecSex + ", tecAddr=" + tecAddr + "]";
	}
	
	
}
