package mathModul;

public class GetMult implements mathModel{
    
    @Override
    public complNumber mathAction(complNumber a, complNumber b){
        return new complNumber(a.x*b.x - a.y*b.y, a.x*b.y + a.y*b.x);
    }
}
