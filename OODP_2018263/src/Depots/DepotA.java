package Depots;

public class DepotA implements Depot {
	
	//Attributes of class depot
	private int depNum;
	private int deliveryPrice;
	private int productPrice;
	private int cash;
	private int stock;
	private boolean canTrade = true;
	private Types BigType;
	
	//Constructor of class depot
	public DepotA(Types type, int deliveryPrice, int productPrice, int cash, int stock) {
		
		this.BigType = type;
		this.deliveryPrice = deliveryPrice;
		this.productPrice = productPrice;
		this.cash = cash;
		this.stock = stock;
	}
	
	//Getters and setters from necessary attributes
	@Override
	public int getStock() {

		return stock;
	}

	@Override
	public int getDepNum() {
		// TODO Auto-generated method stub
		return this.depNum;
	}

	@Override
	public int getProductPrice() {
		// TODO Auto-generated method stub
		return this.productPrice;
	}

	@Override
	public int getDeliveryPrice() {
		// TODO Auto-generated method stub
		return this.deliveryPrice;
	}

	@Override
	public int getCash() {
		// TODO Auto-generated method stub
		return this.cash;
	}

	@Override
	public void setDepNum(int depNum) {
		this.depNum = depNum;
		
	}

	@Override
	public void setStock(int stock) {
		this.stock = stock;
		
	}

	@Override
	public void setCash(int cash) {
		this.cash = cash;
		
	}
	
	@Override
	public Types getType() {
		return BigType;
	}
	
	//Method that checks if the product is the native one and also ensures that the stock never goes under or above the minimum and maximum values
	public boolean canTrade() {
		
		if(BigType == Types.A) {
			if(stock<16 || stock > 50) {
				this.canTrade = false;
			}
		}else {
			if(stock<3 || stock > 40) {
				this.canTrade = false;
			}
		}
		return canTrade;
	}
}
