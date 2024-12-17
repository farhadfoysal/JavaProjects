package attendance;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Main.Admin;
import Main.DBConnection;
import Main.Section.Section;
import Main.Section.SectionData;
import Main.Subject.Subject;
import Main.fcomf.HintTextField;
import Main.scl.subAData;
import Main.scl.subAssigned;
import Main.std.student;
import Main.std.studentData;

public class AttendanceSheett extends JFrame implements ChangeListener, ActionListener, ItemListener, KeyListener, MouseListener, MouseMotionListener, WindowListener, FocusListener, WindowFocusListener, MouseWheelListener, WindowStateListener{
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
	private String[] subcols = {"SI","Student-NAME","Student-Phone","Email","Section","S-Id","A-Id"};
	private JTextField subStdL;
	private String[] stdRow = new String[10];
	private JButton subDsB;

	
    private JTable table;
    private DefaultTableModel model;
    private List<Student> students;
    private Subject sub;
    private String date;

	
	
	public AttendanceSheett(Subject sub, String date){
		this.s = sub;
    	this.sub = sub;
    	this.date = date;
        setTitle("EdUBox Attendance ~ "+sub.getsubName());
		
		this.setDefaultCloseOperation(AttendanceSheett.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1130,720);
		this.setResizable(true);
		this.setTitle("Student Details");
		icon = new ImageIcon(getClass().getResource("..\\Main/img.png"));
		
		this.setIconImage(icon.getImage());
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
	}
	
	public AttendanceSheett(Subject s){
		this.s = s;
		this.setDefaultCloseOperation(AttendanceSheett.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1130,720);
		this.setResizable(true);
		this.setTitle("Student Details");
		icon = new ImageIcon(getClass().getResource("..\\Main/img.png"));
		
		this.setIconImage(icon.getImage());
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
		selectSection(courseASecCom,s.getid());
		Admin ad = new Admin();
//		ad.updateSubject(asubtmdl);
		
		updateStudent(asubtmdl,s.getid());
		
	}
	
