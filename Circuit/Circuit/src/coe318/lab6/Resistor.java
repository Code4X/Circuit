/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author Kalp
 */
public class Resistor {
    private double resistor;
    private Node n1, n2;
    private static int a=1;
    private int id;
    
    public Resistor (double resistance, Node node1, Node node2) {
       if (resistance < 0) {      
           throw new IllegalArgumentException("resistance can't be negative");
       }
       this.resistor = resistance;
       n1 = node1;
       n2 = node2;
       id = a;
       a++;
    }
    
    public Node [] getNodes() {
        Node [] nodes = new Node[2];
        nodes[0] = n1;
        nodes[1] = n2;
        return (nodes);       
    }
    @Override
    public String toString() {
        String info;
        info = "R" + " " + id + " " + n1 + " " + n2 + " " + resistor ;
        return (info);
    }
}
