package Bigs;

import Depots.Types;

public class BigFactory {
	//Factory pattern to instantiate any Big class, it chooses what type of Big it is using the Enum Types.

    public static Big getBig(Types bigType){        
    	
        if (bigType.equals(Types.A)){
            return new BigA();
        }
        else if(bigType.equals(Types.B)){
        	return new BigB();
        }
        else if(bigType.equals(Types.C)){
        	return new BigC();
        }
        return null;
    }
	
}
