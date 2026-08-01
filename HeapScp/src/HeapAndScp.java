
public class HeapAndScp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+s2;
        String s4 = s1.concat("World");
        String s5 = s1.concat(s2);
        String s6 = s1.concat(s2);
        String s7 = new String("Hello World");
        String s8 = new String("Hello World");
        String s9 = "Hello World";
        String s10 = "Hello World";
        String s11 = "Hello"+" World";
        String s12 = "Hello World";
        String s13 = s10.intern();
        System.out.println(s12==s13);
       
        
        
	}

}
