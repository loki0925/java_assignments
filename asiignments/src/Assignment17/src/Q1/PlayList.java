package Q1;
import java.util.*;

public class PlayList {

public List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		if(songs.contains(song)) {
			System.out.println("Song is already added in the playlist");
		}
		else{
			songs.add(song);
			System.out.println("Song added to the playlist successfully");
		}
	}
}
