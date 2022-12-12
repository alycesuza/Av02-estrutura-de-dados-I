package Codigos;

	//declaração das variaveis que vamos utilizar na classe 'TestePrioridades'

public class Prioridades implements Comparable<Prioridades> {
	private String nomeTarefa;
	private String descricao;
	private int prioridade;

	//método que vamos utilizar na classe 'TesteFila' para preencher as variáveis

	public Prioridades(String nomeTarefa, String descricao, int prioridade) {
		this.nomeTarefa = nomeTarefa;
		this.descricao = descricao;
		this.prioridade = prioridade;
	}

	//métodos getters e setters das variavéis criadas
	@Override
	public int compareTo(Prioridades o) {
		return Integer.valueOf(this.getPrioridade()).compareTo(o.getPrioridade());
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

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		return "Prioridades{" + "nomeTarefa='" + nomeTarefa + '\'' + ", descricao='" + descricao + '\''
				+ ", prioridade=" + prioridade + '}';
	}
}
