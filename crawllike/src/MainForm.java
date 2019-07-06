import javax.swing.*;
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
                Game.INSTANCE.render();
            }
        });

    }

}
