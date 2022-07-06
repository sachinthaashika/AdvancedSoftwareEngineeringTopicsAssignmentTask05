import java.util.stream.Stream;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Experiment14 {
	  class NameStreamBuilder {
		    public Stream<String> build(){
		      Stream.Builder<String> builder = Stream.builder(); 
		      builder.add("Justin Bieber");
		      builder.add("Selena Gomez");
		      builder.add("BTS");
		      return builder.build();
		    }
		  }
		  
		  public void run() {
		    NameStreamBuilder builder = new NameStreamBuilder();
		    Stream <String> nameStream = builder.build();
		    nameStream.forEach(n -> System.out.println(n));
		  }

		  public static void main(String[] args) {
		    new Experiment14().run();
		  }
}
