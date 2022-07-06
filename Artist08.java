import java.util.Arrays;
import java.util.List;
/******************************************************************************
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/
public class Artist08 {
  public static void main(String[] args) {
	    List<Artist> table = Arrays.asList(
		        new Artist(1, 10001, "Justin Bieber", 25),
		        new Artist(2, 10002, "Selena Gomez", 12),
		        new Artist(3, 10003, "BTS", 5),
		        new Artist(4, 10004, "Shawn Mendes", 16),
		        new Artist(5, 10005, "John Legend", 24),
		        new Artist(6, 10006, "Shakira", 9),
		        new Artist(7, 10007, "Billie Eilish", 15),
		        new Artist(8, 10008, "Ariana Grande", 22),
		        new Artist(9, 10009, "Zayn Malik", 15),
		        new Artist(10, 10010, "Chris Brown", 8)               ,
		        new Artist(11, 10011, "Olivia Rodrigo", 6),
		        new Artist(12, 10012, "Demi Lovato", 13),
		        new Artist(13, 10013, "Khalid", 17),
		        new Artist(14, 10014, "The Weeknd", 12),
		        new Artist(15, 10015, "Bruno Mars", 21),
		        new Artist(16, 10016, "Camila Cabello", 15),
		        new Artist(17, 10017, "Halsey", 11),
		        new Artist(18, 10018, "Ed Sheeran", 13),
		        new Artist(19, 10019, "Adele", 25),
		        new Artist(20, 10020, "Dua Lipa", 7));
	    
		
	    table.stream().map(artist -> artist.getNumberOfSongs()).forEach(System.out::println);
		//table.stream().map(artist -> artist.replaceAll("", "")).forEach(name -> System.out.println(name));
  }
}
