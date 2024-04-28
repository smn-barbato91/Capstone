package main;

import costs.CostGenerator;

public class Main {

	public static void main(String[] args) {
		
		CostGenerator cg = new CostGenerator();
		
		String costo = cg.generateProperCost("SHORT", "M", 15);
		
		System.out.println(costo);

	}

}
