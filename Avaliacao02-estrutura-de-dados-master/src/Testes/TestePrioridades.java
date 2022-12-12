package Testes;

import Codigos.Prioridades;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestePrioridades {
    public static void main(String[] args) {

		//criação da fila
		Queue<Prioridades> fila = new PriorityQueue<>();

		//mostra a fila cadastrada acima na tela
		System.out.println("Tarefas a serem realizadas\n" + fila);

		//implementação das filas cadastradas com nome, descrição e prioridades
		fila.add(new Prioridades("Faculdade", "Entregar atividade de estrutura!", 2));
		fila.add(new Prioridades("Trabalho", "Apresentação com cliente!", 1));
		fila.add(new Prioridades("Palestra", "Fazer slide da palestra!", 3));

		//mostra na tela as tarefas a serem realizadas, as tarefas realizadas e as tarefas a serem realizadas após a anterior
		System.out.println("\n->Tarefas a serem realizadas\n" + fila);
		System.out.println("\n->Tarefa realizada\n" + fila.remove());
		System.out.println("\n->Tarefa a ser realizada após a anterior\n" + fila.peek());
		System.out.println("\n->Tarefas a serem realizadas\n" + fila);

	}
}
