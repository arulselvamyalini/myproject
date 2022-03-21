package tamilnadu.trichy;

import java.util.Scanner;

public class Arithmetictasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Arithmetictasks at = new Arithmetictasks();
	at.task1();
	Arithmetictasks at1 = new Arithmetictasks();
	at.task2();
	Arithmetictasks at2 = new Arithmetictasks();
	at.task3();
	}

	private void task1() {
		// TODO Auto-generated method stub
		System.out.println("Task1");
		int no = 123456;
		int count = 0;
		int addition = 0;
		while (no>0)
				{
					System.out.println(no%10);
					addition = addition+no%10;
					no = no/10;
					count++;
				}	
		System.out.println("Number of Digits " +count);
		System.out.println("Addition of Digits " +addition);
	}


private void task2() {
	// TODO Auto-generated method stub
	System.out.println("Task2");
	int no = 123456;
	int count = 0;
	int addition = 0;
	while (no>1)
			{
				System.out.println(no%100);
				addition = addition+no%100;
				no = no/10;
				count++;
			}		
	System.out.println("Number of Digits " +count);
	System.out.println("Addition of Digits " +addition);
}



private void task3() {
	// TODO Auto-generated method stub
	System.out.println("Task3");
	int no = 123456;
	int count = 0;
	int addition = 0;
	while (no>12)
			{
				System.out.println(no%1000);
				addition = addition+no%1000;
				no = no/10;
				count++;
			}	
	System.out.println("Number of Digits " +count);
	System.out.println("Addition of Digits " +addition);
}
}
