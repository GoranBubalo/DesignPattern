import java.util.ArrayList;

public class YouTubeChannel {

    private ArrayList<Observer> subscribers = new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {

        this.channelName = channelName;
    }

    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber + " has subscribed to " + channelName);

    }
    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber + " has unsubscribed from " + channelName);
    }

    public void notifySubscribers(String message) {
        System.out.println("Notifying subscribers: " + message+" from : " + channelName);
        for (Observer subscriber : subscribers) {
            subscriber.update(message);
        }

    }
    public void uploadVideo(String videoTitle) {
        System.out.println("Old video uploaded: " + videoTitle);
        notifySubscribers("New video uploaded: " + videoTitle);
    }




 public void sort() {
        System.out.println(" ");
    }





}
