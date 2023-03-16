import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.ImageIcon;

public class TryAgain extends JFrame {
    TryAgain(){

        int appleEaten = GamePanel.applesEaten;
        String  PPN = GamePanel.playerName;

        JLabel imageLabel = new JLabel();
        // image from internet that is downloaded
        ImageIcon gameoverImage = new ImageIcon("menu.gif");
        // set image to label
        imageLabel.setIcon(gameoverImage);

        JButton tryAgainButton = new JButton();
        JButton exitButton = new JButton();
        JButton menuButton = new JButton();

        JLabel namelabel = new JLabel();
        namelabel.setText(PPN + "'s score is: " + Integer.toString(appleEaten));
        namelabel.setFont(new Font("Monospaced", Font.BOLD, 50));
        namelabel.setForeground(Color.white);

        tryAgainButton.setText("Try Again");
        tryAgainButton.setFont(new Font("OCR A Extended", Font.BOLD, 20));
        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler);

        exitButton.setText("Exit");
        exitButton.setFont(new Font("OCR A Extended", Font.BOLD, 20));
        exitHandler handler2 = new exitHandler();
        exitButton.addActionListener(handler2);

        menuButton.setText("Menu");
        menuButton.setFont(new Font("OCR A Extended", Font.BOLD, 20));
        menuHandler handler3 = new menuHandler();
        menuButton.addActionListener(handler3);
        

        this.add(imageLabel);
        this.add(namelabel);
        this.add(menuButton);
        this.add(tryAgainButton);
        this.add(exitButton);
        
        this.setLayout(new FlowLayout());

        this.setTitle("Game Over!");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(598, 475);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.setResizable(false);

        this.getContentPane().setBackground(Color.PINK);

       

    }

    private class EventHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
            new GameFrame();
            dispose();

        }
    }

    private class exitHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            dispose();
        }
    
    }
    private class menuHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new MainMenu();
            dispose();
        }
    
    }
}
