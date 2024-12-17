package Main.std;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import Main.fcomf.ImageUtil;
import Main.fcomf.TimeUtil;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.lang.foreign.GroupLayout;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.DriverManager;
import net.proteanit.sql.DbUtils;
import org.apache.commons.dbutils.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.io.*;
import java.io.File;
import java.text.*;

import javax.imageio.*;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;
import javax.swing.SpinnerDateModel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

import Main.DBConnection;
import Main.Course.viewCourse;
import Main.fcomf.HintTextField;
import Main.scl.School;
import Main.scl.schoolData;
import Main.std.student;
import Main.std.studentData;


public class viewStudent extends JFrame implements ChangeListener, ActionListener, ItemListener, KeyListener, MouseListener, MouseMotionListener, WindowListener, FocusListener, WindowFocusListener, MouseWheelListener, WindowStateListener{
	private Connection con = null;
	private PreparedStatement pst = null, pstt=null, pstaY=null;
	private ResultSet rs = null, rsaY=null;
	private String sql,sqll,sqlaY;
	private Container c;
	private Font f;
	private Font f1;
	private Font f2;
	private Font f3;
	private ImageIcon icon;
	private JButton editdetailsbutton;
	private JButton marksheetbutton;
	private JButton backbutton;
	private JLabel lblLastLogin;
	
	private student s;
	private JPanel pan1;
	private JPanel pan2;
	private JLabel stdIdl;
	private JLabel stdNamel;
	private JLabel stdPhonel;
	private JLabel stdEmaill;
	private JLabel stdMajorl;
	private JLabel dobl;
	private JLabel stdRell;
	private JTextField stdIdt;
	private JTextField stdNamet;
	private JTextField stdPhonet;
	private JTextField stdEmailt;
	private JTextField stddobt;
	private JTextField stdRelt;
	private JTextField stdMajort;
	private JPanel pan3;
	private JTextField stdAddresst;
	private JLabel stdAddressl;
	private JTextField stdHPhonet;
	private JLabel stdHPhonel;
	private JTextField stdMNIDt;
	private JLabel stdMNIDl;
	private JTextField stdMNamet;
	private JLabel stdMNamel;
	private JTextField stdFNIDt;
	private JLabel stdFNIDl;
	private JTextField stdFNamet;
	private JLabel stdFNamel;
	private JTextField stdNIDt;
	private JLabel stdNIDl;
	private JPanel pan4;
	private JPanel pan5;
	private JPanel pan6;
	private JTextField stdgAddresst;
	private JLabel stdgAddressl;
	private JTextField stdgPhonet;
	private JLabel stdgPhonel;
	private JTextField stdgNamet;
	private JLabel stdgNamel;
	private JTextField stdgEmailt;
	private JLabel stdgEmaill;
	private JButton coursesheetbutton;

	public viewStudent(){
		this.setDefaultCloseOperation(viewStudent.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1130,720);
		this.setResizable(true);
		this.setTitle("Student Details");
		icon = new ImageIcon(getClass().getResource("..\\img.png"));
		
		this.setIconImage(icon.getImage());
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
	}
	
	public viewStudent(student s){
		this.s = s;
		this.setDefaultCloseOperation(viewStudent.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1130,720);
		this.setResizable(true);
		this.setTitle("Student Details");
		icon = new ImageIcon(getClass().getResource("..\\img.png"));
		
		this.setIconImage(icon.getImage());
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
		
		
		
	}
	
