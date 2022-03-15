package Depots;


public class DepotFactory {
	
	//Factory pattern to instantiate any different type of depot using the DepotFactory class, it chooses what kind of depot it is using the Enum Types.
	
    public static Depot getDepot(Types depotType, Types bigType, int deliveryPrice, int productPrice, int cash, int stock){        
    	
        if (depotType.equals(Types.A)){
            return new DepotA(bigType, deliveryPrice, productPrice, cash, stock);
        }
        else if(depotType.equals(Types.B)){
            return new DepotB(bigType, deliveryPrice, productPrice, cash, stock);
        }
        else if(depotType.equals(Types.C)) {
        	return new DepotC(bigType, deliveryPrice, productPrice, cash, stock);
        }
        return null;
    }

}
