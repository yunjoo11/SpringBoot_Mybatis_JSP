package com.joo.s1.member;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MemberVO {

	private String username;
	private String password;
	@NotNull
	private String name;
	private String email;
	private String phone;

}
