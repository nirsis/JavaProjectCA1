import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import Bigs.Big;
import Bigs.BigFactory;
import Depots.Depot;
import Depots.Types;

public class CLI {
	
	
	Big bigA;
	Big bigB;
	Big bigC;
	ArrayList<Depot> BigAdepotsA;
	ArrayList<Depot> BigAdepotsB;
	ArrayList<Depot> BigAdepotsC;
	ArrayList<Depot> BigBdepotsA;
	ArrayList<Depot> BigBdepotsB;
	ArrayList<Depot> BigBdepotsC;
	ArrayList<Depot> BigCdepotsA;
	ArrayList<Depot> BigCdepotsB;
	ArrayList<Depot> BigCdepotsC;
	ArrayList<String> display1 = new ArrayList<>();
	ArrayList<String> display2 = new ArrayList<>();
	ArrayList<String> display3 = new ArrayList<>();
	int input1;
	int input2;
	
	

	public CLI() {
		
		initialize();	
		operations();	
		
		//Nested Do-While loop that keeps displaying the options until enters a valid input and chooses a given option
        do {
            do {
                displayOptions();
                input1 = userInput();
                actionController(input1);
            } while (!validNumber(input1));
        } while (input1 != 0);	
	}
	
	public void initialize() {
		
		//Method to load all the companies and depots on memory as soon as the program starts
		bigA = BigFactory.getBig(Types.A);
		bigB = BigFactory.getBig(Types.B);
		bigC = BigFactory.getBig(Types.C);
		BigAdepotsA = bigA.getDepots(Types.A);
		BigAdepotsB = bigA.getDepots(Types.B);
		BigAdepotsC = bigA.getDepots(Types.C);
		BigBdepotsA = bigB.getDepots(Types.A);
		BigBdepotsB = bigB.getDepots(Types.B);
		BigBdepotsC = bigB.getDepots(Types.C);
		BigCdepotsA = bigC.getDepots(Types.A);
		BigCdepotsB = bigC.getDepots(Types.B);
		BigCdepotsC = bigC.getDepots(Types.C);
		
		
	}
	
	
	public void actionController(int option) {
		//Method to choose an action
    	try {
    		
    	SimpleWriter sw = SimpleWriter.getInstance();

        switch (option) {
            case 1: //Display all transactions
            	
            	for(String string : display1) {
            		sw.write(string);
            		sw.write(System.getProperty( "line.separator" ));
            		System.out.println(string);
            	}
          
            	
            	
            break;
            case 2: //Display native product stock of a company
        		System.out.println("Choose a company to display");
        		System.out.println("1- For company A");
        		System.out.println("2- For company B");
        		System.out.println("3- For company C");
        		System.out.println("4- to Display options again");
        		System.out.println("0- To exit the program");
            	input2 = userInput();
            	getNative(input2);         		

            break;  
            case 3:	// Display external product stock of a company
        		System.out.println("Choose a company to display");
        		System.out.println("1- For company A");
        		System.out.println("2- For company B");
        		System.out.println("3- For company C");
        		System.out.println("4- to Display options again");
        		System.out.println("0- To exit the program");
                	input2 = userInput();
                    	getExternal(input2);  
            	
            	
            break;
            case 4: // Display cash balance of a company 
        		System.out.println("Choose a company to display");
        		System.out.println("1- For company A");
        		System.out.println("2- For company B");
        		System.out.println("3- For company C");
        		System.out.println("4- to Display options again");
        		System.out.println("0- To exit the program");
                	input2 = userInput();
                    	getTotal(input2);            	
            
            case 0: // Terminate the program
                System.exit(0);
        }    	
        }catch(Exception e) {
    		e.printStackTrace();
    	}

        }
	public void getExternal(int option) {
		// Method to display the external product of a given company, if the company is Big A it will only display depots B and C from Big A, depots A and C for big B, etc.
		// This loops through the arrays of depots from each company and prints the stock
		if(option == 1) {
        	for(Depot d : BigAdepotsB) {
        		System.out.println("For company Big A depot B "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}
         	for(Depot d : BigAdepotsC) {
        		System.out.println("For company Big A depot C "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}

	    	}
	    else if(option == 2) {         		
        	for(Depot d : BigBdepotsA) {
        		System.out.println("For company Big B depot A "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}
         	for(Depot d : BigBdepotsC) {
        		System.out.println("For company Big A depot C "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}
	        

	    	}
	    else if(option == 3) {
	    	
        	for(Depot d : BigCdepotsA) {
        		System.out.println("For company Big C depot A "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}
         	for(Depot d : BigCdepotsB) {
        		System.out.println("For company Big C depot B "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}
	    	
	    	
	    	}
	    	else if(option == 4) {
	    		
	    		System.out.println("Choose a company to display");
	    		System.out.println("1- For company A");
	    		System.out.println("2- For company B");
	    		System.out.println("3- For company C");
	    		System.out.println("4- to Display options again");
	    		System.out.println("0- To exit the program");

	    		
	    	}
	    	else if (option == 0) {
	    		System.exit(0);
	    	}
	}
	
	public void getNative(int option) {
		// Method to display the native product of a given company, if the company is Big A it will only display depots A from Big A, etc.
		// This loops through the arrays of depots from each company and prints the stock
		if(option == 1) {
        	for(Depot d : BigAdepotsA) {
        		System.out.println("For company Big A depot "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}

	    	}
	    else if(option == 2) {         		
        	for(Depot d : BigBdepotsB) {
        		System.out.println("For company Big B depot "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}
	        

	    	}
	    else if(option == 3) {
	    	
        	for(Depot d : BigCdepotsC) {
        		System.out.println("For company Big C depot "+d.getDepNum()+ " the stock is: "+d.getStock());
        	}
	    	
	    	
	    	}
	    	else if(option == 4) {
	    		
	    		System.out.println("Choose a company to display");
	    		System.out.println("1- For company A");
	    		System.out.println("2- For company B");
	    		System.out.println("3- For company C");
	    		System.out.println("4- to Display options again");
	    		System.out.println("0- To exit the program");

	    		
	    	}
	    	else if (option == 0) {
	    		System.exit(0);
	    	}
		
	}
	
	public void getTotal(int option) {
		
		// Method to display the available cash for every depot of a given company and also the combined amount
		// This loops through the arrays of depots from each company and prints the cash, also every iteration of the loop adds its value to the total		
		
		int total = 0;
    	if(option == 1) {
    	
    	for(Depot d : BigAdepotsA) {
    		System.out.println("For company Big A depotA "+d.getDepNum()+ " the cash is: "+d.getCash());
    		total = total+d.getCash();	
    	}
    	for(Depot d : BigAdepotsB) {
    		System.out.println("For company Big A depotB "+d.getDepNum()+ " the cash is: "+d.getCash());
    		total = total+d.getCash();	
    	}
    	for(Depot d : BigAdepotsC) {
    		System.out.println("For company Big A depotC "+d.getDepNum()+ " the cash is: "+d.getCash());
    		total = total+d.getCash();	
    	}
    	System.out.println("Total cash of company A is: "+total);
    	total = 0;
    	}
    	else if(option == 2) {         		
    	
        	for(Depot d : BigBdepotsA) {
        		System.out.println("For company Big B depotA "+d.getDepNum()+ " the cash is: "+d.getCash());
        		total = total+d.getCash();	
        	}
        	for(Depot d : BigBdepotsB) {
        		System.out.println("For company Big B depotB "+d.getDepNum()+ " the cash is: "+d.getCash());
        		total = total+d.getCash();	
        	}
        	for(Depot d : BigBdepotsC) {
        		System.out.println("For company Big B depotC "+d.getDepNum()+ " the cash is: "+d.getCash());
        		total = total+d.getCash();	
        	}
        	System.out.println("Total cash of company B is: "+total);
        	total = 0;
    	}
    	else if(option == 3) {
    		
        	for(Depot d : BigCdepotsA) {
        		System.out.println("For company Big C depotA "+d.getDepNum()+ " the cash is: "+d.getCash());
        		total = total+d.getCash();	
        	}
        	for(Depot d : BigCdepotsB) {
        		System.out.println("For company Big C depotB "+d.getDepNum()+ " the cash is: "+d.getCash());
        		total = total+d.getCash();	
        	}
        	for(Depot d : BigCdepotsC) {
        		System.out.println("For company Big C depotC "+d.getDepNum()+ " the cash is: "+d.getCash());
        		total = total+d.getCash();	
        	}
        	System.out.println("Total cash of company C is: "+total);
        	total = 0;
    	}
    	else if(option == 4) {
    		
    		System.out.println("Choose a company to display");
    		System.out.println("1- For company A");
    		System.out.println("2- For company B");
    		System.out.println("3- For company C");
    		System.out.println("4- to Display options again");
    		System.out.println("0- To exit the program");

    		
    	}
    	else if (option == 0) {
    		System.exit(0);
    	}
	}
	
    public int userInput() {
    	//Method using BufferedReader to read input from the user, validating that the user inputs only a integer, if input is not valid this will return -1 and keep the loop going
        int input;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            System.out.println("That's not a valid option");
            input = -1;
        }

        return input;
    }
    
    public boolean validNumber(int number) {   
    	//validation for user input
        return number >= 0 && number <= 4;
    }
    
    public void displayOptions() {
    	//Prompt the user the available options
    	System.out.println("Transaction simulation completed, choose an option display information about");
        System.out.println("1- Display all transactions");
        System.out.println("2- Display native product stock of a company");
        System.out.println("3- Display external product stock of a company");
        System.out.println("4- Display cash balance of a company");
        System.out.println("0- Terminate the program");
    	
    }

    
    //Method to perform the simulation of trading stock between companies (its not complete)
    public void operations() {

    	//Sell all native products by using a nested loop and subtracting 1 every inner loop until the method canTrade() from the depot class returns false.
    	//When the inner loop finishes moves to the next depot of the company.
    	//This is done 3 times, once per company
    	for(Depot dA : BigAdepotsA){    		
   		 while(dA.canTrade()) {   		
   			dA.setCash(dA.getCash()+dA.getProductPrice()+dA.getDeliveryPrice());
   			dA.setStock(dA.getStock()-1);
   			display1.add("Depot A "+dA.getDepNum() +" traded 1 product A for "+(dA.getProductPrice()+dA.getDeliveryPrice())+"$. New balance is "+dA.getCash()+", stock remaining is "+dA.getStock());    			
   		 }}
    	
     	for(Depot dB : BigBdepotsB){    		
      		 while(dB.canTrade()) {   		
      			dB.setCash(dB.getCash()+dB.getProductPrice()+dB.getDeliveryPrice());
      			dB.setStock(dB.getStock()-1);
      			display1.add("Depot B "+dB.getDepNum() +" traded 1 product B for "+(dB.getProductPrice()+dB.getDeliveryPrice())+"$. New balance is "+dB.getCash()+", stock remaining is "+dB.getStock());    			
      		 }}
     	for(Depot dC : BigCdepotsC){    		
     		 while(dC.canTrade()) {   		
     			dC.setCash(dC.getCash()+dC.getProductPrice()+dC.getDeliveryPrice());
     			dC.setStock(dC.getStock()-1);
     			display1.add("Depot C "+dC.getDepNum() +" traded 1 product C for "+(dC.getProductPrice()+dC.getDeliveryPrice())+"$. New balance is "+dC.getCash()+", stock remaining is "+dC.getStock());
     		 }}
     	
     	//Use cash to buy other products (not implemented)
     	

    	
    
    		
    	}
    



} 

