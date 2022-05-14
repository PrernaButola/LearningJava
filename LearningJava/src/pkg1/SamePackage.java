package pkg1;

public class SamePackage {
	SamePackage()
	   {
	      Protection pro = new Protection();
	      System.out.println("same package constructor");
	      System.out.println("n = " + pro.n);
	      
	      /* class only
	      *  System.out.println("n_priv = " + pro.n_priv); */
	      
	      System.out.println("n_prot = " + pro.n_prot);
	      System.out.println("n_publ = " + pro.n_publ);
	   }
}
