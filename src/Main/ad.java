package Main;

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
import java.util.Vector;
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

import Main.Class.ClassData;
import Main.Section.Section;
import Main.Section.SectionData;
import Main.Section.viewSection;
import Main.Session.Session;
import Main.Session.SessionData;
import Main.Subject.Subject;
import Main.Subject.SubjectData;
import Main.Subject.viewSubject;
import Main.Class.Class;
import Main.fcomf.HintTextField;
import Main.scl.School;
import Main.scl.schoolData;
import Main.scl.schoolDep;
import Main.scl.schoolDepData;
import Main.scl.secAData;
import Main.scl.secAssigned;
import Main.scl.subAData;
import Main.scl.subAOnSec;
import Main.scl.subAOnSecData;
import Main.scl.subAssigned;
import Main.std.student;
import Main.std.studentData;
import Main.std.viewStudent;
import attendance.Calendar;
import Main.fcomf.userAll;

public class ad extends JFrame implements ChangeListener, ActionListener, ItemListener, KeyListener, MouseListener, MouseMotionListener, WindowListener, FocusListener, WindowFocusListener, MouseWheelListener, WindowStateListener{
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
	
	private JTabbedPane tp, tp1, tp2, tp3, tp4, tp5, tp6, tp7, tp8, tp9, tp10, tp11, tp12, tp13, tp14, tp15, tp16, tp17, tp18, tp19, tp20, tp21, tp22;
	
	private JMenu menu, menu1, File, Profile, Edit, Help, Class, Home, User, Course, Fee, Payment, Attendance, Result, Data;
	private JMenuBar menubar, menubar1;
	private JMenuItem dashMain, setting, logout, addClass, classes, addSec, sections, employee, addFeeOnCourse, fees, addFeeStd, payHistory, addPay, takeAttendance, historyAttendance, userManual, helpText, helpVideo, About, item, item1, item2, item3, item4, item5,item6, item7, item8, item9,item10, stdPro, teacherPro, courses, newCourse, aYear, exportData, importData;
	
	private Connection con = null;
	private PreparedStatement pst = null, pstt=null, pstaY=null;
	private ResultSet rs = null, rsaY=null;
	private String sql,sqll,sqlaY;
	
	private String myName, myId, sId, myPhone, myPass;
	
	private JLabel phoneLabel, addressLabel, emailLabel, userLabel, majorLabel, userLabell, phoneLabell, emailLabell, addressLabell, majorLabell;

	private JPanel settp, aYearp, aboutp, stdp, teacherp, emplp, clsp, addClsp, secp, addSecp, coursep, addCoursep, addUserp, addStdp, Payp, addPayp, exportp, importp, manualp, textCallp, videop, takeAttnp, Attnp, rsltp, feep, addFeep, addFeeOnCoursep, addFeeStdp, editFeep, editUserp, editStdp, editCoursep, editPayp;     
	
	
	Timer timer = new Timer();
	long delay = 0;
	long interval = 9000;
	private JLabel userAll;
	private JLabel studentAll;
	private JLabel dueStd;
	private JLabel teacherAll;
	private JLabel noticeMail;
	private JLabel rcvFees;
	private JLabel dueFees;
	
	private String[] aYcols = {"SI","SESSION-NAME","START-YEAR","START-MONTH","END-YEAR","END-MONTH"};
//	private String[][] rows = {
//				
//								{"1","Farhad","01585855075","Cox","5"},
//								{"2","Farhad","01585855076","Cox","5"},
//								{"3","Farhad","01585855077","Cox","4.5"},
//								{"4","Farhad","01585855075","Cox","4"},
//								{"5","Farhad","01585855078","Cox","3"},
//								{"1","Farhad","01585855075","Cox","5"},
//								{"2","Farhad","01585855076","Cox","5"},
//								{"3","Farhad","01585855077","Cox","4.5"},
//								{"4","Farhad","01585855075","Cox","4"},
//								{"5","Farhad","01585855078","Cox","3"},
//								{"1","Farhad","01585855075","Cox","5"},
//								{"2","Farhad","01585855076","Cox","5"},
//								{"3","Farhad","01585855077","Cox","4.5"},
//								{"4","Farhad","01585855075","Cox","4"},
//								{"5","Farhad","01585855078","Cox","3"},
//								{"1","Farhad","01585855075","Cox","5"},
//								{"2","Farhad","01585855076","Cox","5"},
//								{"3","Farhad","01585855077","Cox","4.5"},
//								{"4","Farhad","01585855075","Cox","4"},
//								{"5","Farhad","01585855078","Cox","3"},
//			
//					          };
	
	private String[] stdCols = {"SID","Student Name","Phone","Email","Major","Guardian Phone","Status"};
	private String[] userCols = {"SI","Name","Phone","Address","CGPA"};
	private String[] aYRow = new String[6];
	private String[] stdRow = new String[8];
	private String[] userRow = new String[5];
	
	private JTable tbl, tbl1, aYtbl, stdTbl, userTbl;
	private JTextField textField;
	private DefaultTableModel model, stdModel, model1, model3, aYtmdl, stdtmdl, usertmdl;
	private TableModel stdModell;
	
	private int count = 1, aYcount=1;
	private JTextField sclaYeart;
	private JYearChooser sclsYeart;
	private JMonthChooser sclsMontht;
	private JYearChooser scleYeart;
	private JMonthChooser scleMontht;
	private JButton sclaYB;
	private JButton sclaYUB;
	private JButton sclaYDB;
	private JTextField sclNamet;
	private JTextField sclAddresst;
	private JTextField sclERegt;
	private JTextField sclPhonet;
	private JTextField sclEmailt;
	private JTextField sclWUrlt;
	private JButton sclSettB;
	private JTextField sclItP1t;
	private JTextField sclItP2t;
	private JTextField sclitEmailt;
	private JTextField sclit3t;
	private JTextField sclIt4t;
	private JButton sclMB;
	private JTextField sclFundBalt;
	private JTextField sclFundBankt;
	private JTextField sclFundBankAt;
	private JButton sclFundB;
	private JLabel sclLogolbl;
	private String defaultpicpath = "./assets/profilepicicon.jpg";
	private JLabel sclLogoSize;
	private JLabel sclLogoP;
	private JButton sclImgChB;
	private java.io.File file;
	private JLabel sclLogonamelbl;
	private JLabel sclLogosizenote;
	private JLabel sclLogoPic;
	private JTextField sclPasst;
	private JPanel addStdOne;
	private JPanel addStdTwo;
	private JPanel addStdThree;
	private JComboBox aSMajorCom;
	private HintTextField addStdsidt;
	private HintTextField stdNamet;
	private HintTextField stdPhonet;
	private HintTextField stdEmailt;
	private JSpinner dobspinner;
	private HintTextField stdHPhonet;
	private JComboBox<String> aSRelCom;
	private JComboBox<String> aSgenCom;
	private JComboBox classYearCom;
	private HintTextField stdAddresst;
	private HintTextField stdUWt;
	private HintTextField stdFNamet;
	private HintTextField stdMNamet;
	private HintTextField stdMNIDt;
	private HintTextField stdFNIDt;
	private HintTextField stdSNIDt;
	private HintTextField stdGNamet;
	private HintTextField stdGPhonet;
	private JLabel sLogolbl;
	private JLabel sLogoPic;
	private JLabel sLogoSize;
	private JButton sImgChB;
	private JLabel sLogonamelbl;
	private JLabel sLogosizenote;
	private HintTextField stdGEmailt;
	private HintTextField stdGAddresst;
	private JButton sDAB;
	private JButton sDUB;
	private java.io.File sfile,ffile;
	private student student;
	private FileDialog sfd, ffd;
	private ResultSet res;
	private HintTextField stdSearch;
	private JButton stdSearchB;
	private JButton teacherSearchB;
	private HintTextField teacherSearch;
	private JTextField sclaMajort;
	private JTextField scleMajort;
	private JTextField sclsMajort;
	private JTable aMatbl;
	private DefaultTableModel aMatmdl;
	private String[] aMacols = {"SI","DEPARTMENT-NAME","START-SID","END-SID","C-SID"};
	private String[] classcols = {"SI","Class-NAME","Class-Code","Session"};
	private String[] Seccols = {"SI","Section-NAME","Section-Students","Class","Fee"};
	private String[] subcols = {"SI","Subject-NAME","Subject-Code","Class","Fee"};
	private String[] seccols = {"SI","Section-NAME","Students","Class","Fee"};
	private JButton sclaMDB;
	private JButton sclaMUB;
	private JButton sclaMB;
	private HintTextField classNamet;
	private HintTextField classCodet;
	private JButton classDB;
	private JButton classUB;
	private JButton classAB;
	private JTable classtbl;
	private DefaultTableModel classtmdl;
	private JComboBox classSecCom;
	private HintTextField SecNamet;
	private HintTextField SecCodet;
	private JButton SecAB;
	private JButton SecUB;
	private JButton SecDB;
	private HintTextField SecFeet;
	private JTable Sectbl;
	private DefaultTableModel Sectmdl;
	private JComboBox classSubCom;
	private HintTextField subNamet;
	private HintTextField subCodet;
	private HintTextField subFeet;
	private JButton subAB;
	private JButton subUB;
	private JButton subDB;
	private JTable subtbl;
	private DefaultTableModel subtmdl;
	private JComboBox courseAYearCom;
	private JComboBox courseAClassCom;
	private JTable asubtbl;
	private DefaultTableModel asubtmdl;
	private JComboBox courseASubCom;
	private JComboBox courseASecCom;
	private JButton subAsB;
	private JComboBox secAYearCom;
	private JComboBox secAClassCom;
	private JComboBox secASubCom;
	private JComboBox secASecCom;
	private JButton secAsB;
	private JTable asectbl;
	private DefaultTableModel asectmdl;
	private HintTextField secStdt;
	private JButton secAssB;
	private JButton secDsB;
	private JTextField secStdL;
	private HintTextField secStdNt;
	private JComboBox tasecAYearCom;
	private JComboBox tasecAClassCom;
	private JTable taasectbl;
	private DefaultTableModel taasectmdl;
	private JScrollPane tasp7;
	
	
	
	public ad(){
		this.setDefaultCloseOperation(ad.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1080,680);
		this.setResizable(true);
		this.setTitle("FF_ADMIN_PANEL");
		
		icon = new ImageIcon(getClass().getResource("img.png"));
		
		this.setIconImage(icon.getImage());
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
	}
	

	public void addStudentCode() {
		
			
		
//		JDateChooser txtdate = new JDateChooser();
//		txtdate.setBounds(550,350,100,30);
////		c.add(txtdate);
//		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
//		Date dateg = txtdate.getDate();
//		
//		JLabel sclaYearl = new JLabel("SCHOOL/COLLEGE Accademic Session Name");
//		crLabel(sclaYearl,yearThree,5,5,350,30,Color.WHITE,null,f2,null,"College Accademic Session Name");
//		
//		sclaYeart = new JTextField();
//		crText(sclaYeart,yearThree,5,35,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Accademic Session Name");		
//		
//		JLabel sclsYearl = new JLabel("SCHOOL/COLLEGE Start Session");
//		crLabel(sclsYearl,yearThree,5,65,350,30,Color.WHITE,null,f2,null,"College Start Session");
//		
//		sclsYeart = new JYearChooser();
//		sclsYeart.setBounds(5,95,350,30);
//		yearThree.add(sclsYeart);
//		
//		int sYear = sclsYeart.getYear();
//		
//		sclsMontht = new JMonthChooser();
//		sclsMontht.setBounds(5,125,350,30);
//		yearThree.add(sclsMontht);
//		
//		int sYearM = sclsMontht.getMonth();
//
//		JLabel scleYearl = new JLabel("SCHOOL/COLLEGE End Session");
//		crLabel(scleYearl,yearThree,5,155,350,30,Color.WHITE,null,f2,null,"College End Session");
//		
//		scleYeart = new JYearChooser();
//		scleYeart.setBounds(5,185,350,30);
//		yearThree.add(scleYeart);
//		
//		int eYear = scleYeart.getYear();
//		
//		scleMontht = new JMonthChooser();
//		scleMontht.setBounds(5,215,350,30);
//		yearThree.add(scleMontht);
//		
//		int eYearM = scleMontht.getMonth();
//		
//		sclaYB = new JButton("...Add Accademic Session...");
//		crButton(sclaYB,yearThree,5,300,350,30,Color.BLUE,Color.GREEN,f2,"Accademic Year Update",null,false,false,true);
//		
//		sclaYUB = new JButton(".Update Session.");
//		crButton(sclaYUB,yearThree,5,340,170,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Accademic Year Update",null,false,false,true);
//		
//		sclaYDB = new JButton(".Delete Session.");
//		crButton(sclaYDB,yearThree,185,340,170,30,Color.BLUE,Color.RED,f2,"Accademic Year Update",null,false,false,true);
//		
		
	}
	
	public void crLabel(JLabel thisl,JPanel panel, int s, int t, int w, int h, Color color, Color bg, Font font, Border brdr, String text) {
		thisl.setBounds(s,t,w,h);
		thisl.setFont(font);
		thisl.setForeground(color);
		thisl.setBackground(bg);
		thisl.setBorder(brdr);
		panel.add(thisl);
	}
	
	public void crText(JTextField thist,JPanel panel, int s, int t, int w, int h, Color color, Color bg, int center, Font font, Border brdr, String text) {
		thist.setHorizontalAlignment(center);
//		thist.setHighlighter(null);
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
	
	
	void initComponent() {
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		
		f = new Font("Arial",Font.BOLD,20);
		f1 = new Font("Arial",Font.BOLD,13);
		f2 = new Font("Arial",Font.BOLD,14);
		f3 = new Font("Segoe UI",Font.ITALIC,18);
		
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
		
		File.add(item1);
		File.addSeparator();
		File.add(item);
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
		
		aYear = new JMenuItem("Year & Department");
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
		employee.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
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
		sections.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
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
		courses.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
		Course.add(courses);
		Course.addSeparator();
		courses.addActionListener(this);
		
		newCourse = new JMenuItem("Add Courses");
		newCourse.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
		Course.add(newCourse);
		Course.addSeparator();
		newCourse.addActionListener(this);
		
		Fee = new JMenu("FEES");
		menubar.add(Fee);
		
		fees = new JMenuItem("Fees");
		fees.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
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
		takeAttendance.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK | KeyEvent.SHIFT_DOWN_MASK));
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
		
// Dashboard setting
		tp1 = new JTabbedPane(JTabbedPane.RIGHT);
		tp1.setTabPlacement(JTabbedPane.TOP);
		tp1.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		dashBoard.add(tp1);
		
