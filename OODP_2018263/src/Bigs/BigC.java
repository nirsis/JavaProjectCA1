package Bigs;

import java.util.ArrayList;
import Depots.Depot;
import Depots.Types;
import Iterators.DepotIterator;

public class BigC implements Big {
	
	private Types bigType = Types.C;
	private ArrayList<Depot> productA = new ArrayList<>();
	private ArrayList<Depot> productB = new ArrayList<>();
	private ArrayList<Depot> productC = new ArrayList<>();
	private DepotIterator di;
	
	
	
	public BigC() {		
		di = new DepotIterator(this);
		productA = di.iteratorA();
		productB = di.iteratorB();
		productC = di.iteratorC();
	}
	
	public Types getType() {
		return this.bigType;
	}

	@Override
	public ArrayList<Depot> getDepots(Types type) {
		
		switch(type) {

		case A: return productA;
		
		case B: return productB;
		
		case C: return productC;
		
		}
		
		
		return null;
	}

	}
