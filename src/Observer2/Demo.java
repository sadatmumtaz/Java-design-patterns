/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

/**
 *
 * @author fa20-bse-011
 */
//package refactoring_guru.observer.example;


import Observer2.editor.Editor;
import Observer2.editor.listeners.EmailNotificationListener;
import Observer2.editor.listeners.LogOpenListener;
import Observer2.editor.listeners.SMSSupportListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        
        editor.events.subscribe("save", new SMSSupportListener(" khan khjanakdk jhdkja jkdaslk hjdsah hjdasn hhffffffadsjkhf ahfjdafhjf fhdajshf hfsa fhjaf fjsadf  fdajh fa hjsda fahja dfsakj fajsd afhjadsf hajd ad dafjka jkasf afn akjds jadsf a jaksdf afdjka fasd jadsf hjkaf bjk fadsjk fadsjk fa jkaf bjka"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}