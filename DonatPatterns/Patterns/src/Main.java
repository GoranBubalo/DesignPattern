public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("PewDiePie");
        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob"  );
        Observer sub3 = new Subscriber("Charlie");

        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.uploadVideo("Going to local KFC");

        channel.sort();
        channel.unsubscribe(sub1);
        channel.uploadVideo("My wife left me!!!");

        channel.sort();
        channel.subscribe(sub3);
        channel.uploadVideo("Hot wheels lets play part 194");


    }
}