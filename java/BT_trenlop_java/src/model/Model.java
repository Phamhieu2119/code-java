package model;

public class Model {
	private String user;
	private String pass;
	public Model() {
		this.user = "";
		this.pass ="";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public  String toString() {
		return "Model [user=" + this.getUser() + ", pass=" + this.getPass()+ "]";
	}
	
	
}
