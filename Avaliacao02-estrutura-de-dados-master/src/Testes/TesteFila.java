package Testes;

import Codigos.FiladeTarefa;

import java.util.LinkedList;
import java.util.Queue;

public class TesteFila {
	public static void main(String[] args) {

		//criação da fila
		Queue<FiladeTarefa> filaTarefa = new LinkedList<>();

		//mostra a fila cadastrada acima na tela
		System.out.println("Tarefas Cadastradas\n" + filaTarefa + "\n");

		//implementação das filas cadastradas com nome, descrição e id
		filaTarefa.add(new FiladeTarefa("Trabalho", "Reuniao de checkpoint!", 1));
		filaTarefa.add(new FiladeTarefa("Diária", "Verificação dos afazeres!", 2));
		filaTarefa.add(new FiladeTarefa("Diária", "Execução dos testes!", 3));

		//mostra na tela as tarefas cadastradas, realizadas e a próxima tarefa da lista
		System.out.println("Tarefas Cadastradas\n" + filaTarefa + "\n");
		System.out.println("Tarefa realizada\n" + filaTarefa.remove() + "\n");
		System.out.println("Tarefas Cadastradas\n" + filaTarefa + "\n");
		System.out.println("Próxima tarefa da lista\n" + filaTarefa.peek());
	}
}
