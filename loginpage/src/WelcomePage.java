import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomLabel = new JLabel("Hello User");

    WelcomePage(String userId){

        welcomLabel.setBounds(110, 150, 200, 35);
        welcomLabel.setFont(new Font(null, Font.PLAIN,25));
        welcomLabel.setText( " Welcome "+ userId);


        frame = new JFrame("Welcome Page");
        frame.add(welcomLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
