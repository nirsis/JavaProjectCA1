package Depots;

public interface Depot {
	//Depot interface to allow polymorphism between depot classes
public int getDepNum();
public int getProductPrice();
public int getDeliveryPrice();
public int getCash();
public int getStock();
public void setDepNum(int depNum);
public void setStock(int stock);
public void setCash(int cash);
public boolean canTrade();
public Types getType();
//public void sell(Types productType);
//public void buy(Types productType);

}
