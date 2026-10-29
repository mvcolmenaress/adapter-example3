public class MediaPlayer implements MusicPlayer {
    private MediaAdapter mediaAdapter = new MediaAdapter();

    @Override
    public void play(String mediaType, String fileName) {
        // 1. Get the right player from the adapter
        AdvancedMediaPlayer player = mediaAdapter.getPlayer(mediaType);

        // 2. MediaPlayer does the playing
        if (player != null) {
            player.playMedia(fileName);
        } else {
            System.out.println("Media type not supported for the file: " + fileName);
        }
    }
}
