package cn.uc.beans;

public class Pic {
		
	private int id;
	private int t_n_id;
	private String p_path;
	private String p_info;
	private String p_author;
	private String p_source;
	
	
	
	public Pic(){
		
		
		
	}
	
	
	public Pic(int id, int t_n_id, String p_path, String p_info,
			String p_author, String p_source) {
//		super();
		this.id = id;
		this.t_n_id = t_n_id;
		this.p_path = p_path;
		this.p_info = p_info;
		this.p_author = p_author;
		this.p_source = p_source;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getT_n_id() {
		return t_n_id;
	}


	public void setT_n_id(int t_n_id) {
		this.t_n_id = t_n_id;
	}


	public String getP_path() {
		return p_path;
	}


	public void setP_path(String p_path) {
		this.p_path = p_path;
	}


	public String getP_info() {
		return p_info;
	}


	public void setP_info(String p_info) {
		this.p_info = p_info;
	}


	public String getP_author() {
		return p_author;
	}


	public void setP_author(String p_author) {
		this.p_author = p_author;
	}


	public String getP_source() {
		return p_source;
	}


	public void setP_source(String p_source) {
		this.p_source = p_source;
	}


	@Override
	public String toString() {
		return "Pic [id=" + id + ", t_n_id=" + t_n_id + ", p_path=" + p_path
				+ ", p_info=" + p_info + ", p_author=" + p_author
				+ ", p_source=" + p_source + "]";
	}

	
	
	
}
