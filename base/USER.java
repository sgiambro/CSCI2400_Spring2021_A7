import java.util.*;

public class USER{

	int id;	
	int pin;
	ATM atm = new ATM();

	public USER(){
		id = 0;
		pin = 0;
	}//end constructor

	public USER(int x, int p){
		id = x;
		pin = p;
	}//end constructor

	public int getID(){
		return id;
	}//end getID

	public int getPin(){
		return pin;
	}//end getPin

	public void setInfo(int x, int p){
		id = x;
		pin = p;
	}//end setInfo

	public void setRate(double r){
		atm.setInterest(r);
	}//end setRate

	public int menu(){

		Scanner scan = new Scanner(System.in);
		int x;

		System.out.println("Hello account " + this.getID() + ". What would you like to do?");
                System.out.println("(1) get checking balance");
                System.out.println("(2) deposit into checking");
                System.out.println("(3) withdraw from checking");
                System.out.println("(4) get savings balance");
                System.out.println("(5) deposit into savings");
                System.out.println("(6) withdraw from savings");
                System.out.println("(7) EXIT");

                x = scan.nextInt();

		return x;

	}//end menu

	public void getBalC(){
		System.out.println(atm.getBalC());
	}//end getBalC

	public void depositC(){
		Scanner scan = new Scanner(System.in);
		double amount = 0;
		
		System.out.println("How much do you want to DEPOSIT into CHECKING?");
		amount = scan.nextDouble();
		
                atm.depositC(amount);
        }//end depositC

        public void withdrawC (){
		Scanner scan = new Scanner(System.in);
		double amount = 0;

		System.out.println("How much do you want to WITHDRAW from CHECKING?");
                amount = scan.nextDouble();	

		if((atm.getBalC() - amount) < 0){
			amount = 0;
			System.out.println("NOT ENOUGH MONEY IN ACCOUNT");
		}

                atm.withdrawC(amount);
        }//end withdrawC

	public void getBalS(){
                System.out.println(atm.getBalS());
        }//end getBalS

        public void depositS(){
		Scanner scan = new Scanner(System.in);
		double amount = 0;
		
		System.out.println("How much do you want to DEPOSIT into SAVINGS?");
                amount = scan.nextDouble();

                atm.depositS(amount);
        }//end depositS

        public void withdrawS(){
		Scanner scan = new Scanner(System.in);
		double amount = 0;

		System.out.println("How much do you want to WITHDRAW from SAVINGS?");
                amount = scan.nextDouble();

		if((atm.getBalS() - amount) < 0){
                        amount = 0;
                        System.out.println("NOT ENOUGH MONEY IN ACCOUNT");
                }


                atm.withdrawS(amount);
        }//end withdrawS	
	
	public int exit(){
		return atm.exit();
	}//end exit
}//end USER
