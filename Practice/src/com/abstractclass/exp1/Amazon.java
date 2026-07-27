package com.abstractclass.exp1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Amazon extends Ecommerce {

	static Scanner sc = new Scanner(System.in);

	ArrayList<String> itemList = new ArrayList<String>();

	ArrayList<Integer> itemPrice = new ArrayList<Integer>();

	ArrayList<String> addToCart = new ArrayList<String>();

	public void showItem() {

		itemList.add("HeadPhone");
		itemList.add("Pendrive");
		itemList.add("Mouse");
		itemList.add("Earphone");
		itemList.add("Keyboard");

		itemPrice.add(1500);
		itemPrice.add(700);
		itemPrice.add(550);
		itemPrice.add(650);
		itemPrice.add(850);

		Iterator<String> itrItem = itemList.iterator();
		Iterator<Integer> itrPrice = itemPrice.iterator();
		while (itrItem.hasNext() && itrPrice.hasNext()) {
			String itemName = itrItem.next();
			int itemAmount = itrPrice.next();

			System.out.println(itemName + " : " + itemAmount);
		}

	}

	@Override
	public void addToCart() {
		int amount = 0;
		System.out.println("Add Item To Cart: ");
		String cartItem = sc.nextLine();
		cartItem = sc.nextLine();
		for (int i = 0; i < itemList.size(); i++) {
			if (cartItem.equals(itemList.get(i))) {
				addToCart.add(cartItem);
				amount = amount + itemPrice.get(i);
			}
		}

		System.out.println(amount);
	}

	@Override
	public void upi() {

	}

	@Override
	public void netBanking() {

	}

}
