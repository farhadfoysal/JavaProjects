package Main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Main.Login.Handler;

public class SignUp extends JFrame implements ActionListener {
	private ImageIcon icon, img, img2, img3, img4, img5, img6;
	
	private Container c;
	
	private JLabel l1,l2,l3,l4,l5,l6,l7;
	private JButton b1,b2,b3,b4,b5,b6,b7;
	private JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	private JPasswordField pass, pass1, pass2;
	
	private JTextArea t1,t2,t3,t4,t5;
	private Font f,f1,f2,f3,f4,f5;
	
	private JPanel pan, pan1, pan2, pan3, pan4, pan5, pan6;
	
	private Connection con = null;
	private PreparedStatement pst = null, pstt=null;
	private ResultSet rs = null;
	private String sql,sqll;
	
	SignUp(){
		this.setDefaultCloseOperation(SignUp.DISPOSE_ON_CLOSE);
		this.setBounds(200,50,800,500);
		this.setTitle("EdUBoxSignUp");
		this.setResizable(true);
		this.setBackground(Color.GRAY);
		
		icon = new ImageIcon(getClass().getResource("img.png"));
		this.setIconImage(icon.getImage());
		
		this.initComponents();
		
		con = DBConnection.ConnectionDB();
	}
	
	void initComponents() {
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		
		img = new ImageIcon(getClass().getResource("img.png"));
		l2 = new JLabel(img);
		l2.setBounds(100,50,250,300);
		c.add(l2);
		
		f = new Font("Arial",Font.BOLD,14);
		f1 = new Font("Arial",Font.BOLD,22);
		
		l1 = new JLabel("Already an Account.?");
		l1.setBounds(110,350,160,30);
		l1.setForeground(Color.gray);
		l1.setBackground(Color.white);
		l1.setFont(f);
		c.add(l1);
		
		b1 = new JButton("LOGIN");
		b1.setBounds(260,350,100,30);
		b1.setForeground(Color.pink);
		b1.setBackground(Color.red);
		b1.setFont(f);
		c.add(b1);
		
		t1 = new JTextArea("hi");
		t1.setBounds(50,50,150,150);
		t1.setBackground(Color.white);
//		c.add(t1);
		
		Handler handler = new Handler();
		b1.addActionListener(handler);
		
		l2 = new JLabel("EDUBoX NEW ACCOUNT BoX");
		l2.setBounds(250,10,350,40);
		l2.setFont(f1);
		c.add(l2);
		
		pan = new JPanel();
		pan.setLayout(null);
		pan.setBounds(400,50,300,400);
		pan.setBackground(Color.white);
		c.add(pan);
		
		
		l3 = new JLabel("### ENTER YOUR PHONE NUMBER");
		l3.setBounds(10,5,250,30);
		l3.setFont(f);
		pan.add(l3);
		
		tf1 = new JTextField("01");
		tf1.setHorizontalAlignment(JTextField.CENTER);
//		tf1.setHighlighter(null);
		tf1.setBounds(40,40,200,30);
		pan.add(tf1);
		
		l4 = new JLabel("### ENTER YOUR PASSWORD");
		l4.setBounds(10,75,250,30);
		l4.setFont(f);
		pan.add(l4);
		
		pass = new JPasswordField();
		pass.setHorizontalAlignment(JTextField.CENTER);
		pass.setHighlighter(null);
		pass.setBounds(40,110,200,30);
		pass.setEchoChar('#');
		pan.add(pass);
		
		l5 = new JLabel("### ENTER YOUR SCHOOL NAME");
		l5.setBounds(10,145,300,30);
		l5.setFont(f);
		pan.add(l5);
		
		tf2 = new JTextField();
		tf2.setHorizontalAlignment(JTextField.CENTER);
//		tf2.setHighlighter(null);
		tf2.setBounds(40,180,200,30);
		pan.add(tf2);
		
		l6 = new JLabel("### ENTER YOUR SCHOOL E-mail");
		l6.setBounds(10,215,300,30);
		l6.setFont(f);
		pan.add(l6);
		
		tf3 = new JTextField("@gmail.com");
		tf3.setHorizontalAlignment(JTextField.CENTER);
//		tf3.setHighlighter(null);
		tf3.setBounds(40,250,200,30);
		pan.add(tf3);
		
		b2 = new JButton("Sign Up New Account");
		b2.setBounds(0,285,300,30);
		b2.setFont(f);
		b2.setForeground(Color.white);
		b2.setBackground(Color.gray);
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setContentAreaFilled(true);
		b2.setBorder(null);
		
		pan.add(b2);
		
		LineBorder line = new LineBorder(Color.black);
		EmptyBorder margin = new EmptyBorder(5,15,5,15);
		Border compound = new CompoundBorder(line,margin);
		b2.setBorder(compound);
		b2.setOpaque(true);
		
		b2.addActionListener(this);
		
		
	}
	
