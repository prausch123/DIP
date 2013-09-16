/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class KeyboardInput implements IInput{
    Scanner s = new Scanner(System.in);
    private String message;
    
    public KeyboardInput() {
        setNewMessage();
    }
    
    private void setNewMessage() {
        String tempMsg;
        System.out.println("Please input a Message!");
        tempMsg = s.next();
        
        if(tempMsg != null) {
            setMessage(tempMsg);
        }
    }

    public void setMessage(String m) {
        if(m != null) {
            this.message = m;
        }
    }

    @Override
    public String getMessage() {
        return this.message;
    }
    
}
