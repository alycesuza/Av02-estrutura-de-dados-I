package Codigos;

public class FiladeTarefa {

	//declaração de variáveis

    private String nomeTarefa;
	private String descricao;
	private int idTarefa;

	//método que vamos utilizar na classe 'TesteFila' para preencher as variáveis

	public FiladeTarefa(String nomeTarefa, String descricao, int idTarefa) {
		this.nomeTarefa = nomeTarefa;
		this.descricao = descricao;
		this.idTarefa = idTarefa;
	}

	//métodos getters e setters das variavéis criadas
	
	public FiladeTarefa(String descricao) {
		this.descricao = descricao;
	}

	public FiladeTarefa() {
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}

	@Override
	public String toString() {
		return "FiladeTarefa{" + "nomeTarefa='" + nomeTarefa + '\'' + ", descricao='" + descricao + '\'' + ", idTarefa="
				+ idTarefa + '}';
	}
}
