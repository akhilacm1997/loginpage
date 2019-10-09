package jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Sample {

	public void reg()
	{
		JFrame f = new JFrame("Registration");
		 f.setSize(500, 500);
	     f.setLayout(null);
	     f.setVisible(true);
	     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     final JTextField tf1 = new JTextField();
	     final JTextField tf2 = new JTextField();
	     final JTextField tf3 = new JTextField();
	     final JTextField tf4 = new JTextField();
	     final JTextField tf5 = new JTextField();
	     final JTextField tf6 = new JTextField();
	     JLabel name,id,address,phoneno;
	     JLabel name1 = new JLabel();
	     JLabel address1 = new JLabel();
	     JLabel id11= new JLabel();
	     JLabel phoneno1 = new JLabel();
	     JLabel password = new JLabel("password");
	     JLabel repassword = new JLabel("repassword");
	     name = new JLabel("Name   :");
	     address= new JLabel("address  :");
	     id= new JLabel("proof  :");
	     phoneno= new JLabel("phone  :");
	     name.setBounds(50, 100, 100, 40);
	     address.setBounds(50, 150, 100, 40);
	     id.setBounds(50, 200, 100, 40);
	     phoneno.setBounds(50, 250, 100, 40);
	     password.setBounds(50, 300, 100, 40);
	     repassword.setBounds(50, 350, 100, 40);
	     tf1.setBounds(200, 100, 100, 30);
	     tf2.setBounds(200, 150, 100, 30);
	     tf3.setBounds(200, 200, 100, 30);
	     tf4.setBounds(200, 250, 100, 30);
	     tf5.setBounds(200, 300, 100, 30);
	     tf6.setBounds(200, 350, 100, 30);
	     name1.setBounds(50, 550, 100, 40);
	     address1.setBounds(50, 600, 100, 40);  
	     id11.setBounds(50, 650, 100, 40);
	     phoneno1.setBounds(50, 700, 100, 40);
	     f.add(name);
	     f.add(address);
	     f.add(phoneno);
	     f.add(id);
	     f.add(tf1);
	     f.add(tf2);
	     f.add(tf3);
	     f.add(tf4);
	     f.add(tf5);
	     f.add(tf6);
	     f.add(password);
	     f.add(repassword);
	     JButton b = new   JButton("submit");
	     b.setBounds(200, 500, 100, 30);
	     JLabel tf = new  JLabel();
	     tf.setBounds(200, 530, 200, 30);
	     ConnectionManager obj1=  new ConnectionManager();
	     b.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){ 
		    		f.add(name1);f.add(address1);f.add(id11);f.add(phoneno1);
		    		tf.setText("****registration is completed ****"); 
		    		name1.setText("name          :"+tf1.getText());
		    		address1.setText("address    :"+tf2.getText());
		    		id11.setText("proof id       :"+tf3.getText());
		    		phoneno1.setText("phone      :"+tf4.getText());
		    		  String nam=tf1.getText();
		    		     String  addres=tf1.getText();
		    		     String proo=tf3.getText();
		    		     String phon=tf4.getText();
		    		     String passwor=tf5.getText();
		    		     String repasswor=tf6.getText();
		    		Connection con;
					try {
						Class.forName("com.mysql.jdbc.Driver");  
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
						Statement smt = con.createStatement();
						smt.execute("insert into user values('"+nam+"','"+addres+"','"+phon+"','"+proo+"','"+passwor+"','"+repasswor+"')");
					} catch (SQLException | ClassNotFoundException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} 
		           
				        }  
				    }); 
	    
	     
	     
	     f.add(b);
	     f.add(tf);
	}
	}


