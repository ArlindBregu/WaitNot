/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitnot;
import java.util.LinkedList;
/**
 *
 * @author arlin
 */
public class Consumatore extends Thread{
    
    private BuffWaitNot b;
    private int numero;

    public Consumatore(BuffWaitNot b) {
        this.b = b;
    }
    
    public void run(){
    
        for(int i=0; i<5; i++){
        
            numero = b.preleva();
            try {
                sleep((int)((Math.random() * 1000)));
            } catch (Exception e) {
            }
        }
    }
    
}
