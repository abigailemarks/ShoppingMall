
public class Items {

	String name;
	double price;
	String storeName;
	public Items(String name, double price, String storeName) {
		this.name = name;
		this.price = price;
		this.storeName=storeName;
	
	}
	@Override
	public String toString() {
		return name;
}
}
