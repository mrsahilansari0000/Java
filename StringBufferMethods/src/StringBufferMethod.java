
public class StringBufferMethod {

	public static void main(String[] args) {
		
		//1. Append() Method
        StringBuffer s1 = new StringBuffer("Hello");
        s1.append(" World");
        System.out.println(s1);
        
        //2. length() Method
        StringBuffer s2 = new StringBuffer("Hello");
        int length = s2.length();
        System.out.println(length);
        
        //3. capacity() Method
        StringBuffer s3 = new StringBuffer("Hello");
        int capacity = s3.capacity();
        System.out.println(capacity);
        
        //4. charAt() Method
        StringBuffer s4 = new StringBuffer("Hello");
        System.out.println(s4.charAt(2));
        
        //5. delete() Method
        StringBuffer s5 = new StringBuffer("Hello World");
        System.out.println(s5.delete(0, 6));
        
        //6. deleteCharAt() Method
        StringBuffer s6 = new StringBuffer("Hello World");
        System.out.println(s6.deleteCharAt(5));
        
        //7. ensureCapacity() Method
        StringBuffer s7 = new StringBuffer("Hello World");
        s7.ensureCapacity(25);
        System.out.println(s7.capacity());
        
        //8. insert() Method
        StringBuffer s8 = new StringBuffer("Hello World");
        s8.insert(5, " Kodewala");
        System.out.println(s8);
        
        //9. reverse() Method
        StringBuffer s9 = new StringBuffer("Hello World");
        s9.reverse();
        System.out.println(s9);
        
        //10. replace() Method
        StringBuffer s10 = new StringBuffer("Hello World");
        s10.replace(0, 5, "Kodewala");
        System.out.println(s10);
        
	}

}
