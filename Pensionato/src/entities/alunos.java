package entities;

public class alunos {
	private String name;
	private String email;
	private int bedroom;
	
	
	public alunos (String name, String email, int bedroom) {
		this.name = name;
		this.email = email;
		this.bedroom = bedroom;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getBedroom() {
		return bedroom;
	}


	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}



	
	
}