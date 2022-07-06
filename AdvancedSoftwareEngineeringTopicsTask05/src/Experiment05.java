import java.util.Arrays;
import java.util.List;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment05 {
	
	public static void main(String[] args) {
		//TOO Auto-generated method stub
		String[] n1 = {"Justin Bieber", "Selena Gomez", "BTS"};
		
		/*
		 * for (String name:n1){
		 * System.out.println(name);
		 * }
		 */
		List<String> n2 = Arrays.asList(n1);
		n2.forEach(name -> System.out.println(name));
	}
}
