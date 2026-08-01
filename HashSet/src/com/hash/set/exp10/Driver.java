package com.hash.set.exp10;

import java.util.HashSet;

class Amazon{
	String item;

	public Amazon(String item) {
		super();
		this.item = item;
	}
	
	@Override
	public int hashCode() {
		return 143321;
	}
}

// Balanced Tree - > Set Size Will Be 64
public class Driver {
    public static void main(String[] args) {
		HashSet<Amazon> items = new HashSet<Amazon>(64);
		Amazon item1 = new Amazon("Laptop");
		Amazon item2 = new Amazon("Camera");
		Amazon item3 = new Amazon("Tablet");
		Amazon item4 = new Amazon("Pendrive");
		Amazon item5 = new Amazon("Charger");
		Amazon item6 = new Amazon("Earphone");
		Amazon item7 = new Amazon("Earbuds");
		Amazon item8 = new Amazon("Hard Drive");
		
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		items.add(item8);
		
		Amazon item9 = new Amazon("MacBook");
		items.add(item9);
		items.remove(item4);
		items.remove(item3);
		items.remove(item2);
		items.remove(item6);
		items.remove(item7);
		items.remove(item8);
		items.remove(item1);
		items.remove(item5);
		
	
	}
}
