import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
public class Surveyor implements ActionListener {
    JFrame j;
    public void signup(){
         j = new JFrame("Hello");

        JLabel l1=new JLabel("Name");  
        l1.setBounds(0,50, 120,50);  
        JTextField username = new JTextField("Enter Name");
        username.setBounds(120,50,120,50);
        JLabel l2=new JLabel("Password");  
        l2.setBounds(0,100, 120,50); 
        JPasswordField password = new JPasswordField();
        password.setBounds(120,100,120,50);
        JLabel l3=new JLabel("Confirm Password");  
        l3.setBounds(0,150, 120,50); 
        JPasswordField confirmpassword = new JPasswordField();
        confirmpassword.setBounds(120,150,120,50);
        JButton b = new JButton("Sign Up");
        b.setBounds(160,300,100,30);
        j.add(username);  j.add(b);j.add(password); j.add(confirmpassword);j.add(l1);j.add(l2);j.add(l3);
        b.addActionListener(this);
        j.setSize(400,500);
        j.setLayout(null);
        j.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        final JFrame f= new JFrame("PopupMenu Example");  
        final JPopupMenu popupmenu = new JPopupMenu("Edit");   
        JMenuItem cut = new JMenuItem("Cut");  
        JMenuItem copy = new JMenuItem("Copy");  
        JMenuItem paste = new JMenuItem("Paste");  
        popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste);        
        f.addMouseListener(new MouseAdapter() {  
           public void mouseClicked(MouseEvent e) {              
               popupmenu.show(f , e.getX(), e.getY());  
           }                 
        });  
        f.add(popupmenu);   
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }
}