package calcModul;
import mathModul.*;

public class calculator extends calculationModel{
    
    @Override
    public void PushNumbers(double[] inp)
    {
        this.a = new complNumber(inp[0], inp[1]);
        this.b = new complNumber(inp[2], inp[3]);
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
