
public class Hors {
	
	private String name;
	private int maxWorkedgHours;
	private int actualWorkedHours;
	private boolean coolOrNo;
	private int maxHoursForCool = 80;
	private int maxHOursForNotCool = 34;
	
	public Hors(String nick, int max, int act, boolean mark) {
		this.name = nick;
		this.coolOrNo = mark;
		if (max >= act){
			this.actualWorkedHours = act;
		} else {
			throw new RuntimeException("For " + this.name +
		              "actual hours > max hours");
		}
		if (mark == true){
			if (max <= maxHoursForCool){
				this.maxWorkedgHours = max;
			} else {
				throw new RuntimeException("For " + this.name +
			              " entered too many max worked hours!");
			}
		}
		if (mark == false){
			if (max <= maxHOursForNotCool){
				this.maxWorkedgHours = max;
			} else {
				throw new RuntimeException("For " + this.name +
			              " entered too many max worked hours!");
			}
		}
	}
	
	public void getActualHours(){
		System.out.println(name + " Actual worked hours: " + actualWorkedHours);
	}
	
	public void getMaxHours() {
		System.out.println(name + " Max works hours: " + maxWorkedgHours);
	}
	public void getInfoAboutCool() {
		System.out.print("The " + name + " is");
		if (coolOrNo == true){
			System.out.print(" cool\n");
		} else System.out.print(" not cool\n");
		
	}
}
