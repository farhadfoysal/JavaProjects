package Main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Timer;
import java.util.TimerTask;

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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;
import javax.swing.SpringLayout;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class Student extends JFrame implements ChangeListener, ActionListener, ItemListener, KeyListener, MouseListener, MouseMotionListener, WindowListener, FocusListener, WindowFocusListener, MouseWheelListener, WindowStateListener{
	private ImageIcon icon, img, img1, img2, img3, img4, img5;
	private JPanel dashBoard,pan, pan1, pan2, pan3, pan4, pan5,pan6,pan7,pan8,pan9,pan10;
	private JButton b, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, tf10;
	private Font f, f1, f2, f3, f4, f5, f6, f7, f8, f9;
	private Cursor cr,cr1,cr2,cr3,cr4,cr5,cr6,cr7,cr8,cr9;
	private JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	private Container c,cc;
	private JPasswordField p, p2, p3, p4, p5;
	private JRadioButton rd,rd1,rd2,rd3,rd4,rd5,rd6,rd7,rd8,rd9;
	private JCheckBox ch,ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9;
	private ButtonGroup bg1, bg2, bg3, bg4, bg5, bg6, bg7, bg8, bg9;
	private JComboBox cb, cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;
	private JScrollPane sp, sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9;
	
	private JTextArea ta, ta1, ta2, ta3, ta4, ta5, ta6, ta7, ta8, ta9;
	
	private String[] pl, pl2, pl3, pl4, pl5;
	
	private BorderLayout bl, bl2, bl3, bl4;
	private GridLayout gl, gl2, gl3, gl4;
	private CardLayout cl, cl1, cl2, cl3, cl4;
	private FlowLayout fl, fl1, fl2, fl3, fl4, fl5;
	private BoxLayout bol, bol1, bol2;
	private GridBagLayout gbl, gbl1, gbl2, gbl3;
	private GroupLayout grl, grl2, grl3;
	private SpringLayout sl, sl1, sl2, sl3, sl4, sl5;
	
	private JCalendar cn,cn2;
	private JToggleButton tb,tb1,tb2;
	private JDateChooser date, date1,date2;
	
	private JSlider sli, sli1, sli2, sli3;
	
	private JSpinner spn, spn2, spn3;
	
	private JTabbedPane tp, tp1, tp2, tp3, tp4, tp5;
	
	private JMenu menu, menu1, File, Profile, Edit, Help, Class, Home, User, Course, Fee, Payment, Attendance, Result, Data;
	private JMenuBar menubar, menubar1;
	private JMenuItem dashMain, setting, logout, addClass, classes, addSec, sections, employee, addFeeOnCourse, fees, addFeeStd, payHistory, addPay, takeAttendance, historyAttendance, userManual, helpText, helpVideo, About, item, item1, item2, item3, item4, item5,item6, item7, item8, item9,item10, stdPro, teacherPro, courses, newCourse, aYear, exportData, importData;
	
	private Connection con = null;
	private PreparedStatement pst = null, pstt=null;
	private ResultSet rs = null;
	private String sql,sqll;
	
	private String myName, myId, sId, myPhone, myPass;
	private JLabel phoneLabel, addressLabel, emailLabel, userLabel, majorLabel, userLabell, phoneLabell, emailLabell, addressLabell, majorLabell;

	private JPanel settp, aYearp, aboutp, stdp, teacherp, emplp, clsp, addClsp, secp, addSecp, coursep, addCoursep, addUserp, addStdp, Payp, addPayp, exportp, importp, manualp, textCallp, videop, takeAttnp, Attnp, rsltp, feep, addFeep, addFeeOnCoursep, addFeeStdp, editFeep, editUserp, editStdp, editCoursep, editPayp;     
	
	
	Timer timer = new Timer();
	long delay = 0;
	long interval = 1000;
	private JLabel userAll;
	private JLabel studentAll;
	private JLabel dueStd;
	private JLabel teacherAll;
	private JLabel noticeMail;
	private JLabel rcvFees;
	private JLabel dueFees;
	
	
	Student(){
		this.setDefaultCloseOperation(Student.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1080,680);
		this.setResizable(true);
		this.setTitle("FF_ADMIN_PANEL");
		
		icon = new ImageIcon(getClass().getResource("img.png"));
		
		this.setIconImage(icon.getImage());
		
		this.initComponent();
		
		con = DBConnection.ConnectionDB();
	}
	
	void initComponent() {
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		
		f = new Font("Arial",Font.BOLD,20);
		f1 = new Font("Arial",Font.BOLD,13);
		
		Border border = BorderFactory.createLineBorder(new Color(0,51,102),3);
		
		Border borderr = BorderFactory.createLineBorder(new Color(0,0,102), 1, true);
		
		Border borderrr = BorderFactory.createEtchedBorder(Color.BLACK, Color.cyan);
		
		Border borderrrr = BorderFactory.createBevelBorder(3, new Color(0,51,102), new Color(0,51,102));
		
		Border borderrrrr = BorderFactory.createSoftBevelBorder(10, Color.black, Color.cyan, Color.DARK_GRAY, Color.green);
		
		Border borderrrrs = BorderFactory.createEtchedBorder(20,  Color.black, Color.cyan);
		
		Border brdr =  BorderFactory.createEmptyBorder(5, 5, 5, 5);
		
		pan = new JPanel();
		pan.setLayout(null);
		pan.setBounds(10,10,520,170);
		pan.setBorder(null);
		pan.setBackground(new Color(0,0,51));
		pan.setBorder(borderrrrs);
		c.add(pan);
		
		pan1 = new JPanel();
		pan1.setLayout(null);
		pan1.setBounds(535,10,520,170);
		pan1.setBorder(null);
		pan1.setBackground(new Color(0,0,51));
		pan1.setBorder(border);
		c.add(pan1);
		
		
		pan2 = new JPanel();
		pan2.setLayout(null);
		pan2.setBounds(10,185,(this.getWidth()-35),(this.getHeight()-250));
		pan2.setBorder(null);
		pan2.setBackground(new Color(0,51,102));
		pan2.setBorder(brdr);
		c.add(pan2);
		
		l = new JLabel("KISHALOYA ADARSHA SHIKSHA NIKETON");
		l.setBounds(10,5,500,30);
		l.setFont(f);
//		l.setHorizontalAlignment();
		l.setForeground(Color.white);
		pan.add(l);
		
		
		menubar = new JMenuBar();
		menubar.setBackground(Color.LIGHT_GRAY);
		menubar.setForeground(Color.white);
		this.setJMenuBar(menubar);
		
		File = new JMenu("USERS");
		menubar.add(File);
		
		item = new JMenuItem("New User");
		
		item1 = new JMenuItem("New Student");
		
		File.add(item);
		File.addSeparator();
		File.add(item1);
		File.addSeparator();
		item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		item.addActionListener(this);
		item1.addActionListener(this);
		
		Home = new JMenu("HOME");
		menubar.add(Home);
		
		
		dashMain = new JMenuItem("Home-Panel");
		dashMain.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.CTRL_MASK));
		Home.add(dashMain);
		Home.addSeparator();
		dashMain.addActionListener(this);
		
		setting = new JMenuItem("Settings");
		setting.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.ALT_MASK));
		Home.add(setting);
		Home.addSeparator();
		setting.addActionListener(this);
		
		aYear = new JMenuItem("Accademic Year");
		aYear.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,ActionEvent.CTRL_MASK));
		Home.add(aYear);
		Home.addSeparator();
		aYear.addActionListener(this);
		
		About = new JMenuItem("About");
		About.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
		Home.add(About);
		Home.addSeparator();
		About.addActionListener(this);
		
		logout = new JMenuItem("Logout");
		logout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		Home.add(logout);
		Home.addSeparator();
		logout.addActionListener(this);
		
		Profile = new JMenu("PROFILE");
		menubar.add(Profile);
		
		stdPro = new JMenuItem("Students Profile");
		stdPro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		Profile.add(stdPro);
		Profile.addSeparator();
		stdPro.addActionListener(this);
		
		teacherPro = new JMenuItem("Teachers Profile");
		teacherPro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
		Profile.add(teacherPro);
		Profile.addSeparator();
		teacherPro.addActionListener(this);
		
		employee = new JMenuItem("Employee");
		employee.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.SHIFT_MASK));
		Profile.add(employee);
		Profile.addSeparator();
		employee.addActionListener(this);
		
		Class = new JMenu("CLASS");
		menubar.add(Class);
		
		classes = new JMenuItem("Classes");
		classes.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.ALT_MASK));
		Class.add(classes);
		Class.addSeparator();
		classes.addActionListener(this);
		
		addClass = new JMenuItem("Add Classes");
		addClass.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		Class.add(addClass);
		Class.addSeparator();
		addClass.addActionListener(this);
		
		sections = new JMenuItem("Sections");
		sections.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.SHIFT_MASK));
		Class.add(sections);
		Class.addSeparator();
		sections.addActionListener(this);
		
		addSec = new JMenuItem("Add Sections");
		addSec.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
		Class.add(addSec);
		Class.addSeparator();
		addSec.addActionListener(this);
		
		Course = new JMenu("COURSE");
		menubar.add(Course);
		
		
		courses = new JMenuItem("Courses");
		courses.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.SHIFT_MASK));
		Course.add(courses);
		Course.addSeparator();
		courses.addActionListener(this);
		
		newCourse = new JMenuItem("Add Courses");
		newCourse.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.SHIFT_MASK));
		Course.add(newCourse);
		Course.addSeparator();
		newCourse.addActionListener(this);
		
		Fee = new JMenu("FEES");
		menubar.add(Fee);
		
		fees = new JMenuItem("Fees");
		fees.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.SHIFT_MASK));
		Fee.add(fees);
		Fee.addSeparator();
		fees.addActionListener(this);
		
		addFeeOnCourse = new JMenuItem("Add Course Fee");
		addFeeOnCourse.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.ALT_MASK));
		Fee.add(addFeeOnCourse);
		Fee.addSeparator();
		addFeeOnCourse.addActionListener(this);
		
		addFeeStd = new JMenuItem("Add Student Fee");
		addFeeStd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
		Fee.add(addFeeStd);
		Fee.addSeparator();
		addFeeStd.addActionListener(this);
		
		Payment = new JMenu("PAYMENT");
		menubar.add(Payment);
		
		addPay = new JMenuItem("New Payment");
		addPay.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
		Payment.add(addPay);
		Payment.addSeparator();
		addPay.addActionListener(this);
		
		payHistory = new JMenuItem("Payment History");
		payHistory.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.ALT_MASK));
		Payment.add(payHistory);
		Payment.addSeparator();
		payHistory.addActionListener(this);
		
		Result = new JMenu("RESULT");
		menubar.add(Result);
		
		Attendance = new JMenu("ATTENDANCE");
		menubar.add(Attendance);
		
		takeAttendance = new JMenuItem("Take Attendance");
		takeAttendance.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.SHIFT_MASK));
		Attendance.add(takeAttendance);
		Attendance.addSeparator();
		takeAttendance.addActionListener(this);
		
		historyAttendance = new JMenuItem("Attendance History");
		historyAttendance.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
		Attendance.add(historyAttendance);
		Attendance.addSeparator();
		historyAttendance.addActionListener(this);
		
		Data = new JMenu("DATA");
		menubar.add(Data);
		
		importData = new JMenuItem("Import Data");
		importData.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
		Data.add(importData);
		Data.addSeparator();
		importData.addActionListener(this);
		
		exportData = new JMenuItem("Export Data");
		exportData.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.ALT_MASK));
		Data.add(exportData);
		Data.addSeparator();
		exportData.addActionListener(this);
		
		Help = new JMenu("HELP");
		menubar.add(Help);
		
		userManual = new JMenuItem("Manual");
		Help.add(userManual);
		Help.addSeparator();
		userManual.addActionListener(this);
		
		helpText = new JMenuItem("Text or Call Here");
		helpText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,ActionEvent.ALT_MASK));
		Help.add(helpText);
		Help.addSeparator();
		helpText.addActionListener(this);
		
		helpVideo = new JMenuItem("Video Manual");
		Help.add(helpVideo);
		Help.addSeparator();
		helpVideo.addActionListener(this);
		
		userLabel = new JLabel("USER             : ");
		userLabel.setBounds(10, 40, 100, 25);
		userLabel.setForeground(Color.LIGHT_GRAY);
		userLabel.setFont(f1);
		pan.add(userLabel);
		
		phoneLabel = new JLabel("PHONE           : ");
		phoneLabel.setBounds(10, 65, 100, 25);
		phoneLabel.setForeground(Color.LIGHT_GRAY);
		phoneLabel.setFont(f1);
		pan.add(phoneLabel);
		
		emailLabel = new JLabel("E-MAIL           : ");
		emailLabel.setBounds(10, 90, 100, 25);
		emailLabel.setForeground(Color.LIGHT_GRAY);
		emailLabel.setFont(f1);
		pan.add(emailLabel);
		
		addressLabel = new JLabel("ADDRESS       : ");
		addressLabel.setBounds(10, 115, 100, 25);
		addressLabel.setForeground(Color.LIGHT_GRAY);
		addressLabel.setFont(f1);
		pan.add(addressLabel);
		
		majorLabel = new JLabel("SEMS/CLASS : ");
		majorLabel.setBounds(10, 140, 100, 25);
		majorLabel.setForeground(Color.LIGHT_GRAY);
		majorLabel.setFont(f1);
		pan.add(majorLabel);
		
		userLabell = new JLabel("USER             : ");
		userLabell.setBounds(110, 40, 300, 25);
		userLabell.setForeground(Color.WHITE);
		userLabell.setFont(f1);
		pan.add(userLabell);
		
		phoneLabell = new JLabel("PHONE           : ");
		phoneLabell.setBounds(110, 65, 300, 25);
		phoneLabell.setForeground(Color.WHITE);
		phoneLabell.setFont(f1);
		pan.add(phoneLabell);
		
		emailLabell = new JLabel("E-MAIL           : ");
		emailLabell.setBounds(110, 90, 300, 25);
		emailLabell.setForeground(Color.WHITE);
		emailLabell.setFont(f1);
		pan.add(emailLabell);
		
		addressLabell = new JLabel("ADDRESS       : ");
		addressLabell.setBounds(110, 115, 300, 25);
		addressLabell.setForeground(Color.WHITE);
		addressLabell.setFont(f1);
		pan.add(addressLabell);
		
		majorLabell = new JLabel("SEMS/CLASS : ");
		majorLabell.setBounds(110, 140, 300, 25);
		majorLabell.setForeground(Color.WHITE);
		majorLabell.setFont(f1);
		pan.add(majorLabell);
		
		
		gl = new GridLayout(2,2,5,5);
		pan1.setLayout(gl);
		
		pan3 = new JPanel();
		pan3.setLayout(null);
		pan3.setBounds(0,0,250,80);
		pan3.setBorder(null);
		pan3.setBackground(new Color(0,0,51));
		pan3.setBorder(borderrrrs);
		pan1.add(pan3);
		
		pan4 = new JPanel();
		pan4.setLayout(null);
		pan4.setBounds(250,0,250,80);
		pan4.setBorder(null);
		pan4.setBackground(new Color(0,0,51));
		pan4.setBorder(borderrrrs);
		pan1.add(pan4);
		
		pan5 = new JPanel();
		pan5.setLayout(null);
		pan5.setBounds(0,80,250,80);
		pan5.setBorder(null);
		pan5.setBackground(new Color(0,0,51));
		pan5.setBorder(borderrrrs);
		pan1.add(pan5);
		
		pan6 = new JPanel();
		pan6.setLayout(null);
		pan6.setBounds(250,80,250,80);
		pan6.setBorder(null);
		pan6.setBackground(new Color(0,0,51));
		pan6.setBorder(borderrrrs);
		pan1.add(pan6);
		
		
		
		
		cl = new CardLayout(0,0);
		pan2.setLayout(cl);
		
		dashBoard = new JPanel();
		dashBoard.setLayout(null);
		dashBoard.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		dashBoard.setBorder(null);
