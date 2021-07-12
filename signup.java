package sun;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;

public class signup extends JFrame implements ActionListener
{
    private JPanel contentbox;
    private JTextField textfield;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JButton b1,b2;
    private JComboBox box;

    public static void main (String[] args)
    {
        new signup().setVisible(true);
    }
    public signup()
    {
        setBounds(500, 200, 560, 406);
        contentbox = new JPanel();
        contentbox.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentbox);
        contentbox.setBackground(Color.WHITE);
        contentbox.setLayout(null);

        JLabel user = new JLabel("Username :");
        user.setForeground (Color.DARK_GRAY);
        user.setFont (new Font ("Tahoma", Font.BOLD, 14));
        user.setBounds (99, 70, 92, 26);
        contentbox.add(user);

        JLabel nm = new JLabel ("Name :");
        nm.setForeground (Color.DARK_GRAY);
        nm.setFont (new Font ("Tahoma", Font.BOLD, 14));
        nm.setBounds (99, 107, 92, 26);
        contentbox.add(nm);

        JLabel pass = new JLabel ("Password :");
        pass.setForeground (Color.DARK_GRAY);
        pass.setFont (new Font ("Tahoma", Font.BOLD, 14));
        pass.setBounds (99, 144, 92, 26);
        contentbox.add(pass);

        JLabel ans = new JLabel ("Answer :");
        ans.setForeground (Color.DARK_GRAY);
        ans.setFont (new Font ("Tahoma", Font.BOLD, 14));
        ans.setBounds (99, 218, 92, 26);
        contentbox.add(ans);   
        
        box = new JComboBox();
        box.setModel (new DefaultComboBoxModel (new String[] {"Your Nickname?", "Your Lucky Number", "Your child SuperHero?", "Your Childhood Name", "Your School Name"}));
        box.setBounds (265, 186, 148, 20);
        contentbox.add (box);

        JLabel sec = new JLabel ("Security Question :");
        sec.setForeground (Color.DARK_GRAY);
        sec.setFont (new Font ("Tahoma", Font.BOLD, 14));
        sec.setBounds (99, 181, 140, 26);
        contentbox.add(sec);

        textfield = new JTextField();
        textfield.setBounds (265, 75, 148, 20);
        contentbox.add(textfield);
        textfield.setColumns(10);

        textfield1 = new JTextField();
        textfield1.setBounds (265, 112, 148, 20);
        contentbox.add(textfield1);
        textfield1.setColumns(10);

        textfield2 = new JTextField();
        textfield2.setBounds (265, 149, 148, 20);
        contentbox.add(textfield2);
        textfield2.setColumns(10);

        textfield3 = new JTextField();
	    textfield3.setColumns(10);
	    textfield3.setBounds(265, 224, 148, 20);
    	contentbox.add(textfield3);
        
        b1 = new JButton ("Create");
        b1.addActionListener(this);
        b1.setFont (new Font("Tahoma", Font.BOLD, 13));
        b1.setBounds (140, 272, 100, 30);
        b1.setBackground (Color.BLACK);
        b1.setForeground (Color.WHITE);
        contentbox.add(b1);

        b2 = new JButton ("Back");
        b2.addActionListener(this);
        b2.setFont (new Font("Tahoma", Font.BOLD, 13));
        b2.setBounds (300, 271, 100, 30);
        b2.setBackground (Color.BLACK);
        b2.setForeground (Color.WHITE);
        contentbox.add(b2);

        JPanel p = new JPanel();
        p.setForeground (new Color(34, 139, 34));
        p.setBorder (new TitledBorder(new LineBorder(new Color(128, 128, 0), 2), "Create-Account", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(34,139, 34)));
        p.setBounds(31, 33, 476, 296);
        p.setBackground(Color.WHITE);
        contentbox.add(p);
    }
    public boolean checkusername(String textfield)
    {
        
        String abc= "Select * from users where username having count>0"+new String[]{textfield};
        if(abc.equals(""))
            return true;
        else
            return false;
    }

    public void actionPerformed(ActionEvent a)
    {
        
        try
        {
            conn b = new conn();
            Statement rr= b.c.createStatement();
            
            if (textfield.getText().toString().equals("") || textfield1.getText().toString().equals("") || textfield2.getText().toString().equals("") || textfield3.getText().toString().equals("") )
            {
                JOptionPane.showMessageDialog(null, "Please enter all the details!");
            }

            else {
            if (checkusername(textfield.getText().toString())==false)
            {
              
                if (a.getSource()==b1){
                String s = "insert into account (username, name, password, sec_q, sec_ans) values(?,?,?,?,?)";
                PreparedStatement st = b.c.prepareStatement(s);

                st.setString(1, textfield.getText());
                st.setString(2, textfield1.getText());
                st.setString(3, textfield2.getText());
                st.setString(4, (String) box.getSelectedItem());
                st.setString(5, textfield3.getText());

                int i = st.executeUpdate();
                
                if(i>0)
                {
                    JOptionPane.showMessageDialog(null, "Successfully Created");
                }
                
                textfield.setText("");
                textfield1.setText("");
                textfield2.setText("");
                textfield3.setText("");
            }

        }   
        else{
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }        
    }
            if(a.getSource()==b2)
            {
                this.setVisible(false);
                new login().setVisible(true);
            }
        
        
    }catch (Exception e){

        }
        
    }
}
