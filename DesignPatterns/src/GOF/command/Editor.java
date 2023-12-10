/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.command;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();
    private CommandHistory redoHistory = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Text editor");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");
        JButton ctrlY = new JButton("Ctrl+Y");
        Editor editor = this;
        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(editor)));
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(editor)));
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(editor)));
        ctrlZ.addActionListener(e -> undo());
        ctrlY.addActionListener(e -> redo());
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        buttons.add(ctrlY);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
            redoHistory.clear();
        }
    }

    private void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
            redoHistory.push(command);
        }
    }

    private void redo() {
        if (redoHistory.isEmpty()) return;

        Command command = redoHistory.pop();
        if (command != null) {
            command.execute();
            history.push(command);
        }
    }
}


