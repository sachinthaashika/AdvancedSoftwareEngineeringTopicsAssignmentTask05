import java.util.function.Supplier;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment13 {
	  class NameSupplier implements Supplier<String>{
		    String[] names = { "Justin Bieber", "Selena Gomez", "BTS" };
		    int nextIndex = 0;
		    public String get() {
		      if(nextIndex< names.length) {
		        return names[nextIndex++];
		      }
		      return null;
		    }  
		  }
		  
		  public void run() {
		    NameSupplier ns = new NameSupplier();

		    System.out.println(ns.get());
		    System.out.println(ns.get());
		    System.out.println(ns.get());
		    System.out.println(ns.get());
		  }

		  public static void main(String[] args) {
		    new Experiment13().run();
		  }
}
