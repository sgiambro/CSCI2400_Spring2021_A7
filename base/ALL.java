import java.util.*;

public class ALL{
	public static void main(String[] args){
		
		ArrayList<USER> userList = new ArrayList<USER>();

		Scanner scan = new Scanner(System.in);
		int pin = 0;
		int index = 0;

		ADMIN ad = new ADMIN();
		userList.add((USER)ad);

		userList.add(new USER(57684 , 88335));

		while(pin != 99999){		

		System.out.print("Enter your PIN or 99999 to exit:      ");
		pin = scan.nextInt();
		
		for(int i=0;i<userList.size()-1;i++){
			if(userList.get(i).getPin() == pin){
				index = i;
				break;
			}
			index = -1;
		}


		if(pin == 12345 && index >= 0){

                int num = 0;
		int a = 0;
		int p = 0;
		int u = 0;
		double r = 0;
                int run = 777;

                while (run == 777){

                        num = userList.get(index).menu();

                        if(num == 1){
                         	a = ad.addAcc();
				p = ad.addPin();

				userList.add(new USER(a,p));       
                        }

                        else if(num == 2){
                         	u = ad.delUser();

				for(int i=0;i<userList.size()-1;i++){
					if(userList.get(i).getID() == u){
							userList.remove(u);
					}	
				}       
                        }

                        else if(num == 3){
                         	 for (int i=1; i<(userList.size()-1);i++){

				        System.out.print("| " + userList.get(i).getID() + " ");

       				 }//end for

				 System.out.println("|\n");
       
                        }

                        else if(num == 4){
                         	r = ad.getRate();

				for(int i=0;i<userList.size()-1;i++){
					userList.get(i).setRate(r);
				}
		       
                        }

                        else if(num == 5){
				run = userList.get(index).exit();
			}

                        else{
                                System.out.println("ERROR OPTION NOT FOUND");
                        }

                }//end while
                }//end USER if




		else if(index >= 0){

                int num = 0;
                int run = 777;

                while (run == 777){

                        num = userList.get(index).menu();

                        if(num == 1){
                                userList.get(index).getBalC();
                        }

                        else if(num == 2){
                                userList.get(index).depositC();
                        }

                        else if(num == 3){
                                userList.get(index).withdrawC();
                        }

                        else if(num == 4){
                                userList.get(index).getBalS();
                        }

                        else if(num == 5){
                                userList.get(index).depositS();
                        }

                        else if(num == 6){
                                userList.get(index).withdrawS();
                        }

                        else if(num == 7){
                                run = userList.get(index).exit();
                        }

                        else{
                                System.out.println("ERROR OPTION NOT FOUND");
                        }

		}//end while
		}//end USER if
	}//end whole while
	}//end main

}//end all
