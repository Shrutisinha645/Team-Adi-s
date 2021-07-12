package sun;
import java.awt.*;
import javax.swing.*;

public class aboutus extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutus().setVisible(true);			
	    }
    
        public aboutus() {
            
            super("About Us - Library Management System");
            setBackground(new Color(173, 216, 230));
            setBounds(450, 180, 660, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("sun/images/blob.png"));
            Image i2 = i1.getImage().getScaledInstance(110, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);

            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Lucida Calligraphy", Font.BOLD, 34));
            l3.setBounds(160, 40, 150, 61);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Lucida Calligraphy", Font.BOLD, 34));
            l4.setBounds(70, 90, 405, 46);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v3.1");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(220, 140, 100, 21);
            contentPane.add(l5);

            JLabel l6 = new JLabel("Developed By : Team Adiós");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Contact Us : e20cse857@bennett.edu.in");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Language Used - Core Java \n Concept Used - Swing");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Database Used - MySQL");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);

            JLabel l10 = new JLabel("** HERE COMES THE END OF THE PROJECT **");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(110, 400, 600, 34);
            contentPane.add(l10);          
            contentPane.setBackground(Color.WHITE);
	}
        

}
