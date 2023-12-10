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

public class FruitTreeDecorator extends TreeType {
    private TreeType decoratedTreeType;

    public FruitTreeDecorator(TreeType decoratedTreeType) {
        super(decoratedTreeType.getName(), decoratedTreeType.getColor(), decoratedTreeType.getOtherTreeData(),
              decoratedTreeType.isFruitTree(), decoratedTreeType.getCountOfFruits());
        this.decoratedTreeType = decoratedTreeType;
    }

    @Override
    public void draw(Graphics g, int x, int y, int sizeFactor) {
        decoratedTreeType.draw(g, x, y, sizeFactor);
        if (decoratedTreeType.isFruitTree()) {
            g.setColor(Color.RED); // Assuming fruits are red
            for (int i = 0; i < decoratedTreeType.getCountOfFruits(); i++) {
                g.fillOval(x - sizeFactor * 2 + i * sizeFactor, y - sizeFactor * 2 + i * sizeFactor, 
                           sizeFactor, sizeFactor);
            }
        }
    }
}

