package jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Loginpage {

	public static void main(String[] args) {
		 JFrame f = new JFrame("Login");
		 f.setSize(100, 100);
	     f.setLayout(null);
	     f.setVisible(true);
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     final JTextField tf1 = new JTextField();
	     final JTextField tf2 = new JTextField();
	     JLabel name,password;
	     JLabel username1 = new JLabel();
	     JLabel password1 = new JLabel();
	     name = new JLabel("Username  :");
	     password= new JLabel("Enter your password:");
	     name.setBounds(50, 100, 100, 40);
	     password.setBounds(50, 150, 200, 40);
	     tf1.setBounds(200, 100, 100, 30);
	     tf2.setBounds(200, 150, 100, 30);
	     f.add(name);
	     f.add(password);
	     f.add(tf1);
	     f.add(tf2);
	     Sample s = new Sample();
	     JButton b = new   JButton("Submit");
	     b.setBounds(200, 200, 100, 30);
	     JButton b1 = new   JButton("Register");
	     b1.setBounds(200, 250, 100, 30);
	     f.add(b);
	     f.add(b1);
	     String nam=tf1.getText();
	     String passwor=tf2.getText();

	     b.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){ 
		    		Connection con;
		    		int count =0;
					try {
						Class.forName("com.mysql.jdbc.Driver");  
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
						Statement smt = con.createStatement();
						ResultSet rs= smt.executeQuery("select name,password from user") ;
						while(rs.next())
						{
							if(rs.getString(1).equals(nam)&&(rs.getString(2).equals(passwor)))
							{
							System.out.println("Login sucess");
							count++;
							break;
						}
						}
						if(count==0)
						{
							System.out.println("invalid username or password");
						}
					} catch (SQLException | ClassNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
		    	}
	     });
	     b1.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){ 
		    		s.reg();
		    	}

	     });
	}
}



