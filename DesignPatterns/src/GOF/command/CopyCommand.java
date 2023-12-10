/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.command;

/**
 *
 * @author user
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getSelectedText() == null || editor.textField.getSelectedText().isEmpty()) {
            return false;
        }
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
