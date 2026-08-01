package com.hash.set.exp7;

class Data{
	String name;

	public Data(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 142331;
	}
	
	@Override
	public boolean equals(Object obj) {
		Data data = (Data) obj;
		return this.name.equals(data.name);
	}
}


public class HashSet {
    public static void main(String[] args) {
		String s1 = "Kodewala";
		String s2 = "Academy";
		System.out.println(s1.hashCode()+" And "+s2.hashCode());
		
		Data data1 = new Data("Kodewala");
		Data data2 = new Data("Kodewala");
		System.out.println("data1: "+data1.hashCode()+" data2 "+data2.hashCode()+" "+data1.equals(data2));
	}
}
