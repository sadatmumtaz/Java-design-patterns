/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2.editor.listeners;

import java.io.File;

/**
 *
 * @author fa20-bse-011
 */
public class SMSSupportListener implements EventListener {
    private String smsMsg;
    public SMSSupportListener(String smsMsg) {
        this.smsMsg = smsMsg;
    }
    

    @Override
    public void update(String eventType, File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