//		dashBoard.setBackground(new Color(0,0,51));
		dashBoard.setBackground(Color.gray);
		dashBoard.setBorder(brdr);
		pan2.add(dashBoard,"dashBoard");
		
		settp = new JPanel();
		settp.setLayout(null);
		settp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		settp.setBorder(null);
//		settp.setBackground(new Color(0,51,102));
		settp.setBackground(Color.WHITE);
		settp.setBorder(brdr);
		pan2.add(settp,"settp");
		
		aYearp = new JPanel();
		aYearp.setLayout(null);
		aYearp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aYearp.setBorder(null);
//		aYearp.setBackground(new Color(0,51,102));
		aYearp.setBackground(Color.LIGHT_GRAY);
		aYearp.setBorder(brdr);
		pan2.add(aYearp,"aYearp");
		
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");
		
		stdp = new JPanel();
		stdp.setLayout(null);
		stdp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		stdp.setBorder(null);
//		stdp.setBackground(new Color(0,51,102));
		stdp.setBackground(Color.WHITE);
		stdp.setBorder(brdr);
		pan2.add(stdp,"stdp");
		
		teacherp = new JPanel();
		teacherp.setLayout(null);
		teacherp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		teacherp.setBorder(null);
//		teacherp.setBackground(new Color(0,51,102));
		teacherp.setBackground(Color.WHITE);
		teacherp.setBorder(brdr);
		pan2.add(teacherp,"teacherp");
		
		emplp = new JPanel();
		emplp.setLayout(null);
		emplp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		emplp.setBorder(null);
