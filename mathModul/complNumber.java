package mathModul;

public class complNumber {
    double x;
    double y;

    public complNumber(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return String.format("(%,3f, %,3f)", this.x, this.y);
    }
}
