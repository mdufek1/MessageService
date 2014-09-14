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
        //MessageSource source = new KeyboardInput();
        MessageSource source = new ArrayInput();
        MessageDestination destination = new GuiOutput();
//        MessageDestination destination = new ConsoleOutput();
        MessageManager messageManager = new MessageManager(source, destination);
        //messageManager.processMessage(source, destination);
    }
}
