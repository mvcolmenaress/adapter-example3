public class Driver {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.play("mp3", "/path/to/file.mp3");
        mediaPlayer.play("mp4", "/path/to/file.mp4");
        mediaPlayer.play("vlc", "/path/to/file.vlc");
    }
}
