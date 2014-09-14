/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Mike
 */
public class GuiOutput implements MessageDestination{

    @Override
    public void outputMessage(String messageText) {
      JOptionPane.showMessageDialog(null, messageText);
    }
    
}
