import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Optional;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class File7 {
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("C:/Users/acer/eclipse-workspace/AdvancedSoftwareEngineeringTopicsTask05/data/top-singers.txt"));
		Optional<String> result= r.lines().reduce((left,right) -> left.concat("".concat(right)));
		
		if(result.isPresent())
			System.out.println("result is "+ result.get());
		else
			System.out.println("result not present");
		
		r.close();
	}
}
