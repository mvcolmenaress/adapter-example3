public class Mp4Player implements IPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
