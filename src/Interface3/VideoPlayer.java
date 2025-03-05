package Interface3;

public class VideoPlayer implements AdvancedMediaPlayer {

	@Override
	public void play(String s) {
	   System.out.println("playing video "+ s);

	}

	@Override
	public void stop(String s) {
		System.out.println("Stopping video "+s);
	}

	@Override
	public void pause(String s) {
		System.out.println("Pausing video "+ s);

	}


}
