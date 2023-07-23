package calcModul;
import mathModul.*;

public class calculator extends calculationModel{
    
    @Override
    public void PushNumbers(double ax, double ay, double bx, double by)
    {
        this.a = new complNumber(ax, ay);
        this.b = new complNumber(bx, by);
    }

    @Override
    public complNumber Calculate(mathModel m){
        return m.mathAction(a, b);
    }

    @Override
    public complNumber giveA() {
        return this.a;
    }

    @Override
    public complNumber giveB() {
        return this.b;
    }

}
