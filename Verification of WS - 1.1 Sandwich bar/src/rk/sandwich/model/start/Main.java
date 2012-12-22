package rk.sandwich.model.start;

import java.util.ArrayList;

import rk.sandwich.model.Displayer;
import rk.sandwich.model.Sandwich;
import rk.sandwich.model.Supplement;
import rk.sandwich.model.Worker;



public class Main {

	public static void main(String[] args) {
		
		Supplement tomato = new Supplement("Tomato");
		Supplement egg = new Supplement("Egg");
		Supplement salad = new Supplement("Salad");
		Supplement corn = new Supplement("Corn");
		
		Sandwich usa = new Sandwich("U.S.A.", 300);
		Sandwich cheese = new Sandwich("Cheese", 350);
		Sandwich ham = new Sandwich("Ham", 300);
		
		usa.getSupplements().add(salad);
        //		//строка выше делает то же самое, что и:
//        		ArrayList<Supplement> list = usa.getSupplements();
//        		list.add(salad);
		
		usa.getSupplements().add(tomato);
        cheese.getSupplements().add(tomato);
        cheese.getSupplements().add(corn);
        ham.getSupplements().add(corn);
        ham.getSupplements().add(egg);

        
		
		Worker marty = new Worker("Marty", 500);
		Worker biff = new Worker("Biff", 1200);
		
		marty.purchase(usa);
        biff.purchase(cheese);
        biff.purchase(ham);
        
        ArrayList<Sandwich> sandList = new ArrayList<Sandwich>();
        sandList.add(usa);
        sandList.add(ham);
        sandList.add(cheese);
        
        Displayer.displaySandwichesWithOwners(sandList);

        
		
//		Test below
//		System.out.println(usa.getLabel() + " " + usa.getSupplements());
	}

}
