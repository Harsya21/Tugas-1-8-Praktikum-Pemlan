package Exception;
import java.util.*;

public class Healer extends Character{
   
    public boolean attack(){
        if (gatcha() > 0 && gatcha() <= 0.85){
            return true;
        }else {
            return false;
        }
    }

    public void heal(){
        setHP(getHP() + 25);
    }

    public double gatcha(){
        double random = Math.random();
        return random;
    }
}
