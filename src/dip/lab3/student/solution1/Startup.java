/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Peter
 */
public class Startup {
    
    public static void main(String[] args) {
        /**
         * Types of Inputs:
         * KeyboardInput
         * File Input
         * 
         * Types of Outputs:
         * ConsoleOutput
         * GUIOutput
         */
        IInput input = new KeyboardInput();
        IOutput output = new GUIOutput(input.getMessage());
        
        output.displayMessage();
        
    }
}
