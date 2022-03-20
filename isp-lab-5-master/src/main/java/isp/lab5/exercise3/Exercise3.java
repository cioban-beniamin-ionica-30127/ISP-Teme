package isp.lab5.exercise3;

public class Exercise3 {
    public static void main(String[] args) {

        final Playable firstProxy = new ProxyVideo("Big Bang Theory", ProxyVideo.VideoType.COLOR);
        firstProxy.play();

        final Playable secondProxy = new ProxyVideo("Chaplin.", ProxyVideo.VideoType.BLACK_AND_WHITE);
        secondProxy.play();
    }
}