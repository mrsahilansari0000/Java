package com.staticinstance;

public class ObjectCount {
	static int counter=0;
	ObjectCount(){
		counter++;
	}

  public static void main(String[] args) {
	  ObjectCount obj1 = new ObjectCount();
	  ObjectCount obj2 = new ObjectCount();
	  ObjectCount obj3 = new ObjectCount();
	  ObjectCount obj4 = new ObjectCount();
	  ObjectCount obj5 = new ObjectCount();
	  ObjectCount obj6 = new ObjectCount();
	  ObjectCount obj7 = new ObjectCount();
	  ObjectCount obj8 = new ObjectCount();
	  ObjectCount obj9 = new ObjectCount();
	  ObjectCount obj10 = new ObjectCount();
	  ObjectCount obj11 = new ObjectCount();
	  ObjectCount obj12= new ObjectCount();
	  
	   System.out.println("Number of Total Object Created "+counter);
}
}
