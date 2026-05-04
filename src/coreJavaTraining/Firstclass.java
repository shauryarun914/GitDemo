package coreJavaTraining;

public class Firstclass {
	
	static int a = 4;    //define variable
	
	public void getData()
	{
		System.out.println("i'm in method");
		//return "Hello";
	}
	// Objects are instances and references of the classes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Firstclass fn = new Firstclass();
		fn.getData();
		secondclass sc = new secondclass();
		sc.setData();
		System.out.println("Hello World");  //ln is to print in next line
		System.out.println("Hello Arun");
		System.out.println(a);   //if "" is not given then it will treat as variable and which should be define
	}

	Firstclass fn = new Firstclass();
	fn.getData();
	secondclass sc = new secondclass();
	sc.setData();
	System.out.println("Hello World");  //ln is to print in next line
	System.out.println("Hello Arun");
	System.out.println(a);
}
