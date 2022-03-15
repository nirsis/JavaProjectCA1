package Depots;


public class DepotB implements Depot{
	
	
	private int depNum;
	private int deliveryPrice;
	private int productPrice;
	private int cash;
	private int stock;
	private Types BigType;
	private boolean canTrade = true;
	
	
	public DepotB(Types type, int deliveryPrice, int productPrice, int cash, int stock) {
		this.BigType = type;
		this.deliveryPrice = deliveryPrice;
		this.productPrice = productPrice;
		this.cash = cash;
		this.stock = stock;
	}
	
	@Override
	public int getStock() {
		return stock;
	}

	@Override
	public int getDepNum() {
		return this.depNum;
	}

	@Override
	public int getProductPrice() {
		return this.productPrice;
	}

	@Override
	public int getDeliveryPrice() {
		return this.deliveryPrice;
	}

	@Override
	public int getCash() {
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
	@Override
	public boolean canTrade() {
		
		if(BigType == Types.B) {
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
