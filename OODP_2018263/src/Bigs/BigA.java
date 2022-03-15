package Bigs;
import java.util.ArrayList;
import Depots.Depot;
import Depots.Types;
import Iterators.DepotIterator;


public class BigA implements Big {
	
	//Class of companies Big, they use a Enum type which can be A, B or C and an arraylist of depots that are populated using the iterator pattern
	private Types bigType = Types.A;
	private ArrayList<Depot> productA = new ArrayList<>();
	private ArrayList<Depot> productB = new ArrayList<>();
	private ArrayList<Depot> productC = new ArrayList<>();
	private DepotIterator di;
	
	
	
	public BigA() {	
		
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
