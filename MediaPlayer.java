public class MediaPlayer implements MusicPlayer {
    private MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(String audioType, String fileName) {
        // Get the adapted version of player
        AdvancedMediaPlayer x = mediaAdapter.getAdapted(audioType);

        // Play from that adapted instance
        if (x != null) {
            x.play(fileName);
        } else {
            System.out.println("Media type not supported for the file: " + fileName);
        }
    }
}
