public class MediaAdapter {
    // The adapter's only job: check the type and return the right player
    public AdvancedMediaPlayer getAdapted(String mediaType) {
        if (mediaType.equalsIgnoreCase("mp3")) {
            return new AudioPlayer();
        } else if (mediaType.equalsIgnoreCase("mp4")) {
            return new Mp4Player();
        } else if (mediaType.equalsIgnoreCase("vlc")) {
            return new VlcPlayer();
        }
        return null;
    }
}
