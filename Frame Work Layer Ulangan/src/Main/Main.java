package Main;

import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	
	public void cls() {
		for(int i=0;i<25;i++) System.out.println();
	}
	
	public void MainMenu() {
		System.out.println("nice hello");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
	
	public void menu1() {
		cls();
		
		String type="";
		double nomor=0;
		
		do {
			System.out.println("");
			type=scan.nextLine();
		}while(type == null);
		
		do {
			System.out.println("");
			nomor=scan.nextDouble(); scan.nextLine();
		}while(nomor == 0);
	}
	
	public void menu2() {
		cls();
		
		
	}
	
	public void menu3() {
		cls();
		
		
	}
	
	public Main() {
		
		int choose = 0;
		
		do {
			cls();
			MainMenu();
			System.out.println("Choose: ");
			choose = scan.nextInt(); scan.hasNextLine();
			
			switch(choose) {
			case 1:{
				menu1();
				break;
			}
			case 2:{
				menu2();
				break;
			}
			case 3:{
				menu3();
				break;
			}
		}
			
		}while(choose !=0);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
