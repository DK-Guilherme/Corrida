package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entites.Corredor;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Corredor> runner = new ArrayList<>();
		
		System.out.print("Digite a quantia de competidores: ");
		int comp = sc.nextInt();
		
		for (int i = 1; i<=comp; i++) {
			System.out.print("Nome do corredor: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Tempo que levou para completar o percurso: ");
			int time = sc.nextInt();
			runner.add(new Corredor(name, time));
		}
		runner = runner.stream().sorted(Comparator.comparingInt(Corredor::getTime).reversed()).collect(Collectors.toList());
		
		for(Corredor x : runner) {
			System.out.println(x);
		}
		
		
		
		
		
		

	}

}
