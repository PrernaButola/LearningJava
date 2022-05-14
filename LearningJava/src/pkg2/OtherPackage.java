package pkg2;

public class OtherPackage {
	OtherPackage()
	   {
	      pkg1.Protection pro = new pkg1.Protection();
	      
	      System.out.println("other package constructor");
	      
	      /* class or package only 
	      *  System.out.println("n = " + pro.n); */
	      
	      /* class only 
	      *  System.out.println("n_priv = " + pro.n_priv); */
	      
	      /* class, subclass or package only
	      *  System.out.println("n_prot = " + pro.n_prot); */
	      
	      System.out.println("n_publ = " + pro.n_publ);
	   }
}
