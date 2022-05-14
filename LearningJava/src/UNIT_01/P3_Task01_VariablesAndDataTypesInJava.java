package UNIT_01;

public class P3_Task01_VariablesAndDataTypesInJava {
	static int q=11;
	int p=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//valid Declaration
		int a,b,c;
		float pi;
		double d;
		char e;
		
		//Valid Initializations
		pi= 3.14f;
		d= 20.2d;
		e='v';
		
		a=10;
		b=10;
		c=10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum= 5; //Integer (whole number)
		float myFloatNum= 5.99f; //Floating point number
		char myLetter= 'd'; //character
		boolean myBool= true; //Boolean
		String myText= "Hello"; //String
		
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		/*
		 * Java variable Type conversion & Type  Casting: Details are in OneNote
		 */
		
		double f;
		int i=10;
		f=i; //Type conversion
		
		double g=10;
		int k;
		k= (int) g; //Type Casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(k);
		
		byte h=10; //1 Byte
		boolean l=true; //1 bit = true or false only
		long m= 10L;
		float n= 1.2f;
		double o=1.2d;
		
		
		System.out.println(h);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(ABC.k); // data+ function/methods
		//ABC.display();
		
		ABC obj1= new ABC();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABC obj2= new ABC();
		System.out.println(obj2.i);
		
		//System.out.println(onj1.k++);
		//System.out.println(obj1.k);
		//System.out.println(obj2.k);
		
		ABC.typeConversionAndTypeCasting();
		
	}
	
	int r =10;
	void display() {
		int a= 5; //local variable
		System.out.println("This is Display Method");
		System.out.println(a);
	}
}

class ABC{
	static int k=10;// class variable/static variable
	int i= 10; // instant variable
	 static void display() {
		 
		 int a=5; //local variable
		 System.out.println("this is display method!");
		 typeConversionAndTypeCasting();
		 
		 
	 }
	 
	 static void typeConversionAndTypeCasting() {
		 /*
		  * double f; //8 bytes = 64 bits/ slots int i=10; // 4 bytes =32 bits/slots f=i; //sysoutprintln(f);
		  * 
		  * double g=10; //64 int j; //32 j= (int g);
		  */
		 
		 double f; //64 slots
		 int i=10; //32 slots
		 f=i; //Type conversion
		 System.out.println(f);
		 
		 double g=10;//64
		 int k; //32
		 k= (int)g; //Type casting
		 
		 //32 bits= 64 bits
		 System.out.println(i);
		 System.out.println(k);
		 
	 }
}

