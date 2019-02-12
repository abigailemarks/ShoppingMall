
public class Items {

	String name;
	double price;
	String storeName;
	boolean returnable;
	public Items(String name, double price, String storeName, boolean returnable) {
		this.name = name;
		this.price = price;
		this.storeName=storeName;
		this.returnable=returnable;
	}
	@Override
	public String toString() {
		return name;
}
}
