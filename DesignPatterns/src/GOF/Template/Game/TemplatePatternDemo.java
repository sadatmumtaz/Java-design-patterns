package GOF.Template.Game;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game cricketGame = new Cricket();
        cricketGame.play();
        System.out.println();

        Game footballGame = new Football();
        footballGame.play();
        System.out.println();

        // Test a modified Cricket game with custom shifts
        Game modifiedCricketGame = new Cricket() {
            @Override
            protected void performShift() {
                System.out.println("Custom shift for Cricket");
            }
        };
        modifiedCricketGame.play();
    }
}
