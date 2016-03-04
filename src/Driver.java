import java.util.Scanner;

/**
 * 
 * @author Devin Harris
 * @version 1.0
 *
 */
public class Driver {
	
	/**
	 * Main method that drives the program.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		SongList listOfSongs = new SongList();
		
		listOfSongs.addSong("Hopsin", "Paradise", "Alternative", 180, 5);
		System.out.print("Name the artist you want to remove: ");
		String uInputArtist = in.nextLine();
		System.out.print("Name the song you want to remove: ");
		String uInputTitle = in.next();
		
		listOfSongs.removeSong(uInputArtist, uInputTitle);
		listOfSongs.editSong("Hopsin", "Paradise");
	}

}
