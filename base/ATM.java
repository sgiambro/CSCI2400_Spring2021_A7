import java.util.*;

public class ATM{

	double balC;
	double balS;
	double r;
	int t;

	public ATM(){
		balC = 0;
		balS = 0;
		r = 0;
		t = 1;
	}//end constructor
	
	public void setInterest(double x){
		r = x;
	}//end setInterest

	public double getBalC(){
		return balC;
	}//end getBalC

	public void depositC(double amount){
		balC += amount;
	}//end depositC

	public void withdrawC (double amount){
		balC -= amount;
	}//end withdrawC

	public double getBalS(){
		return (balS*(1+(r*t)));
	}//end getBalS

	public void depositS(double amount){
		balS += amount;
	}//end depositS

	public void withdrawS(double amount){
		balS -= amount;
	}//end withdrawS

	public int exit(){
		return 999;
	}//end exit

}//end ATM
