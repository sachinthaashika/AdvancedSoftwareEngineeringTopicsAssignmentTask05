import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment06 {
	
	class StringPrintConsumer implements Consumer<String>{
		public void accept(String str) {
			System.out.println(str);
		}
	}
	
	public void run() {
		String[] n1 = {"Justin Bieber", "Selena Gomez", "BTS"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.forEach(new StringPrintConsumer());
	}
	
	public static void main(String[] args) {
		new Experiment06().run();
	}
}
