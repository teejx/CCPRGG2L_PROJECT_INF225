import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.*;

public class ColorMenu extends JFrame{

    private String[] colorNameArray = {"GRAY", "DARK GRAY", "ORANGE", "PINK"};
    private Color[] colorListArray = {Color.GRAY, Color.DARK_GRAY, Color.ORANGE, Color.PINK};
    JList colorList;

    ColorMenu(){

        JLabel imageLabel = new JLabel();
        ImageIcon helpImage = new ImageIcon("customize.gif");
        imageLabel.setIcon(helpImage);
        
        JButton backButton = new JButton();

        backButton.setText("Back");
        backButton.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        backHandler handler1 = new backHandler();
        backButton.addActionListener(handler1);

        JLabel label = new JLabel();
        label.setText("Choose your color");
        label.setFont(new Font("OCR A Extended", Font.BOLD, 40));
        this.add(label);

        // JList
        colorList = new JList(colorNameArray);
        colorList.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        // Allows only one selection in the list
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Add event
        EventHandler handler = new EventHandler();
        colorList.addListSelectionListener(handler);

        this.add(imageLabel);
        this.add(colorList);
        this.add(backButton);

        this.setLayout(new FlowLayout());

        this.setTitle("Snek!");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(498, 822);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.setResizable(false);

        this.getContentPane().setBackground(Color.PINK);
    }

    private class EventHandler implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent event){
            GamePanel gp = new GamePanel();
            gp.gameBGColor = colorListArray[colorList.getSelectedIndex()];

            new MainMenu();
            
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