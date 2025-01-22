public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        Logger logger1 = Logger.getLogger();

        logger.log("This is a log message");
        logger1.log("This is a log1 message");

        if (logger == logger1){
            System.out.println("Singletons work!!!");
        }else  {
            System.out.println("Singletons don't work");
        }
    }
}