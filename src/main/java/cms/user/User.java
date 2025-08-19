package cms.user;

public abstract class User {

	private int id;
	private String nome;
	private String email;
	private String password;
	
public User(int id, String nome, String email, String password) {
	
	this.id = id;
	this.nome = nome;
	this.email = email;
	this.password = password;
	
}


}