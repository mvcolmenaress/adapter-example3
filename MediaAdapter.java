public class MediaAdapter {
    private static final String MP3 = "mp3";
    private static final String MP4 = "mp4";
    private static final String VLC = "vlc";

    IPlayer iPlayer;

    public MediaAdapter(String fileType) {
        if (fileType.equalsIgnoreCase(MP3)) {
            iPlayer = new Mp3Player();
        }
        else if (fileType.equalsIgnoreCase(MP4)) {
            iPlayer = new Mp4Player();
        }
        else if (fileType.equalsIgnoreCase(VLC)) {
            iPlayer = new VlcPlayer();
        }
    }

    public IPlayer getPlayer() {
        return iPlayer;
    }
}
