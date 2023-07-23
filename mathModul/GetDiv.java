package mathModul;

public class GetDiv implements mathModel{
    
    @Override
    public complNumber mathAction(complNumber a, complNumber b){
        return new complNumber((a.x*b.x + a.y*b.y)/(b.y*b.y + b.x*b.x),
                            (b.x*a.y - a.x*b.y)/(b.y*b.y + b.x*b.x));
    }
}
