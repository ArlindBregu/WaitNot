/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitnot;

/**
 *
 * @author arlin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BuffWaitNot Buff = new BuffWaitNot();
        
        Produttore p = new Produttore(Buff);
        Consumatore c = new Consumatore(Buff);
        
        p.start();
        c.start();
    }
    
}
