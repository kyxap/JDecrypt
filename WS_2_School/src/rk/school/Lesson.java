package rk.school;

import java.util.ArrayList;

public class Lesson {
	
	private String lesssonName;
	
//	ArrayList<Audience> audience = new ArrayList<Audience>();

	/**
	 * @param lesssonName
	 */
	public Lesson(String lesssonName) {
		this.lesssonName = lesssonName;
	}

	public String getLesssonName() {
		return lesssonName;
	}

	public void setLesssonName(String lesssonName) {
		this.lesssonName = lesssonName;
	}

}
