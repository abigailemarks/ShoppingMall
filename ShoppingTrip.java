
public class ShoppingTrip {

	public static void main(String[] args) {
		Mall theMall = new NatickCollection();
		Shopper theShopper = new Shopper( "abigail", 6000, null);

		theShopper.visit(theMall);

	}

}
