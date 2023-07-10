package abs;

public class TypePlayer extends Player  implements Playable{

    @Override
    public void play() {
        System.out.println("start playing Type record...");
    }

    @Override
    public void stop() {
        System.out.println("stop playing type record...");
    }
}
