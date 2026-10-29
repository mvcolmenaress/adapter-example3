public class VlcPlayer implements IPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }
}
