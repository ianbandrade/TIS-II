package webService;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.simpleframework.http.Query;
import org.simpleframework.http.Request;

import classes.Dimensoes;
import classes.Localizacao;
import classes.Usuario;
import classes.Vaga;
import dao.VagaDAO;

public final class VagaService {

	public JSONObject adicionar(Request request) {
		String nome;
		String sobrenome;

		String indicador;
		String foto;
		String descricao;

		double largura;
		double comprimento;
		double altura;

		String cep;
		String endereco;
		int numero;
		String bairro;
		String cidade;
		String estado;

		Vaga v = null;

		Query query = request.getQuery();

		nome = query.get("nome");
		sobrenome = query.get("sobrenome");
		indicador = query.get("indicador_vaga");
		foto = query.get("foto_vaga");
		descricao = query.get("descricao");
		largura = Math.round(query.getFloat("largura")*10)/10.0;
		comprimento = Math.round(query.getFloat("comprimento")*10)/10.0;
		altura = Math.round(query.getFloat("altura")*10)/10.0;
		cep = query.get("cep");
		endereco = query.get("endereco");
		numero = query.getInteger("numero");
		bairro = query.get("bairro");
		cidade = query.get("cidade");
		estado = query.get("estado");

		v = new Vaga(new Usuario(nome, sobrenome), indicador, foto, descricao,
				new Dimensoes(largura, comprimento, altura),
				new Localizacao(cep, endereco, numero, bairro, cidade, estado));
		
		VagaDAO vagaDAO = new VagaDAO();
		vagaDAO.add(v);
		
		return v.getJson();
	}

	public JSONObject listar() {
		JSONObject json = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		
		List<Vaga> vagas = new ArrayList<Vaga>();
		VagaDAO vagaDAO = new VagaDAO();
		vagas = vagaDAO.getAll();
		
		for(Vaga v: vagas) {
			jsonArray.put(v.getJson());
		}
		json.put("vagas", jsonArray);
		return json;
	}	
}

