/******************************************************************************
 * This class stores the details of Top 20 Singers in the World including their 
 * SongId, ArtistId, Artist, NumberOfSongs. The class 
 * implements the Comparable interface, which determines how artists will be 
 * sorted.     
 * @author Sachintha Ashika Bandara Yapa
 ******************************************************************************/

public class Artist implements Comparable<Artist> {
  private int SongId;
  private int ArtistId;
  private String Artist;
  private int NumberOfSongs;

  public Artist(int SongId, int ArtistId, String Artist, int NumberOfSongs) {
    this.SongId = SongId;
    this.ArtistId = ArtistId;
    this.Artist = Artist;
    this.NumberOfSongs = NumberOfSongs;
  }

  public String toString() {
	  return String.format("%-8d %-10d %-20s %-8d", SongId, ArtistId, Artist, NumberOfSongs);
  }

  public int getSongId() {
	  return SongId;
  }

  public void setSongId(int SongId) {
	  this.SongId = SongId;
  }

  public int getArtistId() {
	  return ArtistId;
	  }
  
  public void setArtistId(int ArtistId) {
	  this.ArtistId = ArtistId;
	  }

  public String getArtist() {
	  return Artist;
  }

  public void setArtist(String Artist) {
	  this.Artist = Artist;
  }

  public int getNumberOfSongs() {
    return NumberOfSongs;
  }

  public void setNumberOfSongs(int NumberOfSongs) {
    this.NumberOfSongs = NumberOfSongs;
  }

  public int compareTo(Artist c) {
    return ((Integer) NumberOfSongs).compareTo(c.NumberOfSongs);
  }
}
