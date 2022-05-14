package pkg2;

class Protection2 extends pkg1.Protection
{
   Protection2()
   {
      System.out.println("derived other package constructor");
      
      /* class or package only 
      *  System.out.println("n = " + n); */
      
      /* class only
      *  System.out.println("n_priv = " + n_priv); */
      
      System.out.println("n_prot = " + n_prot);
      System.out.println("n_publ = " + n_publ);
   }
}
