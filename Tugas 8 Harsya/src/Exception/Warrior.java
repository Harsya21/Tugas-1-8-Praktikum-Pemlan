package Exception;
import java.util.*;
public class Warrior extends Character{

    public boolean attack(){
        if (gatcha() > 0 && gatcha() <= 0.6){
            return true;
        }else {
            return false;
        }
    }

    public double gatcha(){
        double random = Math.random();
        return random;
    }
}
