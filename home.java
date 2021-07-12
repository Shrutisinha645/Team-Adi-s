package sun;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class home extends JFrame implements ActionListener{

	private JPanel contentbox;
    private JButton b1,b2,b3,b4,b5,b6;

	public static void main(String[] args) {
        new home().setVisible(true);
	}
    public home() {
        setBounds(250, 50, 803, 750);
        contentbox = new JPanel();
        setContentPane(contentbox);
        contentbox.setLayout(null);

        JMenuBar menu = new JMenuBar();
        menu.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
        menu.setBackground (new Color(70, 210, 240));
        menu.setBounds(0, 10, 1000, 35);
        contentbox.add(menu);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
             
        JMenuItem logout = new JMenuItem("Logout");
        logout.setBackground(new Color(211, 211, 211));
        logout.setForeground(new Color(105, 105, 105));
        logout.addActionListener(this);
        exit.add(logout);
            
        JMenuItem exit1 = new JMenuItem("Exit");
        exit1.setBackground(new Color(211, 211, 211));
        exit1.setForeground(new Color(105, 105, 105));
        exit1.addActionListener(this);
        exit.add(exit1);
                
        JMenu help = new JMenu("Help");
        help.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
        
        JMenuItem readme = new JMenuItem("Read Me");
        readme.setBackground(new Color(211, 211, 211));
        readme.setForeground(new Color(105, 105, 105));
        help.add(readme);

        JMenuItem aboutus = new JMenuItem("About Us");
        aboutus.setBackground(new Color(211, 211, 211));
        aboutus.setForeground(new Color(105, 105, 105));
        aboutus.addActionListener(this);
        help.add(aboutus);

        JMenu records = new JMenu("Record");
        records.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
            
        JMenuItem bookdetails = new JMenuItem("Book Details");
        bookdetails.addActionListener(this);
        bookdetails.setBackground(new Color(211, 211, 211));
        bookdetails.setForeground(Color.DARK_GRAY);
        records.add(bookdetails);

        JMenuItem studentdetails = new JMenuItem("Student Details");
        studentdetails.setBackground(new Color(211, 211, 211));
        studentdetails.setForeground(Color.DARK_GRAY);
        studentdetails.addActionListener(this);
        records.add(studentdetails);
            
        menu.add(records);
        menu.add(help);
        menu.add(exit);

        JLabel l1 = new JLabel("Library Management System");
        l1.setForeground(new Color(130, 51, 102));
        l1.setFont(new Font("Segoe Print", Font.BOLD, 30));
        l1.setBounds(185, 35, 701, 80);
        contentbox.add(l1);

        JLabel l2 = new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("sun/images/addingbook.png"));
        Image i2 = i1.getImage().getScaledInstance(162, 140,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(60, 150, 158, 152);
        contentbox.add(l2);

        JLabel l3 = new JLabel("");
        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("sun/images/statisticsimage.png"));
        Image i5 = i4.getImage().getScaledInstance(180, 180,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(315, 160, 134, 128);
        contentbox.add(l3);

        JLabel l4 = new JLabel("");
        ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("sun/images/addstudentimage.png"));
        Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(530, 148, 225, 152);
        contentbox.add(l4);

        b1 = new JButton("Add Books");
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(60, 320, 159, 44);
        contentbox.add(b1);

        b2 = new JButton("Statistics");
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(313, 320, 139, 44);
        contentbox.add(b2);

        b3 = new JButton("Add Student");
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(562, 320, 167, 44);
        contentbox.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(20, 120, 750, 260);
        panel.setBackground(Color.WHITE);
        contentbox.add(panel);

        b4 = new JButton("Issue Book");
        b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(76, 620, 143, 41);
        contentbox.add(b4);

        b5 = new JButton("Return Book");
        b5.addActionListener(this);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(310, 620, 159, 41);
        contentbox.add(b5);

        b6 = new JButton("About Us");
        b6.addActionListener(this);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(562, 620, 159, 43);
        contentbox.add(b6);

        JLabel l5 = new JLabel("");
        ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("sun/images/issuebookimage.png"));
        Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(60, 440, 159, 163);
        contentbox.add(l5);

        JLabel l6 = new JLabel("");
        ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("sun/images/returnbookimage.png"));
        Image i14 = i13.getImage().getScaledInstance(140, 140,Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(318, 443, 139, 152);
        contentbox.add(l6);

        JLabel l7 = new JLabel("");
        ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("sun/images/aboutusimage.png"));
        Image i17 = i16.getImage().getScaledInstance(150, 130,Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(562, 453, 157, 152);
        contentbox.add(l7);

        JPanel l8 = new JPanel();
        l8.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "Action", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(233, 150, 122)));
        l8.setBounds(20, 420, 750, 270);
        l8.setBackground(Color.WHITE);
        contentbox.add(l8);
            
        getContentPane().setBackground(Color.WHITE);
        contentbox.setBackground(Color.WHITE);
    }
    public void actionPerformed (ActionEvent a){
        String msg = a.getActionCommand();
        if(msg.equals("Logout")){
            setVisible(false);
            new login().setVisible(true);
        }
        else if(msg.equals("Exit")){
            System.exit(ABORT);
        }
        else if(msg.equals("Read Me")){
            setVisible(false);
            new info().setVisible(true);
        }
        else if(msg.equals("About Us")){
            setVisible(false);
            new aboutus().setVisible(true);
        }
        else if(msg.equals("Book Details")){
            setVisible(false);
            new bookdetail().setVisible(true);
        }
        else if(msg.equals("Student Details")){
            setVisible(false);
            new sdetails().setVisible(true);
        }
        if(a.getSource() == b1){
            this.setVisible(false);
            new addbook().setVisible(true);
        }
        if(a.getSource() == b2){
            this.setVisible(false);
            new stats().setVisible(true);
        }
        if(a.getSource() == b3){
            this.setVisible(false);
            new addstudent().setVisible(true);
        }
        if(a.getSource() == b4){
            this.setVisible(false);
            new issue().setVisible(true);
        }
        if(a.getSource() == b5){
            this.setVisible(false);
            new returnbook().setVisible(true);
        }
        if(a.getSource() == b6){
            this.setVisible(false);
            new aboutus().setVisible(true);
        
        }  
    }
}
