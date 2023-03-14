import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class PlayerMenu extends JFrame {

    JTextField textField;

    PlayerMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        JLabel imageLabel = new JLabel();
        ImageIcon helpImage = new ImageIcon("name.gif");
        imageLabel.setIcon(helpImage);

        // JLabel
        JLabel label = new JLabel();
        label.setText("Enter player name: ");
        label.setFont(new Font("OCR A Extended", Font.BOLD, 30));

        JButton backButton = new JButton();
        backButton.setText("Back");
        backButton.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        backHandler handler1 = new backHandler();
        backButton.addActionListener(handler1);

        // JTextField
        textField = new JTextField(20);
        // Adds event to textfield
        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

        // Add components to frame
        this.add(imageLabel);
        this.add(label);
        this.add(textField);
        this.add(backButton);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(500, 400);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(Color.PINK);
    }

    private class EventHandler implements KeyListener {

        public void keyPressed(KeyEvent event) {

            GamePanel gp = new GamePanel();

            // If ENTER button is pressed, do this
            if (event.getKeyCode() == KeyEvent.VK_ENTER) {

                gp.playerName = textField.getText();

                // Close playermenu frame
                dispose();

                // Go to game frame
                new MainMenu();
            }
        }

        public void keyTyped(KeyEvent event) {
            //
        }

        public void keyReleased(KeyEvent event) {
            //
        }
    }
        private class backHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new MainMenu();
            dispose();
        }
    
    }
}