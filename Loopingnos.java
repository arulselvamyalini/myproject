package tamilnadu.trichy;

import java.util.Scanner;

public class Loopingnos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loopingnos ln = new Loopingnos();
ln.loopnos ();

Loopingnos ln1 = new Loopingnos();
ln1.loopnos2();

Loopingnos ln2 = new Loopingnos();
ln1.loopnos3();
	
Loopingnos ln3 = new Loopingnos();
ln1.loopnos4();

Loopingnos pw = new Loopingnos();
pw.looppower();

Loopingnos pw2 = new Loopingnos();
pw2.looppower1();

Loopingnos pw3 = new Loopingnos();
pw3.looppower2();
}

	
	public void loopnos() {
		// TODO Auto-generated method stub
		int no;
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		while (no<6)
		{
			System.out.println(no);
			no++;
		}
	}
		public void loopnos2() {
			System.out.println("2nd Scenario");
			int no=1;
		while(no<6)	
		{
			
			System.out.println(no*2);
			no++;
		}
	}
		
		public void loopnos3() {
			System.out.println("3rd Scenario");
			int no=1;
		while(no<6)	
		{
			
			System.out.println(no*3);
			no++;
		}
	}
		public void loopnos4() {
			System.out.println("4th Scenario");
			int no=1;
		while(no<6)	
		{
			
			System.out.println(no*4);
			no++;
		}
	}
		public void looppower() {
			System.out.println("Power 1st Scenario");
			
			int no=1;
			
		while(no<6)	
		{
			
			System.out.println (no*2);
			no++;
		}
	}
		public void looppower1() {
			System.out.println("Power 2nd Scenario");
			int no=1;
		while(no<6)	
		{
			
			System.out.println(no*no);
			no++;
		}
	}
		
		public void looppower2() {
			System.out.println("Power 3nd Scenario");
			int no=1;
		while(no<6)	
		{
			
			System.out.println(no*no*no);
			no++;
		}
	}
}

