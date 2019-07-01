package com.app.pojos;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="user_data")
public class User {
	private Integer id;
	private String loginName,password,fname,lname,logintype,contactno;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date regdate;
	
	
	public User() {
		System.out.println("in user constr");
	}
	
	public User(String loginName, String password, String fname, String lname, String logintype, String contactno,
			Date regdate) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.logintype = logintype;
		this.contactno = contactno;
		this.regdate = regdate;
	}
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLogintype() {
		return logintype;
	}

	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
@Temporal(TemporalType.DATE)
	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ",loginName=" + loginName + ", password=" + password + ", fname=" + fname + ", lname=" + lname
				+ ", logintype=" + logintype + ", contactno=" + contactno + ", regdate=" + regdate + "]";
	}


}
