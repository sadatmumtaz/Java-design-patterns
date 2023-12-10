/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.command.RemoteControlExample;

/**
 *
 * @author user
 */
public class LightReplaceCommand implements Command {
    private Light light;

    public LightReplaceCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.switchOff();
        light.replaceLight();
        light.switchOn();
    }
}
