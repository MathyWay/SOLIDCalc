package PresenterModul;

import java.util.logging.Level;
import java.util.logging.Logger;
import calcModul.*;
import ViewModul.*;
import mathModul.*;


public class Presenter {
    
    calculator calculator;
    View view;
    boolean repeat;
    Logger logger;

    public Presenter(calculator c, View v, Logger logger){
        this.calculator = c;
        this.view = v;
        this.logger = logger;
        repeat = true;
    }

    public void buttonClick(){
        int choice;
        while (repeat) {
            choice = view.getIntNumber("Выберите действие:\n" +
            "1 - сложение\n" +
            "2 - умножение\n" +
            "3 - деление\n" +
            "4 - выход\n");
            switch (choice) {
                case 1:
                calculator.PushNumbers(view.getInput());
                logger.log(Level.INFO, "Pushed numbers:" + calculator.giveA().toString() +
                " " + calculator.giveB().toString());

                view.print(calculator.Calculate(new GetSum()).toString());

                logger.log(Level.INFO, "Calculated" + calculator.giveA().toString() +
                "+" + calculator.giveB().toString());
                break;

                case 2:
                calculator.PushNumbers(view.getInput());
                logger.log(Level.INFO, "Pushed numbers:" + calculator.giveA().toString() +
                " " + calculator.giveB().toString());
                
                view.print(calculator.Calculate(new GetMult()).toString());

                logger.log(Level.INFO, "Calculated" + calculator.giveA().toString() +
                "*" + calculator.giveB().toString());
                break;

                case 3:
                calculator.PushNumbers(view.getInput());
                logger.log(Level.INFO, "Pushed numbers:" + calculator.giveA().toString() +
                " " + calculator.giveB().toString());
                
                                    view.print(calculator.Calculate(new GetDiv()).toString());

                logger.log(Level.INFO, "Calculated" + calculator.giveA().toString() +
                "/" + calculator.giveB().toString());
                break;

                case 4:
                repeat = false;
            }
        }
    }
}
