import java.util.*;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        YouTubeChannel channel = new YouTubeChannel();

        Subscriber s1 = new Subscriber("Rahul");
        Subscriber s2 = new Subscriber("Amit");
        Subscriber s3 = new Subscriber("Neha");

        channel.addObserver(s1);
        channel.addObserver(s2);
        channel.addObserver(s3);

        channel.uploadVideo("Java Design Patterns Tutorial");
    }
}

// Observer Interface
interface Observer {
    void update(String message);
}

// Subject Interface
interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Concrete Subject
class YouTubeChannel implements Subject {

    private List<Observer> subscribers = new ArrayList<>();
    private String latestVideo;

    public void uploadVideo(String title) {
        this.latestVideo = title;
        notifyObservers();
    }

    public void addObserver(Observer o) {
        subscribers.add(o);
    }

    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : subscribers) {
            o.update(latestVideo);
        }
    }
}

// Concrete Observer
class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println(name + " notified: New video uploaded -> " + videoTitle);
    }
}
