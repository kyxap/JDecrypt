package rk.sandwich2;

import java.util.ArrayList;


public class Terminal {

	public static void main(String[] args) {
		
		Worker marty = new Worker("Marty", 500);
		Worker biff = new Worker("Biff", 1200);
		
		Supplement tomato = new Supplement("Tomato");
		Supplement egg = new Supplement("Egg");
		Supplement salad = new Supplement("Salad");
		Supplement corn = new Supplement("Corn");
		
		Sandwich usa = new Sandwich("U.S.A.", 300);
		Sandwich cheese = new Sandwich("Cheese", 350);
		Sandwich ham = new Sandwich("Ham", 300);
		
		ArrayList<Supplement> list = usa.getSuppList();
		list.add(salad);
		//the same as previuse part
		usa.getSuppList().add(tomato);
		cheese.getSuppList().add(tomato);
        cheese.getSuppList().add(corn);
        ham.getSuppList().add(corn);
        ham.getSuppList().add(egg);
        
        
//        usa.setWorker(biff);
//        System.out.println(usa.getWorker().getName());
        
        marty.purchase(usa);
        marty.purchase(cheese);
        biff.purchase(cheese);
        biff.purchase(ham);
//        for (Supplement supplement : list) {
//			System.out.println(supplement.getName());
//		}
//        System.out.println("==>" + ham.getSuppList());
		
		
//		System.out.println(list);
        ArrayList<Sandwich> sList = new ArrayList<Sandwich>();
        sList.add(cheese);
        sList.add(ham);
        sList.add(usa);
        
        Displayer.displaySandwichesWithOwners(sList);

	}

}
