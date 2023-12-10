/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.command.editor;

import java.util.Stack;

/**
 *
 * @author user
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.isEmpty() ? null : history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }

    public void clear() { history.clear(); }
}