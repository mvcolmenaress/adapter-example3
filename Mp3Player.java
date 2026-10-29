public class Mp3Player implements IPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing mp3 file: " + fileName);
    }
}
