package Exception;
import java.lang.*;
import java.util.*;

public class Magician extends Character{
    
    public boolean attack(){
        if (gatcha() > 0 && gatcha() <= 0.35){
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