//		emplp.setBackground(new Color(0,51,102));
		emplp.setBackground(Color.WHITE);
		emplp.setBorder(brdr);
		pan2.add(emplp,"emplp");
		
		clsp = new JPanel();
		clsp.setLayout(null);
		clsp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		clsp.setBorder(null);
//		clsp.setBackground(new Color(0,51,102));
		clsp.setBackground(Color.WHITE);
		clsp.setBorder(brdr);
		pan2.add(clsp,"clsp");
		
		addClsp = new JPanel();
		addClsp.setLayout(null);
		addClsp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addClsp.setBorder(null);
//		addClsp.setBackground(new Color(0,51,102));
		addClsp.setBackground(Color.WHITE);
		addClsp.setBorder(brdr);
		pan2.add(addClsp,"addClsp");
		
		secp = new JPanel();
		secp.setLayout(null);
		secp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		secp.setBorder(null);
//		secp.setBackground(new Color(0,51,102));
		secp.setBackground(Color.WHITE);
		secp.setBorder(brdr);
		pan2.add(secp,"secp");
		
		addSecp = new JPanel();
		addSecp.setLayout(null);
		addSecp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addSecp.setBorder(null);
//		addSecp.setBackground(new Color(0,51,102));
		addSecp.setBackground(Color.WHITE);
		addSecp.setBorder(brdr);
		pan2.add(addSecp,"addSecp");
		
		coursep = new JPanel();
		coursep.setLayout(null);
		coursep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		coursep.setBorder(null);
