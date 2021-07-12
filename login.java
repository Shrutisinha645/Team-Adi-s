package sun;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener
{
    private JPanel panel;
    private JTextField textfield;
    private JPasswordField passwordfield;
    private JButton b1,b2,b3;

    public login()
    {
        setBackground (new Color(169, 169, 169));
        setBounds (500, 200, 585, 410);

        panel = new JPanel();
        panel.setBackground (new Color(176, 224, 230));
        setContentPane (panel);
        panel.setLayout (null);

        JLabel l1 = new JLabel ("Username : ");
        l1.setBounds (138 ,86, 95, 30);
        panel.add(l1);

        JLabel l2=new JLabel("Password : ");
        l2.setBounds(139, 121, 95, 30);
        panel.add(l2);

        textfield = new JTextField();
        textfield.setBounds(225, 93, 157, 20);
        panel.add(textfield);

        passwordfield = new JPasswordField();
        passwordfield.setBounds(225, 128, 157, 20);
        panel.add(passwordfield);

        b1 = new JButton ("Login");
        b1.addActionListener (this);
        b1.setForeground (new Color(46, 139, 87));
        b1.setBackground (new Color(250, 250, 210));
        b1.setBounds (162, 181, 113, 39);
        panel.add(b1);

        b2 = new JButton ("SignUp");
        b2.addActionListener (this);
        b2.setForeground (new Color(139, 69, 19));
        b2.setBackground (new Color(255, 235, 205));
        b2.setBounds (308, 181, 113, 39);
        panel.add(b2);

        b3 = new JButton ("Forgot Password");
        b3.addActionListener (this);
        b3.setForeground (new Color (205, 92, 92));
        b3.setBackground (new Color (253, 245, 230));
        b3.setBounds(203, 240, 179, 39);
        panel.add(b3);  
        
        JLabel l3  = new JLabel("Trouble in Login?");
        l3.setFont(new Font("Tahoma",Font.PLAIN, 15));
        l3.setForeground(new Color(255,0,0));
        l3.setBounds(70,246,130,20);
        panel.add(l3);
        
    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource() ==b1)
    
        {
            Boolean status = false;
            try{
                conn b = new conn();
                if (textfield.getText().toString().equals("") || passwordfield.getText().toString().equals(""));
            {
                JOptionPane.showMessageDialog(null, "Please enter all the details!");
            }
                String sql ="select * from account where username=? and password=?";
                PreparedStatement st = b.c.prepareStatement(sql);

                st.setString (1,textfield.getText());
                st.setString (2,passwordfield.getText());

                ResultSet r = st.executeQuery();
                if(r.next())
                {
                    this.setVisible (false);
                    new loadframe().setVisible(true);    
                } else 
                JOptionPane.showMessageDialog (null,"Invalid Login!");
                
            }catch (Exception e1)
            {
                e1.printStackTrace();
            }
        }
        if (a.getSource()==b2)
        {
            
            setVisible(false);
            signup up=new signup();
            up.setVisible(true); 
            
        }  
    
        if (a.getSource()==b3)
        {
            setVisible(false);
            dontknow f=new dontknow();
            f.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        new login().setVisible(true);
    }
}