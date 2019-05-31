package com.example.agendaapimaster.main.agenda;

/**
 * 
 * @author johnnybrabu
 *
 */
public class AgendaMain {

	
	public static void main(String[] args) {
		agendar();
	}
	/**
	 * Faz todo o fluxo de agendamento.
	 */
	public static String agendar() {
		
		if(horarioDisponivel() == true) {
			System.out.println("Horario agendado com sucesso!");
			return "Horario agendado com sucesso!";
		}else {
			System.out.println("Horário cheio! \nEscolha outro horário.");
			return "Horário cheio! \nEscolha outro horário.";
		}
	}
	
	/**
	 * Valida se o horario atende ao numero de vagas disponivel pelo estabelecimento.
	 */
	public static Boolean horarioDisponivel() {
		//faz o count de linhas entre os horarios pré determinados, e valida se ele é menor ou igual ao validaVagas(). 
		System.out.println("Sem horários");
		numeroDeVagas();
		return false;
	}
	
	
	/**
	 * Valida o numero de vagas do estabelecimento.
	 */
	public static Integer numeroDeVagas() {
		//Count de vagas disponivel pelo estabelecimento.
		System.out.println("Vagas:0");
		return 0;
	}
	
	/**
	 * Criar um horario no banco de dados.
	 */
	public static String cadastrarHorario() {
		//Stub de create no banco de dados.
		System.out.println("Falha ao cadastrar o horário!");
		return "Falha ao cadastrar o horário!";
		
	}
	
	
}