//		coursep.setBackground(new Color(0,51,102));
		coursep.setBackground(Color.WHITE);
		coursep.setBorder(brdr);
		pan2.add(coursep,"coursep");
		
		addCoursep = new JPanel();
		addCoursep.setLayout(null);
		addCoursep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addCoursep.setBorder(null);
//		addCoursep.setBackground(new Color(0,51,102));
		addCoursep.setBackground(Color.WHITE);
		addCoursep.setBorder(brdr);
		pan2.add(addCoursep,"addCoursep");
		
		addUserp = new JPanel();
		addUserp.setLayout(null);
		addUserp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addUserp.setBorder(null);
//		addUserp.setBackground(new Color(0,51,102));
		addUserp.setBackground(Color.WHITE);
		addUserp.setBorder(brdr);
		pan2.add(addUserp,"addUserp");
		
		addStdp = new JPanel();
		addStdp.setLayout(null);
		addStdp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addStdp.setBorder(null);
//		addStdp.setBackground(new Color(0,51,102));
		addStdp.setBackground(Color.WHITE);
		addStdp.setBorder(brdr);
		pan2.add(addStdp,"addStdp");
		
		Payp = new JPanel();
		Payp.setLayout(null);
		Payp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		Payp.setBorder(null);
//		Payp.setBackground(new Color(0,51,102));
		Payp.setBackground(Color.WHITE);
		Payp.setBorder(brdr);
		pan2.add(Payp,"Payp");
		
		addPayp = new JPanel();
		addPayp.setLayout(null);
		addPayp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addPayp.setBorder(null);
