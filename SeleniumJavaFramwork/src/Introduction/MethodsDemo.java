package Introduction;


public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo d=new MethodsDemo();
		String name=d.getData();
		System.out.println(name);
		
		System.out.println("---------------------------------------");
		
		MethodsDemo2 d2=new MethodsDemo2();
		String name2=d2.getUserData();
		System.out.println(name2);
		
		
		System.out.println("----------------------------------------");
		
		getData2();
	}
	
	public String getData() {
		System.out.println("Hello World");
		return "rahul shetty";
		
	}
	
	public static void getData2() {
		System.out.println("Static method");
	}

}
