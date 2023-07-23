package calcModul;
import mathModul.*;

public interface calcModel {
    public complNumber Calculate(mathModel m);
    public void PushNumbers(double ax, double ay, double bx, double by);
    public complNumber giveA();
    public complNumber giveB();
}
