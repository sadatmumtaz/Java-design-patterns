/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.Composite;

import java.util.List;

/**
 *
 * @author user
 */
class CompositeIterator implements SubordinateIterator {
    private List<IEmployee> subordinates;
    private int position = 0;

    public CompositeIterator(List<IEmployee> subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public boolean hasNext() {
        return position < subordinates.size();
    }

    @Override
    public IEmployee next() {
        if (this.hasNext()) {
            return subordinates.get(position++);
        }
        return null;
    }
}
