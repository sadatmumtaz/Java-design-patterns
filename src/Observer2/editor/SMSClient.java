/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2.editor;

/**
 *
 * @author fa20-bse-011
 */

import Observer2.editor.publisher.EventManager;

import java.io.File;

public class SMSClient {
    public EventManager events;
    private File message;

    public SMSClient() {
        this.events = new EventManager("send");
    }

    public void sendMessage(File message) {
        this.message = message;
        events.notify("send", message);
    }
}