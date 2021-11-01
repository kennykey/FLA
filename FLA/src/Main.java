import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	
	public void cls() {
		for(int i=0;i<0;i++) System.out.println();
	}
	
	public void MainMenu() {
		System.out.println("Art & Cla Fashion");
		System.out.println("=================");
		System.out.println("1.Sell an Outfit");
		System.out.println("2.Show Sold Outfit");
		System.out.println("3.Exit");

	}
	
	public void menu1() {
		cls();
		
		String Type="";
		String Category="";
		String name="";
		String size="";
		String payment="";
		double nomor=0;
		double nomor2=0;
		
		do {
			System.out.println("Outfit Type [Dress | Shoes]:");
			Type=scan.nextLine();
		}while(!Type.equals("Dress") && !Type.equals("Shoes"));
		
		if(!Type.equals("Dress")) {

			do {
				System.out.println("Outfit Category [Artys | Classic]:");
				Category=scan.nextLine();
			}while(!Category.equals("Artys") && !Category.equals("Classic"));
			
			do {
				System.out.println("Input Name [3-20 chars]:");
				name=scan.nextLine();
			}while(name == null);
			
			do {
				System.out.println("Input Price [10000 - 1000000]:");
				nomor=scan.nextDouble(); scan.nextLine();
			}while(nomor > 1000000 || nomor < 10000);
			
			do {
				System.out.println("Input Size [Small | Medium | Large]:");
				size=scan.nextLine();
			}while(!size.equals("Small") && !size.equals("Medium") && !size.equals("Large"));
			
			do {
				System.out.println("Input Payment [Credit | Transfer]:");
				payment=scan.nextLine();
			}while(!payment.equals("Credit") && !payment.equals("Transfer"));
			
		}else if(!Type.equals("Shoes")){
			
			do {
				System.out.println("Outfit Category [Artys | Classic]:");
				Category=scan.nextLine();
			}while(!Category.equals("Artys") && !Category.equals("Classic"));
			
			do {
				System.out.println("Input Name [3-20 chars]:");
				name=scan.nextLine();
			}while(name == null);
			
			do {
				System.out.println("Input Price [10000 - 1000000]:");
				nomor=scan.nextDouble(); scan.nextLine();
			}while(nomor > 1000000 || nomor < 10000);
			
			do {
				System.out.println("Input Size [34 - 46]:");
				nomor2=scan.nextDouble(); scan.nextLine();
			}while(nomor2 > 46 || nomor2 < 34);
			
			do {
				System.out.println("Input Payment [Credit | Transfer]:");
				payment=scan.nextLine();
			}while(!payment.equals("Credit") && !payment.equals("Transfer"));
			
		}
	}
	
	public void menu2() {
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
		}
			
		}while(choose !=3);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
