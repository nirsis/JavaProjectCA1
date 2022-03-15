package Iterators;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import Bigs.Big;
import Depots.Depot;
import Depots.DepotFactory;
import Depots.Types;

public class DepotIterator {
	
	//Iterator pattern to hide the process of populating the arrays of depots from companies
	private Big b;
	private ArrayList<Depot> productA = new ArrayList<>();
	private ArrayList<Depot> productB = new ArrayList<>();
	private ArrayList<Depot> productC = new ArrayList<>();
	private int randomCash;
	private int randomPrice; 
	private int stock; 
	
	//The iterator constructor needs to be passed a Big class so it can check whether the product is native or not
	public DepotIterator(Big b) {
		this.b = b;
		
	}

	//Iterator methods for the 3 types of depot, values of stock, delivery price, product price and starting cash are set randomly using the 
	//ThreadLocalRandom class respecting the instructed ranges
	//Once a depot is created is given a depot number equal to i+1
	public ArrayList<Depot> iteratorA() {		
			
			for(int i = 0; i < 50; i++) {
				if(b.getType() != Types.A) {
					stock = ThreadLocalRandom.current().nextInt(15, 50 + 1);
				}else {
					stock = ThreadLocalRandom.current().nextInt(3, 40 + 1);
				}
				randomCash = ThreadLocalRandom.current().nextInt(50, 100 + 1);
				randomPrice = ThreadLocalRandom.current().nextInt(1, 10 + 1);
				
				
				Depot d = DepotFactory.getDepot(Types.A, b.getType(), randomPrice, randomPrice, randomCash, stock);
				d.setDepNum(i+1);
				productA.add(d);
			}
			return productA;
	}
	
	public ArrayList<Depot> iteratorB() {		
		
		for(int i = 0; i < 50; i++) {
			if(b.getType() != Types.B) {
				stock = ThreadLocalRandom.current().nextInt(15, 50 + 1);
			}else {
				stock = ThreadLocalRandom.current().nextInt(3, 40 + 1);
			}
			randomCash = ThreadLocalRandom.current().nextInt(50, 100 + 1);
			randomPrice = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			
			Depot d = DepotFactory.getDepot(Types.B, b.getType(), randomPrice, randomPrice, randomCash, stock);
			d.setDepNum(i+1);
			productB.add(d);
		}
		return productB;
		
	}
	public ArrayList<Depot> iteratorC() {		
		
		for(int i = 0; i < 50; i++) {
			if(b.getType() != Types.C) {
				stock = ThreadLocalRandom.current().nextInt(15, 50 + 1);
			}else {
				stock = ThreadLocalRandom.current().nextInt(3, 40 + 1);
			}
			randomCash = ThreadLocalRandom.current().nextInt(50, 100 + 1);
			randomPrice = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			
			
			Depot d = DepotFactory.getDepot(Types.C, b.getType(), randomPrice, randomPrice, randomCash, stock);
			d.setDepNum(i+1);
			productC.add(d);
		}
	return productC;	
	}
	}

