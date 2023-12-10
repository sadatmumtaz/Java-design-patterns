/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.flyweight.trees;

/**
 *
 * @author user
 */
import java.awt.*;

public class Demo {

    static int TREES_TO_DRAW = 100;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            TreeType summerOakType = new TreeType("Summer Oak", Color.GREEN, "Oak texture stub", false, 0);
            TreeType autumnOakType = new TreeType("Autumn Oak", Color.ORANGE, "Autumn Oak texture stub", true, 10);

            forest.plantTree(random(0, Forest.CANVAS_SIZE), random(0, Forest.CANVAS_SIZE), summerOakType);
            forest.plantTree(random(0, Forest.CANVAS_SIZE), random(0, Forest.CANVAS_SIZE),
                    new FruitTreeDecorator(autumnOakType));
        }
        forest.setSize(Forest.CANVAS_SIZE, Forest.CANVAS_SIZE);
        forest.setVisible(true);

        // Memory usage and other logs
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
