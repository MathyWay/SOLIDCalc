import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import PresenterModul.Presenter;
import calcModul.*;
import ViewModul.View;
import LoggingModel.*;

public class Program {

    public static void main(String[] args) {

        final Logger logger = Logger.getLogger(Program.class.getName());
        logger.setLevel(Level.FINE);
        try {
            Handler fileHandler = new FileHandler(System.getProperty("user.dir") + "/logging.log", 2000, 5);
            fileHandler.setFormatter(new MyFormatter());
            logger.addHandler(fileHandler);
            Presenter p = new Presenter(new calculator(), new View(), logger);
            p.buttonClick();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
