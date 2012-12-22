package rk.school;

import java.lang.reflect.Array;
import java.util.ArrayList;

import rk.school.Audience;
import rk.school.Displayer;
import rk.school.Lesson;
import rk.school.Student;
import rk.school.Teacher;

public class Main {

	public static void main(String[] args) {
		Lesson java = new Lesson("Java & OO");
		Lesson jpa = new Lesson("JPA");
		Lesson jsp = new Lesson("JavaScript");
		
		Audience audienceA = new Audience("A");
		Audience audienceB = new Audience("B");
		
		Teacher john = new Teacher("John Rizzol");
		Teacher nicolas = new Teacher("Nicolas Brasseur");
		Teacher vincent = new Teacher("Vincent Delvaux");
		
		Student fred = new Student("Frederic Carbonnelle");
		Student mur = new Student("Murielle Guilbert");
		Student jam = new Student("James Poulson");
		
		audienceA.getLessons().add(java);
		audienceB.getLessons().add(jpa);
		audienceB.getLessons().add(jsp);
		
		System.out.println("=> " + audienceA.getLessons());
		
		
		ArrayList<Audience> test = new ArrayList<Audience>();
		test.add(audienceB);
		test.add(audienceA);
		
		for (Audience audience : test) {
			System.out.println(audience.getAudNum() + " " + audience.getLessons());
		}
		
		
		
//		Displayer.displaySandwichesWithOwners(test);
		
//		System.out.println(a.getWhatLessonHere().getLesssonName()); 
	}

}
