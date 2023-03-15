package Programa;

import java.util.ArrayList;  
import java.util.List;
import Estudante.Estudante;
import Pessoa.Pessoa;
import Professor.Professor;


public class Progma {

	public static void main(String[] args) {
     List<Pessoa> ind = new ArrayList<Pessoa>();
		
		Estudante est1 = new Estudante(1);

		
		Professor prof1 = new Professor(1);
		
		
	
		
		
		
		ind.add(est1);
		
		
		
		ind.add(prof1);
		
		
	
		
		for(Pessoa fb : ind) {
			System.out.println(fb.toString() );
		}
		
		
	
	

	}

}
