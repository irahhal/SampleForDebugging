/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.csbsju;

/**
 *
 * @author irahal
 */
public class Person {
    private String pName;
    private int pAge;

    public Person(String pName, int pAge) {
        this.pName = pName;
        this.pAge = pAge;
    }

    /**
     * @return the pName
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName the pName to set
     */
    public void setpName(String pName) {
        this.pName = pName;
    }

    /**
     * @return the pAge
     */
    public int getpAge() {
        return pAge;
    }

    /**
     * @param pAge the pAge to set
     */
    public void setpAge(int pAge) {
        this.pAge = pAge;
    }

    @Override
    public String toString() {
        return "Person{" + "pName=" + pName + ", pAge=" + pAge + '}';
    }

  
    
}
