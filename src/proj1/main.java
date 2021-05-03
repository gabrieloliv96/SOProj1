package proj1;

import proj1.Hospede;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		int qtdHosp = 0;
		Scanner ler = new Scanner(System.in);
		int id = 1;
		int canal;
		long tempoTv;
		long tempoDescanso;
		List<Hospede> listaHospede = new ArrayList<Hospede>();
		
		// Teste
		System.out.println("Insira a quantidade de hospedes");
		qtdHosp = ler.nextInt();		
		
		for (int i=0; qtdHosp>i; i++) {
			
			// If para adicionar novo hospede
//			if( ) {
				
				Hospede hospede = new Hospede();
				hospede.setId(id);
				
				System.out.println("Canal do hospede " + id + ": ");
				canal = ler.nextInt();
				id ++;
				System.out.println("Tempo assistindo Tv (em segundos): ");
				tempoTv = ler.nextLong();
				System.out.println("Tempo descansando (em segundos): ");
				tempoDescanso = ler.nextLong();
				
				hospede.setCanal(canal);
				hospede.setTempoTv(tempoTv);
				hospede.setTempoDescansar(tempoDescanso);
				
				System.out.println(hospede.getId());
				System.out.println(hospede.getCanal());
				System.out.println(hospede.getTempoTv());
				System.out.println(hospede.getTempoDescansar());
				
				listaHospede.add(hospede);
//			}
			
		}
		
		ThreadHospede.assistirTv(listaHospede);
		

    }
	
	public void run() {
		
	}
	
	
	
	

	

}
