package rk.school;

import java.util.ArrayList;



public class Displayer {
    public static void displaySandwichesWithOwners(ArrayList<Audience> list) {
        for( Audience s : list ) {  // для каждого сандвича из списка
            System.out.println(s.getAudNum() + " " + s.getWhatLessonHere());
        }
    }
}