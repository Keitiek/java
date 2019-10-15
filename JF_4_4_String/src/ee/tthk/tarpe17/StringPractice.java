package ee.tthk.tarpe17;


public class StringPractice {
	public static void main(String [] args) {
	String myString = "abc";
	String s1 = "ABC";
	String s2 = new String ("DEF");
	String s3 = "AB" + "C";
	//a. s1.compareTo(s2);
	System.out.println(s1.compareTo(s2));
	//b. s2.equals(s3);
	System.out.println(s2.equals(s3));
	//c. s3 == s1;
	System.out.println(s3 == s1);
	//d. s2.compareTo(s3);
	System.out.println(s2.compareTo(s3));
	//e. s3.equals(s1)
	System.out.println(s3.equals(s1));
	
	}
}
