package tamilnadu.trichy;

import java.util.Scanner;

public class Scannertask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Hello Madam We are from Census Media,Chennai");

System.out.println("We are collecting data from working women - for survey purposes");

System.out.println("what is your name?");

String name = sc.next();

System.out.println("Thank you  Ms."  +name+ " for your support");

System.out.println("Where are you coming from?   where is your office located?");

String origin = sc.next();

System.out.println("Are you using Bus?");
String s = sc.next();
System.out.println("I used to take two buses to reach my office, 1 is Mofussil and the other is Town Bus");

//boolean yes=sc.nextBoolean();
//if(yes)

System.out.println("How much you spend for Ticket in Mofussil per day");
int mfare=sc.nextInt();
System.out.println("How much you spend for Ticket in City bus per day");
int cfare=sc.nextInt(); 
System.out.println("How many days you work in a month");
int wdays=sc.nextInt();
System.out.println("if CMs NO BUS FARE for ladies plan not implemented, How much you need to pay perday?");
int mpayout = sc.nextInt();
System.out.println("in that case, What what would be your total monthly payout for Bus Fare is concern");
int total=(mfare+cfare)*wdays;
System.out.println ("My monthly payout would be  Rs." +total+ " if CMs scheme not annonced");
 
	if(mfare==100)
		System.out.println("But,Thank God, My total payout is only Rs." +(mfare*wdays)+ "  and CMs No BUS FARE scheme helps me to save "+(cfare*wdays)*100/(mfare*wdays)+ "%");
	else
		System.out.println("No Savings and need to pay full fare of Rs." +total);
System.out.println("if you do not use bus how to commute");
String train = sc.next();
System.out.println(" I use train sometime for a change");
}
}






