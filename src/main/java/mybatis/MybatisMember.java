package mybatis;

public interface MybatisMember {
// 로그인의 필요한 
	public MemberVO login(String id, String pass);
	
	/*
	 * public MemberVO register (String id, String pass, String name, String
	 * mobile1, String mobile2, java.sql.Date regidate, String num);
	 */
}
