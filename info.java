package sun;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class info extends JFrame{

    private JPanel contentpane;
    public static void main (String args[]){
        new info().setVisible(true);
    }
    public info(){
        super("Guide - Library Management System");
        setBounds(500, 250, 700, 500);
        contentpane = new JPanel();
        setContentPane(contentpane);
        contentpane.setLayout(null);

        JLabel i= new JLabel("Library");
        i.setForeground(new Color(0, 250, 154));
        i.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        i.setBounds(7, 90, 405, 40);
        contentpane.add(i);

        JLabel j= new JLabel("Management System");
        j.setForeground(new Color(127, 255, 0));
        j.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        j.setBounds(70, 90, 405, 40);
        contentpane.add(j);

        JLabel k= new JLabel("v3.1");
        k.setForeground(new Color(30, 144, 255));
        k.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        k.setBounds(185, 140, 100, 21);
        contentpane.add(k);

        JLabel l= new JLabel("Delevoped By : Team Adiós");
        l.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l.setBounds(70, 198, 600, 35);
        contentpane.add(l);

        JLabel qq = new JLabel("Back");
		qq.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				home home = new home();
				home.setVisible(true);
            }
		});
		qq.setForeground(new Color(204, 0, 102));
		qq.setFont(new Font("Tahoma", Font.BOLD, 18));
		ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("sun/images/backimage.png"));
	    Image b = a.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    	ImageIcon c = new ImageIcon(b);
	    qq.setIcon(c);
		qq.setBounds(85, 40, 72, 33);
		contentpane.add(qq);

        JTextArea m= new JTextArea("Library management system aims in developing a \n computerized system  to control the main functions of a library.\n It maintains the record and database \nof the library that is useful to enter \nnew books & record issued with their respective \nsubmission dates");
        m.setFont(new Font("Trebuchet NS", Font.BOLD, 20));
        m.setBounds(70, 260, 600, 200);
        contentpane.add(m);

        contentpane.setBackground(Color.WHITE);
    }
}