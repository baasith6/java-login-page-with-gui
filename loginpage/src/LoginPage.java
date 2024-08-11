import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDJLabel = new JLabel("userID:");
    JLabel userPasswordJLabel = new JLabel("Password:");
    JLabel messagLabel = new JLabel();

    HashMap<String,String> logininfo = new HashMap<String,String>();

    LoginPage (HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;

        userIDJLabel.setBounds(50, 100, 75, 25);
        userPasswordJLabel.setBounds(50, 150, 75, 25);

        messagLabel.setBounds(125, 250, 250, 35);
        messagLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        
        
        frame = new JFrame("Login Page");
        frame.add(messagLabel);
        frame.add(userIDJLabel);
        frame.add(userIDField);
        frame.add(userPasswordJLabel);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
            messagLabel.setText("");
        }

        if (e.getSource() == loginButton) {
            
            String userId = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userId)) 
            {
                if (logininfo.get(userId).equals(password)) {
                    messagLabel.setForeground(Color.GREEN);
                    messagLabel.setText("Login Successful...!");
                    frame.dispose();
                    WelcomePage welcomepage = new WelcomePage(userId);

                }
                else{
                    messagLabel.setForeground(Color.red);
                    messagLabel.setText("Invalid Password ");
                }
            }
            else{
                messagLabel.setForeground(Color.red);
                messagLabel.setText("Invalid UserName ");
            }
        }
    }
}
