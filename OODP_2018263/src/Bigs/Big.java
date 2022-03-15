package Bigs;

import java.util.ArrayList;

import Depots.Depot;
import Depots.Types;

public interface Big {
//Big interface to allow polymorphism between Big classes
	
   public ArrayList<Depot> getDepots(Types type);
   public Types getType();
   
}
