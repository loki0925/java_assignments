package Q1;
import java.util.List;

public class Main {

public static void main(String[] args) {
		
		Song s1 = new Song("Naacho Naacho", "RRR");
		Song s2 = new Song("Srivalli", "Pushpa");
		Song s3 = new Song("Naacho Naacho", "RRR");
		Song s4 = new Song("Ye Jo des Hai Mera", "Swades");
		
		PlayList p  = new PlayList();
		
		p.addSong(s1);
		p.addSong(s2);
		p.addSong(s3);
		p.addSong(s4);
		
		List<Song> pl = p.songs;
		
		
		System.out.println("\n*********************************\n");
		for(Song s:pl) {
			s.play();
		}
		
		
	}
}