	public boolean dataRequired() {
		
		String s, s1,s2,s3, s4;
		s1 = tf1.getText();
		s2 = pass.getText();
		s3 = tf2.getText();
		s4 = tf3.getText();
		
		if(s1.equals("")) {
			
			JOptionPane.showMessageDialog(null, "Please Enter Admin Phone Number");
			
			return false;
		}
		
		if(s2.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Enter a New Password");
			return false;
		}
		
		if(s3.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Enter Your School Name");
			return false;
		}
		
		if(s4.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Enter Your School Email");
			return false;
		}
		
		return true;
		
	}
	
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b2) {
			
			if(dataRequired()) {
			
			String s, s1, s2, s3, s4, s5;
			
			UUID uuid = UUID.randomUUID();
			s = uuid.toString();
			
			s1 = tf1.getText();
			s2 = pass.getText();
			s3 = tf2.getText();
			s4 = tf3.getText();
			
			Random dice = new Random();
			int num;
			num = dice.nextInt(10);
			
			SecureRandom sec = new SecureRandom();
			
			int nu = sec.nextInt(9);

			Timestamp uidtime = new Timestamp(System.currentTimeMillis());
			String id = uidtime.toString();
			
			LocalDate date = LocalDate.now();
			
			int year = date.getYear();
			
			int m = (int) (Math.random()*year) + 1;
			String mm = String.valueOf(m);
			
//			JOptionPane.showMessageDialog(null, " name "+s+" rand  "+mm+" uuid ");
			
			SimpleDateFormat da = new SimpleDateFormat("yyyyMMddhhmmss");
			
			String u_id = da.format(new Timestamp(System.currentTimeMillis()));
			
			sql = "INSERT INTO school (sId,sPhone,sPass,sName,sEmail) VALUES(?,?,?,?,?)";
			
			try {
				pst = con.prepareStatement(sql);
				
				pst.setString(1, s);
				pst.setString(2, s1);
				pst.setString(3, s2);
				pst.setString(4, s3);
				pst.setString(5, s4);
				
				pst.execute();
				
				
				
				sqll = "INSERT INTO Users (u_id,name,phone,pass,email,u_type,sId) VALUES (?,?,?,?,?,?,?)";
				
				try {
					pstt = con.prepareStatement(sqll);
					
					pstt.setString(1, u_id);
					pstt.setString(2, s3);
					pstt.setString(3, s1);
					pstt.setString(4, s2);
					pstt.setString(5, s4);
					pstt.setString(6, "1");
					pstt.setString(7, s);
					
					pstt.execute();
					
					JOptionPane.showMessageDialog(null, "New Account Created Successfully! ThankYou");
					
					
					Login lg = new Login();
					lg.setVisible(true);
					
					dispose();
					
				} catch (SQLException e2) {
					JOptionPane.showMessageDialog(null, "School User Data not Inserted, Try Again!"+e2);
					e2.printStackTrace();
				}
				
				
			} catch (SQLException e1) {
				
				JOptionPane.showMessageDialog(null, "Data not Inserted, Try Again!"+e1);
				e1.printStackTrace();
			}
			

			}
			
		}
		
	}
	
	class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
				
			}else if(e.getSource()==b2) {
				
			}else {
				
			}
		}
	}
	
	public static void main(String args[]) {
		SignUp signUp = new SignUp();
		signUp.setVisible(true);
		
		
		
	}


}
