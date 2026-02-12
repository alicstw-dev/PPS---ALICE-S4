package COMPORTAMENTAIS.COMANDO;

import javax.swing.*;
import java.awt.*;

public class Editor {

    public JTextArea textField;
    public String clipboard;

    private CommandHistory history = new CommandHistory();

    public void init() {

        JFrame frame = new JFrame("Editor de texto (digite e use os botões, Luke!)");
        JPanel content = new JPanel();

        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton ctrlC = new JButton("Ctrl + C");
        JButton ctrlX = new JButton("Ctrl + X");
        JButton ctrlV = new JButton("Ctrl + V");
        JButton ctrlZ = new JButton("Ctrl + Z");

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);

        content.add(buttons);

        // COPY
        ctrlC.addActionListener(e ->
                executeCommand(new CopyCommand(this))
        );

        // CUT
        ctrlX.addActionListener(e ->
                executeCommand(new CutCommand(this))
        );

        // PASTE
        ctrlV.addActionListener(e ->
                executeCommand(new PasteCommand(this))
        );

        // UNDO
        ctrlZ.addActionListener(e -> {
            if (!history.isEmpty()) {
                history.pop().undo();
            }
        });

        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }
}
