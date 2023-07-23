package LoggingModel;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerClass {
    
    public final Logger logger = Logger.getLogger("MyLogger");
    
    public LoggerClass(){
        logger.setLevel(Level.FINE);
        try{
            Handler fileHandler = new FileHandler(System.getProperty("user.dir") + "/logging.log", 2000, 5);
            fileHandler.setFormatter(new MyFormatter());
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
