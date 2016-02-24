/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irahal
 */
import edu.csbsju.*;
import java.util.*;

public class Driver {
    public static void main (String args[]){
        int repeat=1;
        People ppl = new People();
                
        while (repeat<=10){
            ppl.addAPerson("Bennie the  "+	repeat, 18 + repeat);
            int x = ppl.getPeople().get(repeat-1).getpAge()*4;
            ppl.addAPerson("Johnnie the "+	repeat, 18 + repeat);
            repeat++;
        }
        
        for(int i=0;i<ppl.getPeople().size();i++){
            System.out.println(ppl.getPeople().get(i));
        }
    }
}