//		addPayp.setBackground(new Color(0,51,102));
		addPayp.setBackground(Color.WHITE);
		addPayp.setBorder(brdr);
		pan2.add(addPayp,"addPayp");
		
		exportp = new JPanel();
		exportp.setLayout(null);
		exportp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		exportp.setBorder(null);
//		exportp.setBackground(new Color(0,51,102));
		exportp.setBackground(Color.WHITE);
		exportp.setBorder(brdr);
		pan2.add(exportp,"exportp");
		
		importp = new JPanel();
		importp.setLayout(null);
		importp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		importp.setBorder(null);
//		importp.setBackground(new Color(0,51,102));
		importp.setBackground(Color.WHITE);
		importp.setBorder(brdr);
		pan2.add(importp,"importp");
		
		manualp = new JPanel();
		manualp.setLayout(null);
		manualp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		manualp.setBorder(null);
//		manualp.setBackground(new Color(0,51,102));
		manualp.setBackground(Color.WHITE);
		manualp.setBorder(brdr);
		pan2.add(manualp,"manualp");
		
		textCallp = new JPanel();
		textCallp.setLayout(null);
		textCallp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		textCallp.setBorder(null);
//		textCallp.setBackground(new Color(0,51,102));
		textCallp.setBackground(Color.WHITE);
		textCallp.setBorder(brdr);
		pan2.add(textCallp,"textCallp");
		
		videop = new JPanel();
		videop.setLayout(null);
		videop.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		videop.setBorder(null);
