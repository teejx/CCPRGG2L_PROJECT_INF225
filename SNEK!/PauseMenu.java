import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class PauseMenu extends JFrame{

      PauseMenu(){
      setTitle("Snek");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 550);
        this.setLocationRelativeTo(rootPane);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.WHITE);

        this.setLayout(new FlowLayout());  
        
        JLabel PauseLabel = new JLabel();
        PauseLabel.setText("||GAME IS PAUSED||");
        PauseLabel.setFont(new Font("OCR A Extended", Font.BOLD,25));
        PauseLabel.setForeground(Color.BLACK);
        this.add(PauseLabel);


        JButton ResumeButton = new JButton();
        ResumeButton.setText("Resume");
        ResumeButton.setFont(new Font("OCR A Extended", Font.BOLD,20));
        this.add(ResumeButton);
        ResumeHandler resume = new  ResumeHandler();
        ResumeButton.addActionListener(resume);


        JButton MenuButton = new JButton();
        MenuButton.setText("MainMenu");
        MenuButton.setFont(new Font("OCR A Extended", Font.BOLD,20));
        this.add(MenuButton);
        MainMenuHandler menu = new  MainMenuHandler();
        MenuButton.addActionListener(menu);


        JButton ExitButton = new JButton();
        ExitButton.setText("Exit");
        ExitButton.setFont(new Font("OCR A Extended", Font.BOLD,20));
        this.add(ExitButton);
        ExitHandler exit = new ExitHandler();
        ExitButton.addActionListener(exit);
        

        JLabel PauseLabelimage = new JLabel();
        ImageIcon pli = new ImageIcon("Pause.gif");
        PauseLabelimage.setIcon(pli);
        this.add(PauseLabelimage);

      }
       

        private class ResumeHandler implements ActionListener{

          

         public void actionPerformed(ActionEvent event){
 
             
            
             dispose();
         }

      }

      private class MainMenuHandler implements ActionListener{

      //   boolean dead;

      //   MainMenuHandler(boolean dead1){
      //       this.dead = dead1;
      //   }

         public void actionPerformed(ActionEvent event){
            
            
            // GamePanel idk = new GamePanel();
            // idk.running = dead;    

            new MainMenu();
            
             
         }

      }

      private class ExitHandler implements ActionListener{

         public void actionPerformed(ActionEvent event){
 
              System.exit(0);
 
         }

      }
   }
   
