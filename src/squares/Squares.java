/*
 *Vilmos Feher
 *squares.java
 *11/05/2018
 */

package squares;
import java.util.*;

/**
 *
 * @author vifeh1685
 */
public class Squares {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> orgNumbers = new ArrayList();
        Collections.addAll(orgNumbers, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9); 
       
        for(int i=0; i<orgNumbers.size() ; i++){
        System.out.println("Numbers: " + i + " Squares: " + (i*i));    
        }
        
       
       
    }
    
}
