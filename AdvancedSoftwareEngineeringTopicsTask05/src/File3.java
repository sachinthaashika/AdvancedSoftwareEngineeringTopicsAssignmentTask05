import java.io.BufferedReader;
import java.io.FileReader;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class File3 {
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("C:/Users/acer/eclipse-workspace/AdvancedSoftwareEngineeringTopicsTask05/data/top-singers.txt"));
		r.lines().filter(l-> l.contains("is")).forEach(l -> System.out.println(l));
		r.close();
	}
}
