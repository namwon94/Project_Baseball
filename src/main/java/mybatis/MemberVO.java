package mybatis;

import java.sql.Date;

public class MemberVO {
	private String id;
	private String pass;
	private String name;
	private String mobile1;
	private String mobile2;
	private java.sql.Date regidate;
	
	
	//생성자
	public MemberVO() {}
	public MemberVO(String id, String pass, String name, String mobile1, String mobile2, Date regidate) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.mobile1 = mobile1;
		this.mobile2 = mobile2;
		this.regidate = regidate;
	}
	//getter/setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile1() {
		return mobile1;
	}
	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}
	public String getMobile2() {
		return mobile2;
	}
	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}
	public java.sql.Date getRegidate() {
		return regidate;
	}
	public void setRegidate(java.sql.Date regidate) {
		this.regidate = regidate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
