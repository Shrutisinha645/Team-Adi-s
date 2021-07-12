package sun;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class loadframe extends JFrame implements Runnable {
    private JPanel contentbox;
    private JProgressBar bar;
    Connection conn;
    int n;
    Thread t;

    public static void main (String[] args){
        new loadframe().setVisible(true);
    }
    public void set(){
        t.start();
    }
    public void run(){
        try{
            for(int i=0; i<200; i++){
                n=n+1;
                int m = bar.getMaximum();
                int v = bar.getValue();
                if(v<m){
                    bar.setValue(bar.getValue()+1);
                }else {
                    i=201;
                    setVisible(false);
                    new home().setVisible(true);
                }
                Thread.sleep(30);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public loadframe(){
        super("Loading");
        t= new Thread((Runnable) this);
        setBounds(450, 190, 600, 390);
        contentbox = new JPanel();
        setContentPane(contentbox);
        contentbox.setLayout(null);

        JLabel lm = new JLabel ("Smart Library v3.1");
        lm.setForeground(new Color(72, 209, 204));
        lm.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
        lm.setBounds(130, 46, 500, 35);
        contentbox.add(lm);

        bar = new JProgressBar();
        bar.setFont (new Font("Tahoma", Font.BOLD, 12));
        bar.setStringPainted(true);
        bar.setBounds(130, 135, 300, 25);
        contentbox.add(bar);

        JLabel lm2 = new JLabel("Please Wait .....");
        lm2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
        lm2.setForeground(new Color(160, 82, 45));
        lm2.setBounds(212, 172, 150, 20);
        contentbox.add(lm2);

        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        p.setBounds(0, 0, 590, 390);
        contentbox.add(p);

        set();
    }   
}