//		videop.setBackground(new Color(0,51,102));
		videop.setBackground(Color.WHITE);
		videop.setBorder(brdr);
		pan2.add(videop,"videop");
		
		takeAttnp = new JPanel();
		takeAttnp.setLayout(null);
		takeAttnp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		takeAttnp.setBorder(null);
//		takeAttnp.setBackground(new Color(0,51,102));
		takeAttnp.setBackground(Color.WHITE);
		takeAttnp.setBorder(brdr);
		pan2.add(takeAttnp,"takeAttnp");
		
		Attnp = new JPanel();
		Attnp.setLayout(null);
		Attnp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		Attnp.setBorder(null);
//		Attnp.setBackground(new Color(0,51,102));
		Attnp.setBackground(Color.WHITE);
		Attnp.setBorder(brdr);
		pan2.add(Attnp,"Attnp");
		
		rsltp = new JPanel();
		rsltp.setLayout(null);
		rsltp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		rsltp.setBorder(null);
//		rsltp.setBackground(new Color(0,51,102));
		rsltp.setBackground(Color.WHITE);
		rsltp.setBorder(brdr);
		pan2.add(rsltp,"rsltp");
		
		feep = new JPanel();
		feep.setLayout(null);
		feep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		feep.setBorder(null);
//		feep.setBackground(new Color(0,51,102));
		feep.setBackground(Color.WHITE);
		feep.setBorder(brdr);
		pan2.add(feep,"feep");
		
		addFeep = new JPanel();
		addFeep.setLayout(null);
		addFeep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addFeep.setBorder(null);
//		addFeep.setBackground(new Color(0,51,102));
		addFeep.setBackground(Color.WHITE);
		addFeep.setBorder(brdr);
		pan2.add(addFeep,"addFeep");
		
		editFeep = new JPanel();
		editFeep.setLayout(null);
		editFeep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		editFeep.setBorder(null);
