import java.util.Arrays;
import java.util.List;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment03 {
	public static void main(String[] args) {
		String[] n1 = {"Justin Bieber", "Selena Gomez", "BTS"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println(n2.getClass());
		for(String name:n2) {
			System.out.println(name);
		}	
	}
}

/*In this code the array is converted to a List so that advantages
 * of the Collection API may used later
 */
