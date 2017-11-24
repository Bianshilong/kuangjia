package com.bsl.struts23.uitags;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private String gender;
	private String about;
	private String country;
	private List<Country> countryList;
	private String[] community;
	private List<String> communityList;
	private Boolean mailingList;
//	private Date date;
	
	public String populate() {
		//向页面上的国家字段列表添加选项值
		countryList = new ArrayList<Country>();
		countryList.add(new Country(1,"India"));
		countryList.add(new Country(2, "USA"));
		countryList.add(new Country(3, "France"));
		countryList.add(new Country(4, "China"));
		//向页面上的社区字段复选框添加选项值
		communityList = new ArrayList<String>();
		communityList.add("Java");
		communityList.add("PHP");
		communityList.add("ASP");
		communityList.add(".Net");
		
		community = new String[] {"Java",".Net"};
		mailingList = true;
//		date = new Date();
		return "populate";
	}
	public String execute() {
		return SUCCESS;
	}
}
