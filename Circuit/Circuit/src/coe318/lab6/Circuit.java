/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList;

/**
 *
 * @author Kalp
 */
public class Circuit {
    private ArrayList<Resistor> resist = new ArrayList<Resistor> ();
    private static String resistorString;
    private static Circuit instance = null;
    
    public static Circuit getInstance() {
        if (instance == null) {
        instance = new Circuit();
        }
    return instance;
   }

    private Circuit(){}
    
    public void add( Resistor r) {
        resist.add(r);
    }
    
    @Override
    public String toString(){
        resistorString="";
        for (int x = 0; x < resist.size(); x++)
        {
            resistorString = resistorString + (resist.get(x)).toString() + "\n";
        }
        return resistorString;
    }   

    public static void main( String [] args){
        Node zero = new Node();
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Circuit c = Circuit.getInstance(); 
        Resistor r1 = new Resistor(20, zero, one);
        Resistor r2 = new Resistor(40, two, three);
        c.add(r1);
        c.add(r2);
        System.out.println(c.toString());
    }
}
