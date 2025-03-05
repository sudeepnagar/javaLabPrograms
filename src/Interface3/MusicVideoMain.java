package Interface3;
import java.util.*;
public class MusicVideoMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Song Title:");
		String songName=sc.nextLine();
         
		if(songName.equals("")) {
			System.err.println("Title is not be empty string");
		}
		
		else {
		MusicPlayer song=new MusicPlayer();
		System.out.println("Song Title:"+songName);
		song.play(songName);
		song.stop(songName);
		song.pause(songName);
		
		System.out.println("=========================");
		VideoPlayer vsong=new VideoPlayer();
		System.out.println("Video Song Title:"+songName);
		vsong.play(songName);
		vsong.stop(songName);
		vsong.pause(songName);
		}
	    
	}

}
