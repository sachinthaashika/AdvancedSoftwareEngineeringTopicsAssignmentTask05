import java.io.BufferedReader;
import java.io.FileReader;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class File5 {
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("C:/Users/acer/eclipse-workspace/AdvancedSoftwareEngineeringTopicsTask05/data/top-singers.txt"));
		r.lines()
		.sorted((a,b)->{
			if(a.length()== b.length())
				return 0;
			if(a.length()<b.length())
				return 1;
			return -1;
		})
		.forEach(l->System.out.println(l));
		r.close();
	}
}
