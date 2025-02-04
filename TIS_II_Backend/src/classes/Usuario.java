package classes;

import org.json.JSONException;
import org.json.JSONObject;

public class Usuario {

	private String nome;
	private String sobrenome;
	private String email;
	private String telefone;
	private String senha;

	public Usuario(String nome, String sobrenome, String email, String telefone, String senha) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}

	public Usuario(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = null;
		this.telefone = null;
		this.senha = null;
	}

	public Usuario() {
		super();
		this.nome = null;
		this.sobrenome = null;
		this.email = null;
		this.telefone = null;
		this.senha = null;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", sobrenome=" + sobrenome + ", email=" + email + ", telefone" + telefone + ", senha=" + senha + "]";
	}

	public JSONObject getJson() throws JSONException {
		JSONObject json = new JSONObject();
		json.put("Nome", getNome());
		json.put("Sobrenome", getSobrenome());
		json.put("Email", getEmail());
		json.put("Telefone", getTelefone());
		json.put("Senha", getSenha());
		return json;
	}
}
