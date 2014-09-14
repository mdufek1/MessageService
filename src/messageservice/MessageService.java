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
public class MessageService {
    public static void main(String[] args) {
        MessageSource source = new KeyboardInput();
        MessageDestination destination = new GuiOutput();
        MessageManager messageManager = new MessageManager();
        messageManager.processMessage(source, destination);
    }
}
