/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author Mike
 */
public interface MessageDestination {
    
    public abstract void outputMessage(String messageText);
    
}
