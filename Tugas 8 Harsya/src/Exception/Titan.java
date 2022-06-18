package Exception;
import java.util.*;
import java.lang.Math;

public class Titan extends Character{
    
    public boolean attack(){
        if (gatcha() > 0 && gatcha() <= 0.4){
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
