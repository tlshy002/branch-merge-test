package com.springboot.myhome.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
public class User_info {
	@Id
	private String user_id;
	@NotEmpty(message="암호를 입력하세요.")
	private String user_pwd;
	private String name;
	@NotEmpty(message="주소를 입력하세요.")
	private String addr;
	@NotEmpty(message="전화번호를 입력하세요.")
	private String phone;
	private String gender;
	private Integer grade;
	@NotEmpty(message="이메일을 입력하세요.")
	private String email;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birth;
	private String job;
}








