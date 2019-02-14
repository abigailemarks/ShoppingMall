import java.util.*;

import ls.java.menu.LSMenu;

public class NatickCollection extends Mall {
	ArrayList<Store> StoreList = new ArrayList<Store>();

	public NatickCollection() {
		super("Natick Collection");

	}

	public ArrayList<Store> makestores() {
		Store Apple = new Apple();
		StoreList.add(Apple);
		Store Nordstroms = new Nordstroms();
		StoreList.add(Nordstroms);
		Store Wegmans = new Wegmans();
		StoreList.add(Wegmans);
		Store AmericanGirl = new AmericanGirl();
		StoreList.add(AmericanGirl);
		Store Justice = new Justice();
		StoreList.add(Justice);
		return StoreList;
	}
}
