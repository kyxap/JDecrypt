package com.rk.sandwichStore;

import java.util.ArrayList;



public class Displayer {
    public static void displaySandwichesWithOwners(ArrayList<Sandwich> list) {
        for( Sandwich s : list ) {  // ��� ������� �������� �� ������
            System.out.println(s.getsName() + " owned by " + s.getOwner().getfName());
        }
    }
}