	public void initComponent() {
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		f = new Font("Arial",Font.BOLD,20);
		f1 = new Font("Arial",Font.BOLD,13);
		f2 = new Font("Arial",Font.BOLD,15);
		f3 = new Font("Segoe UI",Font.ITALIC,18);
		Border border = BorderFactory.createLineBorder(new Color(0,51,102),3);
		Border borderr = BorderFactory.createLineBorder(new Color(0,0,102), 1, true);
		Border borderrr = BorderFactory.createEtchedBorder(Color.BLACK, Color.cyan);
		Border borderrrr = BorderFactory.createBevelBorder(3, new Color(0,51,102), new Color(0,51,102));
		Border borderrrrr = BorderFactory.createSoftBevelBorder(10, Color.black, Color.cyan, Color.DARK_GRAY, Color.green);
		Border borderrrrs = BorderFactory.createEtchedBorder(20,  Color.black, Color.cyan);
		Border brdr =  BorderFactory.createEmptyBorder(5, 5, 5, 5);
		
		
		JPanel panel = new JPanel();
//		panel.setBackground(new Color(32, 178, 170));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 0, 1095, 130);
		c.add(panel);
		panel.setLayout(null);
		
		JLabel lblDisplayingStudentDetails = new JLabel(s.getstdName()+" ("+s.getsMajor()+"-"+s.getstdId()+")");
		lblDisplayingStudentDetails.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDisplayingStudentDetails.setForeground(new Color(255, 255, 255));
		lblDisplayingStudentDetails.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblDisplayingStudentDetails.setBounds(0, 11, 1067, 35);
		panel.add(lblDisplayingStudentDetails);
		
		editdetailsbutton = new JButton("Edit Details");
		editdetailsbutton.setBorder(new EmptyBorder(0, 0, 0, 0));
		editdetailsbutton.setFocusable(false);
		editdetailsbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		editdetailsbutton.setForeground(new Color(0, 139, 139));
		editdetailsbutton.setBackground(new Color(255, 255, 255));
		editdetailsbutton.setFont(new Font("Segoe UI", Font.BOLD, 15));

		editdetailsbutton.setBounds(932, 85, 140, 35);
		panel.add(editdetailsbutton);
		editdetailsbutton.addActionListener(this);
		
		coursesheetbutton = new JButton("COURSES");
		coursesheetbutton.setBorder(new EmptyBorder(0, 0, 0, 0));
		coursesheetbutton.setFocusable(false);
		coursesheetbutton.setForeground(new Color(0, 139, 139));
		coursesheetbutton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		coursesheetbutton.setBackground(new Color(255, 255, 255));
		coursesheetbutton.setBounds(637, 85, 140, 35);
		coursesheetbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(coursesheetbutton);
		coursesheetbutton.addActionListener(this);
		
		marksheetbutton = new JButton("Marksheet");
		marksheetbutton.setBorder(new EmptyBorder(0, 0, 0, 0));
		marksheetbutton.setFocusable(false);
		marksheetbutton.setForeground(new Color(0, 139, 139));
		marksheetbutton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		marksheetbutton.setBackground(new Color(255, 255, 255));
		marksheetbutton.setBounds(782, 85, 140, 35);
		marksheetbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(marksheetbutton);
		marksheetbutton.addActionListener(this);
		
		backbutton = new JButton("Back");
		backbutton.setContentAreaFilled(false);
		backbutton.setBorder(new EmptyBorder(0, 0, 0, 0));
	
		backbutton.setIcon(new ImageIcon(".\\assets\\back.png"));
		backbutton.setFocusable(false);
		backbutton.setForeground(Color.WHITE);
		backbutton.setFont(new Font("Segoe UI", Font.BOLD, 16));
		backbutton.setBackground(new Color(32, 178, 170));
		backbutton.setBounds(10, 85, 88, 36);
		panel.add(backbutton);
		backbutton.addActionListener(this);
		
		lblLastLogin = new JLabel("Last Login ");
		if(s.getaStatus()==1)
		{
			lblLastLogin.setText("Last Login : No Login");
		}
		
		else 
		{
			lblLastLogin.setText("Last Login : "+"Active");
		}
		lblLastLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastLogin.setForeground(Color.WHITE);
		lblLastLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastLogin.setBounds(710, 58, 357, 19);
		panel.add(lblLastLogin);
		
		JLabel lblStudentDetails = new JLabel("Student Details");
		lblStudentDetails.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentDetails.setForeground(Color.WHITE);
		lblStudentDetails.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblStudentDetails.setBounds(10, 30, 415, 44);
		panel.add(lblStudentDetails);
		
		
		pan1 = new JPanel();
		crPanel(pan1, 10, 135, 545, 250, Color.WHITE, brdr);
		c.add(pan1);
		
		
		stdIdl = new JLabel("STD ID : ");
		crLabel(stdIdl,pan1,215,5,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
		
		stdIdt = new JTextField(s.getstdId());
		crText(stdIdt,pan1, 295, 5, 250, 35, new Color(0, 139, 139), Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		stdNamel = new JLabel("Name : ");
		crLabel(stdNamel,pan1,215,40,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdNamet = new JTextField(s.getstdName());
		crText(stdNamet,pan1, 295, 40, 250, 35, new Color(0, 139, 139), Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdPhonel = new JLabel("Phone : ");
		crLabel(stdPhonel,pan1,215,75,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdPhonet = new JTextField(s.getstdPhone());
		crText(stdPhonet,pan1, 295, 75, 250, 35, new Color(0, 139, 139), Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdEmaill = new JLabel("Email : ");
		crLabel(stdEmaill,pan1,215,110,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdEmailt = new JTextField(s.getstdEmail());
		crText(stdEmailt,pan1, 295,110, 250, 35, new Color(0, 139, 139), Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		dobl = new JLabel("D.O.B : ");
		crLabel(dobl,pan1,215,145,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
		
		stddobt = new JTextField(s.getdob());
		crText(stddobt,pan1, 295,145, 250, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdRell = new JLabel("Religion : ");
		crLabel(stdRell,pan1,215,180,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdRelt = new JTextField(s.getstdReligion());
		crText(stdRelt,pan1, 295,180, 250, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdMajorl = new JLabel("Major : ");
		crLabel(stdMajorl,pan1,215,215,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdMajort = new JTextField(s.getsMajor());
		crText(stdMajort,pan1, 295,215, 250, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		
		pan2 = new JPanel();
		crPanel(pan2, 560, 135, 545,250, Color.WHITE, brdr);
		c.add(pan2);
		
		stdNIDl = new JLabel("STD NID NO :   ");
		crLabel(stdNIDl,pan2,5,5,120,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
		
		stdNIDt = new JTextField(s.getnidBirth());
		crText(stdNIDt,pan2,125, 5, 420, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		stdFNamel = new JLabel("Father Name :   ");
		crLabel(stdFNamel,pan2,5,40,120,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdFNamet = new JTextField(s.getfatherName());
		crText(stdFNamet,pan2,125, 40, 420, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdFNIDl = new JLabel("Father NID :   ");
		crLabel(stdFNIDl,pan2,5,75,120,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdFNIDt = new JTextField(s.getfNid());
		crText(stdFNIDt,pan2,125, 75, 420, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdMNamel = new JLabel("Mother Name :   ");
		crLabel(stdMNamel,pan2,5,110,120,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdMNamet = new JTextField(s.getmotherName());
		crText(stdMNamet,pan2,125,110, 420, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdMNIDl = new JLabel("Mother NID NO :   ");
		crLabel(stdMNIDl,pan2,5,145,120,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
		
		stdMNIDt = new JTextField(s.getmNid());
		crText(stdMNIDt,pan2,125,145, 420, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdHPhonel = new JLabel("Home Phone :   ");
		crLabel(stdHPhonel,pan2,5,180,120,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdHPhonet = new JTextField(s.gethomePhone());
		crText(stdHPhonet,pan2,125,180, 420, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdAddressl = new JLabel("Address :   ");
		crLabel(stdAddressl,pan2,5,215,120,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdAddresst = new JTextField(s.getaddress());
		crText(stdAddresst,pan2,125,215, 420, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		pan3 = new JPanel();
		crPanel(pan3,10,390,1095,365, Color.WHITE, brdr);
		c.add(pan3);
		
		pan4 = new JPanel();
		crPanel(pan4,0,0,360,365, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		pan3.add(pan4);
		
		stdgNamel = new JLabel("Guardian Details : ");
		crLabel(stdgNamel,pan4,0,0,360,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.CENTER);
		
		
		stdgNamel = new JLabel("Name : ");
		crLabel(stdgNamel,pan4,0,40,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
		
		stdgNamet = new JTextField(s.getgName());
		crText(stdgNamet,pan4,80,40,280, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdgPhonel = new JLabel("Phone : ");
		crLabel(stdgPhonel,pan4,0,80,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdgPhonet = new JTextField(s.getgPhone());
		crText(stdgPhonet,pan4,80,80,280, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		stdgAddressl = new JLabel("Address : ");
		crLabel(stdgAddressl,pan4,0,120,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdgAddresst = new JTextField(s.getgAddress());
		crText(stdgAddresst,pan4,80,120,280, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		stdgEmaill = new JLabel("Email : ");
		crLabel(stdgEmaill,pan4,0,160,80,35,new Color(0, 139, 139),null,new Font("Segoe UI", Font.BOLD, 15),new LineBorder(new Color(192, 192, 192)),"College Accademic Session Name",true,SwingConstants.RIGHT);
			
		stdgEmailt = new JTextField(s.getgEmail());
		crText(stdgEmailt,pan4,80,160,280, 35, Color.BLUE, Color.WHITE,SwingConstants.CENTER, f2,new LineBorder(new Color(192, 192, 192)),"Student ID");
		
		
		pan5 = new JPanel();
		crPanel(pan5,365,0,360,365, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		pan3.add(pan5);
		
		pan6 = new JPanel();
		crPanel(pan6,730,0,365,365, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		pan3.add(pan6);
				
		
		
			
		JLabel profilepiclabel = new JLabel();
		profilepiclabel.setBounds(5, 5, 200, 240);
		pan1.add(profilepiclabel);
		profilepiclabel.setIcon(new ImageIcon(s.getProfilePic(200, 240)));
		profilepiclabel.setBorder(new LineBorder(new Color(192, 192, 192), 2));
		profilepiclabel.setOpaque(true);
		profilepiclabel.setBackground(new Color(240, 248, 255));
		profilepiclabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		profilepiclabel.setHorizontalAlignment(SwingConstants.CENTER);

		
	}
	
	public void crLabel(JLabel thisl,JPanel panel, int s, int t, int w, int h, Color color, Color bg, Font font, Border brdr, String text, boolean opa, int ali) {
		thisl.setBounds(s,t,w,h);
		thisl.setFont(font);
		thisl.setForeground(color);
		thisl.setBackground(bg);
		thisl.setBorder(brdr);
		thisl.setOpaque(opa);
		thisl.setHorizontalAlignment(ali);
		panel.add(thisl);
	}
	
	public void crText(JTextField thist,JPanel panel, int s, int t, int w, int h, Color color, Color bg, int center, Font font, Border brdr, String text) {
		thist.setHorizontalAlignment(center);
//		thist.setHighlighter(null);
		thist.setFont(font);
		thist.setForeground(color);
		thist.setBackground(bg);
		thist.setBounds(s,t,w,h);
		thist.setBorder(brdr);
		panel.add(thist);
		thist.addActionListener(this);
	}
	public void crTab() {
		
	}
	public void crPanel(JPanel thisp, int s, int t, int w, int h, Color bg, Border brdr) {
		thisp.setLayout(null);
		thisp.setBounds(s,t,w,h);
		thisp.setBorder(null);
		thisp.setBackground(bg);
		thisp.setBorder(brdr);
		
	}
	
	public void crButton(JButton thisb, JPanel panel, int s, int t, int w, int h, Color color, Color bg, Font font, String text, Border brdr, boolean bp, boolean fp, boolean caf) {
		thisb.setBounds(s,t,w,h);
		thisb.setFont(font);
		thisb.setForeground(color);
		thisb.setBackground(bg);
		thisb.setToolTipText(text);
		thisb.setBorderPainted(bp);
		thisb.setFocusPainted(fp);
		thisb.setContentAreaFilled(caf);
		thisb.setBorder(brdr);
		panel.add(thisb);
		thisb.setCursor(new Cursor(Cursor.HAND_CURSOR));
		thisb.addActionListener(this);
		
	}
	
	public void crTable(JTable tbl,JPanel panel,JScrollPane scrl,Border brdr, Color hbColor,Color hfColor, Color sColor, Color gColor, Font hf, Font f, int thdi1, int thdi2, int rowh) {
		tbl.setBorder(brdr);
		tbl.getTableHeader().setBackground(hbColor);
		tbl.getTableHeader().setForeground(hfColor);
		tbl.setSelectionBackground(sColor);
		tbl.getTableHeader().setFont(hf);
		tbl.setFont(f);
		tbl.getTableHeader().setPreferredSize(new Dimension(thdi1,thdi2));
		tbl.setFocusable(false);
		tbl.setDragEnabled(false);
		tbl.setEnabled(true);
		tbl.setRowHeight(rowh);
		tbl.setDefaultEditor(Object.class, null);
		tbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
		tbl.setGridColor(gColor);
		tbl.getTableHeader().setReorderingAllowed(false);
		scrl.setViewportView(tbl);
		panel.add(scrl);
	}
	

	public void crCom(JComboBox com,JPanel panel,int s,int t, int w, int h,Color fg,Color bg, String text) {
		com.setForeground(fg);
		com.setToolTipText(text);
		com.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		com.addActionListener(this);
		com.setBackground(bg);
		com.setBounds(s, t, w, h);
		com.setFocusable(false);
		panel.add(com);
	}
	
	public void crHText(HintTextField thist,JPanel panel, int s, int t, int w, int h, Color color, Color bg, int center, Font font, Border brdr, String text,boolean focus,int c) {
		thist.setHorizontalAlignment(center);
//		thist.setHighlighter(null);
		thist.setForeground(color);
		thist.setBackground(bg);
		thist.setBounds(s,t,w,h);
		thist.setBorder(brdr);
		panel.add(thist);
		thist.setFocusable(focus);
		thist.setColumns(c);
		thist.setFont(font);
		thist.addActionListener(this);
	}
	
	public String userId() {
		String uid, s;
		
		UUID uuid = UUID.randomUUID();
		s = uuid.toString();
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
//		JOptionPane.showMessageDialog(null, " name "+s+" rand  "+mm+" uuid ");
		SimpleDateFormat da = new SimpleDateFormat("yyyyMMddhhmmss");
		String u_id = da.format(new Timestamp(System.currentTimeMillis()));
		
		
		return u_id;
	}
	
	public String uId() {
		String uid, s;
		
		UUID uuid = UUID.randomUUID();
		s = uuid.toString();
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
//		JOptionPane.showMessageDialog(null, " name "+s+" rand  "+mm+" uuid ");
		SimpleDateFormat da = new SimpleDateFormat("yyyyMMddhhmmss");
		String u_id = da.format(new Timestamp(System.currentTimeMillis()));
		
		
		return s;
	}
	
	
	
	public static void main(String[] args) {
		viewStudent frm = new viewStudent();
		frm.setVisible(true);

	}




	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==coursesheetbutton) {
			viewCourse course = new viewCourse(s);
			course.setVisible(true);
			dispose();
		}else if(e.getSource()==backbutton) {
			viewStudent std = new viewStudent(s);
			std.setVisible(true);
			dispose();
		}
		
	}




	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

}
