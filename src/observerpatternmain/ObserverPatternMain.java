/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatternmain;

/**
 *
 * @title ObserverPatternMain.java
 * @author James Mitchell 92020474
 * @date 25/09/2019
 */
public class ObserverPatternMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person personManu = new Person("Manu");
        Person personTama = new Person("Tama");
        
        Product productUte = new Product("4x4Ute");
        
        // register the observers 
        productUte.registerObserver(personManu);
        productUte.registerObserver(personTama);
        
        //calling setQty > 0 should issue notification.
        productUte.setQty(10);
    }
    
}
