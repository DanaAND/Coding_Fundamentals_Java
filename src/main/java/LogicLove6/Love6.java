package LogicLove6;

public class Love6 {

    public boolean add(int a, int b) {
       boolean result = false;
       if (6 == a || 6 == b) {
           result = true;
       }
        if (6 == a-b || 6 == b-a){
            result = true;
        }
        if (6 == a+b) {
            result  = true;
        }
        return result;
    }
}
