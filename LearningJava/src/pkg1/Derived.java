package pkg1;
import pkg2.Derived;
import pkg2.Protection;
import pkg2.SamePackage;

public class Demo {

	public static void main(String[] args) {
		Protection obj1 = new Protection();
	      Derived obj2 = new Derived();
	      SamePackage obj3 = new SamePackage();
	}

}

