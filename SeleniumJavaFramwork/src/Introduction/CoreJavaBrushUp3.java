package Introduction;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// String is an Object in Java
		//String literal creation in String Pool
		String s= "Rahul Shetty Academy";
		String s1="Rahul Shetty Academy";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println("****************************");
		
		//String creation in Heap
		String s2=new String("Rahul Shetty Academy");
		String s3=new String("Rahul Shetty Academy");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println("*****************************");
		
		System.out.println(s==s3);
		System.out.println(s.equals(s3));

		System.out.println("*****************************");
		String a="Arpita Sarangi mama";
		String[] splittedString=a.split(" ");
		for(String p:splittedString)
		System.out.println(p);
		
		System.out.println("*****************************");
		String[] splittedString1=s.split("Shetty");
		System.out.println(splittedString1[0]);
		System.out.println(splittedString1[1]);
		System.out.println(splittedString1[1].trim());
		
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("*****************************");
		
		//Print char[] in rverse
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

}
