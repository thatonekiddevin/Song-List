/**
 * 
 * @author Devin
 *
 */
public class Song {
	
	/**
	 * Variables that contain object information.
	 */
	
	private String songArtist;
	private String songTitle;
	private String songGenre;
	private int songLength;
	private int songRating;
	
	/**
	 * Creates a song object with specificed paramaters.
	 * @param sArtist The artist name given by user.
	 * @param sTitle The song title given by user.
	 * @param sGenre The song genre given by user.
	 * @param sLength The song length given by user.
	 * @param sRating The song rating given by user.
	 */
	public Song(String sArtist, String sTitle, String sGenre, int sLength, int sRating) {
		this.songArtist = sArtist;
		this.songTitle = sTitle;
		this.songGenre = sGenre;
		this.songLength = sLength;
		this.songRating = sRating;
	}
	
	public String getArtist() {
		return this.songArtist;
	}
	
	public String getTitle() {
		return this.songTitle;
	}
	
	public String getGenre() {
		return this.songGenre;
	}
	
	public int getLength() {
		return this.songLength;
	}
	
	public int getRating() {
		return this.getRating();
	}
	
	public String songArtistTitle() {
		return (this.songArtist + this.songTitle).toLowerCase();
	}

}
