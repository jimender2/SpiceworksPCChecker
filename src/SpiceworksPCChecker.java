import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class SpiceworksPCChecker {

	public static void main(String[] args) throws ParseException {
		
		//Declare variables
		String dateJoined;
		
		long millisec,
			day,
			totalPoints,
			pointsTillPC,
			daysTillPC,
			pointsPerDay;
		
		//Set to value of PC
		final int PC = 250000;
		
		//Get scanner
		Scanner scan = new Scanner(System.in);
		
		//Get start date from user
		System.out.println("Enter Day You Joined Spiceworks");
		dateJoined = scan.nextLine();
		
		//Get point total from user
		System.out.println("Enter How Many Points You Have");
		totalPoints = scan.nextInt();
		
		//Close scanner
		scan.close();
		
		//Convert day joined to date format
		Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateJoined);
		String timeStamp = new SimpleDateFormat("MM/dd/yyyy").format(new java.util.Date());
		Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(timeStamp);
		
		//Get time between the two dates
		millisec = date1.getTime() - date.getTime();
		day = millisec / 24 /60/60/1000;
		
		//Calculate a few different things
		pointsPerDay = totalPoints / day;
		pointsTillPC = PC - totalPoints;
		daysTillPC = pointsTillPC / pointsPerDay;
		
		//Display output
		System.out.println("You have been a member for " + day + " days.");
		System.out.println("You average " + pointsPerDay + " points per day.");
		System.out.println("If you continue at this rate you will become PC "
				+ "in " + daysTillPC + " days.");
		System.out.println("This is " + daysTillPC / 365 + " years.");
		System.out.println("Good luck");
	}

}