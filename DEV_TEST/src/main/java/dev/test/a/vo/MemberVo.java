package dev.test.a.vo;

import java.sql.Timestamp;

public class MemberVo {
	
	private String id;
	private String pwd;
    private String name;
    private String jumin1;
    private String jumin2;
    private String hp;//핸드폰
    private String email; //이메일
    private Timestamp reg_date; // 마지막수정날짜
    private String login_time; // 최근 로그인시간
    private String logout_time; // 최근 로그아웃시간
	
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJumin1() {
		return jumin1;
	}
	public void setJumin1(String jumin1) {
		this.jumin1 = jumin1;
	}
	public String getJumin2() {
		return jumin2;
	}
	public void setJumin2(String jumin2) {
		this.jumin2 = jumin2;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getReg_date() {
		return reg_date;
	}
	public void setReg_date(Timestamp reg_date) {
		this.reg_date = reg_date;
	}
	public String getLogin_time() {
		return login_time;
	}
	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}
	public String getLogout_time() {
		return logout_time;
	}
	public void setLogout_time(String logout_time) {
		this.logout_time = logout_time;
	}
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + ", name=" + name + ", jumin1=" + jumin1 + ", jumin2=" + jumin2
				+ ", hp=" + hp + ", email=" + email + ", reg_date=" + reg_date + ", login_time=" + login_time
				+ ", logout_time=" + logout_time + "]";
	}
}
