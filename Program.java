import PresenterModul.Presenter;
import calcModul.*;
import ViewModul.View;
import LoggingModel.*;

public class Program {

    public static void main(String[] args) {
        try {
            LoggerClass MyLogger = new LoggerClass();
            Presenter p = new Presenter(new calculator(), new View(), MyLogger.logger);
            p.buttonClick();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
