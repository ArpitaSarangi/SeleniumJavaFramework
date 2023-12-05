package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {


		//if-else
		
		int[] arr2= {1,2,11,26,598,7,6,321,67,9};
		
		for(int i=0;i<arr2.length;i++) {
		if(arr2[i] %2 ==0) {
			System.out.println(arr2[i]+" -Even Number");
			//break;
		}else {
			System.out.println(arr2[i]+ " -Odd number");
		}
	}
		
		System.out.println("*********************");
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("1");
		al.add("Arpita");
		al.add("employee id");
		al.remove(1);
		al.add(1,"Amba");
		System.out.println(al.get(0));
		
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("********************************");
		for(String i:al) {
			System.out.println(i);
		}
		
		System.out.println("****************************************");
		//Item present in ArrayList or not
		System.out.println(al.contains("selenium"));
		
		System.out.println("****************************************");
		//ArrayList to Array
		String[] m=new String[al.size()];
		m=al.toArray(m);
		for(String p:m) {
		System.out.println(p);
		}
		System.out.println("****************************************");
		//Array to List conversion
		String name[]= {"Amba","Panasa","Kakharu","Allo"};
		List<String> list=Arrays.asList(name);
		/*for(String s:list) {
			System.out.println(s);
		}*/
			System.out.println(list);
	}

}
