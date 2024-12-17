package Main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicBorders.FieldBorder;

public class LoginCode extends JFrame implements ActionListener{
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
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private String sql;
	
	LoginCode(){
		this.setDefaultCloseOperation(LoginCode.DISPOSE_ON_CLOSE);
		this.setBounds(200,50,800,500);
		this.setResizable(true);
		this.setTitle("EdUBoxLogin");
		
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
		
		l1 = new JLabel("Create New Account..");
		l1.setBounds(110,350,160,30);
		l1.setForeground(Color.gray);
		l1.setBackground(Color.white);
		l1.setFont(f);
		c.add(l1);
		
		b1 = new JButton("CREATE");
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
		
		l2 = new JLabel("EDUBoX LoGiN BoX");
		l2.setBounds(300,10,250,40);
		l2.setFont(f1);
		c.add(l2);
		
		pan = new JPanel();
		pan.setLayout(null);
		pan.setBounds(400,50,300,300);
		pan.setBackground(Color.white);
		c.add(pan);
		
		
		l3 = new JLabel("### ENTER YOUR PHONE NUMBER");
		l3.setBounds(10,10,250,40);
		l3.setFont(f);
		pan.add(l3);
		
		tf1 = new JTextField("01");
		tf1.setHorizontalAlignment(JTextField.CENTER);
//		tf1.setHighlighter(null);
		tf1.setBounds(40,50,200,40);
		pan.add(tf1);
		
		l4 = new JLabel("### ENTER YOUR PASSWORD");
		l4.setBounds(10,100,250,40);
		l4.setFont(f);
		pan.add(l4);
		
		pass = new JPasswordField();
		pass.setHorizontalAlignment(JTextField.CENTER);
		pass.setHighlighter(null);
		pass.setBounds(40,150,200,40);
		pass.setEchoChar('#');
		pass.addActionListener(this);
		pan.add(pass);
		
		
		b2 = new JButton("Login your Account");
		b2.setBounds(0,200,300,30);
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
		
		String s, s1;
		s = tf1.getText();
		s1 = pass.getText();
		
		if(s.equals("")) {
			
			JOptionPane.showMessageDialog(null, "Please Enter Your Number");
			
			return false;
		}
		
		if(s1.equals("")) {
			JOptionPane.showMessageDialog(null, "Please Enter Your Password");
			return false;
		}
		
		return true;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b2||e.getSource()==pass) {
			
			if(dataRequired()) {
				
			
			
			String s, s1;
			String ff = "FF-"+new Timestamp(System.currentTimeMillis());
			
			UUID uid = UUID.randomUUID();
					
			SimpleDateFormat da = new SimpleDateFormat("yyyyMMddhhmmss");
			
			String date = da.format(new Timestamp(System.currentTimeMillis()));
			
			s = tf1.getText();
			s1 = pass.getText();
			
			
			
			sql = "SELECT * FROM Users WHERE phone LIKE ? AND pass LIKE ?;";
			
			try {
				pst = con.prepareStatement(sql);
				
				pst.setString(1,s);
				pst.setString(2,s1);
				
				rs = pst.executeQuery();
				
				if(rs.next()) {
					
					
					JOptionPane.showMessageDialog(null, "Login Successfully");
				
					if(rs.getInt("u_type")==1) {
						Admin ad = new Admin(rs.getString("name"), rs.getString("u_id"),rs.getString("sId"),s,s1,rs.getString("email"));
						ad.setVisible(true);
					}else if(rs.getInt("u_type")==2) {
						UserAdmin ad = new UserAdmin(rs.getString("name"), rs.getString("u_id"),rs.getString("sId"),s,s1,rs.getString("email"));
						ad.setVisible(true);
					}else if(rs.getInt("u_type")==3) {
						Teacher ad = new Teacher(rs.getString("name"), rs.getString("u_id"),rs.getString("sId"),s,s1,rs.getString("email"));
						ad.setVisible(true);
					}else if(rs.getInt("u_type")==4) {
						Student ad = new Student(rs.getString("name"), rs.getString("u_id"),rs.getString("sId"),s,s1,rs.getString("email"));
						ad.setVisible(true);
					}else {
						Main ad = new Main(rs.getString("name"), rs.getString("u_id"),rs.getString("sId"),s,s1,rs.getString("email"));
						ad.setVisible(true);
					}
					
//					SignUp si = new SignUp();
//					si.setVisible(true);
					pst.close();
					rs.close();
					dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "User Not Found or Password Not Correct!"+s+" pass: "+s1);
				}
				
			} catch (SQLException e1) {
				
				JOptionPane.showMessageDialog(null, "Data base not Connected!"+s+" pass: "+s1);

				e1.printStackTrace();
			}finally {
				try {
					pst.close();
					rs.close();
				}catch(Exception ef){
					
				}
			}
			
			
			
			
			}
//			System.out.println("time : "+date);
			
		}
		
	}
	
	class Handler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b1) {
				SignUp sign = new SignUp();
				sign.setVisible(true);
				dispose();
				
			}else if(e.getSource()==b2) {
				
			}else {
				
			}
		}
	}
	
	public static void main(String args[]) {
		LoginCode login = new LoginCode();
		login.setVisible(true);
		
	}

}
