package Main;

import java.util.ArrayList;
import java.util.Scanner;

import data.Katepe;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Katepe> Katepe = new ArrayList<>();
	
	public void cls() {
		for(int i=0;i<25;i++) System.out.println();
	}
	
	public void MainMenu() {
		System.out.println("KaTePe");
		System.out.println("===========");
		System.out.println("1. Register KaTePe");
		System.out.println("2. Process KaTePe");
		System.out.println("3. Deliver KaTePe");
		System.out.println("4. Exit");
	}
	
	void print(){
		System.out.println("Entry No");
		System.out.println("Name          :");
		System.out.println("Gender        :");
		System.out.println("BirthPlace    :");
		System.out.println("Address       :");
		System.out.println("Current Phase :");
		System.out.println("========================");
		
		for (int i = 0; i < Katepe.size(); i++) {
			System.out.printf("Entry No",i+1);
			System.out.printf("Name          :",Katepe.get(i).getName());
			System.out.printf("Gender        :",Katepe.get(i).getGender());
			System.out.printf("BirthPlace    :",Katepe.get(i).getBirthPlace());
			System.out.printf("Address       :",Katepe.get(i).getAddress());
			System.out.printf("Current Phase :");
		}
		System.out.println("========================");
	}
	
	public void menu1() {
		cls();
		String Delivery="";
		String address="";
		String birthPlace="";
		String gender="";
		String name="";
		
		do {
			System.out.println("Input name [Cannot Be Empty]: ");
			name=scan.nextLine();
		}while(name == null);
		
		do {
			System.out.println("Input Gender [Male | Female][Case Sensitive]: ");
			gender=scan.nextLine();
		}while(!gender.equals("Male") && !gender.equals("Female"));
		
		do {
			System.out.println("Input birthplace [Cannot Be Empty]: ");
			birthPlace=scan.nextLine();
		}while(birthPlace == null);
		
		do {
			System.out.println("Input address [Cannot Be Empty]: ");
			address=scan.nextLine();
		}while(address == null);
		
		do {
			System.out.println("Input Delivery type [GOJEK | JNE][Case Sensitive]: ");
			Delivery=scan.nextLine();
		}while(!Delivery.equals("GOJEK") && !Delivery.equals("JNE"));
	}
	
	public void menu2() {
		cls();
		if (Katepe.size()>0)
		{
			print();
		}
		else
		{
			System.out.println("Empty");
		}
		scan.nextLine();
	}
	
	public void menu3() {
		cls();
		double nomor=0;
		do {
			System.out.println("Which KaTePe should we deliver [1 - 1][0 to quit]?");
			nomor=scan.nextDouble(); scan.nextLine();
		}while(nomor == 0);
		
	}
	
	public Main() {
		
		int choose = 0;
		
		do {
			cls();
			MainMenu();
			System.out.println(">> ");
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
