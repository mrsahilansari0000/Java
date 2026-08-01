
public class InternMethod {
  public static void main(String[] args) {
	
	  String s1 = "Kodewala"; // 1 Obj in SCP
	  String s2 = "Academy";  // 1 Obj in SCP
	  String s3 = s1+s2; // Object Created In Heap
	  String s4 = s3.intern(); // Check the refrence in scp when its exits it returns the Refrence to the String, Copy / Move the Object(s3) from Heap to Scp. And Both refrence s3 and s4 point in SCP. so s3==s4 --> true
//	  String s5 = new String("Kodewala Academy"); // Obj Created in Heap. And Kodewala Academy is already in SCP so it not create new Object
//	  String s6 = new String("Kodewala Academy");
	  String s7 = new String(s4);
//	  System.out.println(s3==s4);
//	  System.out.println(s4==s5);
//	  System.out.println(s5==s6);
	  System.out.println(s4==s7);
}
}
