package mathModul;

public class GetSum implements mathModel{

    @Override
    public complNumber mathAction(complNumber a, complNumber b){
        return new complNumber(a.x+b.x, a.y+b.y);
    }
}
