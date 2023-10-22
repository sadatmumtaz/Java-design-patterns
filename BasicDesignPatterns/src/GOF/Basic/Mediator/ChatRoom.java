/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Basic.Mediator;

import java.util.Date;

/**
 *
 * @author user
 */

public class ChatRoom {

    public static void showMessage(User user, String message) {
   System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
}
}
