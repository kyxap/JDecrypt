package rk.school;

import java.util.ArrayList;

public class Audience {
	private String audNum;
	
//	Lesson lesson;
	
	private ArrayList<Lesson> lessons  = new ArrayList<Lesson>();
	
	public ArrayList<Lesson> getLessons() {
		return lessons;
	}
	
	public Audience(String audNum) {
		this.audNum = audNum;
	}

	public String getAudNum() {
		return audNum;
	}

	public void setAudNum(String audNum) {
		this.audNum = audNum;
	}
}
