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
public class MessageManager {

    public MessageManager(MessageSource source, MessageDestination destination) {
        destination.outputMessage(source.getMessage());
    }

    public MessageManager() {
    }

    public void processMessage(MessageSource source, MessageDestination destination){
        destination.outputMessage(source.getMessage());
    }
    
}
