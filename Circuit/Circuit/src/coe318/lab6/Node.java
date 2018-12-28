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
public class Node {
    private int n;
    private static int x=0;
    
public Node () {
        n = x;
        x++;
    }

    @Override
    public String toString () {
    return ("" +n);
    }
}
