public class Logger {

    private static Logger logger;

    private Logger() {}

    static Logger getLogger(){
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message){
        System.out.println(message);
    }

}
