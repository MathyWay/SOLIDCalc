import PresenterModul.Presenter;
import calcModul.*;
import ViewModul.View;
import LoggingModel.*;

public class Program {

    public static void main(String[] args) {

        LoggerClass MyLogger = new LoggerClass();
        Presenter p = new Presenter(new calculator(), new View(), MyLogger.logger);
        p.buttonClick();

    }
}
