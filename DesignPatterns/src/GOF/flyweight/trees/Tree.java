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

public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g, int canvasSize) {
        int sizeFactor = y < canvasSize / 3 ? 3 : (y < 2 * canvasSize / 3 ? 2 : 1);
        type.draw(g, x, y, sizeFactor);
    }
}

