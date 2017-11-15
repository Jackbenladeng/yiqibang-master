package cn.uc.beans;

import java.util.Date;

public class News {
	private int id;
	private int t_t_id;
	private String n_title;
	private String n_source;
	private String n_content;
	private Date n_createtime;
	private int n_commcount;
	private int n_readcount;
	private int n_sharecount;
	private String n_author;
	private Boolean n_Ifhot;
	private Boolean n_Ifreport;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getT_t_id() {
		return t_t_id;
	}
	public void setT_t_id(int t_t_id) {
		this.t_t_id = t_t_id;
	}
	public String getN_title() {
		return n_title;
	}
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	public String getN_source() {
		return n_source;
	}
	public void setN_source(String n_source) {
		this.n_source = n_source;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public Date getN_createtime() {
		return n_createtime;
	}
	public void setN_createtime(Date n_createtime) {
		this.n_createtime = n_createtime;
	}
	public int getN_commcount() {
		return n_commcount;
	}
	public void setN_commcount(int n_commcount) {
		this.n_commcount = n_commcount;
	}
	public int getN_readcount() {
		return n_readcount;
	}
	public void setN_readcount(int n_readcount) {
		this.n_readcount = n_readcount;
	}
	public int getN_sharecount() {
		return n_sharecount;
	}
	public void setN_sharecount(int n_sharecount) {
		this.n_sharecount = n_sharecount;
	}
	public String getN_author() {
		return n_author;
	}
	public void setN_author(String n_author) {
		this.n_author = n_author;
	}
	public Boolean getN_Ifhot() {
		return n_Ifhot;
	}
	public void setN_Ifhot(Boolean n_Ifhot) {
		this.n_Ifhot = n_Ifhot;
	}
	public Boolean getN_Ifreport() {
		return n_Ifreport;
	}
	public void setN_Ifreport(Boolean n_Ifreport) {
		this.n_Ifreport = n_Ifreport;
	}
	
	
	
	
	@Override
	public String toString() {
		return "News [id=" + id + ", t_t_id=" + t_t_id + ", n_title=" + n_title
				+ ", n_source=" + n_source + ", n_content=" + n_content
				+ ", n_createtime=" + n_createtime + ", n_commcount="
				+ n_commcount + ", n_readcount=" + n_readcount
				+ ", n_sharecount=" + n_sharecount + ", n_author=" + n_author
				+ ", n_Ifhot=" + n_Ifhot + ", n_Ifreport=" + n_Ifreport + "]";
	}
	
	
	
	
	
	
	
	
	
	






	



	
	
	
	
	
	
}
