package rk.school;

import java.util.ArrayList;



public class Displayer {
    public static void displaySandwichesWithOwners(ArrayList<Audience> list) {
        for( Audience s : list ) {  // ��� ������� �������� �� ������
            System.out.println(s.getAudNum() + " " + s.getWhatLessonHere());
        }
    }
}