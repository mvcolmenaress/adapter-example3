public class MediaPlayer implements MusicPlayer {
    @Override
    public void play(String audioType, String fileName) {
        // Get the adapted version of player
        IPlayer x = new MediaAdapter(audioType).getPlayer();

        // Play from that adapted instance
        if (x != null) {
            x.play(fileName);
        } else {
            System.out.println("Media type not supported for the file: " + fileName);
        }
    }
}
