package sun;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class addstudent extends JFrame implements ActionListener{

    private JPanel contentbox;
    private JTextField t1,t2,t3;
    private JComboBox box, box1, box2, box3;
    JButton b1,b2;
    public static void main(String[] args) {
        new addstudent().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
	    t1.setText("" + rd.nextInt(10000 + 1));
    }

    public addstudent() {
        super("Add Student");
	    setBounds(400, 200, 395, 430);
	    contentbox = new JPanel();
	    contentbox.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentbox);
	    contentbox.setLayout(null);

	    JLabel l1 = new JLabel("Student_id");
	    l1.setForeground(new Color(25, 25, 112));
	    l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    l1.setBounds(64, 63, 102, 22);
	    contentbox.add(l1);

    	JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(25, 25, 112));
	    l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(64, 97, 102, 22);
	    contentbox.add(l2);

	    JLabel l3 = new JLabel("Father's Name");
	    l3.setForeground(new Color(25, 25, 112));
	    l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	    l3.setBounds(64, 130, 102, 22);
	    contentbox.add(l3);

	    JLabel l4 = new JLabel("Branch");
	    l4.setForeground(new Color(25, 25, 112));
	    l4.setFont(new Font("Tahoma", Font.BOLD, 14));
	    l4.setBounds(64, 209, 102, 22);
        contentbox.add(l4);

        JLabel l5 = new JLabel("Year");
	    l5.setForeground(new Color(25, 25, 112));
	    l5.setFont(new Font("Tahoma", Font.BOLD, 14));
	    l5.setBounds(64, 242, 102, 22);
	    contentbox.add(l5);

	    JLabel l6 = new JLabel("Semester");
	    l6.setForeground(new Color(25, 25, 112));
	    l6.setFont(new Font("Tahoma", Font.BOLD, 14));
	    l6.setBounds(64, 275, 102, 22);
	    contentbox.add(l6);

    	t1 = new JTextField();
    	t1.setEditable(false);
	    t1.setForeground(new Color(47, 79, 79));
    	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
    	t1.setBounds(174, 66, 156, 20);
    	contentbox.add(t1);
    	t1.setColumns(10);

    	t2 = new JTextField();
    	t2.setForeground(new Color(47, 79, 79));
    	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t2.setColumns(10);
    	t2.setBounds(174, 100, 156, 20);
    	contentbox.add(t2);

    	t3 = new JTextField();
    	t3.setForeground(new Color(47, 79, 79));
    	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
    	t3.setColumns(10);
    	t3.setBounds(174, 133, 156, 20);
    	contentbox.add(t3);

	    box = new JComboBox();
    	box.setModel(new DefaultComboBoxModel(new String[] { "Mechanical", "CSE", "IT", "Civil", "Automobile", "EEE", "LLB","Finance","Journalism","Other" }));
    	box.setForeground(new Color(47, 79, 79));
    	box.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
    	box.setBounds(176, 211, 154, 20);
    	contentbox.add(box);

    	box1 = new JComboBox();
    	box1.setModel(new DefaultComboBoxModel(new String[] { "First", "Second", "Third", "Four" }));
	    box1.setForeground(new Color(47, 79, 79));
        box1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
    	box1.setBounds(176, 244, 154, 20);
    	contentbox.add(box1);

    	box2 = new JComboBox();
    	box2.setModel(new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
    	box2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
    	box2.setForeground(new Color(47, 79, 79));
    	box2.setBounds(176, 277, 154, 20);
    	contentbox.add(box2);

    	b1 = new JButton("ADD");
    	b1.addActionListener(this);
    	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
    	b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    	contentbox.add(b1);

    	b2 = new JButton("Back");
    	b2.addActionListener(this);
    	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
    	b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	    contentbox.add(b2);

	    JLabel l7 = new JLabel("Course");
	    l7.setForeground(new Color(25, 25, 112));
    	l7.setFont(new Font("Tahoma", Font.BOLD, 14));
    	l7.setBounds(64, 173, 102, 22);
    	contentbox.add(l7);

    	box3 = new JComboBox();
    	box3.setModel(new DefaultComboBoxModel(new String[] { "B.A","B.Ed", "B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "M.Sc", "B.Com", "M.Com" }));
	    box3.setForeground(new Color(47, 79, 79));
	    box3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
    	box3.setBounds(176, 176, 154, 20);
	    contentbox.add(box3);

	    JPanel panel = new JPanel();
    	panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add-Student", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
	    panel.setBackground(new Color(211, 211, 211));
    	panel.setBounds(10, 38, 358, 348);
        contentbox.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);
        contentbox.add(panel);
	    random();
    }
    
    public void actionPerformed(ActionEvent ae){
        try{ 
            if(ae.getSource() == b1){
                try{
                    conn con = new conn();
                    String sql = "insert into student(student_id, name, father, course, branch, year, semester) values(?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
		            st.setString(1, t1.getText());
		            st.setString(2, t2.getText());
		            st.setString(3, t3.getText());
		            st.setString(4, (String) box3.getSelectedItem());
		            st.setString(5, (String) box.getSelectedItem());
		            st.setString(6, (String) box1.getSelectedItem());
		            st.setString(7, (String) box2.getSelectedItem());
                    int i = st.executeUpdate();
                    if (i > 0){
                        JOptionPane.showMessageDialog(null, "Successfully Added");
                        this.setVisible(false);
                        new home().setVisible(true);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
		        new home().setVisible(true);		
            }
        }
        catch(Exception e){    
        }
    }
}