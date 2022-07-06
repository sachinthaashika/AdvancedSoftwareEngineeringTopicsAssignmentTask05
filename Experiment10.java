import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment10 {
	
	class EFilter implements Predicate<String>{
		public boolean test(String name) {
			return name.contains("n");
		}
	}
	
	public void run() {
		String[] n1 = {"Justin Bieber", "Selena Gomez", "BTS"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.stream().filter(new EFilter()).forEach(name -> System.out.println(name));
	}
	
	public static void main (String[] args) {
		new Experiment10().run();
	}
}
