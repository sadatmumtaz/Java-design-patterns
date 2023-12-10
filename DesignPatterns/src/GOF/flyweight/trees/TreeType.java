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

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private boolean isFruitTree;
    private int countOfFruits;

    public TreeType(String name, Color color, String otherTreeData, boolean isFruitTree, int countOfFruits) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.isFruitTree = isFruitTree;
        this.countOfFruits = countOfFruits;
    }

    public void draw(Graphics g, int x, int y, int sizeFactor) {
        // Basic tree drawing logic (adjust for sizeFactor)
        g.setColor(color);
        g.fillOval(x - sizeFactor * 5, y - sizeFactor * 10, sizeFactor * 10, sizeFactor * 10);
    }

    // Getters
    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public String getOtherTreeData() {
        return otherTreeData;
    }

    public boolean isFruitTree() {
        return isFruitTree;
    }

    public int getCountOfFruits() {
        return countOfFruits;
    }
}