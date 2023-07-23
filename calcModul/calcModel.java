package calcModul;
import mathModul.*;

public interface calcModel {
    public complNumber Calculate(mathModel m);
    public void PushNumbers(double[] inp);
    public complNumber giveA();
    public complNumber giveB();
}
