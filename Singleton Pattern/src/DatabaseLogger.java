import java.sql.DriverManager;

public class DatabaseLogger {
    private static DatabaseLogger databaseLogger;

    private DatabaseLogger() {
        DriverManager.getConnection("","","");
    }

    static DatabaseLogger getInstance() {
        if (databaseLogger == null){
            databaseLogger = new DatabaseLogger();
        }
        return databaseLogger;
    }
}
