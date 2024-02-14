/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import javax.swing.JOptionPane;

/**
 *
 * @author Sofia
 */
public class Validations {
    
    public int num(String numS) {
       int num; 
        try {
        num = Integer.parseInt(numS); 
        return num; 
        }catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error, please enter number");
    }
        return 0;
    }
}
