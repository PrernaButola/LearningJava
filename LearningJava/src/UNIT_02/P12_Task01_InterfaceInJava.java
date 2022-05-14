package UNIT_02;

/*
-An interface is a completely(100%) "abstract class",
-that is used to group related methods with empty bodies

-Nedd of interface?
-multiple interface can be implemented at the same time in one class?

- can an interface extends another interface?
*/

//interface (100% abstract class)
interface Animal{
	public void animalSound(); //interface method (does not have a body)
	public void run(); // interface method (does not  have a body)
}

//interface
interface Human{
	public void humanSound(); // interface method (does not have a body) 
	public void run1(); // interface method (does not  have a body)
}

public class P12_Task01_InterfaceInJava {

	public static void main(String[] args) {
		
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
	}
	
	public void run() {
		
	}

}
