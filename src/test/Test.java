
package test;

import java.util.Scanner;

public class Test {

     public static void main(String[] args) {
          
          Scanner s = new Scanner (System.in);
          Scanner t = new Scanner (System.in);
          
 Calculator c = new Calculator(); 
 /* System.out.println("Lista opcija:");
 System.out.println("sabiranje 2 broja: add");
 System.out.println("oduzimanje 2 broja: sub");
 System.out.println("množenje 2 broja: mul");        
 System.out.println("dijeljenje 2 broja: div");        
 System.out.println("sabiranje 3 broja: add3");        
 System.out.println("oduzimanje 3 broja: sub3");        
 System.out.println("množenje 3 broja: mul3");        
 System.out.println("dijeljenje 3 broja: div3");
*/
 System.out.println("Odaberite željenu operaciju, a potom unosite brojeve");
 
System.out.println("Da li želite da saberete dva broja? Molimo unesite da ili ne");
 String operacija = t.nextLine();
		if (operacija.equals("da"))
                                        
                           	System.out.println(c.add(s.nextDouble(), s.nextDouble()));
                  	else
                     System.out.println("Idemo dalje");
 System.out.println("Da li želite da oduzmete dva broja? Molimo unesite da ili ne");
 String operacija2 = t.nextLine();

		if (operacija.equals("da"))
                 
                           	System.out.println(c.sub(s.nextDouble(), s.nextDouble()));
                  	else
                      System.out.println("Unos nije validan");
System.out.println("Da li želite da podijelite dva broja? Molimo unesite da ili ne");
 String operacija3 = t.nextLine();

		if (operacija3.equals("da"))
                                        
                           	System.out.println(c.div(s.nextDouble(), s.nextDouble()));
                  	else
                         System.out.println("Unos nije validan");
System.out.println("Da li želite da pomnožite dva broja? Molimo unesite da ili ne");
 String operacija4 = t.nextLine();

		if (operacija4.equals("da"))
                                        
                           	System.out.println(c.mul(s.nextDouble(), s.nextDouble()));
                  	else
                    System.out.println("Unos nije validan");
System.out.println("Da li želite da saberete tri broja? Molimo unesite da ili ne");
 String operacija5 = t.nextLine();

		if (operacija5.equals("da"))
                                        
                           	System.out.println(c.add3(s.nextDouble(), s.nextDouble(), s.nextDouble()));
                  	else
                    System.out.println("Unos nije validan");
System.out.println("Da li želite da oduzmete tri broja? Molimo unesite da ili ne");
 String operacija6 = t.nextLine();

		if (operacija6.equals("da"))
                                        
                           	System.out.println(c.sub3(s.nextDouble(), s.nextDouble(), s.nextDouble()));
                  	else
                    System.out.println("Unos nije validan");
System.out.println("Da li želite da pomnožite tri broja? Molimo unesite da ili ne");
 String operacija7 = t.nextLine();

		if (operacija7.equals("da"))
                                        
                           	System.out.println(c.mul3(s.nextDouble(), s.nextDouble(), s.nextDouble()));
                  	else
                       System.out.println("Unos nije validan");
System.out.println("Da li želite da podijelite tri broja? Molimo unesite da ili ne");
 String operacija8 = t.nextLine();

		if (operacija8.equals("da"))
                                        
                           	System.out.println(c.div3(s.nextDouble(), s.nextDouble(), s.nextDouble()));
                  	else
                    System.out.println("Unos nije validan");
  
     }
     
}
