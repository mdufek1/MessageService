/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;
import java.util.Scanner;
/**
 *
 * @author Mike
 */
public class KeyboardInput implements MessageSource {
    private String message;
    Scanner keyboard = new Scanner(System.in);
   
    
    @Override
    public String getMessage() {
        System.out.println("Please enter the message that you want to be displayed.");
        message = keyboard.nextLine();
        return message;
    }
    
}
