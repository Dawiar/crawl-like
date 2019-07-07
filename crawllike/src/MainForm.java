import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainForm extends JFrame {
    public JPanel mainPanel;

    public MainForm()
    {
        super();
        setContentPane(mainPanel);
        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Game.INSTANCE.render(mainPanel.getGraphics());
            }
        });

    }

    private void createUIComponents() {
        mainPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                Game.INSTANCE.render(g);
            }

        };
    }
}