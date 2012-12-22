import java.util.Calendar;
import java.util.GregorianCalendar;
import org.sikuli.script.*;

public class NumOfDayTillGudauri {
    public static void main(String[] args) { 	
    	  	
    	int month;
    	int day;
    	int year;
    	long daysLeft;
    	String imgDir = "C:/Users/IBM_ADMIN/Dropbox/SelfEducation/JAVA/IBM_workspace/NumOfDaysTillGudauri/";
    	
    	GregorianCalendar gregorianCalendar=new GregorianCalendar();
    	month=Integer.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH));
    	day=Integer.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    	year=Integer.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
   	
    	Calendar cal1 = new GregorianCalendar(year, month, day);
    	Calendar cal2 = new GregorianCalendar(2013, 1, 13);
    	daysLeft = (cal2.getTimeInMillis() - cal1.getTimeInMillis()) / 86400000;
    	String temp = "/topic " + daysLeft + " days left before the Gudauri trip";
    	String skype = "C:/Program Files (x86)/Skype/Phone/Skype.exe";
    	App.focus(skype);
    	Screen s = new Screen();
        try{
        		
        		
                //s.click(imgDir + "imgs/skype.png", 0);
                if (s.exists(imgDir +"imgs/snow_selected.png") != null) {
                	s.click(imgDir + "imgs/msg.png");
                }
                else {
                	s.click(imgDir + "imgs/snow_clear.png");
                	s.click(imgDir + "imgs/msg.png");
                }
                //s.type(null, temp, 0);
                s.paste(temp);
                //s.wait("imgs/spotlight-input.png");
                //s.type(null, "hello world\n", 0);
                s.type(Key.ENTER);
                System.out.println("Ty block finished");
        }        
        catch(FindFailed e){
                e.printStackTrace();
        }


    }

}