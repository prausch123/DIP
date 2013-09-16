/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peter
 */
public class FileInput implements IInput{
    private String message;
    
    public FileInput() {
        try {
            readFromFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileInput.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileInput.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void readFromFile() throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Peter/Desktop/textfile.txt"))) { // You can replace with any file name, This is what I used for testing purposes.
            this.message = reader.readLine();
        }
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
    
}
