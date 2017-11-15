package cn.uc.beans;

public class Type {
	private int id;
	private String t_name;
	
	
	public Type(){
		
		
	}
	
	
	
	public Type(int id, String t_name) {
		super();
		this.id = id;
		this.t_name = t_name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getT_name() {
		return t_name;
	}


	public void setT_name(String t_name) {
		this.t_name = t_name;
	}


	@Override
	public String toString() {
		return "Type [id=" + id + ", t_name=" + t_name + "]";
	}
	
	
	
}
