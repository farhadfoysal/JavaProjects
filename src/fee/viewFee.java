package fee;

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
import java.time.format.DateTimeFormatter;
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
import javax.swing.ListSelectionModel;
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

import Main.Admin;
import Main.DBConnection;
import Main.Student;
import Main.Class.Class;
import Main.Class.ClassData;
import Main.Section.Section;
import Main.Section.SectionData;
import Main.Session.Session;
import Main.Subject.Subject;
import Main.Subject.SubjectData;
import Main.fcomf.HintTextField;
import Main.scl.School;
import Main.scl.schoolData;
import Main.scl.schoolDep;
import Main.scl.secAData;
import Main.scl.secAssigned;
import Main.scl.subAData;
import Main.scl.subAOnSec;
import Main.scl.subAOnSecData;
import Main.scl.subAssigned;
import Main.std.student;
import Main.std.studentData;
import Main.std.viewStudent;


public class viewFee extends JFrame implements ChangeListener, ActionListener, ItemListener, KeyListener, MouseListener, MouseMotionListener, WindowListener, FocusListener, WindowFocusListener, MouseWheelListener, WindowStateListener{
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
	
	private Subject s;
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
	private JComboBox courseASecCom;
	private JComboBox courseAStdCom;
	private JButton subAsB;
	private JButton subAssB;
	private HintTextField subStdt;
	private HintTextField subStdNt;
	private JTable asubtbl;
	private DefaultTableModel asubtmdl;
	private JScrollPane sp1;
	private String[] subcols = {"SID","Name","Fee Details","Fee","P~S","Session","Waiver","Status","SCP","ID"};
	private String[] Asubcols = { "SI", "SUBJECT-NAME", "SUB-CODE", "CLASS", "SECTION", "FEE", "ID" };
	private String[] feeTypecols = { "SI","Fee Type", "Fee", "Id" };	
	private String[] courseSeccols = { "SI","Course Name","C-Code", "TotalS", "Id" };
	private JTextField subStdL;
	private String[] stdRow = new String[15];
	private JButton subDsB;
	private Student st;
	private student std = new student();
	private String sId;
	private String faculty;
	private JTabbedPane tpf;
	private JTable aAsubtbl;
	private DefaultTableModel aAsubtmdl;
	private JScrollPane spA;
	private JComboBox feeSessionCom;
	private JComboBox feeSemCom;
	private JComboBox feedepSeCom;
	private JTabbedPane tp1;
	private JTable otherstbl;
	private DefaultTableModel othersmdl;
	private JScrollPane sp2;
	private JButton feeAoB;
	private JButton feeAodB;
	private JComboBox fsectionCom;
	private JTable coursetbl;
	private DefaultTableModel coursemdl;
	private JScrollPane sp3;
	private JButton feesecAB;
	private JComboBox ccourseCom;
	private JComboBox csectionCom;
	private JButton feeAcB;
	private JTable courseetbl;
	private DefaultTableModel courseemdl;
	private JScrollPane sp4;
	private JComboBox ccsectionCom;
	private JButton feeAccB;
	private String stdId;
	private Admin admin = new Admin();
	private int[] resu;

	public viewFee(){
		this.setDefaultCloseOperation(viewFee.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1130,720);
		this.setResizable(true);
		this.setTitle("Student Details");
		icon = new ImageIcon(getClass().getResource("..\\Main/img.png"));
		
		this.setIconImage(icon.getImage());
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
	}
	
	public viewFee(student std){
		this.std = std;
		this.sId = std.getsId();
		this.stdId = std.getstdId();
		this.setDefaultCloseOperation(viewFee.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1130,720);
		this.setResizable(true);
		this.setTitle("Student Details"+std.getstdName()+" ~ "+std.getstdId()+" ~ "+std.getstdPhone());
		icon = new ImageIcon(getClass().getResource("..\\Main/img.png"));
		
		this.setIconImage(icon.getImage());
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
		Admin ad = new Admin();
		ad.updateFee(asubtmdl,sId,stdId);
		ad.selectSession(feeSessionCom,sId);
		ad.selectMajor(feedepSeCom, sId);
		ad.selectClass(feeSemCom,sId);
		ad.updateCourse(aAsubtmdl,sId,stdId);
		updateSubject(courseemdl,sId);
	}
	

	public void updateStudent(DefaultTableModel mdl,int classId) {
		subAData sd = new subAData();
		ResultSet rem = sd.getStudentInfo(s.getsId(),classId);
		
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					
					Section se = new Section();
					se = new SectionData().getSection(rem.getInt(12),s.getsId());
					
					stdRow[0] = rem.getString(3);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(6);
					stdRow[4] = se.toString();
					stdRow[5] = rem.getString(12);
					stdRow[6] = rem.getString(8);
					
				
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
	

	public void updateStudent(DefaultTableModel mdl,int subId,int secId) {
		subAData sd = new subAData();
		ResultSet rem = sd.getStudentInfo(s.getsId(),subId,secId);
		
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					
					Section se = new Section();
					se = new SectionData().getSection(rem.getInt(12),s.getsId());
					
					stdRow[0] = rem.getString(3);
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(6);
					stdRow[4] = se.toString();
					stdRow[5] = rem.getString(12);
					stdRow[6] = rem.getString(8);
				
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
	
	public void updateCourseByCls(DefaultTableModel mdl,String stdId,int clsId,String sId) {
		subAData sd = new subAData();
		ResultSet rem = sd.getSubjectInfo(sId,stdId,clsId);
		
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					
					Subject su = new Subject();
					SubjectData sud = new SubjectData();
					su = sud.getSubject(rem.getInt(4), sId);
					Class c = new Class();
					ClassData cd = new ClassData();
					c = cd.getClassData(rem.getInt(8));
					Section se = new Section();
					SectionData sed = new SectionData();
					se = sed.getSection(rem.getInt(5), sId);
					stdRow[1] = su.getsubName();
					stdRow[2] = su.getsubCode();
					stdRow[3] = c.getclsName();
					stdRow[4] = se.getsecName();
					stdRow[5] = rem.getString(6);
					stdRow[6] = rem.getString(1);
					stdRow[7] = rem.getString(3);
				
					mdl.addRow(stdRow);
					i++;
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
			System.out.println("Fee Type not found");
		}
		
	}
	
	public void updateCourse(DefaultTableModel mdl, String sId, String stdId) {
		subAData sd = new subAData();
		ResultSet rem = sd.getSubjectInfoByUser(sId,stdId);
		
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					
					Subject su = new Subject();
					SubjectData sud = new SubjectData();
					su = sud.getSubject(rem.getInt(4), sId);
					Class c = new Class();
					ClassData cd = new ClassData();
					c = cd.getClassData(rem.getInt(8));
					Section se = new Section();
					SectionData sed = new SectionData();
					se = sed.getSection(rem.getInt(5), sId);
					stdRow[1] = su.getsubName();
					stdRow[2] = su.getsubCode();
					stdRow[3] = c.getclsName();
					stdRow[4] = se.getsecName();
					stdRow[5] = rem.getString(6);
					stdRow[6] = rem.getString(1);
					stdRow[7] = rem.getString(3);
				
					mdl.addRow(stdRow);
					i++;
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
			System.out.println("Fee Type not found");
		}
		
	}
	
