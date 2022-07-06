import java.time.LocalDate;
import java.util.function.Supplier;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment16 {
	  public static void main(String[] args) {
		    Supplier<String> dateSupplier = new Supplier<String>() {
		      public String get() {
		        LocalDate date = LocalDate.now(); 
		        return date.toString();
		      }
		    };  
		    System.out.printf("Today is %s", dateSupplier.get());
		  }
	  }