	public AttendanceSheett(){

		this.setDefaultCloseOperation(AttendanceSheett.DISPOSE_ON_CLOSE);
		this.setBounds(150,50,1130,720);
		this.setResizable(true);
		this.setTitle("Student Details");
		icon = new ImageIcon(getClass().getResource("..\\Main/img.png"));
		
		this.setIconImage(icon.getImage());
		
		con = DBConnection.ConnectionDB();
		this.initComponent();
		
		selectSection(courseASecCom,s.getid());
		Admin ad = new Admin();
//		ad.updateSubject(asubtmdl);
		
		updateStudent(asubtmdl,s.getid());
		
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
		
		JLabel lblDisplayingStudentDetails = new JLabel(""+s.getsubName()+"("+s.getsubCode()+")");
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
		crPanel(pan1, 10, 135, 730, 320, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		c.add(pan1);
		
		asubtbl = new JTable();
		asubtbl.setEnabled(true);
		asubtbl.setSelectionBackground(Color.pink);
		asubtbl.setFont(f);
		asubtbl.setBackground(Color.white);
		asubtbl.setRowHeight(25);
		
		asubtmdl = new DefaultTableModel();
		asubtmdl.setColumnIdentifiers(subcols);
//		asubtbl.setModel(asubtmdl);
		
		sp1 = new JScrollPane(asubtbl);
		sp1.setBounds(5,5,720,310);
		pan1.add(sp1);
		
		
//		asubtbl.addMouseListener(new MouseAdapter() {
//
//			public void mouseClicked(MouseEvent e) {
//				
//				int i;
//				i = asubtbl.getSelectedRow();
//				
//				if(i>=0) {
//					
//					String s1, s2, s3, s4,s5;
//					int s;
//					s5 = asubtmdl.getValueAt(i, 0).toString();
//					s1 = asubtmdl.getValueAt(i, 1).toString();
//					s2 = asubtmdl.getValueAt(i, 2).toString();
//					s3 = asubtmdl.getValueAt(i, 3).toString();
//					s4 = asubtmdl.getValueAt(i, 4).toString();
//					
//					subStdL.setText(s5);
//					subStdNt.setText(s1);
//					
//				}else {
//					JOptionPane.showMessageDialog(null, "You did not select any Row!");
//				}
//				
//			}
//			
//		});
		
	
		pan2 = new JPanel();
		crPanel(pan2, 745, 135, 360,320, Color.LIGHT_GRAY, new LineBorder(new Color(192, 192, 192)));
		c.add(pan2);
		
		subStdt = new HintTextField("Student Id Or Phone Number ");
		crHText(subStdt,pan2,10,5,340,30,Color.white,new Color(60, 190, 190),HintTextField.CENTER,f3,null,"Class or Semester Code",true,40);		
		
		
		subAssB = new JButton("...Stduent...");
		crButton(subAssB,pan2,20,40,300,30,Color.BLUE,Color.CYAN,f2,"Assign subject",null,false,false,true);
		
		
		String[] courseAasC = {"--Select a Section--"}; 
		courseASecCom = new JComboBox<String>(courseAasC);
		crCom(courseASecCom,pan2,10,80,340,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Section");
		
		String[] courseAStdC = {"--Select a Student--"}; 
		courseAStdCom = new JComboBox<String>(courseAStdC);
		crCom(courseAStdCom,pan2,10,115,340,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student");
		
		subStdL = new JTextField("SID");
		crText(subStdL,pan2,10,150,340,30,Color.BLUE,Color.LIGHT_GRAY,SwingConstants.CENTER,new Font("Segoe UI", Font.PLAIN, 15),new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY),"SID");
		
		
		subStdNt = new HintTextField("STUDENT NAME");
		crHText(subStdNt,pan2,10,185,340,30,Color.BLACK,Color.LIGHT_GRAY,HintTextField.CENTER,f3,null,"Student Details",false,40);		
		
		subDsB = new JButton("...Drop...");
		crButton(subDsB,pan2,1,240,80,30,Color.BLUE,Color.red,f2,"Drop Student",null,false,false,true);
		
		
		subAsB = new JButton("...Assing Stduent...");
		crButton(subAsB,pan2,1,280,358,30,Color.BLUE,Color.GREEN,f2,"Assign Student",null,false,false,true);
		
		
		
		pan3 = new JPanel();
		crPanel(pan3,10,460,1095,225, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		c.add(pan3);
	
		pan4 = new JPanel();
		crPanel(pan4,0,0,360,220, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		pan3.add(pan4);
		
	
		pan5 = new JPanel();
		crPanel(pan5,365,0,360,220, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		pan3.add(pan5);
		
		pan6 = new JPanel();
		crPanel(pan6,730,0,365,220, Color.WHITE, new LineBorder(new Color(192, 192, 192)));
		pan3.add(pan6);
		
		
		
		 // Initialize the students list
        students = new ArrayList<>();
        students.add(new Student(1, "John Doe", "john@example.com", "A"));
        students.add(new Student(2, "Jane Smith", "jane@example.com", "A"));
        students.add(new Student(3, "Michael Johnson", "michael@example.com", "A"));
        students.add(new Student(4, "Emily Davis", "emily@example.com", "A"));

        // Create the table model and set the column headers
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Attendance");

        // Populate the table with student data
        for (Student student : students) {
            Object[] row = {student.getId(), student.getName(), student.getEmail(), student.getAttendanceStatus()};
            model.addRow(row);
        }

        // Create the table and set the model
        table = new JTable(model);

        asubtbl.setModel(model);
        
        // Add a JComboBox as the cell editor for attendance status
        TableColumn attendanceColumn = asubtbl.getColumnModel().getColumn(3);
        attendanceColumn.setCellEditor(new DefaultCellEditor(createAttendanceComboBox()));

        // Create the button panel
        JPanel buttonPanel = new JPanel();
        JButton markAllPresentButton = new JButton("Mark All Present");
        JButton markAllAbsentButton = new JButton("Mark All Absent");
        JButton submitButton = new JButton("Submit");

        // Mark all students as present button
        markAllPresentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int row = 0; row < asubtbl.getRowCount(); row++) {
                    model.setValueAt("P", row, 3);
                }
            }
        });

        // Mark all students as absent button
        markAllAbsentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int row = 0; row < asubtbl.getRowCount(); row++) {
                    model.setValueAt("A", row, 3);
                }
            }
        });

        // Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Student> attendanceData = new ArrayList<>();
                for (int row = 0; row < asubtbl.getRowCount(); row++) {
                    int id = (int) model.getValueAt(row, 0);
                    String name = (String) model.getValueAt(row, 1);
                    String email = (String) model.getValueAt(row, 2);
                    String attendanceStatus = (String) model.getValueAt(row, 3);
                    Student student = new Student(id, name, email, attendanceStatus);
                    attendanceData.add(student);
                }
                // Process the attendance data (e.g., send to a database, perform calculations, etc.)
                // For now, let's just display the collected data in a message dialog
                StringBuilder message = new StringBuilder();
                for (Student student : attendanceData) {
                    message.append("ID: ").append(student.getId()).append("\n");
                    message.append("Name: ").append(student.getName()).append("\n");
                    message.append("Email: ").append(student.getEmail()).append("\n");
                    message.append("Attendance: ").append(student.getAttendanceStatus().equals("P") ? "Present" : "Absent").append("\n");
                    message.append("--------------------\n");
                }
                JOptionPane.showMessageDialog(AttendanceSheett.this, message.toString());
            }
        });

        buttonPanel.add(markAllPresentButton);
        buttonPanel.add(markAllAbsentButton);
        buttonPanel.add(submitButton);
		
		
        buttonPanel.setBounds(300, 85, 445, 35);
		panel.add(buttonPanel);
		
				
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
	
    private JComboBox<String> createAttendanceComboBox() {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("P");
        comboBox.addItem("A");
        return comboBox;
    }
	
	public static void main(String[] args) {
		AttendanceSheett frm = new AttendanceSheett();
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
			
			updateStudent(asubtmdl,s.getid(),i);
//			selectStudent(courseAStdCom,i);
		}else if(e.getSource()==subDsB) {
			
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

