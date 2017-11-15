package cn.uc.beans;

public class User {

	private int id;
	private String u_username;
	private String u_nickname;
	private String u_password;
	private boolean u_sex;
	private String u_bindtel;
	private String email;
	private String u_heading;
	private boolean u_state;
	private String u_createtime;
	private String u_birthday;
	private String u_remark;
	private String u_update;
	private int u_provinceid;
	private int u_cityid;
	private int u_areaid;
	
	
	public User(int id, String u_username, String u_nickname,
			String u_password, boolean u_sex, String u_bindtel, String email,
			String u_heading, boolean u_state, String u_createtime,
			String u_birthday, String u_remark, String u_update,
			int u_provinceid, int u_cityid, int u_areaid) {
		super();
		this.id = id;
		this.u_username = u_username;
		this.u_nickname = u_nickname;
		this.u_password = u_password;
		this.u_sex = u_sex;
		this.u_bindtel = u_bindtel;
		this.email = email;
		this.u_heading = u_heading;
		this.u_state = u_state;
		this.u_createtime = u_createtime;
		this.u_birthday = u_birthday;
		this.u_remark = u_remark;
		this.u_update = u_update;
		this.u_provinceid = u_provinceid;
		this.u_cityid = u_cityid;
		this.u_areaid = u_areaid;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getU_username() {
		return u_username;
	}


	public void setU_username(String u_username) {
		this.u_username = u_username;
	}


	public String getU_nickname() {
		return u_nickname;
	}


	public void setU_nickname(String u_nickname) {
		this.u_nickname = u_nickname;
	}


	public String getU_password() {
		return u_password;
	}


	public void setU_password(String u_password) {
		this.u_password = u_password;
	}


	public boolean isU_sex() {
		return u_sex;
	}


	public void setU_sex(boolean u_sex) {
		this.u_sex = u_sex;
	}


	public String getU_bindtel() {
		return u_bindtel;
	}


	public void setU_bindtel(String u_bindtel) {
		this.u_bindtel = u_bindtel;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getU_heading() {
		return u_heading;
	}


	public void setU_heading(String u_heading) {
		this.u_heading = u_heading;
	}


	public boolean isU_state() {
		return u_state;
	}


	public void setU_state(boolean u_state) {
		this.u_state = u_state;
	}


	public String getU_createtime() {
		return u_createtime;
	}


	public void setU_createtime(String u_createtime) {
		this.u_createtime = u_createtime;
	}


	public String getU_birthday() {
		return u_birthday;
	}


	public void setU_birthday(String u_birthday) {
		this.u_birthday = u_birthday;
	}


	public String getU_remark() {
		return u_remark;
	}


	public void setU_remark(String u_remark) {
		this.u_remark = u_remark;
	}


	public String getU_update() {
		return u_update;
	}


	public void setU_update(String u_update) {
		this.u_update = u_update;
	}


	public int getU_provinceid() {
		return u_provinceid;
	}


	public void setU_provinceid(int u_provinceid) {
		this.u_provinceid = u_provinceid;
	}


	public int getU_cityid() {
		return u_cityid;
	}


	public void setU_cityid(int u_cityid) {
		this.u_cityid = u_cityid;
	}


	public int getU_areaid() {
		return u_areaid;
	}


	public void setU_areaid(int u_areaid) {
		this.u_areaid = u_areaid;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", u_username=" + u_username
				+ ", u_nickname=" + u_nickname + ", u_password=" + u_password
				+ ", u_sex=" + u_sex + ", u_bindtel=" + u_bindtel + ", email="
				+ email + ", u_heading=" + u_heading + ", u_state=" + u_state
				+ ", u_createtime=" + u_createtime + ", u_birthday="
				+ u_birthday + ", u_remark=" + u_remark + ", u_update="
				+ u_update + ", u_provinceid=" + u_provinceid + ", u_cityid="
				+ u_cityid + ", u_areaid=" + u_areaid + "]";
	}

	
	
	
}
