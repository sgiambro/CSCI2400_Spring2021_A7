import java.util.*;

public class ADMIN extends USER {


	public ADMIN(){

		super.setInfo(00000 , 12345);

	}//end constructor

	public int menu(){

	
                Scanner scan = new Scanner(System.in);
                int x;

                System.out.println("Hello ADMIN. What would you like to do?");
                System.out.println("(1) Add Account");
                System.out.println("(2) Delete Account");
                System.out.println("(3) See All Accounts");
                System.out.println("(4) Set Interest Rate");
                System.out.println("(5) EXIT");

                x = scan.nextInt();

                return x;

	
	}//end menu

	public int addAcc(){

	 	Scanner scan = new Scanner(System.in);
         	int an = 0;

         	System.out.println("Enter new account number:  ");
         	an = scan.nextInt();

		return an;

	}//end addAcc

	public int addPin(){
		
		Scanner scan = new Scanner(System.in);
         	int pn = 0;

                System.out.println("Enter new pin number:  ");
                pn = scan.nextInt();

                return pn;


	}//end addPin

	public int delUser(){
	
		Scanner scan = new Scanner(System.in);
        	int ud = 0;

                System.out.println("Enter account number of account you want removed:  ");
                ud = scan.nextInt();

                return ud;

	
	}//end delUser


	public double getRate(){

		Scanner scan = new Scanner(System.in);
	        double nr = 0;

                System.out.println("Enter new Interest Rate:  ");
                nr = scan.nextDouble();

                return nr;

	
	}//end getRate
	

}//end admin