		JPanel dashOne = new JPanel();
		crPanel(dashOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel dashTwo = new JPanel();
		crPanel(dashTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel dashThree = new JPanel();
		crPanel(dashThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp1.addTab("Dash1", dashOne);
		tp1.addTab("Dash2", dashTwo);
		tp1.addTab("Dash3", dashThree);
		
		
		settp = new JPanel();
		settp.setLayout(null);
		settp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		settp.setBorder(null);
//		settp.setBackground(new Color(0,51,102));
		settp.setBackground(Color.WHITE);
		settp.setBorder(brdr);
		pan2.add(settp,"settp");
		
// School settings		
		
		tp = new JTabbedPane(JTabbedPane.RIGHT);
		tp.setTabPlacement(JTabbedPane.TOP);
		tp.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		settp.add(tp);
		
		JPanel settOne = new JPanel();
		crPanel(settOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel settTwo = new JPanel();
		crPanel(settTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel settThree = new JPanel();
		crPanel(settThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp.addTab("COLLEGE/SCHOOL", settOne);
		tp.addTab("MANAGEMENT", settTwo);
		tp.addTab("BANK-FUNDS", settThree);
		
		JLabel sclNamel = new JLabel("SCHOOL/COLLEGE NAME  ");
		crLabel(sclNamel,settOne,5,5,350,30,Color.WHITE,null,f2,null,"College Name");
		
		sclNamet = new JTextField();
		crText(sclNamet,settOne,5,35,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Name ");
		
		JLabel sclAddressl = new JLabel("SCHOOL/COLLEGE Address  ");
		crLabel(sclAddressl,settOne,5,65,350,30,Color.WHITE,null,f2,null,"College Address");
		
		sclAddresst = new JTextField();
		crText(sclAddresst,settOne,5,95,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Address");
		
		JLabel sclERegl = new JLabel("SCHOOL/COLLEGE EIIN/REG NO ");
		crLabel(sclERegl,settOne,5,125,350,30,Color.WHITE,null,f2,null,"College EIIN/REG NO");
		
		sclERegt = new JTextField();
		crText(sclERegt,settOne,5,155,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College EIIN/REG NO");
		
		JLabel sclPhonel = new JLabel("SCHOOL/COLLEGE PHONE ");
		crLabel(sclPhonel,settOne,5,185,350,30,Color.WHITE,null,f2,null,"College Phone");
		
		sclPhonet = new JTextField();
		crText(sclPhonet,settOne,5,215,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Phone");
		
		JLabel sclEmaill = new JLabel("SCHOOL/COLLEGE Email");
		crLabel(sclEmaill,settOne,5,245,350,30,Color.WHITE,null,f2,null,"College Email");
		
		sclEmailt = new JTextField();
		crText(sclEmailt,settOne,5,275,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Email");
		
		JLabel sclWUrll = new JLabel("SCHOOL/COLLEGE WEBSite Url ");
		crLabel(sclWUrll,settOne,5,305,350,30,Color.WHITE,null,f2,null,"College WEBSITE URL");
		
		sclWUrlt = new JTextField();
		crText(sclWUrlt,settOne,5,335,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Website Url");
		
		
		sclSettB = new JButton("...School Update...");
		crButton(sclSettB,settOne,500,350,350,30,Color.BLUE,Color.LIGHT_GRAY,f2,"School Update",null,false,false,true);
		
		
		JLabel sclItP1l = new JLabel("SCHOOL/COLLEGE IT Phone 1  ");
		crLabel(sclItP1l,settTwo,5,5,350,30,Color.WHITE,null,f2,null,"College Phone 1");
		
		sclItP1t = new JTextField();
		crText(sclItP1t,settTwo,5,35,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College IT Phone 1 ");
		
		JLabel sclItP2l = new JLabel("SCHOOL/COLLEGE Phone 2 ");
		crLabel(sclItP2l,settTwo,5,65,350,30,Color.WHITE,null,f2,null,"College IT Phone 2");
		
		sclItP2t = new JTextField();
		crText(sclItP2t,settTwo,5,95,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College IT Phone 2");
		
		JLabel sclitEmaill = new JLabel("SCHOOL/COLLEGE IT Email ");
		crLabel(sclitEmaill,settTwo,5,125,350,30,Color.WHITE,null,f2,null,"College IT Email");
		
		sclitEmailt = new JTextField();
		crText(sclitEmailt,settTwo,5,155,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College IT Email");
		
		JLabel sclPassl = new JLabel("SCHOOL/COLLEGE  Password");
		crLabel(sclPassl,settTwo,5,185,350,30,Color.WHITE,null,f2,null,"College Password");
		
		sclPasst = new JTextField();
		crText(sclPasst,settTwo,5,215,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College ");
		
		JLabel sclit4l = new JLabel("SCHOOL/COLLEGE ");
		crLabel(sclit4l,settTwo,5,245,350,30,Color.WHITE,null,f2,null,"College ");
		
		sclIt4t = new JTextField();
		crText(sclIt4t,settTwo,5,275,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College ");
		
		
		
		sclMB = new JButton("...Mangement Update...");
		crButton(sclMB,settTwo,500,350,350,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Management Update",null,false,false,true);
		
		
		JLabel sclFundBall = new JLabel("SCHOOL/COLLEGE Funds Balance ");
		crLabel(sclFundBall,settThree,5,5,350,30,Color.WHITE,null,f2,null,"College Funds Balance");
		
		sclFundBalt = new JTextField();
		crText(sclFundBalt,settThree,5,35,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Funds Balance");
		
		JLabel sclFundBankl = new JLabel("SCHOOL/COLLEGE Authorize Bank Name");
		crLabel(sclFundBankl,settThree,5,65,350,30,Color.WHITE,null,f2,null,"College Authorize Bank");
		
		sclFundBankt = new JTextField();
		crText(sclFundBankt,settThree,5,95,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Authorize Bank");
		
		JLabel sclFundBankAl = new JLabel("SCHOOL/COLLEGE Bank A/NO");
		crLabel(sclFundBankAl,settThree,5,125,350,30,Color.WHITE,null,f2,null,"College Authorize Bank A/NO");
		
		sclFundBankAt = new JTextField();
		crText(sclFundBankAt,settThree,5,155,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Authorize Bank A/NO");		
		
		sclFundB = new JButton("...Funds Update...");
		crButton(sclFundB,settThree,500,350,350,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Funds Update",null,false,false,true);
		
		sclLogolbl = new JLabel("");
		sclLogolbl.setBorder(new LineBorder(Color.gray));
		sclLogolbl.setIcon(new ImageIcon(defaultpicpath));
		sclLogolbl.setHorizontalAlignment(SwingConstants.CENTER);
		sclLogolbl.setBounds(400,5,200,240);
		settOne.add(sclLogolbl);

		sclLogoPic = new JLabel("");
		sclLogoPic.setFont(new Font("Segoe UI", Font.PLAIN,17));
		sclLogoPic.setBounds(620,10,100,25);
		settOne.add(sclLogoPic);
		
		sclLogoSize = new JLabel("");
		sclLogoSize.setFont(new Font("Segoe UI", Font.PLAIN,17));
		sclLogoSize.setBounds(620,35,350,25);
		settOne.add(sclLogoSize);
		
		sclImgChB = new JButton("...Choose File...");
		crButton(sclImgChB,settOne,620,60,150,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Image Upload",null,false,false,true);
//		sclImgChB.addActionListener(this);
		
		sclLogonamelbl = new JLabel("No File Choosen");
		crLabel(sclLogonamelbl,settOne,620,90,300,25,Color.WHITE,null,f2,null,"No File Choosen");
		
		sclLogosizenote = new JLabel("Image size < 1024 KB");
		crLabel(sclLogosizenote,settOne,620,115,300,25,Color.WHITE,null,f2,null,"Image size");
		
		
		aYearp = new JPanel();
		aYearp.setLayout(null);
		aYearp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aYearp.setBorder(null);
//		aYearp.setBackground(new Color(0,51,102));
		aYearp.setBackground(Color.LIGHT_GRAY);
		aYearp.setBorder(brdr);
		pan2.add(aYearp,"aYearp");
		
// accademic year code
		
		tp2 = new JTabbedPane(JTabbedPane.RIGHT);
		tp2.setTabPlacement(JTabbedPane.TOP);
		tp2.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		aYearp.add(tp2);
		
		JPanel yearOne = new JPanel();
		crPanel(yearOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel yearTwo = new JPanel();
		crPanel(yearTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel yearThree = new JPanel();
		crPanel(yearThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp2.addTab("Accademic Sessions", yearThree);
		tp2.addTab("#Department Management", yearOne);
		tp2.addTab("Session MANAGEMENT", yearTwo);
				
		
		JDateChooser txtdate = new JDateChooser();
		txtdate.setBounds(550,350,100,30);
//		c.add(txtdate);
		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
		Date dateg = txtdate.getDate();
		
		JLabel sclaYearl = new JLabel("SCHOOL/COLLEGE Accademic Session Name");
		crLabel(sclaYearl,yearThree,5,5,350,30,Color.WHITE,null,f2,null,"College Accademic Session Name");
		
		sclaYeart = new JTextField();
		crText(sclaYeart,yearThree,5,35,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College Accademic Session Name");		
		
		JLabel sclsYearl = new JLabel("SCHOOL/COLLEGE Start Session");
		crLabel(sclsYearl,yearThree,5,65,350,30,Color.WHITE,null,f2,null,"College Start Session");
		
		sclsYeart = new JYearChooser();
		sclsYeart.setBounds(5,95,350,30);
		yearThree.add(sclsYeart);
		
		int sYear = sclsYeart.getYear();
		
		sclsMontht = new JMonthChooser();
		sclsMontht.setBounds(5,125,350,30);
		yearThree.add(sclsMontht);
		
		int sYearM = sclsMontht.getMonth();

		JLabel scleYearl = new JLabel("SCHOOL/COLLEGE End Session");
		crLabel(scleYearl,yearThree,5,155,350,30,Color.WHITE,null,f2,null,"College End Session");
		
		scleYeart = new JYearChooser();
		scleYeart.setBounds(5,185,350,30);
		yearThree.add(scleYeart);
		
		int eYear = scleYeart.getYear();
		
		scleMontht = new JMonthChooser();
		scleMontht.setBounds(5,215,350,30);
		yearThree.add(scleMontht);
		
		int eYearM = scleMontht.getMonth();
		
		sclaYB = new JButton("...Add Accademic Session...");
		crButton(sclaYB,yearThree,5,300,350,30,Color.BLUE,Color.GREEN,f2,"Accademic Year Update",null,false,false,true);
		
		sclaYUB = new JButton(".Update Session.");
		crButton(sclaYUB,yearThree,5,340,170,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Accademic Year Update",null,false,false,true);
		
		sclaYDB = new JButton(".Delete Session.");
		crButton(sclaYDB,yearThree,185,340,170,30,Color.BLUE,Color.RED,f2,"Accademic Year Update",null,false,false,true);
		
		
		aYtbl = new JTable();
		aYtbl.setEnabled(true);
		aYtbl.setSelectionBackground(Color.pink);
		aYtbl.setFont(f);
		aYtbl.setBackground(Color.white);
		aYtbl.setRowHeight(25);
		
		aYtmdl = new DefaultTableModel();
		aYtmdl.setColumnIdentifiers(aYcols);
		aYtbl.setModel(aYtmdl);
		
		sp = new JScrollPane(aYtbl);
		sp.setBounds(400,10,600,360);
		yearThree.add(sp);
		
//		updateAYear();
		
		aYtbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
//				updateAYear();
				int i;
				i = aYtbl.getSelectedRow();
				
				if(i>=0) {
					
					String s, s1;
					int s2,s3,s4,s5;
					s = aYtmdl.getValueAt(i, 0).toString();
					s1 = aYtmdl.getValueAt(i, 1).toString();
					s2 = Integer.parseInt(aYtmdl.getValueAt(i, 2).toString());
					s3 = Integer.parseInt(aYtmdl.getValueAt(i, 3).toString());
					s4 = Integer.parseInt(aYtmdl.getValueAt(i, 4).toString());
					s5 = Integer.parseInt(aYtmdl.getValueAt(i, 5).toString());
					
					sclaYeart.setText(s1);
					sclsYeart.setYear(s2);
					sclsMontht.setMonth(s3-1);
					scleYeart.setYear(s4);
					scleMontht.setMonth(s5-1);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
		
		JLabel sclaMajorl = new JLabel("Department Name");
		crLabel(sclaMajorl,yearOne,5,5,350,30,Color.WHITE,null,f2,null,"New Major Name");
		
		sclaMajort = new JTextField();
		crText(sclaMajort,yearOne,5,35,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"Department/Major Name");		
		
		JLabel sclsMajorl = new JLabel("Start SID");
		crLabel(sclsMajorl,yearOne,5,65,350,30,Color.WHITE,null,f2,null,"College Start SID");
		sclsMajort = new JTextField();
		crText(sclsMajort,yearOne,5,100,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"Department/Major Name");		
		

		JLabel scleMajorl = new JLabel("End SID");
		crLabel(scleMajorl,yearOne,5,135,350,30,Color.WHITE,null,f2,null,"College End SID");
		scleMajort = new JTextField();
		crText(scleMajort,yearOne,5,170,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"Department/Major Name");		
		
		
		
		sclaMB = new JButton("...Add Department...");
		crButton(sclaMB,yearOne,5,300,350,30,Color.BLUE,Color.GREEN,f2,"Accademic Year Update",null,false,false,true);
		
		sclaMUB = new JButton(".Update Department.");
		crButton(sclaMUB,yearOne,5,340,170,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Accademic Year Update",null,false,false,true);
		
		sclaMDB = new JButton(".Delete Department.");
		crButton(sclaMDB,yearOne,185,340,170,30,Color.BLUE,Color.RED,f2,"Accademic Year Update",null,false,false,true);
		
		
		aMatbl = new JTable();
		aMatbl.setEnabled(true);
		aMatbl.setSelectionBackground(Color.pink);
		aMatbl.setFont(f);
		aMatbl.setBackground(Color.white);
		aMatbl.setRowHeight(25);
		
		aMatmdl = new DefaultTableModel();
		aMatmdl.setColumnIdentifiers(aMacols);
		aMatbl.setModel(aMatmdl);
		
		sp2 = new JScrollPane(aMatbl);
		sp2.setBounds(400,10,600,360);
		yearOne.add(sp2);
		
		
		aMatbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int i;
				i = aMatbl.getSelectedRow();
				
				if(i>=0) {
					
					String s1, s2, s3, s4;
					int s;
					s = Integer.parseInt(aMatmdl.getValueAt(i, 0).toString());
					s1 = aMatmdl.getValueAt(i, 1).toString();
					s2 = aMatmdl.getValueAt(i, 2).toString();
					s3 = aMatmdl.getValueAt(i, 3).toString();
					
					sclaMajort.setText(s1);
					sclsMajort.setText(s2);
					scleMajort.setText(s3);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
		
//		JLabel sclNamel = new JLabel("SCHOOL/COLLEGE NAME : ");
//		crLabel(sclNamel,settp,5,5,350,30,Color.WHITE,null,f2,null,"College Name");
//		
//		JTextField sclNamet = new JTextField();
//		crText(sclNamet,settp,5,35,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College ");
//		
//		JLabel sclAddressl = new JLabel("SCHOOL/COLLEGE NAME : ");
//		crLabel(sclAddressl,settp,5,65,350,30,Color.WHITE,null,f2,null,"College ");
//		
//		JTextField sclAddresst = new JTextField();
//		crText(sclAddresst,settp,5,95,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College ");
//		
//		JLabel sclERegl = new JLabel("SCHOOL/COLLEGE NAME : ");
//		crLabel(sclERegl,settp,5,125,350,30,Color.WHITE,null,f2,null,"College ");
//		
//		JTextField sclERegt = new JTextField();
//		crText(sclERegt,settp,5,155,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College ");
//		
//		JLabel sclPhonel = new JLabel("SCHOOL/COLLEGE NAME : ");
//		crLabel(sclPhonel,settp,5,185,350,30,Color.WHITE,null,f2,null,"College ");
//		
//		JTextField sclPhonet = new JTextField();
//		crText(sclPhonet,settp,5,215,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College ");
//		
//		JLabel sclEmaill = new JLabel("SCHOOL/COLLEGE NAME : ");
//		crLabel(sclEmaill,settp,5,245,350,30,Color.WHITE,null,f2,null,"College ");
//		
//		JTextField sclEmailt = new JTextField();
//		crText(sclEmailt,settp,5,275,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College ");
//		
//		JLabel sclWUrll = new JLabel("SCHOOL/COLLEGE NAME : ");
//		crLabel(sclWUrll,settp,5,305,350,30,Color.WHITE,null,f2,null,"College ");
//		
//		JTextField sclWUrlt = new JTextField();
//		crText(sclWUrlt,settp,5,335,350,30,Color.BLUE,Color.WHITE,JTextField.CENTER,f2,null,"College ");
//		
//		
//		JButton sclSettB = new JButton("...School Update...");
//		crButton(sclSettB,settp,5,365,350,30,Color.BLUE,Color.LIGHT_GRAY,f2,"School Update",null,false,false,true);
//		
		
		
		aboutp = new JPanel();
		aboutp.setLayout(null);
		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		aboutp.setBorder(null);
//		aboutp.setBackground(new Color(0,51,102));
		aboutp.setBackground(Color.WHITE);
		aboutp.setBorder(brdr);
		pan2.add(aboutp,"aboutp");

// about settings		
		
		tp3 = new JTabbedPane(JTabbedPane.RIGHT);
		tp3.setTabPlacement(JTabbedPane.TOP);
		tp3.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		aboutp.add(tp3);
		
		JPanel aboutOne = new JPanel();
		crPanel(aboutOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel aboutTwo = new JPanel();
		crPanel(aboutTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel aboutThree = new JPanel();
		crPanel(aboutThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp3.addTab("COLLEGE/SCHOOL", aboutOne);
		tp3.addTab("MANAGEMENT", aboutTwo);
		tp3.addTab("BANK-FUNDS", aboutThree);
		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
//		
//		aboutp = new JPanel();
//		aboutp.setLayout(null);
//		aboutp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
//		aboutp.setBorder(null);
////		aboutp.setBackground(new Color(0,51,102));
//		aboutp.setBackground(Color.WHITE);
//		aboutp.setBorder(brdr);
//		pan2.add(aboutp,"aboutp");
		
		stdp = new JPanel();
		stdp.setLayout(null);
		stdp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		stdp.setBorder(null);
//		stdp.setBackground(new Color(0,51,102));
		stdp.setBackground(Color.WHITE);
		stdp.setBorder(brdr);
		pan2.add(stdp,"stdp");
		
// Student profile 
		
		tp4 = new JTabbedPane(JTabbedPane.RIGHT);
		tp4.setTabPlacement(JTabbedPane.TOP);
		tp4.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		stdp.add(tp4);
		
		JPanel stdOne = new JPanel();
		crPanel(stdOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel stdTwo = new JPanel();
		crPanel(stdTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel stdThree = new JPanel();
		crPanel(stdThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp4.addTab("#SEARCH STUDENT", stdOne);
		tp4.addTab("#SEARCH WITH MAJOR ", stdTwo);
		tp4.addTab("#SEARCH WITH SECTION", stdThree);
		
		
		
		stdSearch = new HintTextField("Type Student Id or Phone No ");
		crHText(stdSearch,stdOne,250,40,250,40,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student ID or Phone Number",true,40);		
		
		stdSearchB = new JButton("SEARCH");
		crButton(stdSearchB,stdOne,505,40,200,40,Color.BLUE,Color.RED,f2,"Student Search Button",null,false,false,true);

		
		
		
		
		
		
		
		teacherp = new JPanel();
		teacherp.setLayout(null);
		teacherp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		teacherp.setBorder(null);
//		teacherp.setBackground(new Color(0,51,102));
		teacherp.setBackground(Color.WHITE);
		teacherp.setBorder(brdr);
		pan2.add(teacherp,"teacherp");
		
// Teacher profile
		
		tp5 = new JTabbedPane(JTabbedPane.RIGHT);
		tp5.setTabPlacement(JTabbedPane.TOP);
		tp5.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		teacherp.add(tp5);
		
		JPanel teacherOne = new JPanel();
		crPanel(teacherOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel teacherTwo = new JPanel();
		crPanel(teacherTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel teacherThree = new JPanel();
		crPanel(teacherThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp5.addTab("#SEARCH TEACHER", teacherOne);
		tp5.addTab("#SEARCH WITH DEPARTMENT", teacherTwo);
		tp5.addTab("#SALARY", teacherThree);
		
		
		teacherSearch = new HintTextField("Type Teacher Id or Phone No ");
		crHText(teacherSearch,teacherOne,250,40,250,40,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Teacher ID or Phone Number",true,40);		
		
		teacherSearchB = new JButton("SEARCH");
		crButton(teacherSearchB,teacherOne,505,40,200,40,Color.BLUE,Color.RED,f2,"Teacher Search Button",null,false,false,true);

		
		
		
		
		emplp = new JPanel();
		emplp.setLayout(null);
		emplp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		emplp.setBorder(null);
//		emplp.setBackground(new Color(0,51,102));
		emplp.setBackground(Color.WHITE);
		emplp.setBorder(brdr);
		pan2.add(emplp,"emplp");
		
// employee profile		
		
		tp6 = new JTabbedPane(JTabbedPane.RIGHT);
		tp6.setTabPlacement(JTabbedPane.TOP);
		tp6.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		emplp.add(tp6);
		
		JPanel emplOne = new JPanel();
		crPanel(emplOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel emplTwo = new JPanel();
		crPanel(emplTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel emplThree = new JPanel();
		crPanel(emplThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp6.addTab("COLLEGE/SCHOOL", emplOne);
		tp6.addTab("MANAGEMENT", emplTwo);
		tp6.addTab("BANK-FUNDS", emplThree);
		
		clsp = new JPanel();
		clsp.setLayout(null);
		clsp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		clsp.setBorder(null);
//		clsp.setBackground(new Color(0,51,102));
		clsp.setBackground(Color.WHITE);
		clsp.setBorder(brdr);
		pan2.add(clsp,"clsp");
		
// Class setting code 
		
		tp7 = new JTabbedPane(JTabbedPane.RIGHT);
		tp7.setTabPlacement(JTabbedPane.TOP);
		tp7.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		clsp.add(tp7);
		
		JPanel clsOne = new JPanel();
		crPanel(clsOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel clsTwo = new JPanel();
		crPanel(clsTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel clsThree = new JPanel();
		crPanel(settThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp7.addTab("COLLEGE/SCHOOL", clsOne);
		tp7.addTab("MANAGEMENT", clsTwo);
		tp7.addTab("BANK-FUNDS", clsThree);
		
		addClsp = new JPanel();
		addClsp.setLayout(null);
		addClsp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addClsp.setBorder(null);
//		addClsp.setBackground(new Color(0,51,102));
		addClsp.setBackground(Color.WHITE);
		addClsp.setBorder(brdr);
		pan2.add(addClsp,"addClsp");
		
// Add Class setting 
		
		tp8 = new JTabbedPane(JTabbedPane.RIGHT);
		tp8.setTabPlacement(JTabbedPane.TOP);
		tp8.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		addClsp.add(tp8);
		
		JPanel addClsOne = new JPanel();
		crPanel(addClsOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addClsTwo = new JPanel();
		crPanel(addClsTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addClsThree = new JPanel();
		crPanel(addClsThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp8.addTab("+Add Class/Semester", addClsOne);
		tp8.addTab("MANAGEMENT", addClsTwo);
		tp8.addTab("BANK-FUNDS", addClsThree);
		
		
		JLabel addClassYearL = new JLabel("Session : ");
		crLabel(addClassYearL,addClsOne,25,10,80,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Select Session");
		

		String[] classYearC = {"--Select a Session--"}; 
		
		classYearCom = new JComboBox<String>(classYearC);
		crCom(classYearCom,addClsOne,105,10,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		
		
		classNamet = new HintTextField("Class/Semester Name ");
		crHText(classNamet,addClsOne,25,45,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Name",true,40);		
		
		classCodet = new HintTextField("Class/Semester Code ");
		crHText(classCodet,addClsOne,25,80,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Code",true,40);		
		

		classAB = new JButton("...Add Class/Semester...");
		crButton(classAB,addClsOne,5,300,350,30,Color.BLUE,Color.GREEN,f2,"Accademic Year Update",null,false,false,true);
		
		classUB = new JButton(".Update Class/Semester.");
		crButton(classUB,addClsOne,5,340,170,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Accademic Year Update",null,false,false,true);
		
		classDB = new JButton(".Delete Class/Semester.");
		crButton(classDB,addClsOne,185,340,170,30,Color.BLUE,Color.RED,f2,"Accademic Year Update",null,false,false,true);
		
		
		classtbl = new JTable();
		classtbl.setEnabled(true);
		classtbl.setSelectionBackground(Color.pink);
		classtbl.setFont(f);
		classtbl.setBackground(Color.white);
		classtbl.setRowHeight(25);
		
		classtmdl = new DefaultTableModel();
		classtmdl.setColumnIdentifiers(classcols);
		classtbl.setModel(classtmdl);
		
		sp3 = new JScrollPane(classtbl);
		sp3.setBounds(400,10,600,360);
		addClsOne.add(sp3);
		
		
		classtbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int i;
				i = classtbl.getSelectedRow();
				
				if(i>=0) {
					
					String s1, s2, s3, s4;
					int s;
					s = Integer.parseInt(classtmdl.getValueAt(i, 0).toString());
					s1 = classtmdl.getValueAt(i, 1).toString();
					s2 = classtmdl.getValueAt(i, 2).toString();
					s3 = classtmdl.getValueAt(i, 3).toString();
					
					classNamet.setText(s1);
					classCodet.setText(s2);
					classYearCom.setToolTipText(s3);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
		
		
		secp = new JPanel();
		secp.setLayout(null);
		secp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		secp.setBorder(null);
//		secp.setBackground(new Color(0,51,102));
		secp.setBackground(Color.WHITE);
		secp.setBorder(brdr);
		pan2.add(secp,"secp");
			
		
// section setting
		
		tp9 = new JTabbedPane(JTabbedPane.RIGHT);
		tp9.setTabPlacement(JTabbedPane.TOP);
		tp9.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		secp.add(tp9);
		
		JPanel secOne = new JPanel();
		crPanel(secOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel secTwo = new JPanel();
		crPanel(secTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel secThree = new JPanel();
		crPanel(settThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp9.addTab("COLLEGE/SCHOOL", secOne);
		tp9.addTab("MANAGEMENT", secTwo);
		tp9.addTab("BANK-FUNDS", secThree);
		
		
		JLabel secAL = new JLabel("Please, Select a Session and Class ~ ");
		crLabel(secAL,secOne,15,10,285,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Select Session");
		String[] secAC = {"--Select a Session--"}; 
		secAYearCom = new JComboBox<String>(secAC);
		crCom(secAYearCom,secOne,305,10,225,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		String[] secAcC = {"--Select a Class--"}; 
		secAClassCom = new JComboBox<String>(secAcC);
		crCom(secAClassCom,secOne,540,10,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		secStdt = new HintTextField("Student Id Or Phone Number ");
		crHText(secStdt,secOne,765,5,250,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Code",true,40);		
		
		
		secAssB = new JButton("...Stduent...");
		crButton(secAssB,secOne,770,40,245,30,Color.BLUE,Color.CYAN,f2,"Assign section",null,false,false,true);
		
//		String[] secAacC = {"--Select a Subject--"}; 
//		secASubCom = new JComboBox<String>(secAacC);
//		crCom(secASubCom,secOne,770,85,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");

		String[] secAaC = {"--Select a Section--"}; 
		secASecCom = new JComboBox<String>(secAaC);
		crCom(secASecCom,secOne,770,120,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");

		secStdL = new JTextField("SID");
		crText(secStdL,secOne,770,160,245,30,Color.BLUE,Color.BLUE,SwingConstants.CENTER,new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"SID");
		
		secStdNt = new HintTextField("STUDENT NAME");
		crHText(secStdNt,secOne,770,195,245,30,Color.BLACK,Color.BLUE,HintTextField.CENTER,f3,null,"Student Details",false,40);		
		
		secDsB = new JButton("...Drop...");
		crButton(secDsB,secOne,765,340,80,30,Color.BLUE,Color.red,f2,"Drop Section",null,false,false,true);
		
		secAsB = new JButton("...ASSIGNe...");
		crButton(secAsB,secOne,765,290,250,30,Color.BLUE,Color.GREEN,f2,"Assign section",null,false,false,true);
		
		asectbl = new JTable();
		asectbl.setEnabled(true);
		asectbl.setSelectionBackground(Color.pink);
		asectbl.setFont(f);
		asectbl.setBackground(Color.white);
		asectbl.setRowHeight(25);
		
		asectmdl = new DefaultTableModel();
		asectmdl.setColumnIdentifiers(seccols);
		asectbl.setModel(asectmdl);
		
		sp7 = new JScrollPane(asectbl);
		sp7.setBounds(15,50,745,330);
		secOne.add(sp7);
		
		
		asectbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int i;
				i = asectbl.getSelectedRow();
				
				if(i>=0) {
					
					String s1, s2, s3, s4;
					int s;
					s = Integer.parseInt(asectmdl.getValueAt(i, 0).toString());
					s1 = asectmdl.getValueAt(i, 1).toString();
					s2 = asectmdl.getValueAt(i, 2).toString();
					s3 = asectmdl.getValueAt(i, 3).toString();
					s4 = asectmdl.getValueAt(i, 4).toString();
					
					Subject sub = new Subject();
					sub = new SubjectData().getSubject(s, sId);
					
					viewSection vSub = new viewSection(sub);
					
					vSub.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
		
		addSecp = new JPanel();
		addSecp.setLayout(null);
		addSecp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addSecp.setBorder(null);
//		addSecp.setBackground(new Color(0,51,102));
		addSecp.setBackground(Color.WHITE);
		addSecp.setBorder(brdr);
		pan2.add(addSecp,"addSecp");
		
// add section settings

		tp10 = new JTabbedPane(JTabbedPane.RIGHT);
		tp10.setTabPlacement(JTabbedPane.TOP);
		tp10.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		addSecp.add(tp10);
		
		JPanel addSecOne = new JPanel();
		crPanel(addSecOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addSecTwo = new JPanel();
		crPanel(addSecTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addSecThree = new JPanel();
		crPanel(addSecThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp10.addTab("+Add Section", addSecOne);
		tp10.addTab("Section Manage", addSecTwo);
		tp10.addTab("Others", addSecThree);		
		
		
		JLabel addSecClassL = new JLabel("Class : ");
		crLabel(addSecClassL,addSecOne,25,10,80,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Select Session");
		

		String[] classSecC = {"--Select a Class--"}; 
		
		classSecCom = new JComboBox<String>(classSecC);
		crCom(classSecCom,addSecOne,105,10,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		SecNamet = new HintTextField("Section Name ");
		crHText(SecNamet,addSecOne,25,45,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Name",true,40);		
		
		SecCodet = new HintTextField("Section Code ");
		crHText(SecCodet,addSecOne,25,80,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Code",true,40);		
		
		SecFeet = new HintTextField("Section Fee ");
		crHText(SecFeet,addSecOne,25,115,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Code",true,40);	
		

		SecAB = new JButton("...Add Section...");
		crButton(SecAB,addSecOne,5,300,350,30,Color.BLUE,Color.GREEN,f2,"Accademic Year Update",null,false,false,true);
		
		SecUB = new JButton(".Update Section.");
		crButton(SecUB,addSecOne,5,340,170,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Accademic Year Update",null,false,false,true);
		
		SecDB = new JButton(".Delete Section.");
		crButton(SecDB,addSecOne,185,340,170,30,Color.BLUE,Color.RED,f2,"Accademic Year Update",null,false,false,true);
		
		
		Sectbl = new JTable();
		Sectbl.setEnabled(true);
		Sectbl.setSelectionBackground(Color.pink);
		Sectbl.setFont(f);
		Sectbl.setBackground(Color.white);
		Sectbl.setRowHeight(25);
		
		Sectmdl = new DefaultTableModel();
		Sectmdl.setColumnIdentifiers(Seccols);
		Sectbl.setModel(Sectmdl);
		
		sp4 = new JScrollPane(Sectbl);
		sp4.setBounds(400,10,600,360);
		addSecOne.add(sp4);
		
		
		Sectbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int i;
				i = Sectbl.getSelectedRow();
				
				if(i>=0) {
					
					String s1, s2, s3, s4;
					int s;
					s = Integer.parseInt(Sectmdl.getValueAt(i, 0).toString());
					s1 = Sectmdl.getValueAt(i, 1).toString();
					s2 = Sectmdl.getValueAt(i, 2).toString();
					s3 = Sectmdl.getValueAt(i, 3).toString();
					s4 = Sectmdl.getValueAt(i, 4).toString();
					
					SecNamet.setText(s1);
					SecCodet.setText(s2);
					classSecCom.setToolTipText(s3);
					SecFeet.setText(s4);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
		
		
		
		coursep = new JPanel();
		coursep.setLayout(null);
		coursep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		coursep.setBorder(null);
//		coursep.setBackground(new Color(0,51,102));
		coursep.setBackground(Color.WHITE);
		coursep.setBorder(brdr);
		pan2.add(coursep,"coursep");
		
// courses 
		
		tp11 = new JTabbedPane(JTabbedPane.RIGHT);
		tp11.setTabPlacement(JTabbedPane.TOP);
		tp11.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		coursep.add(tp11);
		
		JPanel courseOne = new JPanel();
		crPanel(courseOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel courseTwo = new JPanel();
		crPanel(courseTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel courseThree = new JPanel();
		crPanel(courseThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp11.addTab("Assign Course", courseOne);
		tp11.addTab("MANAGEMENT", courseTwo);
		tp11.addTab("BANK-FUNDS", courseThree);
		
		JLabel courseAL = new JLabel("Please, Select a Session and Class ~ ");
		crLabel(courseAL,courseOne,15,10,285,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Select Session");
		String[] courseAC = {"--Select a Session--"}; 
		courseAYearCom = new JComboBox<String>(courseAC);
		crCom(courseAYearCom,courseOne,305,10,225,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		String[] courseAcC = {"--Select a Class--"}; 
		courseAClassCom = new JComboBox<String>(courseAcC);
		crCom(courseAClassCom,courseOne,540,10,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		
		
		JLabel courseAaL = new JLabel("To Assign Subject On a Section ~ ");
		crLabel(courseAaL,courseOne,770,10,220,70,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Select Session");
		
		String[] courseAacC = {"--Select a Subject--"}; 
		courseASubCom = new JComboBox<String>(courseAacC);
		crCom(courseASubCom,courseOne,770,85,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		String[] courseAaC = {"--Select a Section--"}; 
		courseASecCom = new JComboBox<String>(courseAaC);
		crCom(courseASecCom,courseOne,770,120,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		subAsB = new JButton("...ASSIGNe...");
		crButton(subAsB,courseOne,770,160,220,30,Color.BLUE,Color.GREEN,f2,"Assign subject",null,false,false,true);
		
		
		asubtbl = new JTable();
		asubtbl.setEnabled(true);
		asubtbl.setSelectionBackground(Color.pink);
		asubtbl.setFont(f);
		asubtbl.setBackground(Color.white);
		asubtbl.setRowHeight(25);
		
		asubtmdl = new DefaultTableModel();
		asubtmdl.setColumnIdentifiers(subcols);
		asubtbl.setModel(asubtmdl);
		
		sp6 = new JScrollPane(asubtbl);
		sp6.setBounds(15,50,745,330);
		courseOne.add(sp6);
		
		
		asubtbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int i;
				i = asubtbl.getSelectedRow();
				
				if(i>=0) {
					
					String s1, s2, s3, s4;
					int s;
					s = Integer.parseInt(asubtmdl.getValueAt(i, 0).toString());
					s1 = asubtmdl.getValueAt(i, 1).toString();
					s2 = asubtmdl.getValueAt(i, 2).toString();
					s3 = asubtmdl.getValueAt(i, 3).toString();
					s4 = asubtmdl.getValueAt(i, 4).toString();
					
					Subject sub = new Subject();
					sub = new SubjectData().getSubject(s, sId);
					
					viewSubject vSub = new viewSubject(sub);
					
					vSub.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
		addCoursep = new JPanel();
		addCoursep.setLayout(null);
		addCoursep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addCoursep.setBorder(null);
//		addCoursep.setBackground(new Color(0,51,102));
		addCoursep.setBackground(Color.WHITE);
		addCoursep.setBorder(brdr);
		pan2.add(addCoursep,"addCoursep");
		
		
		
		JLabel addClassSubL = new JLabel("Class : ");
		crLabel(addClassSubL,addCoursep,25,10,80,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Select Session");
		

		String[] classSubC = {"--Select a Class--"}; 
		
		classSubCom = new JComboBox<String>(classSubC);
		crCom(classSubCom,addCoursep,105,10,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		
		subNamet = new HintTextField("Subject Name ");
		crHText(subNamet,addCoursep,25,45,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Name",true,40);		
		
		subCodet = new HintTextField("Subject Code ");
		crHText(subCodet,addCoursep,25,80,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Code",true,40);		
		
		subFeet = new HintTextField("Subject Fee ");
		crHText(subFeet,addCoursep,25,115,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Code",true,40);		
		

		subAB = new JButton("...Add Subject...");
		crButton(subAB,addCoursep,5,300,350,30,Color.BLUE,Color.GREEN,f2,"Accademic Year Update",null,false,false,true);
		
		subUB = new JButton(".Update Subject.");
		crButton(subUB,addCoursep,5,340,170,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Accademic Year Update",null,false,false,true);
		
		subDB = new JButton(".Delete Subject.");
		crButton(subDB,addCoursep,185,340,170,30,Color.BLUE,Color.RED,f2,"Accademic Year Update",null,false,false,true);
		
		
		subtbl = new JTable();
		subtbl.setEnabled(true);
		subtbl.setSelectionBackground(Color.pink);
		subtbl.setFont(f);
		subtbl.setBackground(Color.white);
		subtbl.setRowHeight(25);
		
		subtmdl = new DefaultTableModel();
		subtmdl.setColumnIdentifiers(subcols);
		subtbl.setModel(subtmdl);
		
		sp5 = new JScrollPane(subtbl);
		sp5.setBounds(400,10,600,360);
		addCoursep.add(sp5);
		
		
		subtbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int i;
				i = subtbl.getSelectedRow();
				
				if(i>=0) {
					
					String s1, s2, s3, s4;
					int s;
					s = Integer.parseInt(subtmdl.getValueAt(i, 0).toString());
					s1 = subtmdl.getValueAt(i, 1).toString();
					s2 = subtmdl.getValueAt(i, 2).toString();
					s3 = subtmdl.getValueAt(i, 3).toString();
					s4 = subtmdl.getValueAt(i, 4).toString();
					
					subNamet.setText(s1);
					subCodet.setText(s2);
					classSubCom.setToolTipText(s3);
					subFeet.setText(s4);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
		
		addUserp = new JPanel();
		addUserp.setLayout(null);
		addUserp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addUserp.setBorder(null);
//		addUserp.setBackground(new Color(0,51,102));
		addUserp.setBackground(Color.WHITE);
		addUserp.setBorder(brdr);
		pan2.add(addUserp,"addUserp");
		
// add user settings
		
		tp12 = new JTabbedPane(JTabbedPane.RIGHT);
		tp12.setTabPlacement(JTabbedPane.TOP);
		tp12.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		addUserp.add(tp12);
		
		JPanel addUserOne = new JPanel();
		crPanel(addUserOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addUserTwo = new JPanel();
		crPanel(addUserTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addUserThree = new JPanel();
		crPanel(addUserThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp12.addTab("COLLEGE/SCHOOL", addUserOne);
		tp12.addTab("MANAGEMENT", addUserTwo);
		tp12.addTab("BANK-FUNDS", addUserThree);
		
		
		
		
		
		
		addStdp = new JPanel();
		addStdp.setLayout(null);
		addStdp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addStdp.setBorder(null);
//		addStdp.setBackground(new Color(0,51,102));
		addStdp.setBackground(Color.WHITE);
		addStdp.setBorder(brdr);
		pan2.add(addStdp,"addStdp");
		
// add Student setting 
		
		tp13 = new JTabbedPane(JTabbedPane.RIGHT);
		tp13.setTabPlacement(JTabbedPane.TOP);
		tp13.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		addStdp.add(tp13);
		
		addStdOne = new JPanel();
		crPanel(addStdOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.white,brdr);
		
		addStdTwo = new JPanel();
		crPanel(addStdTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.white,brdr);
		
		addStdThree = new JPanel();
		crPanel(addStdThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.white,brdr);
		
		tp13.addTab("+ Add New Student", addStdTwo);
		tp13.addTab("All Students", addStdOne);
		
		tp13.addTab("Manage Student", addStdThree);
		
		
		JLabel addStdH = new JLabel("Add Student Form");
		crLabel(addStdH,addStdTwo,0,0,595,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Add Student Form");
		addStdH.setHorizontalAlignment(SwingConstants.CENTER);
		
		String[] sMajorC = {"--Select Department--"}; 
		
		aSMajorCom = new JComboBox<String>(sMajorC);
		crCom(aSMajorCom,addStdTwo,5,40,300,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Major");
		
		JLabel addStdsidL = new JLabel("SID : ");
		crLabel(addStdsidL,addStdTwo,5,80,40,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Add Student Form");
		
		addStdsidt = new HintTextField("");
		crHText(addStdsidt,addStdTwo,50,80,255,30,Color.white,new Color(32, 178, 170),HintTextField.CENTER,f3,null,"Student ID No",false,14);		
		
		
		stdNamet = new HintTextField("Student Name");
		crHText(stdNamet,addStdTwo,5,120,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Full Name",true,22);		
		
		stdPhonet = new HintTextField("Student Phone Number");
		crHText(stdPhonet,addStdTwo,5,160,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Phone Number",true,22);		
		
		stdEmailt = new HintTextField("Student Email");
		crHText(stdEmailt,addStdTwo,5,200,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Email",true,22);		
				
//		stdEmailt = new HintTextField("Student Email");
//		crHText(stdEmailt,addStdTwo,5,175,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Email",true,22);		
//		
		
		JLabel addStddobL = new JLabel("Date of Birth : ");
		crLabel(addStddobL,addStdTwo,5,240,100,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Add Student Form");
		
		dobspinner = new JSpinner();
		dobspinner.setToolTipText("Date Of Birth");
		dobspinner.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					dobspinner.setFocusable(false);
				}
			}
		});
		dobspinner.setFont(new Font("Segoe UI Historic", Font.PLAIN, 18));
		SimpleDateFormat model = new SimpleDateFormat("dd-MM-yyyy");
		dobspinner.setModel(new SpinnerDateModel());
		dobspinner.setEditor(new JSpinner.DateEditor(dobspinner, model.toPattern()));
		dobspinner.setBounds(105,240,200,30);
		addStdTwo.add(dobspinner);
		
		
		stdHPhonet = new HintTextField("Father/Mother Phone");
		crHText(stdHPhonet,addStdTwo,5,280,300,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Email",true,22);		
		
		JLabel addStdRelL = new JLabel("Religion : ");
		crLabel(addStdRelL,addStdTwo,5,320,100,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Add Student Form");
		
		String[] sRelC = {"Islam","Hindu","Others"}; 
		
		aSRelCom = new JComboBox<String>(sRelC);
		crCom(aSRelCom,addStdTwo,105,320,200,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student's Religion");
		
		JLabel addStdgenL = new JLabel("Gender : ");
		crLabel(addStdgenL,addStdTwo,5,355,100,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Add Student Form");
		
		String[] sgenC = {"Male","Female","Others"}; 
		
		aSgenCom = new JComboBox<String>(sgenC);
		crCom(aSgenCom,addStdTwo,105,355,200,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student's Gender");
		
		stdAddresst = new HintTextField("Address ");
		crHText(stdAddresst,addStdTwo,315,40,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Address",true,40);		
		
		stdUWt = new HintTextField("Union-Word NO/Street ");
		crHText(stdUWt,addStdTwo,315,80,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student's Union-Word/Street",true,40);		
		
		stdFNamet = new HintTextField("Father Name ");
		crHText(stdFNamet,addStdTwo,315,120,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Father Name",true,40);		
		
		stdMNamet = new HintTextField("Mother Name ");
		crHText(stdMNamet,addStdTwo,315,160,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Mother Name",true,40);		
		
		stdFNIDt = new HintTextField("Father NID No ");
		crHText(stdFNIDt,addStdTwo,315,200,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Father NiD",true,40);		
		
		stdMNIDt = new HintTextField("Mother NID No ");
		crHText(stdMNIDt,addStdTwo,315,240,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Mother NiD",true,40);		
		
		stdSNIDt = new HintTextField("Student NiD/Birth Reg NO  ");
		crHText(stdSNIDt,addStdTwo,315,280,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student NID",true,40);		
		
		stdGNamet = new HintTextField("Guardian Name ");
		crHText(stdGNamet,addStdTwo,315,320,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Guardian Name",true,40);		
		
		stdGPhonet = new HintTextField("Guardian Phone ");
		crHText(stdGPhonet,addStdTwo,315,355,280,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Guardian Phone",true,40);		
		
		
		sLogolbl = new JLabel("");
		sLogolbl.setBorder(new LineBorder(Color.gray));
		sLogolbl.setIcon(new ImageIcon(defaultpicpath));
		sLogolbl.setHorizontalAlignment(SwingConstants.CENTER);
		sLogolbl.setBounds(605,0,180,220);
		addStdTwo.add(sLogolbl);
		

		sLogoPic = new JLabel("");
		sLogoPic.setFont(new Font("Segoe UI", Font.PLAIN,17));
		sLogoPic.setBounds(605,225,100,25);
		addStdTwo.add(sLogoPic);
		
		sLogoSize = new JLabel("");
		sLogoSize.setFont(new Font("Segoe UI", Font.PLAIN,17));
		sLogoSize.setBounds(605,255,180,25);
		addStdTwo.add(sLogoSize);
		
		sImgChB = new JButton("...Choose File...");
		crButton(sImgChB,addStdTwo,605,285,180,30,Color.BLUE,Color.LIGHT_GRAY,f2,"Image Upload",null,false,false,true);
//		sImgChB.addActionListener(this);
		
		sLogonamelbl = new JLabel("No File Choosen");
		crLabel(sLogonamelbl,addStdTwo,605,320,180,25,Color.BLUE,null,f2,null,"No File Choosen");
		
		sLogosizenote = new JLabel("Image size < 1024 KB");
		crLabel(sLogosizenote,addStdTwo,605,350,180,25,Color.BLUE,null,f2,null,"Image size");
		
		stdGAddresst = new HintTextField("Guardian Address ");
		crHText(stdGAddresst,addStdTwo,790,5,210,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Guardian Name",true,40);		
		
		stdGEmailt = new HintTextField("Guardian Email ");
		crHText(stdGEmailt,addStdTwo,790,40,210,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Student Guardian Phone",true,40);		
		
		sDUB = new JButton(".UPDATE STUDENT DATA.");
		crButton(sDUB,addStdTwo,800,270,200,50,Color.BLUE,Color.RED,f2,"Student Data Update",null,false,false,true);

		sDAB = new JButton(".ADD STUDENT DATA.");
		crButton(sDAB,addStdTwo,800,330,200,50,Color.BLUE,Color.GREEN,f2,"Add Student",null,false,false,true);
	
		
		
		
		stdTbl = new JTable();
		stdModel = new DefaultTableModel();
		stdModel.setColumnIdentifiers(stdCols);
		stdTbl.setModel(stdModel);
		
		sp1 = new JScrollPane(stdTbl);
		sp1.setBounds(5,20,1010,365);
		
		crTable(stdTbl,addStdOne,sp1,new LineBorder(Color.LIGHT_GRAY),new Color(32,178,170),Color.WHITE,new Color(240,255,255),Color.LIGHT_GRAY,f,new Font("Segoe UI",Font.PLAIN,18),40,30,30);
		
		stdTbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
//				updateAYear();
				int i;
				i = stdTbl.getSelectedRow();
				
				if(i>=0) {
					
					String uId, s1;
					
					uId = stdModel.getValueAt(i, 0).toString();
					s1 = stdModel.getValueAt(i, 1).toString();
					
					
					studentData sd = new studentData();
			
					viewStudent vs = new viewStudent(sd.getStudentData(uId));
					
					vs.setVisible(true);
					
				
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
		
		
		Payp = new JPanel();
		Payp.setLayout(null);
		Payp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		Payp.setBorder(null);
//		Payp.setBackground(new Color(0,51,102));
		Payp.setBackground(Color.WHITE);
		Payp.setBorder(brdr);
		pan2.add(Payp,"Payp");
		
// payment setting 
		
		tp14 = new JTabbedPane(JTabbedPane.RIGHT);
		tp14.setTabPlacement(JTabbedPane.TOP);
		tp14.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		Payp.add(tp14);
		
		JPanel PayOne = new JPanel();
		crPanel(PayOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel PayTwo = new JPanel();
		crPanel(PayTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel PayThree = new JPanel();
		crPanel(PayThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp14.addTab("COLLEGE/SCHOOL", PayOne);
		tp14.addTab("MANAGEMENT", PayTwo);
		tp14.addTab("BANK-FUNDS", PayThree);
		
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

// export setting
		
		tp15 = new JTabbedPane(JTabbedPane.RIGHT);
		tp15.setTabPlacement(JTabbedPane.TOP);
		tp15.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		exportp.add(tp15);
		
		JPanel exportOne = new JPanel();
		crPanel(exportOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel exportTwo = new JPanel();
		crPanel(exportTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel exportThree = new JPanel();
		crPanel(exportThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp15.addTab("COLLEGE/SCHOOL", exportOne);
		tp15.addTab("MANAGEMENT", exportTwo);
		tp15.addTab("BANK-FUNDS", exportThree);
		
		importp = new JPanel();
		importp.setLayout(null);
		importp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		importp.setBorder(null);
//		importp.setBackground(new Color(0,51,102));
		importp.setBackground(Color.WHITE);
		importp.setBorder(brdr);
		pan2.add(importp,"importp");
	
// import setting code	
		
		tp16 = new JTabbedPane(JTabbedPane.RIGHT);
		tp16.setTabPlacement(JTabbedPane.TOP);
		tp16.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		importp.add(tp16);
		
		JPanel importOne = new JPanel();
		crPanel(importOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel importTwo = new JPanel();
		crPanel(importTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel importThree = new JPanel();
		crPanel(importThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp16.addTab("COLLEGE/SCHOOL", importOne);
		tp16.addTab("MANAGEMENT", importTwo);
		tp16.addTab("BANK-FUNDS", importThree);
		
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
		
// Take Attendance setting
		
		tp17 = new JTabbedPane(JTabbedPane.RIGHT);
		tp17.setTabPlacement(JTabbedPane.TOP);
		tp17.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		takeAttnp.add(tp17);
		
		JPanel takeAttnOne = new JPanel();
		crPanel(takeAttnOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel takeAttnTwo = new JPanel();
		crPanel(takeAttnTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel takeAttnThree = new JPanel();
		crPanel(takeAttnThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp17.addTab("COLLEGE/SCHOOL", takeAttnOne);
		tp17.addTab("MANAGEMENT", takeAttnTwo);
		tp17.addTab("BANK-FUNDS", takeAttnThree);
		
		
		
		
		
		
		JLabel tasecAL = new JLabel("Please, Select a Session and Class ~ ");
		crLabel(tasecAL,takeAttnOne,15,10,285,30,new Color(32, 178, 170),new Color(32, 178, 170),new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"Select Session");
		String[] tasecAC = {"--Select a Session--"}; 
		tasecAYearCom = new JComboBox<String>(tasecAC);
		crCom(tasecAYearCom,takeAttnOne,305,10,225,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Session");
		
		String[] tasecAcC = {"--Select a Class--"}; 
		tasecAClassCom = new JComboBox<String>(tasecAcC);
		crCom(tasecAClassCom,takeAttnOne,540,10,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Semester/Class");
		

		taasectbl = new JTable();
		taasectbl.setEnabled(true);
		taasectbl.setSelectionBackground(Color.pink);
		taasectbl.setFont(f);
		taasectbl.setBackground(Color.white);
		taasectbl.setRowHeight(25);
		
		taasectmdl = new DefaultTableModel();
		taasectmdl.setColumnIdentifiers(seccols);
		taasectbl.setModel(taasectmdl);
		
		tasp7 = new JScrollPane(taasectbl);
		tasp7.setBounds(15,50,990,330);
		takeAttnOne.add(tasp7);
		
		
		taasectbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int i;
				i = taasectbl.getSelectedRow();
				
				if(i>=0) {
					
					String s1, s2, s3, s4;
					int s;
					s = Integer.parseInt(taasectmdl.getValueAt(i, 0).toString());
					s1 = taasectmdl.getValueAt(i, 1).toString();
					s2 = taasectmdl.getValueAt(i, 2).toString();
					s3 = taasectmdl.getValueAt(i, 3).toString();
					s4 = taasectmdl.getValueAt(i, 4).toString();
					
					Section sec = new Section();
					sec = new SectionData().getSection(s, sId);
					
					Calendar vSub = new Calendar(sec,myId);
					
					vSub.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});		
		
		
		
		
		
		
		
		
		Attnp = new JPanel();
		Attnp.setLayout(null);
		Attnp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		Attnp.setBorder(null);
//		Attnp.setBackground(new Color(0,51,102));
		Attnp.setBackground(Color.WHITE);
		Attnp.setBorder(brdr);
		pan2.add(Attnp,"Attnp");
		
// Attendance setting
		
		tp18 = new JTabbedPane(JTabbedPane.RIGHT);
		tp18.setTabPlacement(JTabbedPane.TOP);
		tp18.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		Attnp.add(tp18);
		
		JPanel AttnOne = new JPanel();
		crPanel(AttnOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel AttnTwo = new JPanel();
		crPanel(AttnTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel AttnThree = new JPanel();
		crPanel(AttnThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp18.addTab("COLLEGE/SCHOOL", AttnOne);
		tp18.addTab("MANAGEMENT", AttnTwo);
		tp18.addTab("BANK-FUNDS", AttnThree);
		
		rsltp = new JPanel();
		rsltp.setLayout(null);
		rsltp.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		rsltp.setBorder(null);
//		rsltp.setBackground(new Color(0,51,102));
		rsltp.setBackground(Color.WHITE);
		rsltp.setBorder(brdr);
		pan2.add(rsltp,"rsltp");
		
// Result setting 
		
		tp19 = new JTabbedPane(JTabbedPane.RIGHT);
		tp19.setTabPlacement(JTabbedPane.TOP);
		tp19.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		rsltp.add(tp19);
		
		JPanel rsltOne = new JPanel();
		crPanel(rsltOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel rsltTwo = new JPanel();
		crPanel(rsltTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel rsltThree = new JPanel();
		crPanel(rsltThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp19.addTab("COLLEGE/SCHOOL", rsltOne);
		tp19.addTab("MANAGEMENT", rsltTwo);
		tp19.addTab("BANK-FUNDS", rsltThree);
		
		feep = new JPanel();
		feep.setLayout(null);
		feep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		feep.setBorder(null);
//		feep.setBackground(new Color(0,51,102));
		feep.setBackground(Color.WHITE);
		feep.setBorder(brdr);
		pan2.add(feep,"feep");
		
// Fee Setting Code
		
		tp20 = new JTabbedPane(JTabbedPane.RIGHT);
		tp20.setTabPlacement(JTabbedPane.TOP);
		tp20.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		feep.add(tp20);
		
		JPanel feeOne = new JPanel();
		crPanel(feeOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel feeTwo = new JPanel();
		crPanel(settTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel feeThree = new JPanel();
		crPanel(feeThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp20.addTab("COLLEGE/SCHOOL", feeOne);
		tp20.addTab("MANAGEMENT", feeTwo);
		tp20.addTab("BANK-FUNDS", feeThree);
		
		addFeep = new JPanel();
		addFeep.setLayout(null);
		addFeep.setBounds(5,185,(this.getWidth()-35),(this.getHeight()-250));
		addFeep.setBorder(null);
//		addFeep.setBackground(new Color(0,51,102));
		addFeep.setBackground(Color.WHITE);
		addFeep.setBorder(brdr);
		pan2.add(addFeep,"addFeep");
		
// Add Fee setting code
		
		tp21 = new JTabbedPane(JTabbedPane.RIGHT);
		tp21.setTabPlacement(JTabbedPane.TOP);
		tp21.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		settp.add(tp21);
		
		JPanel addFeeOne = new JPanel();
		crPanel(addFeeOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addFeeTwo = new JPanel();
		crPanel(addFeeTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addFeeThree = new JPanel();
		crPanel(addFeeThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp21.addTab("COLLEGE/SCHOOL", addFeeOne);
		tp21.addTab("MANAGEMENT", addFeeTwo);
		tp21.addTab("BANK-FUNDS", addFeeThree);
		
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
		
// add fee on course code
		
		tp22 = new JTabbedPane(JTabbedPane.RIGHT);
		tp22.setTabPlacement(JTabbedPane.TOP);
		tp22.setBounds(5,0,(this.getWidth()-55),(this.getHeight()-265));
		addFeeOnCoursep.add(tp22);
		
		JPanel addFeeOnCourseOne = new JPanel();
		crPanel(addFeeOnCourseOne,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addFeeOnCourseTwo = new JPanel();
		crPanel(addFeeOnCourseTwo,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		JPanel addFeeOnCourseThree = new JPanel();
		crPanel(addFeeOnCourseThree,5,0,(this.getWidth()-55),(this.getHeight()-265),Color.blue,brdr);
		
		tp22.addTab("COLLEGE/SCHOOL", addFeeOnCourseOne);
		tp22.addTab("MANAGEMENT", addFeeOnCourseTwo);
		tp22.addTab("BANK-FUNDS", addFeeOnCourseThree);
		
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
				
				School scl = new School();
				scl = new schoolData().getSchoolData(sId);
				
				studentAll.setText("STUDENTS : "+scl.getsStudent());
				dueStd.setText("DUE : ");
				teacherAll.setText("TEACHERS : "+scl.getsTeacher());
				userAll.setText("USERS : "+scl.getsUser());
				rcvFees.setText("RECEIVED FEES : ");
				dueFees.setText("DUE FEES : ");
				noticeMail.setText("MESSAGES : ");
			}
		};
		

		timer.scheduleAtFixedRate(task,delay,interval);
		
	}
	
	public ad(String name, String id , String sId, String phone, String pass, String email){
		this.setDefaultCloseOperation(ad.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1080,680);
		this.setResizable(true);
		this.setTitle("FF_ADMIN_PANEL");
		
		icon = new ImageIcon(getClass().getResource("img.png"));
		
		this.setIconImage(icon.getImage());
		
		this.myName = name;
		this.myId = id;
		this.sId = sId;
		this.myPhone = phone;
		this.myPass = pass;
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
		l.setText(name);
		userLabell.setText("Admin" + " ("+id+")");
		phoneLabell.setText(phone);
		emailLabell.setText(email);
//		addressLabell.setText(address);
		majorLabell.setText("Administration");
		
//		updateAYear();
		updateSchool();
//		
//		addSchoolCode();

	}
	
	
	public void createModel(String sId, String select, String condition) {
		studentData rd = new studentData();
		res = rd.getstudentInfo(sId, select, condition);
		
		if(res!=null) {
			
//			Object[] stdRow = new Object[8];
			stdModel.setRowCount(0);
			
			try {
				while(res.next()) {
					stdRow[0] = res.getString(1);
					stdRow[1] = res.getString(2);
					stdRow[2] = res.getString(3);
					stdRow[3] = res.getString(4);
					stdRow[4] = res.getString(5);
					stdRow[5] = res.getString(6);
////					stdRow[6] = rs.getString("gEmail");
//					stdRow[6] = rs.getString(7);
//					stdRow[] = rs.getString("");
					

//					System.out.println(""+stdRow[0]+" "+stdRow[1]);
					
					stdModel.addRow(stdRow);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
//					pst.close();
					res.close();
				}catch(Exception ef){
					
				}
			}
			
//			try {
//				ResultSetMetaData metaData = rs.getMetaData();
//				
//				int cColumn = metaData.getColumnCount();
//				
//				for(int i=1; i<=cColumn; i++) {
//					stdModel.addColumn(metaData.getColumnName(i));
//				}
//				
//				while(rs.next()) {
//					Object[] row = new Object[cColumn];
//					for(int i=1; i<=cColumn; i++) {
//						row[i-1] = rs.getObject(i);
//					}
//					stdModel.addRow(row);
//				}
//				
//				
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
//			stdTbl.setModel(DbUtils.resultSetToTableModel(rs));
//			stdTbl.setModel(stdModell);
		}else {
			System.out.println("User not found");
		}
		
//		System.out.println(" "+rs);
		stdTbl.getColumnModel().getColumn(0).setMaxWidth(150);
		stdTbl.getColumnModel().getColumn(1).setMaxWidth(180);
		stdTbl.getColumnModel().getColumn(2).setMaxWidth(180);
		stdTbl.getColumnModel().getColumn(3).setMaxWidth(180);
		stdTbl.getColumnModel().getColumn(4).setMaxWidth(150);
		stdTbl.getColumnModel().getColumn(5).setMaxWidth(180);
		stdTbl.getColumnModel().getColumn(6).setMaxWidth(80);
//		stdTbl.getColumnModel().getColumn(7).setMaxWidth(50);
		stdTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
		
	}
	
	
	
	public void addSchoolCode() {
//		String select = " uId as 'SID', stdName as 'Student', stdPhone as 'Phone', stdEmail as 'Email', sMajor as 'Major', gPhone as 'Guardian', aStatus as 'Status' ";
		String condition = " AND aStatus=1 ";
		String select = " uId, stdName, stdPhone, stdEmail, sMajor, gPhone ";
//		condition = " ";
		createModel(sId,select,condition);
		
		addStudentCode();	
	}
	
	

	public void selectSection(JComboBox com) {
		SectionData cd = new SectionData();
		ResultSet rsm = cd.getSectionInfo(sId);
		
		if(rsm!=null) {
			com.removeAllItems();
			Section s = new Section();
			s.setsecName("--Select a Section--");
			com.addItem(s);			
			try {
				while(rsm.next()) {
					
					Section d = new Section();
				
					d.setid(rsm.getInt(1));
					d.setsId(rsm.getString(2));
					d.setclsId(rsm.getString(3));
					d.setsecName(rsm.getString(4));
					d.setsecCode(rsm.getString(5));
					d.setsecFee(rsm.getString(6));
					d.setsecTeaId(rsm.getString(7));
					d.setsecNumStd(rsm.getInt(8));
					d.setaStatus(rsm.getInt(9));
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rsm.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Session not found");
		}
		
		
	}
	
	public void selectSection(JComboBox com,String clsId) {
		SectionData cd = new SectionData();
		ResultSet rsm = cd.getSectionInfo(sId,clsId);
		
		if(rsm!=null) {
			
			com.removeAllItems();
			Section s = new Section();
			s.setsecName("--Select a Section--");
			com.addItem(s);			
			try {
				while(rsm.next()) {
					
					Section d = new Section();
				
					d.setid(rsm.getInt(1));
					d.setsId(rsm.getString(2));
					d.setclsId(rsm.getString(3));
					d.setsecName(rsm.getString(4));
					d.setsecCode(rsm.getString(5));
					d.setsecFee(rsm.getString(6));
					d.setsecTeaId(rsm.getString(7));
					d.setsecNumStd(rsm.getInt(8));
					d.setaStatus(rsm.getInt(9));
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rsm.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Session not found");
		}
		
		
	}
	
	public void selectSubject(JComboBox com) {
		SubjectData sd = new SubjectData();
		ResultSet rsm = sd.getSubjectInfo(sId);
		
		if(rsm!=null) {
			com.removeAllItems();
			Subject s = new Subject();
			s.setsubName("--Select a Subject--");
			com.addItem(s);	
			try {
				while(rsm.next()) {
					
					Subject d = new Subject();
				
					d.setid(rsm.getInt(1));
					d.setsId(rsm.getString(2));
					d.setsubId(rsm.getString(3));
					d.setsubName(rsm.getString(4));
					d.setsubCode(rsm.getString(5));
					d.setsubFee(rsm.getString(6));
					d.setsubTeacherId(rsm.getString(7));
					d.setclsId(rsm.getString(8));
					d.setaStatus(rsm.getInt(9));
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rsm.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Session not found");
		}
		
		
	}
	
	public void selectSubjectOnSec(JComboBox com,int i,String sId) {
		subAOnSecData sd = new subAOnSecData();
		ResultSet rsm = sd.getSubjectOnSec(sId,i);
		
		if(rsm!=null) {
			com.removeAllItems();
			Subject s = new Subject();
			s.setsubName("--Select a Subject--");
			com.addItem(s);	
			try {
				while(rsm.next()) {
					
					Subject d = new Subject();
				
					SubjectData subd = new SubjectData();
				 	d = subd.getSubject(rsm.getInt(4), rsm.getString(2));
					
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rsm.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Session not found");
		}
		
		
	}
	
	public void selectSubject(JComboBox com,int i) {
		SubjectData sd = new SubjectData();
		ResultSet rsm = sd.getSubjectInfo(sId,i);
		
		if(rsm!=null) {
			com.removeAllItems();
			Subject s = new Subject();
			s.setsubName("--Select a Subject--");
			com.addItem(s);	
			try {
				while(rsm.next()) {
					
					Subject d = new Subject();
				
					d.setid(rsm.getInt(1));
					d.setsId(rsm.getString(2));
					d.setsubId(rsm.getString(3));
					d.setsubName(rsm.getString(4));
					d.setsubCode(rsm.getString(5));
					d.setsubFee(rsm.getString(6));
					d.setsubTeacherId(rsm.getString(7));
					d.setclsId(rsm.getString(8));
					d.setaStatus(rsm.getInt(9));
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rsm.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Session not found");
		}
		
		
	}

	public void selectClass(JComboBox com) {
		ClassData cd = new ClassData();
		ResultSet rsm = cd.getClassInfo(sId);
		
		if(rsm!=null) {
			com.removeAllItems();
			Class c = new Class();
			c.setclsName("--Select a Class--");
			com.addItem(c);		
			try {
				while(rsm.next()) {
					
					Class d = new Class();
				
					d.setId(rsm.getInt(1));
					d.setsId(rsm.getString(2));
					d.setclsId(rsm.getString(3));
					d.setclsName(rsm.getString(4));
					d.setclsCode(rsm.getString(5));
					d.setaYear(rsm.getString(6));
					d.setaYearId(rsm.getInt(7));
					d.setaStatus(rsm.getInt(8));
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rsm.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Session not found");
		}
		
		
	}
	
	public void selectClass(JComboBox com,int i) {
		ClassData cd = new ClassData();
		ResultSet rsm = cd.getClassInfo(sId,i);
		
		if(rsm!=null) {
			com.removeAllItems();
			Class c = new Class();
			c.setclsName("--Select a Class--");
			com.addItem(c);	
			try {
				while(rsm.next()) {
					
					Class d = new Class();
				
					d.setId(rsm.getInt(1));
					d.setsId(rsm.getString(2));
					d.setclsId(rsm.getString(3));
					d.setclsName(rsm.getString(4));
					d.setclsCode(rsm.getString(5));
					d.setaYear(rsm.getString(6));
					d.setaYearId(rsm.getInt(7));
					d.setaStatus(rsm.getInt(8));
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rsm.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Session not found");
		}
		
		
	}
	
	public void selectSession(JComboBox com) {
		SessionData cd = new SessionData();
		ResultSet rsm = cd.getSessionInfo(sId);
		
		if(rsm!=null) {
			Session s = new Session();
			s.setaYname("--Select a Session--");
			com.addItem(s);	
			com.removeAllItems();
			com.addItem(s);
			
			try {
				while(rsm.next()) {
					
					Session d = new Session();
				
					d.setId(rsm.getInt(1));
					d.setsId(rsm.getString(2));
					d.setaYname(rsm.getString(3));
					d.setsYear(rsm.getString(4));
					d.setsMonth(rsm.getString(5));
					d.seteYear(rsm.getString(6));
					d.seteMonth(rsm.getString(7));
					d.setaStatus(rsm.getInt(8));
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rsm.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Session not found");
		}
		
		
	}
	
	
	
	public void selectMajor(JComboBox com) {
		schoolDepData rd = new schoolDepData();
		ResultSet rem = rd.getDepInfo(sId);
		
		if(rem!=null) {
			com.removeAllItems();
			schoolDep sd = new schoolDep();
			sd.setmName("--Select a Department--");
			com.addItem(sd);	
			
			try {
				while(rem.next()) {
					
					schoolDep d = new schoolDep();
				
					d.setid(rem.getInt(1));
					d.setsId(rem.getString(2));
					d.setmName(rem.getString(3));
					d.setstartId(rem.getString(4));
					d.setendId(rem.getString(5));
					d.setcurrentId(rem.getString(6));
					d.setmStatus(rem.getInt(7));
				
					com.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
//					pst.close();
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Department not found");
		}
		
		
	}
	
	public void selectMajor() {
		schoolDepData rd = new schoolDepData();
		ResultSet rem = rd.getDepInfo(sId);
		
		if(rem!=null) {
			aSMajorCom.removeAllItems();
			schoolDep sd = new schoolDep();
			sd.setmName("--Select a Department--");
			aSMajorCom.addItem(sd);	
			
			try {
				while(rem.next()) {
					
					schoolDep d = new schoolDep();
				
					d.setid(rem.getInt(1));
					d.setsId(rem.getString(2));
					d.setmName(rem.getString(3));
					d.setstartId(rem.getString(4));
					d.setendId(rem.getString(5));
					d.setcurrentId(rem.getString(6));
					d.setmStatus(rem.getInt(7));
				
					aSMajorCom.addItem(d);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Department not found");
		}
		
		
	}
	
	public void updateMajor() {
		schoolDepData rd = new schoolDepData();
		ResultSet rem = rd.getDepInfo(sId);
		
		if(rem!=null) {
			
			aMatmdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = rem.getString(1);
					stdRow[1] = rem.getString(3);
					stdRow[2] = rem.getString(4);
					stdRow[3] = rem.getString(5);
					stdRow[4] = rem.getString(6);
					stdRow[5] = rem.getString(7);
				
					aMatmdl.addRow(stdRow);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
//					pst.close();
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Department not found");
		}
		
//
//		stdTbl.getColumnModel().getColumn(0).setMaxWidth(150);
//		stdTbl.getColumnModel().getColumn(1).setMaxWidth(180);
//		stdTbl.getColumnModel().getColumn(2).setMaxWidth(180);
//		stdTbl.getColumnModel().getColumn(3).setMaxWidth(180);
//		stdTbl.getColumnModel().getColumn(4).setMaxWidth(150);
//		stdTbl.getColumnModel().getColumn(5).setMaxWidth(180);
//		stdTbl.getColumnModel().getColumn(6).setMaxWidth(80);
//		stdTbl.getColumnModel().getColumn(7).setMaxWidth(50);
//		stdTbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		
	}
	
	
	public void updateClass() {
		ClassData cd = new ClassData();
		ResultSet rem = cd.getClassInfo(sId);
		
		if(rem!=null) {
			
			classtmdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = rem.getString(1);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(6);
					stdRow[4] = rem.getString(7);
					stdRow[5] = rem.getString(8);
				
					classtmdl.addRow(stdRow);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Class not found");
		}
		
	}
	
	
	public void updateClass(DefaultTableModel mdl) {
		ClassData cd = new ClassData();
		ResultSet rem = cd.getClassInfo(sId);
		
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = rem.getString(1);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(6);
					stdRow[4] = rem.getString(7);
					stdRow[5] = rem.getString(8);
				
					mdl.addRow(stdRow);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Class not found");
		}
		
	}
	

	public void updateSubject(DefaultTableModel mdl) {
		SubjectData sd = new SubjectData();
		ResultSet rem = sd.getSubjectInfo(sId);
		
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = rem.getString(1);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(8);
					stdRow[4] = rem.getString(6);
					stdRow[5] = rem.getString(7);
					
				
					mdl.addRow(stdRow);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Subject not found");
		}
		
	}
	
	public void updateSubject(DefaultTableModel mdl,int classId) {
		SubjectData sd = new SubjectData();
		ResultSet rem = sd.getSubjectInfo(sId,classId);
		
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = rem.getString(1);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(8);
					stdRow[4] = rem.getString(6);
					stdRow[5] = rem.getString(7);
					
				
					mdl.addRow(stdRow);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Subject not found");
		}
		
	}
	

	public void updateSection(DefaultTableModel mdl,String clsId) {
		SectionData sd = new SectionData();
		ResultSet rem = sd.getSectionInfo(sId,clsId);
		
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = rem.getString(1);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(8);
					stdRow[3] = rem.getString(3);
					stdRow[4] = rem.getString(6);
				
					mdl.addRow(stdRow);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
//					pst.close();
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Class not found");
		}
		
	}
	
	public void updateSection(DefaultTableModel mdl) {
		SectionData sd = new SectionData();
		ResultSet rem = sd.getSectionInfo(sId);
		
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = rem.getString(1);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(8);
					stdRow[3] = rem.getString(3);
					stdRow[4] = rem.getString(6);
				
					mdl.addRow(stdRow);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
//					pst.close();
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Class not found");
		}
		
	}
	

	public void updateSection() {
		SectionData sd = new SectionData();
		ResultSet rem = sd.getSectionInfo(sId);
		
		if(rem!=null) {
			
			Sectmdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = rem.getString(1);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(3);
					stdRow[4] = rem.getString(6);
				
					Sectmdl.addRow(stdRow);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
				try {
//					pst.close();
					rem.close();
				}catch(Exception ef){
					
				}
			}
			

		}else {
			System.out.println("Class not found");
		}
		
	}
	
	public void updateSchool() {
		
		schoolData sData = new schoolData();
		School s = new School();
		s = sData.getSchoolData(sId);
		
		sclNamet.setText(s.getsName());
		sclAddresst.setText(s.getsAdrs());
		sclERegt.setText(s.getsEiin());
		sclPhonet.setText(s.getsPhone());
		sclEmailt.setText(s.getsEmail());
		sclWUrlt.setText(s.getsWeb());
		sclItP1t.setText(s.getsItp1());
		sclItP2t.setText(s.getsItp2());
		sclitEmailt.setText(s.getsItEmail());
		sclPasst.setText(s.getsPass());
		sclFundBalt.setText(s.getsFundsBal());
		sclFundBankt.setText(s.getsFundsBank());
		sclFundBankAt.setText(s.getsFundsAN());
		
		l.setText(s.getsName());
		phoneLabell.setText(s.getsPhone());
		emailLabell.setText(s.getsEmail());
		addressLabell.setText(s.getsAdrs());
		
	}
	
	public void updateAYear() {
		
		aYtmdl.setRowCount(0);
		
		sql = "SELECT * FROM aYear WHERE sId LIKE ? AND aStatus LIKE ?;";
		
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1,sId);
			pst.setString(2,"1");
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				
//				aYRow[0] = Integer.toString(rs.getInt("uId"));
				aYRow[0] = rs.getString("uId");
				aYRow[1] = rs.getString("aYname");
				aYRow[2] = rs.getString("sYear");
				aYRow[3] = rs.getString("sMonth");
				aYRow[4] = rs.getString("eYear");
				aYRow[5] = rs.getString("eMonth");
				
				aYtmdl.addRow(aYRow);
			}
			
			pst.close();
			rs.close();
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Data base not Connected!");

			e1.printStackTrace();
		}finally {
			try {
				pst.close();
				rs.close();
			}catch(Exception ef){
				
			}
		}
	}
	
	public static void main(String args[]) {
		
		ad frame = new ad();
		
		frame.setVisible(true);
		
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public FileDialog uploadPic(String title, String dir) {
		FileDialog fd = new FileDialog(this,title,FileDialog.LOAD);
		fd.setDirectory(dir);
		fd.setFile("*.jped;*.jpg;*.png;*.tiff;*.tif;*.gif;");
		fd.setVisible(true);
		fd.setLocationRelativeTo(this);
		
		return fd;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==sclImgChB) {
			FileDialog ffd = new FileDialog(this,"Choose School Image",FileDialog.LOAD);
			ffd.setDirectory(".\\SchoolPhoto\\");
			ffd.setFile("*.jpg;*.png;*.tiff;*.tif;*.gif;");
			ffd.setVisible(true);
			ffd.setLocationRelativeTo(this);
			
//			ffd = uploadPic("Choose School Image",".\\SchoolPhoto\\");
			
			String ffilename = ffd.getFile();
			String fpath = ffd.getDirectory();
			
			if(ffilename!=null) {
				
				ffile = new File(fpath+ffilename);
				long fbytes = ffile.length();
				if(fbytes<10482376) {
					
					try {
						
						sclLogosizenote.setForeground(new Color(46,139,27));
						sclLogosizenote.setText("Image Size <1024KB");
						Image fimage = ImageIO.read(ffile).getScaledInstance(200, 240, Image.SCALE_SMOOTH);
						
						sclLogolbl.setIcon(new ImageIcon(fimage));
						sclLogoSize.setText(ffile.length()/1024+" KB");
						sclLogonamelbl.setText(ffile.getName());
						sclLogoPic.setText(fpath+ffilename);
					}catch(Exception exp) {
						
						ffile = null;
						sclLogosizenote.setForeground(Color.red);
						sclLogosizenote.setText("Image Image Not Supported!");
						sclLogosizenote.setText("");
						sclLogonamelbl.setText("No File Choosen");
						
						exp.printStackTrace();
					}
					
				}else {
					ffile = null;
					sclLogosizenote.setForeground(Color.red);
					sclLogosizenote.setText("Image size greater than 1024 KB");
					sclLogosizenote.setText("");
					sclLogonamelbl.setText("No File Choosen");
				}
				
			}
		}
		if(e.getSource()==sImgChB) {
//			System.out.println("student button");
			FileDialog sfd = new FileDialog(this,"Choose Student Image",FileDialog.LOAD);
			sfd.setDirectory(".\\StudentsPhoto\\");
			sfd.setFile("*.jped;*.jpg;*.png;*.tiff;*.tif;*.gif;");
			sfd.setVisible(true);
			sfd.setLocationRelativeTo(this);
			
//			sfd = uploadPic("Choose Student Image",".\\StudentsPhoto\\");
			
			String sfilename = sfd.getFile();
			String spath = sfd.getDirectory();
			
			if(sfilename!=null) {
				
				sfile = new File(spath+sfilename);
				long sbytes = sfile.length();
				if(sbytes<10482376) {
					
					try {
						
						sLogosizenote.setForeground(new Color(46,139,27));
						sLogosizenote.setText("Image Size <1024KB");
						Image simage = ImageIO.read(sfile).getScaledInstance(180, 220, Image.SCALE_SMOOTH);
						
						sLogolbl.setIcon(new ImageIcon(simage));
						sLogoSize.setText(sfile.length()/1024+" KB");
						sLogonamelbl.setText(sfile.getName());
						sLogoPic.setText(spath+sfilename);
						
					}catch(Exception exp) {
						
						sfile = null;
						sLogosizenote.setForeground(Color.red);
						sLogosizenote.setText("Image Image Not Supported!");
						sLogosizenote.setText("");
						sLogonamelbl.setText("No File Choosen");
						
						exp.printStackTrace();
					}
					
				}else {
					sfile = null;
					sLogosizenote.setForeground(Color.red);
					sLogosizenote.setText("Image size greater than 1024 KB");
					sLogosizenote.setText("");
					sLogonamelbl.setText("No File Choosen");
				}
				
			}
		}
		
		if(e.getSource()==logout) {
			this.dispose();
			
		}else if(e.getSource()==sDAB) {
			
			studentData sData = new studentData();
			
			try {
				
				student s = new student();
				
				s.setsId(sId);
				s.setuId(userId());
				s.setstdId(addStdsidt.getText());
				s.setstdName(stdNamet.getText());
				s.setstdPhone(stdPhonet.getText());
				s.setstdEmail(stdEmailt.getText());
				s.setsMajor(aSMajorCom.getSelectedItem().toString());
				
				Date dob = (Date) dobspinner.getValue();
				s.setdob(new SimpleDateFormat("dd-MM-yyyy").format(dob));
				s.sethomePhone(stdHPhonet.getText());
				s.setstdReligion(aSRelCom.getSelectedItem().toString());
				s.setgender(aSgenCom.getSelectedItem().toString());
				s.setstdPass(stdPhonet.getText());
				s.setaddress(stdAddresst.getText());
				s.setUnionWord(stdUWt.getText());
				s.setfatherName(stdFNamet.getText());
				s.setmotherName(stdMNamet.getText());
				s.setfNid(stdFNIDt.getText());
				s.setmNid(stdMNIDt.getText());
				s.setnidBirth(stdSNIDt.getText());
				s.setgName(stdGNamet.getText());
				s.setgPhone(stdGPhonet.getText());
				s.setgAddress(stdGAddresst.getText());
				s.setgEmail(stdGEmailt.getText());
				s.setAdmissionDate(s.generateAdmissionDate());
				s.setaStatus(1);
				if (sfile!=null) {
					s.setFile(sfile);
					s.setProfilePic(ImageIO.read(sfile));
				} else {
					 sfile = new File("./assets/profilepicicon.jpg");
					 s.setFile(sfile);
					 s.setProfilePic(ImageIO.read(sfile));
				}
				s.setstdImg(sLogoPic.getText());
				int i = sData.addStudent(s);
				if(i==1) {
					updateSchool();
					addSchoolCode();
					JOptionPane.showMessageDialog(null, "Successfully "+s.getstdName()+"'s Data updated! ThankYou");
					stdGEmailt.setText("");
					stdAddresst.setText("");
					stdGPhonet.setText("");
					stdGNamet.setText("");
					stdSNIDt.setText("");
					stdMNIDt.setText("");
					stdFNIDt.setText("");
					stdMNamet.setText("");
					stdFNamet.setText("");
					stdUWt.setText("");
					stdAddresst.setText("");
					stdPhonet.setText("");
					stdPhonet.setText("");
					stdHPhonet.setText("");
					addStdsidt.setText("");
					stdNamet.setText("");
					stdEmailt.setText("");
					
				}else {
					JOptionPane.showMessageDialog(null, "OOPs Data not updated! Try Again!");
					
				}
			
			}catch (Exception ex) {
				
//				JOptionPane.showMessageDialog(null, "Session Data not Inserted, Try Again!"+ex);
				ex.printStackTrace();
			}
		}
//		else if(e.getSource()==item1) {
//			JOptionPane.showMessageDialog(null, "Successfully  Data updated! ThankYou");
//			
//		}
		else if(e.getSource()==sclSettB||e.getSource()==sclMB||e.getSource()==sclFundB) {
			schoolData sData = new schoolData();
			
			School s = new School();
			s.setsName(sclNamet.getText());
			s.setsAdrs(sclAddresst.getText());
			s.setsEiin(sclERegt.getText());
			s.setsPhone(sclPhonet.getText());
			s.setsEmail(sclEmailt.getText());
			s.setsWeb(sclWUrlt.getText());
			s.setsItp1(sclItP1t.getText());
			s.setsItp2(sclItP2t.getText());
			s.setsItEmail(sclitEmailt.getText());
			s.setsPass(sclPasst.getText());
			s.setsFundsBal(sclFundBalt.getText());
			s.setsFundsBank(sclFundBankt.getText());
			s.setsFundsAN(sclFundBankAt.getText());
			
			
			int i = sData.updateSchool(sId, s);
			if(i==1) {
				updateSchool();
				JOptionPane.showMessageDialog(null, "Successfully "+s.getsName()+"'s Data updated! ThankYou");
				
			}else {
				JOptionPane.showMessageDialog(null, "OOPs Data not updated! Try Again!");
				
			}
			
		}else if(e.getSource()==sclaYB) {
			
			
			String s,s1;
			int s2,s3,s4, s5;
			
			s1 = sclaYeart.getText();
			s2 = sclsYeart.getYear();
			s3 = sclsMontht.getMonth();
			s4 = scleYeart.getYear();
			s5 = scleMontht.getMonth();

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
//			JOptionPane.showMessageDialog(null, " name "+s+" rand  "+mm+" uuid ");
			SimpleDateFormat da = new SimpleDateFormat("yyyyMMddhhmmss");
			String u_id = da.format(new Timestamp(System.currentTimeMillis()));
			
			aYRow[0] = "aY-"+u_id;
			aYRow[1] = s1;
			aYRow[2] = Integer.toString(s2);
			aYRow[3] = Integer.toString(s3+1);
			aYRow[4] = Integer.toString(s4);
			aYRow[5] = Integer.toString(s5+1);
			
			sql = "INSERT INTO aYear (uId,sId,aYname,sYear,sMonth,eYear,eMonth,aStatus) VALUES(?,?,?,?,?,?,?,?)";
			
			try {
				pst = con.prepareStatement(sql);
				
				pst.setString(1, "aY-"+u_id);
				pst.setString(2, sId);
				pst.setString(3, s1);
				pst.setString(4, Integer.toString(s2));
				pst.setString(5, Integer.toString(s3+1));
				pst.setString(6, Integer.toString(s4));
				pst.setString(7, Integer.toString(s5+1));
				pst.setString(8, "1");
				
				pst.execute();
				
				JOptionPane.showMessageDialog(null, "New "+s1+" Session Created! ThankYou");
				aYtmdl.addRow(aYRow);
				updateAYear();
//				sqll = "INSERT INTO Users (u_id,name,phone,pass,email,u_type,sId) VALUES (?,?,?,?,?,?,?)";
//				
//				try {
//					pstt = con.prepareStatement(sqll);
//					
//					pstt.setString(1, u_id);
//					pstt.setString(2, s3);
//					pstt.setString(3, s1);
//					pstt.setString(4, s2);
//					pstt.setString(5, s4);
//					pstt.setString(6, "1");
//					pstt.setString(7, s);
//					
//					pstt.execute();
//					
//					JOptionPane.showMessageDialog(null, "New Account Created Successfully! ThankYou");
//					
//					
//					Login lg = new Login();
//					lg.setVisible(true);
//					
//					dispose();
//					
//				} catch (SQLException e2) {
//					JOptionPane.showMessageDialog(null, "School User Data not Inserted, Try Again!"+e2);
//					e2.printStackTrace();
//				}
				
				pst.close();
				rs.close();
				
			} catch (SQLException e1) {
				
				JOptionPane.showMessageDialog(null, "Session Data not Inserted, Try Again!"+e1);
				e1.printStackTrace();
			}finally {
				try {
					pst.close();
				}catch(Exception ef){
					
				}
			}
			
			

			
			
//			sql = "INSERT INTO users(name,phone,address,cgpa,id) VALUES (?,?,?,?,?)";
//			
//			
//			try {
//				pst = con.prepareStatement(sql);
//				
//				pst.setString(1, tf1.getText());
//				pst.setString(2, tf2.getText());
//				pst.setString(3, tf3.getText());
//				pst.setString(4, tf4.getText());
//				pst.setString(5, Integer.toString(count));
//				
//				pst.execute();
//				
//				JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
//				
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				JOptionPane.showMessageDialog(null, "Data not Inserted, Try Again!"+e1);
//				e1.printStackTrace();
//			}
			
			count++;
			
		}else if(e.getSource()==sclaYUB) {
			
			
			String s,s1;
			int s2,s3,s4, s5;
			
			s1 = sclaYeart.getText();
			s2 = sclsYeart.getYear();
			s3 = sclsMontht.getMonth();
			s4 = scleYeart.getYear();
			s5 = scleMontht.getMonth();

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
//			JOptionPane.showMessageDialog(null, " name "+s+" rand  "+mm+" uuid ");
			SimpleDateFormat da = new SimpleDateFormat("yyyyMMddhhmmss");
			String u_id = da.format(new Timestamp(System.currentTimeMillis()));
			
			
			sql = "UPDATE aYear set aYname = ?, sYear = ?, sMonth = ?, eYear = ?, eMonth = ?, aStatus = ? WHERE uId = ? AND sId = ?";
			
			try {
				pst = con.prepareStatement(sql);
				pst.setString(1, s1);
				pst.setString(2, Integer.toString(s2));
				pst.setString(3, Integer.toString(s3+1));
				pst.setString(4, Integer.toString(s4));
				pst.setString(5, Integer.toString(s5+1));
				pst.setString(6, "1");
				pst.setString(7, aYtmdl.getValueAt(aYtbl.getSelectedRow(), 0).toString());
				pst.setString(8, sId);
				
				pst.execute();
				
				JOptionPane.showMessageDialog(null, "Successfully "+s1+" Session updated! ThankYou");
				
				updateAYear();
				
				pst.close();
				rs.close();
				
			} catch (SQLException e1) {
				
				JOptionPane.showMessageDialog(null, "Session Data not updated, Try Again!"+e1);
				e1.printStackTrace();
			}finally {
				try {
					pst.close();
				}catch(Exception ef){
					
				}
			}
			
			
		}else if(e.getSource()==secAssB||e.getSource()==secStdt) {
			if(secStdt.getText()!="") {
				
				String s1;
				
				studentData sd = new studentData();
		
				student st;
				st = sd.getStudent(secStdt.getText());
				
				if(st!=null) {
					secStdL.setText(st.getstdId());
					secStdNt.setText(st.getstdName()+"("+st.getstdPhone()+")");
					
				}else {
					JOptionPane.showMessageDialog(null, "Student Not Found!");
				}
			
			}else {
				JOptionPane.showMessageDialog(null, "You did not Input Number Or Id No!");
			}
		}
		else if(e.getSource()==sclaYDB) {
			int i;
			i = aYtbl.getSelectedRow();
			
//			JOptionPane.showMessageDialog(null, "Session Data  "+i);
			
			if(i>=0) {
				
				sql = "DELETE FROM aYear WHERE uId = ? and sId = ?";
				
				try {
					pst = con.prepareStatement(sql);
					
					pst.setString(1, aYtmdl.getValueAt(aYtbl.getSelectedRow(), 0).toString());
					pst.setString(2, sId);
					pst.execute();
					
					
					JOptionPane.showMessageDialog(null, "Session Data Deleted!");
					updateAYear();
					
				}  catch (SQLException e1) {
					
					JOptionPane.showMessageDialog(null, "Session Data not updated, Try Again!"+e1);
					e1.printStackTrace();
				}finally {
					try {
						pst.close();
					}catch(Exception ef){
						
					}
				}
				
				
				aYtmdl.removeRow(i);
				
			}else {
				JOptionPane.showMessageDialog(null, "You did not select any Row!");
			}
		}
		else if(e.getSource()==aSMajorCom && aSMajorCom.getSelectedItem()!=null) {
			
			String s = aSMajorCom.getSelectedItem().toString();
			schoolDep sd = (schoolDep) aSMajorCom.getSelectedItem();
			int i = sd.getid();
			String dName = sd.getmName();
			if(dName!="--Select a Department--") {
				schoolDepData sdd = new schoolDepData();
				String cId = sdd.depId(i);
				if(cId!=null) {
					addStdsidt.setText(cId);
				}
			}

			
		}

		else if(e.getSource()==b3) {
//			updateAYear();
		}
		else if(e.getSource()==setting) {
			cl.show(pan2, "settp");
			updateSchool();
			
		}else if(e.getSource()==aYear) {
			cl.show(pan2, "aYearp");
			updateAYear();
			updateMajor();
			
			
		}else if(e.getSource()==dashMain) {
			cl.show(pan2, "dashBoard");
		}
		else if(e.getSource()==About) {
			cl.show(pan2, "aboutp");
//			updateAYear();
//			updateSchool();
			
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
			updateClass();
			selectSession(classYearCom);
		}else if(e.getSource()==sections) {
			cl.show(pan2, "secp");
			updateSection(asectmdl);
			selectSession(secAYearCom);
			selectClass(secAClassCom);
			selectSection(secASecCom);
			
		}else if(e.getSource()==addSec) {
			cl.show(pan2, "addSecp");
			selectClass(classSecCom);
			updateSection(Sectmdl);
		}else if(e.getSource()==courses) {
			cl.show(pan2, "coursep");
			selectSession(courseAYearCom);
			selectClass(courseAClassCom);
			selectSubject(courseASubCom);
			selectSection(courseASecCom);
			updateSubject(asubtmdl);
			
		}else if(e.getSource()==newCourse) {
			cl.show(pan2, "addCoursep");
			selectClass(classSubCom);
			updateSubject(subtmdl);
		}
		
		else if(e.getSource()==courseAYearCom && courseAYearCom.getSelectedItem()!=null) {
		String s = courseAYearCom.getSelectedItem().toString();
		Session sd = (Session) courseAYearCom.getSelectedItem();
		int i = sd.getId();
		String dName = sd.getaYname();
		
		selectClass(courseAClassCom,i);
	}else if(e.getSource()==courseAClassCom && courseAClassCom.getSelectedItem()!=null) {
		
		String s = courseAClassCom.getSelectedItem().toString();
		Class sd = (Class) courseAClassCom.getSelectedItem();
		int i = sd.getId();
		String dName = sd.getclsName();
		updateSubject(asubtmdl,i);
		selectSubject(courseASubCom,i);
	}else if(e.getSource()==courseASubCom && courseASubCom.getSelectedItem()!=null) {
		String s = courseASubCom.getSelectedItem().toString();
		Subject sd = (Subject) courseASubCom.getSelectedItem();
		int i = sd.getid();
		String dName = sd.getsubName();
		String clsId = sd.getclsId();
		
		selectSection(courseASecCom,clsId);
	}else if(e.getSource()==secAYearCom && secAYearCom.getSelectedItem()!=null) {
		String s = secAYearCom.getSelectedItem().toString();
		Session sd = (Session) secAYearCom.getSelectedItem();
		int i = sd.getId();
		String dName = sd.getaYname();
		
		selectClass(secAClassCom,i);
	}else if(e.getSource()==secAClassCom && secAClassCom.getSelectedItem()!=null) {
		
		String s = secAClassCom.getSelectedItem().toString();
		Class sd = (Class) secAClassCom.getSelectedItem();
		int i = sd.getId();
		String dName = sd.getclsName();
//		System.out.println(i+" name "+dName);
		if(i!=0) {
			updateSection(asectmdl,i+"");
			selectSection(secASecCom,i+"");
		}
	}else if(e.getSource()==tasecAYearCom && tasecAYearCom.getSelectedItem()!=null) {
		String s = tasecAYearCom.getSelectedItem().toString();
		Session sd = (Session) tasecAYearCom.getSelectedItem();
		int i = sd.getId();
		String dName = sd.getaYname();
		
		selectClass(tasecAClassCom,i);
	}else if(e.getSource()==tasecAClassCom && tasecAClassCom.getSelectedItem()!=null) {
		
		String s = tasecAClassCom.getSelectedItem().toString();
		Class sd = (Class) tasecAClassCom.getSelectedItem();
		int i = sd.getId();
		String dName = sd.getclsName();
//		System.out.println(i+" name "+dName);
		if(i!=0) {
			updateSection(taasectmdl,i+"");
//			selectSection(tasecASecCom,i+"");
		}
	}
	else if(e.getSource()==subAsB) {
		if(courseASubCom.getSelectedItem()!=null && courseASecCom.getSelectedItem()!=null) {
			
			int exit = JOptionPane.showConfirmDialog(null, "Do you want to assign this subject on that section?","Yes or NO",JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(exit == JOptionPane.YES_OPTION) {
			
				String s = courseASubCom.getSelectedItem().toString();
				Subject sd = (Subject) courseASubCom.getSelectedItem();
				int i = sd.getid();
				String dName = sd.getsubName();
				String clsId = sd.getclsId();
				
				SubjectData subData = new SubjectData();
				
				
				String se = courseASecCom.getSelectedItem().toString();
				Section sec = (Section) courseASecCom.getSelectedItem();
				int si = sec.getid();
				
				SectionData secData = new SectionData();
				
				subAOnSecData subAsec = new subAOnSecData();
				subAOnSec sOs =  subAsec.addSubAndSec(subData.getSubject(i,sId),secData.getSection(si,sId));
				
				int result = subAsec.addSubOnSec(sOs);
				
				if(result==1) {
					JOptionPane.showMessageDialog(null, dName+" is Assigned on "+sec.getsecName());
				}else {
					JOptionPane.showMessageDialog(null, "Try Again!");
				}

			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Sorry! you didn't select Subject or Section","Warning",JOptionPane.INFORMATION_MESSAGE);
		}
	}
		
	else if(e.getSource()==secAsB) {
		Section secc = (Section) secASecCom.getSelectedItem();
		int si = secc.getid();
		
		if(si!=0) {
			
				studentData sd = new studentData();
				student st = new student();
				int i = sd.checkStudent(secStdL.getText());
				Class c = new Class();
				ClassData cd = new ClassData();
				
				if(i==1) {
					st = sd.getStudentByStdId(secStdL.getText());
					secAssigned sec = new secAssigned();
					secAData secData = new secAData();
				
					sec.setstdId(secStdL.getText());
					sec.setsecAId(new ad().uId());
					sec.setaStatus(1);
					
					String se = secASecCom.getSelectedItem().toString();
					
					c = cd.getClassData(Integer.parseInt(secc.getclsId()));
					
					sec.setaYearId(c.getaYearId());
					sec.setsecId(si);
					sec.setclsId(Integer.parseInt(secc.getclsId()));
					sec.setsId(secc.getsId());
					sec.setaYear(c.getaYear());
					
					int exit = JOptionPane.showConfirmDialog(null, "Do you want to assign this subject on that section?","Yes or NO",JOptionPane.YES_NO_CANCEL_OPTION);
					
					if(exit == JOptionPane.YES_OPTION) {
						
						int ids = secData.addSecAData(sec);
						if(ids==1) {
							updateSection(asectmdl,c.getId()+"");
							JOptionPane.showMessageDialog(null, "Thank You! "+st.getstdName()+" is Assigned"+" On "+secc.getsecName(),"Success",JOptionPane.INFORMATION_MESSAGE);
		
						}else {
							JOptionPane.showMessageDialog(null, "Sorry! Section did't Assign, Try again later","Warning",JOptionPane.INFORMATION_MESSAGE);
		
						}
						
					}else {
						
					}
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Sorry! Student Not Found","Warning",JOptionPane.INFORMATION_MESSAGE);
		
				}
		
		
			
		}else {
			JOptionPane.showMessageDialog(null, "Sorry! you didn't select Section","Warning",JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}
		
		else if(e.getSource()==item) {
			cl.show(pan2, "addUserp");
			
			
		}else if(e.getSource()==item1) {
			cl.show(pan2, "addStdp");
			addSchoolCode();
			selectMajor();
			
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
			updateSection(taasectmdl);
			selectSession(tasecAYearCom);
			selectClass(tasecAClassCom);
//			selectSection(tasecASecCom);
			
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
		else if(e.getSource()==stdSearchB) {
			if(stdSearch.getText()!="") {
				
				String s1;
				
				studentData sd = new studentData();
		
				student st;
				st = sd.getStudent(stdSearch.getText());
				
				if(st!=null) {
					viewStudent vs = new viewStudent(st);
					
					vs.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Student Not Found!");
				}
			
			}else {
				JOptionPane.showMessageDialog(null, "You did not Input Number Or Id No!");
			}
		}
		else if(e.getSource()==sclaMB) {
			
			schoolDepData mData = new schoolDepData();
			
			try {
				
				schoolDep d = new schoolDep();
				
				d.setmName(sclaMajort.getText());
				d.setsId(sId);
				d.setmStatus(1);
				d.setstartId(sclsMajort.getText());
				d.setendId(scleMajort.getText());
				
				int i = mData.addDep(d);
				if(i==1) {
					updateMajor();
					JOptionPane.showMessageDialog(null, "Successfully "+d.getmName()+"'s Data updated! ThankYou");

					sclaMajort.setText("");
					sclsMajort.setText("");
					scleMajort.setText("");
					
				}else {
					JOptionPane.showMessageDialog(null, "OOPs Data not updated! Try Again!");
					
				}
			
			}catch (Exception ex) {
				
//				JOptionPane.showMessageDialog(null, "Session Data not Inserted, Try Again!"+ex);
				ex.printStackTrace();
			}
			
		}
		else if(e.getSource()==sclaMUB) {
			
		}
		else if(e.getSource()==sclaMDB) {
			
		}else if(e.getSource()==subAB) {
			SubjectData sData = new SubjectData();
			
			try {
				
				Subject c = new Subject();
				
				c.setsId(sId);
				c.setsubId(userId());
				c.setsubName(subNamet.getText());
				c.setsubCode(subCodet.getText());
				c.setsubFee(subFeet.getText());
				
				String s = classSubCom.getSelectedItem().toString();
				Class se = (Class) classSubCom.getSelectedItem();
				int id = se.getId();
				c.setclsId(id+"");
				String sName = se.getclsName();
				
				int i = sData.addSubject(c);
				if(i==1) {
					updateSubject(subtmdl);
					JOptionPane.showMessageDialog(null, "Successfully "+c.getsubName()+"'s Data added! ThankYou");
					subNamet.setText("");
					subCodet.setText("");
					subFeet.setText("");
					classSubCom.setSelectedIndex(0);
					
				}else {
					JOptionPane.showMessageDialog(null, "OOPs Data not added! Try Again!");
					
				}
			
			}catch (Exception ex) {
				
//				JOptionPane.showMessageDialog(null, "Session Data not Inserted, Try Again!"+ex);
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==subDB) {
			
		}
		else if(e.getSource()==classAB) {
			ClassData cData = new ClassData();
			
			try {
				
				Class c = new Class();
				
				c.setsId(sId);
				c.setclsId(userId());
				c.setclsName(classNamet.getText());
				c.setclsCode(classCodet.getText());
				c.setaYear(classYearCom.getSelectedItem().toString());
				
				String s = classYearCom.getSelectedItem().toString();
				Session se = (Session) classYearCom.getSelectedItem();
				int id = se.getId();
				c.setaYearId(id);
				String sName = se.getaYname();
				
				int i = cData.addClass(c);
				if(i==1) {
					updateClass();
					JOptionPane.showMessageDialog(null, "Successfully "+c.getclsName()+"'s Data added! ThankYou");
					classNamet.setText("");
					classCodet.setText("");
					classYearCom.setSelectedIndex(0);
					
				}else {
					JOptionPane.showMessageDialog(null, "OOPs Data not added! Try Again!");
					
				}
			
			}catch (Exception ex) {
				
//				JOptionPane.showMessageDialog(null, "Session Data not Inserted, Try Again!"+ex);
				ex.printStackTrace();
			}
		}
		else if(e.getSource()==classDB) {
			
		}else if(e.getSource()==SecAB) {
			SectionData sData = new SectionData();
			
			try {
				
				Section c = new Section();
				
				c.setsId(sId);
				c.setclsId(userId());
				c.setsecName(SecNamet.getText());
				c.setsecCode(SecCodet.getText());
				c.setsecFee(SecFeet.getText());
				
				String s = classSecCom.getSelectedItem().toString();
				Class se = (Class) classSecCom.getSelectedItem();
				int id = se.getId();
				c.setclsId(id+"");
				String sName = se.getclsName();
				
				int i = sData.addSection(c);
				if(i==1) {
					updateSection(Sectmdl);
					JOptionPane.showMessageDialog(null, "Successfully "+c.getsecName()+"'s Data added! ThankYou");
					SecNamet.setText("");
					SecCodet.setText("");
					SecFeet.setText("");
					classSecCom.setSelectedIndex(0);
					
				}else {
					JOptionPane.showMessageDialog(null, "OOPs Data not added! Try Again!");
					
				}
			
			}catch (Exception ex) {
				
//				JOptionPane.showMessageDialog(null, "Session Data not Inserted, Try Again!"+ex);
				ex.printStackTrace();
			}
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
		
//		if(e.getSource() == (JMenuItem)item1) {
//			JOptionPane.showMessageDialog(null, "Successfully  Data updated! ThankYou");
//		}
		
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
