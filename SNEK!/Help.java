import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.ImageIcon;

public class Help extends JFrame{

   
    //JList helpList;
    Help(){
        

        JLabel label = new JLabel();
        label.setText("Instructions:");
        label.setFont(new Font("OCR A Extended", Font.BOLD, 30));

        JLabel imageLabel = new JLabel();
        ImageIcon helpImage = new ImageIcon("helpGUI.gif");
        imageLabel.setIcon(helpImage);
        
        JLabel imageInstruct = new JLabel();
        ImageIcon helpInstruct = new ImageIcon("instructions.png");
        imageInstruct.setIcon(helpInstruct);

        JButton backButton = new JButton();

        backButton.setText("Back");
        backButton.setFont(new Font("OCR A Extended", Font.BOLD, 25));
        backHandler handler = new backHandler();
        backButton.addActionListener(handler);

        this.add(imageLabel);
        this.add(imageInstruct);
        this.add(backButton);

        this.setLayout(new FlowLayout());

        this.setTitle("Need Help?");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(498, 637);

        this.setLocationRelativeTo(null);

        this.setVisible(true);

        this.setResizable(false);

        this.getContentPane().setBackground(Color.PINK);

    }
    private class backHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            new MainMenu();
            dispose();
        }
    
    }

    
}
