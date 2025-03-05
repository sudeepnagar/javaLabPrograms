package Interface3;

public class MusicPlayer implements AdvancedMediaPlayer {

	@Override
	public void play(String s) {
	   System.out.println("playing Music "+ s);

	}

	@Override
	public void stop(String s) {
		System.out.println("Stopping music "+s);
	}

	@Override
	public void pause(String s) {
		System.out.println("Pausing music "+ s);

	}

}
