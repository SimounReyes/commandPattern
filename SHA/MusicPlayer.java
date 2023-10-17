package SHA;

public class MusicPlayer implements Button{

    @Override
    public String powerOn() {
        return "The Music Player is powered on! Now playing 'Banana by the Minions'.";
    }

    @Override
    public String powerOff() {
        return "The Music Player is powered off";
    }

    @Override
    public String plus() {
        return "The Music Player's volume has increased!";
    }

    @Override
    public String minus() {
        return "The Music Player's volume has increased!";
    }
}
