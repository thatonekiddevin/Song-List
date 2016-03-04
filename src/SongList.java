import java.util.ArrayList;

/**
 * 
 * @author Devin
 *
 */
public class SongList {
	
	/**
	 * Array that holds all of our songs.
	 */
	private ArrayList<Song> SongContainer = new ArrayList<Song>();
	
	/**
	 * Songlist constructor.
	 */
	public SongList() {
		
	}
	
	/**
	 * Clears the SongContainer which holds all the songs for the program.
	 */
	public void deleteSongList() {
		SongContainer.clear();
	}
	
	/**
	 * Method that creates song and adds to ArrayList.
	 * @param uArtist user input artist.
	 * @param uTitle user input title.
	 * @param uGenre user input genre.
	 * @param uLength user input length.
	 * @param uRating user input rating.
	 */
	public void addSong(String uArtist, String uTitle, String uGenre, int uLength, int uRating) {
		Song song = new Song(uArtist, uTitle, uGenre, uLength, uRating);
		SongContainer.add(song);
		System.out.println("Song added named: " + uTitle);
	}
	
	/**
	 * Removes song from SongContainer.
	 * @param uArtist user input artist.
	 * @param uTitle user input title.
	 */
	public void removeSong(String uArtist, String uTitle) {
		String removeString = (uArtist + uTitle).toLowerCase();
		for (int i = 0; i < SongContainer.size(); i++) {
			if (SongContainer.get(i).songArtistTitle().equals(removeString)) {
				SongContainer.remove(i);
				System.out.println("Song removed.");
			}
		}
	}
	
	/**
	 * Edits song from SongContainer.
	 * @param uArtist
	 * @param uTitle
	 */
	public void editSong(String uArtist, String uTitle) {
		String editString = (uArtist + uTitle).toLowerCase();
		for (int i = 0; i < SongContainer.size(); i++) {
			if (SongContainer.get(i).songArtistTitle().equals(editString)) {
				System.out.println("Song Found! " + SongContainer.get(i).getTitle());
			}
		}
	}

}
