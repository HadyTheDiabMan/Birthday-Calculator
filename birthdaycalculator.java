import java.util.Scanner;

/**
 * 
 * @author Hady Diab, Birthday Calculator
 *
 */
public class birthdaycalculator 
{

	public static void main(String[] args) 
	{
	Scanner birthday=new Scanner(System.in);
	System.out.println("Please enter your name: ");
	String name1= birthday.nextLine();
	System.out.println("Please enter your birthday(day #): ");
	int firstday= birthday.nextInt();
	System.out.println("Please enter your birth month(# month): ");
	int month1= birthday.nextInt();
	System.out.println("Please enter your birth year: ");
	int year1 = birthday.nextInt();
	
	System.out.println("The second person, please enter your name: ");
	String name2=birthday.nextLine();
	System.out.println("Enter your birthday(day #)You were born, 2nd person: ");
	int secondday=birthday.nextInt();
	System.out.println("Second person, enter in your birth month please(# month): ");
	int month2=birthday.nextInt();
	System.out.println("Please enter your birth year, second person: ");
	int year2=birthday.nextInt();
	
	
	if(year1>year2)
	{
		System.out.println(name2+" is older than "+name1+".");
	}
	else if (year1<year2)
	{
		System.out.println(name1+" is older than "+name2+".");
	}
	else if (month1>month2)
	{
		System.out.println(name2+" is older than "+name1+".");
	}
	else if (month1<month2)
	{
		System.out.println(name1+" is older than "+name1+".");
	}
	else if (firstday>secondday)
	{
		System.out.println(name2+" is older than "+name1+".");
	}
	else if (firstday<secondday)
	{
		System.out.println(name1+" is older than "+name1+".");
	}
	}
	

}
