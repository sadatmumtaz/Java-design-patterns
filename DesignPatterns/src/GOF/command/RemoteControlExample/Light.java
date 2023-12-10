/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.command.RemoteControlExample;

/**
 *
 * @author user
 */
public class Light {
    private boolean isOn;

    public void switchOn() {
        System.out.println("Current status: Light is " + (isOn ? "ON" : "OFF"));
        isOn = true;
        System.out.println("Switching Light ON");
    }

    public void switchOff() {
        System.out.println("Current status: Light is " + (isOn ? "ON" : "OFF"));
        isOn = false;
        System.out.println("Switching Light OFF");
    }

    public void replaceLight() {
        System.out.println("Replacing the light...");
    }
}
