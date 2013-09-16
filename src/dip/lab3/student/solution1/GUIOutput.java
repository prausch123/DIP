/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Peter
 */
public class GUIOutput implements IOutput{
    private String message;
    
    public GUIOutput(String m) {
        this.message = m;
    }
    
    @Override
    public void displayMessage() {
        JOptionPane.showMessageDialog(null,message);
    }
    
}
