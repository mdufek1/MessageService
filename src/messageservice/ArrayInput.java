/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;
import java.util.Random;
/**
 *
 * @author Mike
 */
public class ArrayInput implements MessageSource {
    String[] messages = {"Welcome!", "Hello!", "Greetings!", "How are you?", "Nice to see you again!", "Welcome back!"};
    //int randomNum = rand.nextInt((max - min) + 1) + min;
    Random random = new Random();
    private String message;
    
    @Override
    public String getMessage() {
       int messageNo = random.nextInt(((messages.length-1)-0)+1)+0;
       message = messages[messageNo];
       return message;
    }
    
}
