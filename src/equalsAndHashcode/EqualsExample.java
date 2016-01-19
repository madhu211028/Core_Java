package equalsAndHashcode;

import java.util.Date;

public class EqualsExample {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
	Contact c1= new Contact(1, "Madhusudhan", "07438248988");
	Contact c2= new Contact(2, "Madhusudhan", "07438248988");
	
	Contact c3=c1;
	System.out.println(c1.hashCode());
	System.out.println(c2.hashCode());
	System.out.println(c1.hashCode()==c2.hashCode());
	long endTime=System.currentTimeMillis();
	long totalTime=endTime-startTime;
	System.out.println(totalTime);
	Date date= new Date();
	System.out.println(date);
	
	}

}
