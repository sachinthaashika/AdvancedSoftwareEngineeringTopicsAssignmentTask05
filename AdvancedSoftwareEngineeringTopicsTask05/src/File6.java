import java.io.BufferedReader;
import java.io.FileReader;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class File6 {

	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("C:/Users/acer/eclipse-workspace/AdvancedSoftwareEngineeringTopicsTask05/data/top-singers.txt"));
		//r.lines().forEach(l->System.out.println(l));
		
		System.out.println(r.lines().reduce("", String::concat));
		
		r.close();
	}
}
