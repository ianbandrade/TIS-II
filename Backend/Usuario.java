
public class Usuario {

	//Os demais m�todos e vari�veis devem ser colocados quando for desenvolver o cadastro de usu�rio
	
	private String email;
	private String senha;

	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

}