//		editFeep.setBackground(new Color(0,51,102));
		editFeep.setBackground(Color.WHITE);
		editFeep.setBorder(brdr);
		pan2.add(editFeep,"editFeep");
		
		editUserp = new JPanel();
		editUserp.setLayout(null);
		editUserp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		editUserp.setBorder(null);
//		editUserp.setBackground(new Color(0,51,102));
		editUserp.setBackground(Color.WHITE);
		editUserp.setBorder(brdr);
		pan2.add(editUserp,"editUserp");
		
		editStdp = new JPanel();
		editStdp.setLayout(null);
		editStdp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		editStdp.setBorder(null);
//		editStdp.setBackground(new Color(0,51,102));
		editStdp.setBackground(Color.WHITE);
		editStdp.setBorder(brdr);
		pan2.add(editStdp,"editStdp");
		
		editCoursep = new JPanel();
		editCoursep.setLayout(null);
		editCoursep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		editCoursep.setBorder(null);
//		editCoursep.setBackground(new Color(0,51,102));
		editCoursep.setBackground(Color.WHITE);
		editCoursep.setBorder(brdr);
		pan2.add(editCoursep,"editCoursep");
		
		editPayp = new JPanel();
		editPayp.setLayout(null);
		editPayp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		editPayp.setBorder(null);
//		editPayp.setBackground(new Color(0,51,102));
		editPayp.setBackground(Color.WHITE);
		editPayp.setBorder(brdr);
		pan2.add(editPayp,"editPayp");
		
		
		addFeeOnCoursep = new JPanel();
		addFeeOnCoursep.setLayout(null);
		addFeeOnCoursep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addFeeOnCoursep.setBorder(null);
//		addFeeOnCoursep.setBackground(new Color(0,51,102));
		addFeeOnCoursep.setBackground(Color.WHITE);
		addFeeOnCoursep.setBorder(brdr);
		pan2.add(addFeeOnCoursep,"addFeeOnCoursep");
		
		
		addFeeStdp = new JPanel();
		addFeeStdp.setLayout(null);
		addFeeStdp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addFeeStdp.setBorder(null);
//		addFeeStdp.setBackground(new Color(0,51,102));
		addFeeStdp.setBackground(Color.WHITE);
		addFeeStdp.setBorder(brdr);
		pan2.add(addFeeStdp,"addFeeStdp");
		
//		 = new JPanel();
//		.setLayout(null);
//		.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		.setBorder(null);
////		.setBackground(new Color(0,51,102));
//		.setBackground(Color.WHITE);
//		.setBorder(brdr);
//		pan2.add(,"");
		


		studentAll = new JLabel("Students : ");
		studentAll.setForeground(Color.WHITE);
		studentAll.setBounds(5,5,150,30);
		pan3.add(studentAll);
		dueStd = new JLabel("Due : 50 Students");
		dueStd.setForeground(Color.WHITE);
		dueStd.setBounds(5,35,150,30);
		pan3.add(dueStd);
		
		teacherAll = new JLabel("Teachers : ");
		teacherAll.setForeground(Color.WHITE);
		teacherAll.setBounds(5,5,240,30);
		pan4.add(teacherAll);
		userAll = new JLabel("User : ");
		userAll.setForeground(Color.WHITE);
		userAll.setBounds(5,35,240,30);
		pan4.add(userAll);
		
		rcvFees = new JLabel("Recieved Fees : ");
		rcvFees.setForeground(Color.WHITE);
		rcvFees.setBounds(5,5,240,30);
		pan5.add(rcvFees);
		dueFees = new JLabel("Due Fees : ");
		dueFees.setForeground(Color.WHITE);
		dueFees.setBounds(5,35,150,30);
		pan5.add(dueFees);
		
		noticeMail = new JLabel("Unseen Mail : ");
		noticeMail.setForeground(Color.WHITE);
		noticeMail.setBounds(5,5,240,30);
		pan6.add(noticeMail);
		
		
		
		TimerTask task = new TimerTask() {
			public void run() {
				
//				System.out.println("FArhad Foysal");
				
			}
		};
		

