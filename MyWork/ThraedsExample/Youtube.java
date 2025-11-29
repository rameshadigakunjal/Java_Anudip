package MyWork.ThraedsExample;

class YoutubeVideo extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Playing video: " + i);
        }
    }
}
class BufferingVideo extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Buffering video: " + i);
        }
    }

    
}
public class Youtube {
    public static void main(String[] args) {
        new YoutubeVideo().start();
        new BufferingVideo().start();
    }
}