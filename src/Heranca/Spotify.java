package heranca;
class Pause {
    public void start() {
        System.out.println("Música pausada...Dê play para reproduzir.");
    }
}
class Play extends Pause {
    @Override
    public void start() {
        super.start();
        System.out.println("Play!\nMúsica em reprodução..");
    }
}
public class Spotify {
    public static void main(String[] args) {
        Play go = new Play();
        go.start();
    }
}