//		timer.scheduleAtFixedRate(task,delay,interval);
		
	}
	
	Student(String name, String id , String sId, String phone, String pass, String email){
		this.setDefaultCloseOperation(Student.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1080,680);
		this.setResizable(true);
		this.setTitle("FF_ADMIN_PANEL");
		
		icon = new ImageIcon(getClass().getResource("img.png"));
		
		this.setIconImage(icon.getImage());
		
		this.initComponent();
		
		con = DBConnection.ConnectionDB();
		
		this.myName = name;
		this.myId = id;
		this.sId = sId;
		this.myPhone = phone;
		this.myPass = pass;
		l.setText(name);
		userLabell.setText("Admin" + " ("+id+")");
		phoneLabell.setText(phone);
		emailLabell.setText(email);
//		addressLabell.setText(address);
		majorLabell.setText("Administration");
		
		
		
		
		

	}
	
	public static void main(String args[]) {
		
		Student frame = new Student();
		
		frame.setVisible(true);
		
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==logout) {
			this.dispose();
			
		}else if(e.getSource()==setting) {
			cl.show(pan2, "settp");
		}else if(e.getSource()==aYear) {
			cl.show(pan2, "aYearp");
		}else if(e.getSource()==dashMain) {
			cl.show(pan2, "dashBoard");
		}
		else if(e.getSource()==About) {
			cl.show(pan2, "aboutp");
		}else if(e.getSource()==stdPro) {
			cl.show(pan2, "stdp");
		}else if(e.getSource()==teacherPro) {
			cl.show(pan2, "teacherp");
		}else if(e.getSource()==employee) {
			cl.show(pan2, "emplp");
		}else if(e.getSource()==classes) {
			cl.show(pan2, "clsp");
		}else if(e.getSource()==addClass) {
			cl.show(pan2, "addClsp");
		}else if(e.getSource()==sections) {
			cl.show(pan2, "secp");
		}else if(e.getSource()==addSec) {
			cl.show(pan2, "addSecp");
		}else if(e.getSource()==courses) {
			cl.show(pan2, "coursep");
		}else if(e.getSource()==newCourse) {
			cl.show(pan2, "addCoursep");
		}else if(e.getSource()==item) {
			cl.show(pan2, "addUserp");
		}else if(e.getSource()==item1) {
			cl.show(pan2, "addStdp");
		}else if(e.getSource()==payHistory) {
			cl.show(pan2, "Payp");
		}else if(e.getSource()==addPay) {
			cl.show(pan2, "addPayp");
		}else if(e.getSource()==exportData) {
			cl.show(pan2, "exportp");
		}else if(e.getSource()==importData) {
			cl.show(pan2, "importp");
		}else if(e.getSource()==userManual) {
			cl.show(pan2, "manualp");
		}else if(e.getSource()==helpText) {
			cl.show(pan2, "textCallp");
		}else if(e.getSource()==helpVideo) {
			cl.show(pan2, "videop");
		}else if(e.getSource()==takeAttendance) {
			cl.show(pan2, "takeAttnp");
		}else if(e.getSource()==historyAttendance) {
			cl.show(pan2, "Attnp");
		}
//		else if(e.getSource()==) {
//			cl.show(pan2, "rsltp");
//		}
		else if(e.getSource()==fees) {
			cl.show(pan2, "feep");
		}
//		else if(e.getSource()==) {
//			cl.show(pan2, "addFeep");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "editFeep");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "editUserp");
//		}
//		else if(e.getSource()==) {
//			cl.show(pan2, "editStdp");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "editCoursep");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "editPayp");
//		}
		else if(e.getSource()==addFeeOnCourse) {
			cl.show(pan2, "addFeeOnCoursep");
		}else if(e.getSource()==addFeeStd) {
			cl.show(pan2, "addFeeStdp");
		}
//		else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}else if(e.getSource()==) {
//			cl.show(pan2, "");
//		}
		
		
		
		
		
	}

	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

}
