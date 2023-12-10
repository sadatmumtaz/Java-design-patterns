/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.command.RemoteControlExample;

/**
 *
 * @author user
 */
//Concrete Command

public class LightOnCommand implements Command {

    // reference to the light
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOn();
        System.out.println("Light is on");
    }

}
