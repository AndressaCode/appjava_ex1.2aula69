/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Andressa Silva
 */
public class Calculator {
    
    public double radius;
    public double PI = 3.14159;
    
    public double circunference(){
        return 2.0 * radius * PI;
    }
    
    public double volume(){
        return 4.0 * PI * radius * radius * radius / 3;
    }
}
