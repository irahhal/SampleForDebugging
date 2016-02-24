/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csbsju;

import java.util.*;
/**
 *
 * @author irahal
 */
public class People{


   private ArrayList<Person> people;



    public People() {
        people = new ArrayList<Person>();
    }
    
    public void addAPerson(String pName, int pAge){
            people.add(new Person(pName,pAge));
    }
    
    public ArrayList<Person> getPeople() {
        return people;
    }
       

}
