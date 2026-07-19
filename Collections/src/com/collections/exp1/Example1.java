package com.collections.exp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Example1 {
	public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(78);
        values.add(50);
        values.add(88);
        values.add(28);
        values.add(41);
        values.add(52);
        values.add(63);
        values.add(22);
        values.add(87);
        values.add(54);
        
        System.out.println(values);
        
        Collections.sort(values);
        System.out.println(values);
        
        Collections.reverse(values);
        System.out.println(values);
        
        Collections.shuffle(values);
        System.out.println(values);
        
        int data = Collections.max(values);
        System.out.println("[ "+data+" ]");
        
        Collection<Integer> unmodifableValue =  Collections.unmodifiableCollection(values);
        unmodifableValue.remove(0);
        
        
       
        
	}
}