	public void updateCourseByCond(DefaultTableModel mdl,String sId,String cond) {
		subAData sd = new subAData();
		ResultSet rem = sd.getSubjectInfo(sId,cond);
		
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					
					Subject su = new Subject();
					SubjectData sud = new SubjectData();
					su = sud.getSubject(rem.getInt(4), sId);
					Class c = new Class();
					ClassData cd = new ClassData();
					c = cd.getClassData(rem.getInt(8));
					Section se = new Section();
					SectionData sed = new SectionData();
					se = sed.getSection(rem.getInt(5), sId);
					stdRow[1] = su.getsubName();
					stdRow[2] = su.getsubCode();
					stdRow[3] = c.getclsName();
					stdRow[4] = se.getsecName();
					stdRow[5] = rem.getString(6);
					stdRow[6] = rem.getString(1);
					stdRow[7] = rem.getString(3);
				
					mdl.addRow(stdRow);
					i++;
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
			System.out.println("Fee Type not found");
		}
		
	}

	public void updateFeeType(DefaultTableModel mdl,String sId) {
		FeeTypeData sd = new FeeTypeData();
		ResultSet rem = sd.getFeeTypeDataInfo(sId);
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					stdRow[1] = rem.getString(2);
					stdRow[2] = rem.getString(4);
					stdRow[3] = rem.getString(1);
					stdRow[4] = rem.getString(4);
					stdRow[5] = rem.getString(1);
					
				
					mdl.addRow(stdRow);
					i++;
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
			System.out.println("Fee Type not found");
		}
		
	}
	
	public void updateFeeType(DefaultTableModel mdl,String sId,int sessionId) {
		FeeTypeData sd = new FeeTypeData();
		ResultSet rem = sd.getFeeTypeDataInfo(sId,sessionId);
		
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					stdRow[1] = rem.getString(2);
					stdRow[2] = rem.getString(4);
					stdRow[3] = rem.getString(1);
					stdRow[4] = rem.getString(4);
					stdRow[5] = rem.getString(1);
					
				
					mdl.addRow(stdRow);
					i++;
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
			System.out.println("Fee Type not found");
		}
		
		
	}
	
	public void updateFeeTypeByDep(DefaultTableModel mdl,String sId,int depId) {
		FeeTypeData sd = new FeeTypeData();
		ResultSet rem = sd.getFeeTypeDataInfoByDep(sId,depId);
		
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					stdRow[1] = rem.getString(2);
					stdRow[2] = rem.getString(4);
					stdRow[3] = rem.getString(1);
					stdRow[4] = rem.getString(4);
					stdRow[5] = rem.getString(1);
					
				
					mdl.addRow(stdRow);
					i++;
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
			System.out.println("Fee Type not found");
		}
		
		
	}
	
	
	public void updateSubject(DefaultTableModel mdl,String sId) {
		SubjectData sd = new SubjectData();
		ResultSet rem = sd.getSubjectInfo(sId);
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(6);
					stdRow[4] = rem.getString(1);
					stdRow[5] = rem.getString(8);
					
					mdl.addRow(stdRow);
					i++;
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
	
	public void updateSubject(DefaultTableModel mdl,String sId,int classId) {
		SubjectData sd = new SubjectData();
		ResultSet rem = sd.getSubjectInfo(sId,classId);
		
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					stdRow[1] = rem.getString(4);
					stdRow[2] = rem.getString(5);
					stdRow[3] = rem.getString(6);
					stdRow[4] = rem.getString(1);
					stdRow[5] = rem.getString(8);
					
					mdl.addRow(stdRow);
					i++;
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
	
	public void updateSubjectSec(DefaultTableModel mdl,String sId) {
		subAOnSecData sd = new subAOnSecData();
		ResultSet rem = sd.getSubjectOnSec(sId);
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					
					Subject su = new Subject();
					SubjectData sud = new SubjectData();
					su = sud.getSubject(rem.getInt(4), sId);
					
					stdRow[1] = su.getsubName();
					stdRow[2] = su.getsubCode();
					stdRow[3] = rem.getString(6);
					stdRow[4] = rem.getString(1);
					stdRow[5] = rem.getString(5);
					
					mdl.addRow(stdRow);
					i++;
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
	
	public void updateSubjectSec(DefaultTableModel mdl,String sId,int secId) {
		subAOnSecData sd = new subAOnSecData();
		ResultSet rem = sd.getSubjectOnSec(sId,secId);
		
		int i = 1;
		if(rem!=null) {
			
			mdl.setRowCount(0);
			
			try {
				while(rem.next()) {
					stdRow[0] = i+"";
					
					Subject su = new Subject();
					SubjectData sud = new SubjectData();
					su = sud.getSubject(rem.getInt(4), sId);
					
					stdRow[1] = su.getsubName();
					stdRow[2] = su.getsubCode();
					stdRow[3] = rem.getString(6);
					stdRow[4] = rem.getString(1);
					stdRow[5] = rem.getString(5);
					
					mdl.addRow(stdRow);
					i++;
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
	
	public String date() {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = currentDate.format(formatter);
		return date;
	}
	
	public String generateAdmissionDate()
	{	
		String gdate = TimeUtil.getCurrentTime();
		return gdate;
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
//		JLabel lblDisplayingStudentDetails = new JLabel("Sub name");
		JLabel lblDisplayingStudentDetails = new JLabel(""+std.getstdName()+"("+std.getstdId()+")");
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
		
		 marksheetbutton = new JButton("Marksheet");
		marksheetbutton.setBorder(new EmptyBorder(0, 0, 0, 0));
		marksheetbutton.setFocusable(false);

		
		marksheetbutton.setForeground(new Color(0, 139, 139));
		marksheetbutton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		marksheetbutton.setBackground(new Color(255, 255, 255));
		marksheetbutton.setBounds(782, 85, 140, 35);
		marksheetbutton.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel.add(marksheetbutton);
		
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
		
		lblLastLogin = new JLabel("Last Login ");
		if(1==1)
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
		
		JLabel lblStudentDetails = new JLabel("Subject Details");
		lblStudentDetails.setHorizontalAlignment(SwingConstants.LEFT);
		lblStudentDetails.setForeground(Color.WHITE);
		lblStudentDetails.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblStudentDetails.setBounds(10, 30, 415, 44);
		panel.add(lblStudentDetails);
		
		
		pan1 = new JPanel();
		crPanel(pan1, 10, 135, 730, 540, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		c.add(pan1);
		

	    tpf = new JTabbedPane(4);
	    tpf.setTabPlacement(1);
	    tpf.setBounds(2, 2, 730, 530);
	    pan1.add(tpf);
	    
	    JPanel othersFeef = new JPanel();
	    crPanel(othersFeef, 5, 0, 725, 525, Color.blue, brdr);
	    
	    JPanel secFeef = new JPanel();
	    crPanel(secFeef, 5, 0, 360, 725, Color.blue, brdr);
	    
	    JPanel courseFeef = new JPanel();
	    crPanel(courseFeef, 5, 0, 360, 725, Color.blue, brdr);
	    JPanel courseFeeef = new JPanel();
	    crPanel(courseFeeef, 5, 0, 360, 725, Color.blue, brdr);
	    
	    tpf.addTab("~Fee Details~", othersFeef);
	    tpf.addTab("~COURSE DETAILS~", secFeef);
	    tpf.addTab("~USERONE", courseFeef);
	    tpf.addTab("~USERTWO", courseFeeef);
		
		
		asubtbl = new JTable();
		asubtbl.setEnabled(true);
		asubtbl.setSelectionBackground(Color.pink);
		asubtbl.setFont(f);
		asubtbl.setBackground(Color.white);
		asubtbl.setRowHeight(25);
		
		asubtmdl = new DefaultTableModel();
		asubtmdl.setColumnIdentifiers(subcols);
		asubtbl.setModel(asubtmdl);
		
		sp1 = new JScrollPane(asubtbl);
		sp1.setBounds(5,5,720,530);
		othersFeef.add(sp1);
		
		asubtbl.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				
				int i;
				i = asubtbl.getSelectedRow();
				
				if(i>=0) {
					
					String s1, s2, s3, s4,s5;
					int s;
					s5 = asubtmdl.getValueAt(i, 0).toString();
					s1 = asubtmdl.getValueAt(i, 1).toString();
					s2 = asubtmdl.getValueAt(i, 2).toString();
					s3 = asubtmdl.getValueAt(i, 3).toString();
					s4 = asubtmdl.getValueAt(i, 4).toString();
					
//					subStdL.setText(s5);
//					subStdNt.setText(s1);
					
				}else {
					JOptionPane.showMessageDialog(null, "You did not select any Row!");
				}
				
			}
			
		});
		
	
		aAsubtbl = new JTable();
		aAsubtbl.setEnabled(true);
		aAsubtbl.setSelectionBackground(Color.pink);
		aAsubtbl.setFont(f);
		aAsubtbl.setBackground(Color.white);
		aAsubtbl.setRowHeight(25);
	    
	    aAsubtmdl = new DefaultTableModel();
	    aAsubtmdl.setColumnIdentifiers(Asubcols);
	    aAsubtbl.setModel(aAsubtmdl);
	    
	    spA = new JScrollPane(aAsubtbl);
	    spA.setBounds(5, 5, 720, 530);
	    secFeef.add(spA);
		
		
	    String[] feeSessionC = { "--Select a Session/Year--" };
	    
	    feeSessionCom = new JComboBox(feeSessionC);
	    crCom(feeSessionCom, panel, 130, 90, 200, 30, Color.DARK_GRAY, new Color(255, 255, 255), "Select Session");
	    
	    String[] feeSemC = { "--Select Class/Semester--" };
	    
	    feeSemCom = new JComboBox(feeSemC);
	    crCom(feeSemCom, panel, 335, 90, 200, 30, Color.DARK_GRAY, new Color(255, 255, 255), "Select Session");
	    
	    String[] feedepSeC = { "--Select a Department/Major--" };
	    
	    feedepSeCom = new JComboBox(feedepSeC);
	    crCom(feedepSeCom, panel, 540, 90, 200, 30, Color.DARK_GRAY, new Color(255, 255, 255), "Select Student Major");
	    
	    pan2 = new JPanel();
	    crPanel(pan2, 745, 135, 360, 530, Color.LIGHT_GRAY, new LineBorder(new Color(192, 192, 192)));
	    c.add(pan2);
		
	    tp1 = new JTabbedPane(4);
	    tp1.setTabPlacement(1);
	    tp1.setBounds(2, 2, 360, 525);
	    pan2.add(tp1);
	    
	    JPanel othersFee = new JPanel();
	    crPanel(othersFee, 5, 0, 360, 525, Color.blue, brdr);
	    
	    JPanel secFee = new JPanel();
	    crPanel(secFee, 5, 0, 360, 525, Color.blue, brdr);
	    
	    JPanel courseFee = new JPanel();
	    crPanel(courseFee, 5, 0, 360, 525, Color.blue, brdr);
	    JPanel courseFeee = new JPanel();
	    crPanel(courseFeee, 5, 0, 360, 525, Color.blue, brdr);
	    
	    tp1.addTab("~Fee~", othersFee);
	    tp1.addTab("~SECTION~", secFee);
	    tp1.addTab("~COURSE~T1S", courseFee);
	    tp1.addTab("~COURSE~T2M", courseFeee);
	    
	    otherstbl = new JTable();
	    otherstbl.setEnabled(true);
	    otherstbl.setSelectionBackground(Color.pink);
	    otherstbl.setFont(f);
	    otherstbl.setBackground(Color.white);
	    otherstbl.setRowHeight(25);
	    
	    othersmdl = new DefaultTableModel();
	    othersmdl.setColumnIdentifiers(feeTypecols);
	    otherstbl.setModel(othersmdl);
	    
	    sp2 = new JScrollPane(otherstbl);
	    sp2.setBounds(2, 52, 350, 350);
	    othersFee.add(sp2);
	    ListSelectionModel selectotherstbl = otherstbl.getSelectionModel();
	    selectotherstbl.setSelectionMode(2);
	    feeAoB = new JButton("+Add Fee");
	    crButton(feeAoB, othersFee, 95, 415, 150, 35, Color.BLUE, Color.GREEN, f2, "Waiver Add", null, false, false, true);
	    feeAodB = new JButton("+Delete Fee&Course");
	    crButton(feeAodB, othersFee, 95, 455, 150, 35, Color.BLUE, Color.RED, f2, "Waiver Add", null, false, false, true);
	    

	    String[] fsectionC = { "--Select a Section--" };
	    
	    fsectionCom = new JComboBox(fsectionC);
	    crCom(fsectionCom, secFee, 27, 52, 300, 30, Color.DARK_GRAY, new Color(255, 255, 255), "Select Student Major");
	    
	    coursetbl = new JTable();
	    coursetbl.setEnabled(true);
	    coursetbl.setSelectionBackground(Color.pink);
	    coursetbl.setFont(f);
	    coursetbl.setBackground(Color.white);
	    coursetbl.setRowHeight(25);
	    
	    coursemdl = new DefaultTableModel();
	    coursemdl.setColumnIdentifiers(courseSeccols);
	    coursetbl.setModel(coursemdl);
	    
	    sp3 = new JScrollPane(coursetbl);
	    sp3.setBounds(2, 87, 350, 350);
	    secFee.add(sp3);
	    ListSelectionModel selectcoursetbl = coursetbl.getSelectionModel();
	    selectcoursetbl.setSelectionMode(2);
	    feesecAB = new JButton("+Add Course");
	    crButton(feesecAB, secFee, 95, 455, 150, 35, Color.BLUE, Color.GREEN, f2, "Waiver Add", null, false, false, true);
	    
	    String[] ccourseC = { "--Select a Subject/Course--" };
	    
	    ccourseCom = new JComboBox(ccourseC);
	    crCom(ccourseCom, courseFee, 27, 52, 300, 30, Color.DARK_GRAY, new Color(255, 255, 255), "Select Student Major");
	    String[] csectionC = { "--Select a Section--" };
	    
	    csectionCom = new JComboBox(csectionC);
	    crCom(csectionCom, courseFee, 27, 90, 300, 30, Color.DARK_GRAY, new Color(255, 255, 255), "Select Student Major");
	    feeAcB = new JButton("+Add Course");
	    crButton(feeAcB, courseFee, 95, 455, 150, 35, Color.BLUE, Color.GREEN, f2, "Waiver Add", null, false, false, true);
	    
	    courseetbl = new JTable();
	    courseetbl.setEnabled(true);
	    courseetbl.setSelectionBackground(Color.pink);
	    courseetbl.setFont(f);
	    courseetbl.setBackground(Color.white);
	    courseetbl.setRowHeight(25);
	    
	    courseemdl = new DefaultTableModel();
	    courseemdl.setColumnIdentifiers(courseSeccols);
	    courseetbl.setModel(courseemdl);
	    
	    sp4 = new JScrollPane(courseetbl);
	    sp4.setBounds(2, 52, 350, 350);
	    courseFeee.add(sp4);
	    ListSelectionModel selectcourseetbl = coursetbl.getSelectionModel();
	    selectcourseetbl.setSelectionMode(2);
	    
	    String[] ccsectionC = { "--Select a Section--" };
	    
	    ccsectionCom = new JComboBox(ccsectionC);
	    crCom(ccsectionCom, courseFeee, 27, 415, 300, 30, Color.DARK_GRAY, new Color(255, 255, 255), "Select Section");
	    feeAccB = new JButton("+Add Course");
	    crButton(feeAccB, courseFeee, 95, 455, 150, 35, Color.BLUE, Color.GREEN, f2, "Waiver Add", null, false, false, true);
		
		
		
//		subStdt = new HintTextField("Student Id Or Phone Number ");
//		crHText(subStdt,pan2,10,5,340,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Code",true,40);		
//		
//		
//		subAssB = new JButton("...Stduent...");
//		crButton(subAssB,pan2,20,40,300,30,Color.BLUE,Color.CYAN,f2,"Assign subject",null,false,false,true);
//		
//		
//		String[] courseAasC = {"--Select a Section--"}; 
//		courseASecCom = new JComboBox<String>(courseAasC);
//		crCom(courseASecCom,pan2,10,80,340,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Section");
//		
//		String[] courseAStdC = {"--Select a Student--"}; 
//		courseAStdCom = new JComboBox<String>(courseAStdC);
//		crCom(courseAStdCom,pan2,10,115,340,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student");
//		
//		subStdL = new JTextField("SID");
//		crText(subStdL,pan2,10,150,340,30,Color.BLUE,Color.LIGHT_GRAY,SwingConstants.CENTER,new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"SID");
//		
//		
//		subStdNt = new HintTextField("STUDENT NAME");
//		crHText(subStdNt,pan2,10,185,340,30,Color.BLACK,Color.LIGHT_GRAY,HintTextField.CENTER,f3,null,"Student Details",false,40);		
//		
//		subDsB = new JButton("...Drop...");
//		crButton(subDsB,pan2,1,240,80,30,Color.BLUE,Color.red,f2,"Drop Student",null,false,false,true);
//		
//		
//		subAsB = new JButton("...Assing Stduent...");
//		crButton(subAsB,pan2,1,280,358,30,Color.BLUE,Color.GREEN,f2,"Assign Student",null,false,false,true);
		
		
		
//		pan3 = new JPanel();
//		crPanel(pan3,10,460,1095,225, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
//		c.add(pan3);
//	
//		pan4 = new JPanel();
//		crPanel(pan4,0,0,360,220, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
//		pan3.add(pan4);
//		
//	
//		pan5 = new JPanel();
//		crPanel(pan5,365,0,360,220, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
//		pan3.add(pan5);
//		
//		pan6 = new JPanel();
//		crPanel(pan6,730,0,365,220, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
//		pan3.add(pan6);
				
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
//		com.setEditable(true);
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
		viewFee frm = new viewFee();
		frm.setVisible(true);

	}

	public void selectSection(JComboBox com) {
		SectionData cd = new SectionData();
		ResultSet rsm = cd.getSectionInfo(s.getsId());
		
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
	
	public void selectSection(JComboBox com,int subId) {
		SectionData cd = new SectionData();
		ResultSet rsm = cd.getSectionInfo(s.getsId(),subId);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==subAssB||e.getSource()==subStdt) {
			if(subStdt.getText()!="") {
				
				String s1;
				
				studentData sd = new studentData();
		
				student st;
				st = sd.getStudent(subStdt.getText());
				
				if(st!=null) {
					subStdL.setText(st.getstdId());
					subStdNt.setText(st.getstdName()+"("+st.getstdPhone()+")");
					
				}else {
					JOptionPane.showMessageDialog(null, "Student Not Found!");
				}
			
			}else {
				JOptionPane.showMessageDialog(null, "You did not Input Number Or Id No!");
			}
		}else if(e.getSource()==subAsB) {
			
			studentData sd = new studentData();
			
			int i = sd.checkStudent(subStdL.getText());
			
//			System.out.println(""+i+" "+subStdL.getText());
			
			if(i==1) {
				subAssigned sub = new subAssigned();
				subAData subData = new subAData();
				
				sub.setstdId(subStdL.getText());
				sub.setsubAId(new Admin().uId());
				sub.setaStatus(1);
				sub.setsubId(s.getid());
				sub.setsubFee(s.getsubFee());
				sub.setsId(s.getsId());
				
				sub.setclsId(Integer.parseInt(s.getclsId()));
				
				String se = courseASecCom.getSelectedItem().toString();
				Section sec = (Section) courseASecCom.getSelectedItem();
				int si = sec.getid();
				sub.setsecId(si);
				
				int exit = JOptionPane.showConfirmDialog(null, "Do you want to assign this subject on that section?","Yes or NO",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(exit == JOptionPane.YES_OPTION) {
					
					int ids = subData.addSubjectStd(sub);
					if(ids==1) {
						updateStudent(asubtmdl,s.getid());
						JOptionPane.showMessageDialog(null, "Thank You! Your Subject is Assigned","Success",JOptionPane.INFORMATION_MESSAGE);

					}else {
						JOptionPane.showMessageDialog(null, "Sorry! you didn't select Subject or Section","Warning",JOptionPane.INFORMATION_MESSAGE);

					}
					
				}else {
					
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Section or Student","Warning",JOptionPane.INFORMATION_MESSAGE);

			}

			
			
		}else if(e.getSource()==courseASecCom && courseASecCom.getSelectedItem()!=null) {
			
			String sec = courseASecCom.getSelectedItem().toString();
			Section sd = (Section) courseASecCom.getSelectedItem();
			int i = sd.getid();
			String dName = sd.getsecName();
			if(i!=0) {
				updateStudent(asubtmdl,s.getid(),i);
//				selectStudent(courseAStdCom,i);
			}
			updateStudent(asubtmdl,s.getid(),i);
//			selectStudent(courseAStdCom,i);
		}else if(e.getSource()==feeSessionCom && feeSessionCom.getSelectedItem()!=null) {
			String s = feeSessionCom.getSelectedItem().toString();
			Session sd = (Session) feeSessionCom.getSelectedItem();
			int i = sd.getId();
			String dName = sd.getaYname();
//			System.out.println(i+" name "+dName);
			if(i!=0) {
				Admin ad = new Admin();
				ad.selectClass(feeSemCom,sId,i);
				ad.updateFee(asubtmdl,sId,stdId,i);
				ad.updateCourse(aAsubtmdl,sId,stdId);
				updateFeeType(othersmdl,sId,i);
			}
			
		}else if(e.getSource()==feeSemCom && feeSemCom.getSelectedItem()!=null) {
			
			String s = feeSemCom.getSelectedItem().toString();
			Class sd = (Class) feeSemCom.getSelectedItem();
			int i = sd.getId();
			String dName = sd.getclsName();
//			System.out.println(i+" name "+dName);
			if(i!=0) {
				Admin ad = new Admin();
//				updateSection(taasectmdl,i+"");
				ad.selectSection(fsectionCom,sId,i+"");
				ad.selectSection(csectionCom,sId,i+"");
				ad.selectSection(ccsectionCom,sId,i+"");
				ad.selectSubject(ccourseCom, sId, i);
				ad.updateFeeByCls(asubtmdl,sId,stdId,i);
//				ad.updateCourse(aAsubtmdl,sId,stdId);
				ad.updateCourseByCls(aAsubtmdl,stdId,i,sId);
				updateSubject(courseemdl,sId,i);
			}
		}else if(e.getSource()==fsectionCom && fsectionCom.getSelectedItem()!=null) {
			String s = fsectionCom.getSelectedItem().toString();
			Section sd = (Section) fsectionCom.getSelectedItem();
			int i = sd.getid();
			String dName = sd.getsecName();
//			System.out.println(i+" name "+dName);
			if(i!=0) {
				updateSubjectSec(coursemdl,sId,i);
			}
		}else if(e.getSource()==csectionCom && csectionCom.getSelectedItem()!=null) {
			String s = csectionCom.getSelectedItem().toString();
			Section sd = (Section) csectionCom.getSelectedItem();
			int i = sd.getid();
			String dName = sd.getsecName();
			if(ccourseCom.getSelectedItem()!=null) {
//				Subject sud = (Subject) ccourseCom.getSelectedItem();
//				int is = sud.getid();
////				System.out.println(i+" name "+dName);
//				if(i!=0) {
//					if(is!=0) {
//						
//					}
////					updateSubjectSec(coursemdl,sId,i);
//				}
			}

		}else if(e.getSource()==ccourseCom && ccourseCom.getSelectedItem()!=null) {
			String s = ccourseCom.getSelectedItem().toString();
			Subject sd = (Subject) ccourseCom.getSelectedItem();
			int i = sd.getid();
			String dName = sd.getsubName();
			Section sed = (Section) csectionCom.getSelectedItem();
			int is = sed.getid();
//			System.out.println(i+" name "+dName);
			if(i!=0) {
				if(is!=0) {
					
				}
//				updateSubjectSec(coursemdl,sId,i);
			}
		}else if(e.getSource()==ccsectionCom && ccsectionCom.getSelectedItem()!=null) {
			String s = ccsectionCom.getSelectedItem().toString();
			Section sd = (Section) ccsectionCom.getSelectedItem();
			int i = sd.getid();
			String dName = sd.getsecName();
//			System.out.println(i+" name "+dName);
			if(i!=0) {
//				updateFeeType(fsubtmdl,i);
			}
		}else if(e.getSource()==feedepSeCom && feedepSeCom.getSelectedItem()!=null) {
			String s = feedepSeCom.getSelectedItem().toString();
			schoolDep sd = (schoolDep) feedepSeCom.getSelectedItem();
			int i = sd.getid();
			String dName = sd.getmName();
			
			if(i!=0) {
				updateFeeTypeByDep(othersmdl,sId,i);
			}

		}else if(e.getSource()==feeAccB) {
			if(feeSessionCom.getSelectedItem()!=null && feeSessionCom.getSelectedItem()!=null) {
				
				if(feeSemCom.getSelectedItem()!=null && feeSemCom.getSelectedItem()!=null) {
					
					if(ccsectionCom.getSelectedItem()!=null && ccsectionCom.getSelectedItem()!=null) {
						
						int exit = JOptionPane.showConfirmDialog(null, "Do you want to assign these Subjects?","Yes or NO",JOptionPane.YES_NO_CANCEL_OPTION);
						
						if(exit == JOptionPane.YES_OPTION) {
						
							String s = feeSessionCom.getSelectedItem().toString();
							Session sd = (Session) feeSessionCom.getSelectedItem();
							int i = sd.getId();
							
							String sem = feeSemCom.getSelectedItem().toString();
							Class semd = (Class) feeSemCom.getSelectedItem();
							int isem = semd.getId();
							
							String sec = ccsectionCom.getSelectedItem().toString();
							Section secd = (Section) ccsectionCom.getSelectedItem();
							int isec = secd.getid();
							
							if(isem!=0) {
								if(isec!=0) {
									feeData feeData = new feeData();
									FeeTypeData feetData = new FeeTypeData();
									
									schoolDep sde = (schoolDep) feedepSeCom.getSelectedItem();
									int ide = sde.getid();
									int rI=0;

									secAssigned secA = new secAssigned();
									secAData secAData = new secAData();
									subAData subAData = new subAData();
									subAOnSecData subAOData = new subAOnSecData();
									SubjectData subData = new SubjectData();
									
									int cSecA = secAData.checkSecAssigned(isem,isec,stdId,sId);
									if(cSecA==0) {
										secA.setaYear(sd.getaYname());
										secA.setclsId(isem);
										secA.setsecId(isec);
										secA.setstdId(stdId);
										secA.setsId(sId);
										secA.setsecfeeTk(secd.getsecFee());
										secA.setaYearId(i);
										secAData.addSecAData(secA);
									}
									int[] selRows = courseetbl.getSelectedRows();
									for(int row : selRows) {
										fee fe = new fee();
										Subject ft = new Subject();
										subAOnSec subAO = new subAOnSec();
										subAssigned subA = new subAssigned();
										String s1, s2, s3, s4,s5;
										int s0,hi,csOns,csA, csubA;
//										s5 = courseemdl.getValueAt(row, 0).toString();
//										s1 = courseemdl.getValueAt(row, 1).toString();
//										s2 = courseemdl.getValueAt(row, 2).toString();
//										s3 = courseemdl.getValueAt(row, 3).toString();
										s4 = courseemdl.getValueAt(row, 4).toString();
										s0 = Integer.parseInt(s4);
										ft = subData.getSubject(s0, sId);
										
										csOns = subAOData.checkSubOnSec(s0,isec);
										if(csOns==0) {
											subAO.setsId(sId);
											subAO.setsubId(s0);
											subAO.setsubAId(new Admin().uId());
											subAO.setsecId(isec);
											subAO.setsubFee(ft.getsubFee());
											subAO.setsecFee(secd.getsecFee());
											subAOData.addSubOnSec(subAO);
										}
										csA = subAData.checkSubAssigned(s0,isec,stdId,sId);
										if(csOns==0) {
											System.out.println("hi"+csOns);
										}
										subA.setsId(sId);
										subA.setsubId(s0);
										subA.setsubAId(new Admin().uId());
										subA.setsecId(isec);
										subA.setsubFee(ft.getsubFee());
										subA.setclsId(isem);
										subA.setstdId(stdId);
										csubA = subAData.addSubjectStd(subA);
										if(csubA!=0) {
											fe.setStdId(stdId);
											fe.setSId(sId);
											
											fe.setDate(date());
											fe.setTime(generateAdmissionDate());
											fe.setFeeDetails(ft.getsubCode()+" ("+ft.getsubName()+")");
											if(i!=0) {
												fe.setSessionId(i);
											}else {
												JOptionPane.showMessageDialog(null, "Please Select a Session!");
												//Message
											}
											if(ide!=0) {
												fe.setDepId(ide);
											}else {
												JOptionPane.showMessageDialog(null, "Please Select a Department!");
												//Message
											}
											if(isem!=0) {
												fe.setClsId(isem);
											}else {
												fe.setClsId(Integer.parseInt(ft.getclsId()));
												//Message
											}
											if(isec!=0) {
												fe.setSecId(isec);
											}else {
												JOptionPane.showMessageDialog(null, "Please Select a Section!");
												//Message
											}
											
											fe.setFeeId(new Admin().userId());
											fe.setFeeType(s0);
											fe.setSubId(s0);
											fe.setFee(ft.getsubFee());
											hi = feeData.addFee(fe);
											if(hi!=0) {
												courseemdl.setValueAt("Advised!",row,1);
											}
//											System.out.println("row--"+row);
											rI++;
											new Admin().updateFee(asubtmdl,sId,stdId);
										}
										
										
									}

								}else {
									JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Section","Warning",JOptionPane.INFORMATION_MESSAGE);
								}
							}else {
								JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Class/Semester","Warning",JOptionPane.INFORMATION_MESSAGE);
							}
	

						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Section","Warning",JOptionPane.INFORMATION_MESSAGE);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Semester/Class","Warning",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Session","Warning",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(e.getSource()==feeAcB) {
			if(feeSessionCom.getSelectedItem()!=null && feeSessionCom.getSelectedItem()!=null) {
				
				if(feeSemCom.getSelectedItem()!=null && feeSemCom.getSelectedItem()!=null) {
					
					if(csectionCom.getSelectedItem()!=null && csectionCom.getSelectedItem()!=null) {
						
						int exit = JOptionPane.showConfirmDialog(null, "Do you want to assign these Subjects?","Yes or NO",JOptionPane.YES_NO_CANCEL_OPTION);
						
						if(exit == JOptionPane.YES_OPTION) {
						
							String s = feeSessionCom.getSelectedItem().toString();
							Session sd = (Session) feeSessionCom.getSelectedItem();
							int i = sd.getId();
							
							String sem = feeSemCom.getSelectedItem().toString();
							Class semd = (Class) feeSemCom.getSelectedItem();
							int isem = semd.getId();
							
							String sub = ccourseCom.getSelectedItem().toString();
							Subject subd = (Subject) ccourseCom.getSelectedItem();
							int isub = subd.getid();
							
							String sec = csectionCom.getSelectedItem().toString();
							Section secd = (Section) csectionCom.getSelectedItem();
							int isec = secd.getid();
							
							if(isem!=0) {
								if(isec!=0) {
									if(isub!=0) {
										feeData feeData = new feeData();
										FeeTypeData feetData = new FeeTypeData();
										
										schoolDep sde = (schoolDep) feedepSeCom.getSelectedItem();
										int ide = sde.getid();
										int rI=0;

										secAssigned secA = new secAssigned();
										secAData secAData = new secAData();
										subAData subAData = new subAData();
										subAOnSecData subAOData = new subAOnSecData();
										SubjectData subData = new SubjectData();
										
										int cSecA = secAData.checkSecAssigned(isem,isec,stdId,sId);
										if(cSecA==0) {
											secA.setaYear(sd.getaYname());
											secA.setclsId(isem);
											secA.setsecId(isec);
											secA.setstdId(stdId);
											secA.setsId(sId);
											secA.setsecfeeTk(secd.getsecFee());
											secA.setaYearId(i);
											secAData.addSecAData(secA);
										}

										
											fee fe = new fee();
											Subject ft = new Subject();
											subAOnSec subAO = new subAOnSec();
											subAssigned subA = new subAssigned();
											String s1, s2, s3, s4,s5;
											int s0,hi,csOns,csA, csubA;

		
											s0 = isub;
											ft = subData.getSubject(s0, sId);
											
											csOns = subAOData.checkSubOnSec(s0,isec);
											if(csOns==0) {
												subAO.setsId(sId);
												subAO.setsubId(s0);
												subAO.setsubAId(new Admin().uId());
												subAO.setsecId(isec);
												subAO.setsubFee(ft.getsubFee());
												subAO.setsecFee(secd.getsecFee());
												subAOData.addSubOnSec(subAO);
											}
											csA = subAData.checkSubAssigned(s0,isec,stdId,sId);
											if(csOns==0) {
												System.out.println("hi"+csOns);
											}
											subA.setsId(sId);
											subA.setsubId(s0);
											subA.setsubAId(new Admin().uId());
											subA.setsecId(isec);
											subA.setsubFee(ft.getsubFee());
											subA.setclsId(isem);
											subA.setstdId(stdId);
											csubA = subAData.addSubjectStd(subA);
											if(csubA!=0) {
												fe.setStdId(stdId);
												fe.setSId(sId);
												
												fe.setDate(date());
												fe.setTime(generateAdmissionDate());
												fe.setFeeDetails(ft.getsubCode()+" ("+ft.getsubName()+")");
												if(i!=0) {
													fe.setSessionId(i);
												}else {
													JOptionPane.showMessageDialog(null, "Please Select a Session!");
													//Message
												}
												if(ide!=0) {
													fe.setDepId(ide);
												}else {
													JOptionPane.showMessageDialog(null, "Please Select a Department!");
													//Message
												}
												if(isem!=0) {
													fe.setClsId(isem);
												}else {
													fe.setClsId(Integer.parseInt(ft.getclsId()));
													//Message
												}
												if(isec!=0) {
													fe.setSecId(isec);
												}else {
													JOptionPane.showMessageDialog(null, "Please Select a Section!");
													//Message
												}
												
												fe.setFeeId(new Admin().userId());
												fe.setFeeType(s0);
												fe.setSubId(s0);
												fe.setFee(ft.getsubFee());
												hi = feeData.addFee(fe);
												if(hi!=0) {
//													System.out.println("row--"+row);
													rI++;
													new Admin().updateFee(asubtmdl,sId,stdId);
												}

											}
											

									}else {
										JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Subject","Warning",JOptionPane.INFORMATION_MESSAGE);
									}

								}else {
									JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Section","Warning",JOptionPane.INFORMATION_MESSAGE);
								}
							}else {
								JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Class/Semester","Warning",JOptionPane.INFORMATION_MESSAGE);
							}
	

						}
						
					}else {
						JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Section","Warning",JOptionPane.INFORMATION_MESSAGE);
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Semester/Class","Warning",JOptionPane.INFORMATION_MESSAGE);
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Sorry! you didn't select any Session","Warning",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		else if(e.getSource()==feeAoB) {
			if(feeSessionCom.getSelectedItem()!=null && feeSessionCom.getSelectedItem()!=null) {
				
				int exit = JOptionPane.showConfirmDialog(null, "Do you want to assign this Fee?","Yes or NO",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(exit == JOptionPane.YES_OPTION) {
				
					String s = feeSessionCom.getSelectedItem().toString();
					Session sd = (Session) feeSessionCom.getSelectedItem();
					int i = sd.getId();
					feeData feeData = new feeData();
					FeeTypeData feetData = new FeeTypeData();
					
					schoolDep sde = (schoolDep) feedepSeCom.getSelectedItem();
					int ide = sde.getid();
					int rI=0;

					int[] selRows = otherstbl.getSelectedRows();
					for(int row : selRows) {
						fee fe = new fee();
						FeeType ft = new FeeType();
						String s1, s2, s3, s4,s5;
						int s0,hi;
//						s5 = othersmdl.getValueAt(row, 0).toString();
//						s1 = othersmdl.getValueAt(row, 1).toString();
//						s2 = othersmdl.getValueAt(row, 2).toString();
						s3 = othersmdl.getValueAt(row, 3).toString();
//						s4 = othersmdl.getValueAt(row, 4).toString();
						s0 = Integer.parseInt(s3);
						ft = feetData.getFeeType(s0, sId);
						fe.setStdId(stdId);
						fe.setSId(sId);
						
						fe.setDate(date());
						fe.setTime(generateAdmissionDate());
						fe.setFeeDetails(ft.getTypeName());
						if(i!=0) {
							fe.setSessionId(i);
						}else {
							fe.setSessionId(ft.getSessionId());
						}
						if(ide!=0) {
							fe.setDepId(ide);
						}else {
							fe.setDepId(ft.getDepId());
						}
						
						fe.setFeeId(new Admin().userId());
						fe.setFeeType(s0);
						fe.setFee(ft.getAmount());
						hi = feeData.addFee(fe);
						if(hi!=0) {
							othersmdl.setValueAt("",row,1);
						}
//						System.out.println("hi"+hi);
						rI++;
						new Admin().updateFee(asubtmdl,sId,stdId);
					}

//					int result = 1;
//					
//					if(result==1) {
//						JOptionPane.showMessageDialog(null, " is Assigned on ");
//					}else {
//						JOptionPane.showMessageDialog(null, "Try Again!");
//					}

				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Sorry! you didn't select Subject or Section","Warning",JOptionPane.INFORMATION_MESSAGE);
			}
		}else if(e.getSource()==feeAodB) {
			int exit = JOptionPane.showConfirmDialog(null, "Do you want to assign this Fee?","Yes or NO",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(exit == JOptionPane.YES_OPTION) {
				
					feeData feeData = new feeData();

					int[] selRows = asubtbl.getSelectedRows();
					for(int row : selRows) {
						fee fe = new fee();
						FeeType ft = new FeeType();
						String s1, s2, s3, s4,s5;
						int s0,hi;
//						s5 = othersmdl.getValueAt(row, 0).toString();
//						s1 = othersmdl.getValueAt(row, 1).toString();
//						s2 = othersmdl.getValueAt(row, 2).toString();
						s3 = asubtmdl.getValueAt(row, 9).toString();
//						s4 = othersmdl.getValueAt(row, 4).toString();
						s0 = Integer.parseInt(s3);
						hi = feeData.deleteFee(s0, sId);
						if(hi!=0) {
							JOptionPane.showMessageDialog(null, "Thank You, Fee/Course data successfully deleted","Success",JOptionPane.INFORMATION_MESSAGE);
							
						}

					}
					new Admin().updateFee(asubtmdl,sId,stdId);
				}
				

		}
			
		else if(e.getSource()==subDsB) {
			
			int i;
			i = asubtbl.getSelectedRow();
			
			if(i>=0) {
				
				String s1, s2, s3, s4,s5,s6,s7;
				int ss,aId;
				s5 = asubtmdl.getValueAt(i, 0).toString();
				s1 = asubtmdl.getValueAt(i, 1).toString();
				s2 = asubtmdl.getValueAt(i, 2).toString();
				s3 = asubtmdl.getValueAt(i, 3).toString();
				s4 = asubtmdl.getValueAt(i, 4).toString();
				s6 = asubtmdl.getValueAt(i, 5).toString();
				ss = Integer.parseInt(s6);
				s7 = asubtmdl.getValueAt(i, 6).toString();
				aId = Integer.parseInt(s7);
				
				int exit = JOptionPane.showConfirmDialog(null, "Do you want to Drop this subject on that section?","Yes or NO",JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(exit == JOptionPane.YES_OPTION) {
					subAData sData = new subAData();
					int de = sData.deleteSubjectStd(aId, s.getsId());
					
					if(de==1) {
						updateStudent(asubtmdl,s.getid());
						JOptionPane.showMessageDialog(null, "Successfully Subject Droped","Warning",JOptionPane.INFORMATION_MESSAGE);

					}else {
						JOptionPane.showMessageDialog(null, "Sorry! Try Again later","Warning",JOptionPane.INFORMATION_MESSAGE);

					}
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "You did not select any Row!");
			}
			
		}
		
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
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

}

