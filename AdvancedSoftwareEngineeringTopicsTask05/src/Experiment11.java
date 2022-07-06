import java.util.Arrays;
import java.util.List;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment11 {
	public void run() {
		String[] n1 = {"Justin Bieber", "Selena Gomez", "BTS"};
		
		List<String> n2 = Arrays.asList(n1);
		n2.stream().map(name -> name.replaceAll("e", "")).forEach(name -> System.out.println(name));
		
	}
	public static void main(String[] args) {
		new Experiment11().run();
	}
}
