import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment04 {
	
	public static void main(String[] args) {
		String[] n1 = {"Justin Bieber", "Selena Gomez", "BTS"};
		
		List<String> n2 = Arrays.asList(n1);
		
		System.out.println(n2.getClass());
		for(Method m: n2.getClass().getDeclaredMethods()) {
			System.out.println(m.getName());	
		}
	}
}
