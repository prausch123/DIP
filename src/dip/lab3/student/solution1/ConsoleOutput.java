/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Peter
 */
public class ConsoleOutput implements IOutput{
    private String message;
    
    public ConsoleOutput(String m) {
        this.message = m;
    }

    @Override
    public void displayMessage() {
        System.out.println(message);
    }

}
