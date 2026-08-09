package com.test;

public class RectangleArea {

   public int rectArea(int _length, int _breadth) {
	   int area = _length*_breadth;
	   return area;
   }
   
   public static int rectPer(int _length, int _breadth) {
	   int per = 2*(_length+_breadth);
	   return per;
   }
	
	
   public static void main(String[] args) {
	   RectangleArea area = new RectangleArea();
	   int ans = area.rectArea(52, 58);
	   System.out.println(ans);
	   
	   int perm = RectangleArea.rectPer(10, 10);
	   System.out.println(perm);
	   
}
}
