public class MediaPlayer {
    public void play(String fileType, String fileName) {
        // Get the adapted version of player
        // Play from that adapted instance
        MediaAdapter mediaAdapter = new MediaAdapter(fileType);
        IPlayer player = mediaAdapter.getPlayer();
        player.play(fileName);
    }
}
