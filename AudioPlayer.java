public class AudioPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing mp3 file: " + fileName);
    }
}
