package Introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int myNum=5;
		String website="Rahul Shetty Academy";
		char letter='r';
		double dec=5.999;
		boolean myCard=true;
		
		System.out.println(myNum + " is the value stored in the myNum variable");
		System.out.println(website);
		
		//Arrays -
		int arr[]=new int[5];
		arr[0]=1;
		arr[1]=5;
		arr[2]=8;
		arr[3]=10;
		arr[4]=55;
			System.out.println(arr[0]);
			
		int[] arr1= {1,5,8,10,55,435435,4353,5695,3154,23};
		System.out.println(arr[2]);
		
		//for loo
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//for loop
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		String[] name= {"Arpita","Avishek","mama","bapun"};
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+" ");
		}
		
		System.out.println();
		
		//Advanced for loop
		for( String s:name) {
			System.out.print(s+" ");
		}
	}

}
