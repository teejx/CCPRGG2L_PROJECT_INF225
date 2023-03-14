import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifficultyMenu extends JFrame {
    DifficultyMenu() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        JLabel imageLabel = new JLabel();
        ImageIcon helpImage = new ImageIcon("difficulty.gif");
        imageLabel.setIcon(helpImage);

        JButton easyButton = new JButton();
        easyButton.setText("EASY");
        easyButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
        // Add event to easy button
        EventHandler easyHandler = new EventHandler(200);
        easyButton.addActionListener(easyHandler);

        JButton mediumButton = new JButton();
        mediumButton.setText("MEDIUM");
        mediumButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
        // Add event to easy button
        EventHandler mediumHandler = new EventHandler(120);
        mediumButton.addActionListener(mediumHandler);

        JButton hardButton = new JButton();
        hardButton.setText("HARD");
        hardButton.setFont(new Font("OCR A Extended", Font.BOLD, 30));
        // Add event to easy button
        EventHandler hardHandler = new EventHandler(40);
        hardButton.addActionListener(hardHandler);

        JButton backButton = new JButton();
        backButton.setText("Back");
        backButton.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        backHandler handler1 = new backHandler();
        backButton.addActionListener(handler1);

        add(imageLabel);
        add(easyButton);
        add(mediumButton);
        add(hardButton);
        add(backButton);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(400, 438);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(Color.PINK);
    }

    private class EventHandler implements ActionListener {

        int snakeSpeed;

        // Constructor
        EventHandler(int speed) {
            this.snakeSpeed = speed;
        }

        public void actionPerformed(ActionEvent event) {
            GamePanel gp = new GamePanel();
            gp.DELAY = snakeSpeed;

            // Goes to colormenu frame
            new MainMenu();

            // Closes difficulty menu frame
            dispose();
        }
    }
    private class backHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new MainMenu();
            dispose();
        }
    
    }
}