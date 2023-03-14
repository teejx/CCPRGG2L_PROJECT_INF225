import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame{
    MainMenu(){

        // JLabel
        JLabel imageLabel = new JLabel();
        // image from internet that is downloaded
        ImageIcon catImage = new ImageIcon("snek.gif");
        // set image to label
        imageLabel.setIcon(catImage);


        // JButton
        JButton startButton = new JButton();
        startButton.setText("Press Start");
        startButton.setFont(new Font("OCR A Extended", Font.BOLD,25));
        startHandler handler1 = new startHandler();
        startButton.addActionListener(handler1);

        JButton helpButton = new JButton();
        helpButton.setText("Help");
        helpButton.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        //helpButton.setBackground(Color.darkGray);
        helpHandler handler2 = new helpHandler();
        helpButton.addActionListener(handler2);

        JButton difficultyButton = new JButton();
        difficultyButton.setText("Difficulty");
        difficultyButton.setFont(new Font("OCR A Extended", Font.BOLD,25));
        difficultyHandler handler3 = new difficultyHandler();
        difficultyButton.addActionListener(handler3);

        JButton playerButton = new JButton();
        playerButton.setText("Player Name");
        playerButton.setFont(new Font("OCR A Extended", Font.BOLD,25));
        playerHandler handler4 = new playerHandler();
        playerButton.addActionListener(handler4);

        JButton customizeButton = new JButton();
        customizeButton.setText("Customize");
        customizeButton.setFont(new Font("OCR A Extended", Font.BOLD, 25));

        // add event to start button
        EventHandler handler = new EventHandler();
        customizeButton.addActionListener(handler);


        // add label and image to frame
        this.add(imageLabel);
        this.add(startButton);
        this.add(playerButton);
        this.add(difficultyButton);
        this.add(customizeButton);
        this.add(helpButton);
        


        this.setLayout(new FlowLayout());
        // Frame Title
        this.setTitle("Snek!");
        // Terminates java program on close
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Frame Size
        this.setSize(600, 618);
        // Puts frame in the middle
        this.setLocationRelativeTo(null);
        // Make visible
        this.setVisible(true);
        // Disable resize
        this.setResizable(false);
        // Set Background Color
        this.getContentPane().setBackground(Color.PINK);
    }
    // event handler (button click for "Customize")
    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){
            // goes to game frame
            new ColorMenu();
            
            // Closes frame
            dispose();

         }

    }
    private class startHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new GameFrame();

            dispose();
        }
    
    }
    private class helpHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new Help();

            dispose();
        }
    
    }
    private class difficultyHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new DifficultyMenu();

            dispose();
        }
    
    }
    private class playerHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new PlayerMenu();

            dispose();
        }
    
    }

}