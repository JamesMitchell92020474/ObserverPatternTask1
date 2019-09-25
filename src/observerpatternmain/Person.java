/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatternmain;

/**
 *
 * @title Person.java
 * @author James Mitchell 92020474
 * @date 25/09/2019
 */

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer{
    
    // set a backing field
    private final String personName;	
 
    // ctor
    public Person(String newName) {
            personName = newName;
    }
 
    // mandatory method because implements Observer

    /**
     *
     * @param mySubject
     * @param prodName
     */
    @Override
    public void update(Observable mySubject, Object prodName) {
            System.out.println("Hello "+ personName +", the " + (String) prodName + " is now in stock.");
    }
}
