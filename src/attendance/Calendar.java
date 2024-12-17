package attendance;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Main.Admin;
import Main.Section.Section;
import Main.Subject.Subject;

import java.awt.*;
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
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Calendar extends JFrame implements ChangeListener, ActionListener, ItemListener, KeyListener, MouseListener, MouseMotionListener, WindowListener, FocusListener, WindowFocusListener, MouseWheelListener, WindowStateListener{
    private YearMonth currentYearMonth;
    private JLabel monthYearLabel;
    private JPanel calendarPanel;
    private Section sec;
    private Subject sub;
	private JComboBox courseASubCom;
	private JPanel courseOne;
	private Admin admin;
	private String myId;
	private ImageIcon icon;

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
	
    public Calendar(Section section,String myId) {
        this.sec = section;
        this.myId = myId;
        setTitle("EdUBox Calendar ~ "+sec.getsecName());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.setBounds(150,50,780,680);
		icon = new ImageIcon(getClass().getResource("..\\Main/img.png"));
		
		this.setIconImage(icon.getImage());
        currentYearMonth = YearMonth.now();

        monthYearLabel = new JLabel("", JLabel.CENTER);
        JButton previousButton = new JButton("<");
        JButton nextButton = new JButton(">");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentYearMonth = currentYearMonth.minusMonths(1);
                updateCalendar();
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentYearMonth = currentYearMonth.plusMonths(1);
                updateCalendar();
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(previousButton);
        controlPanel.add(monthYearLabel);
        controlPanel.add(nextButton);

        calendarPanel = new JPanel(new GridLayout(0, 7));
        calendarPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        calendarPanel.setPreferredSize(new Dimension(800, 600)); 

        JPanel takeAttendanceOne = new JPanel(); 
        takeAttendanceOne.setLayout(new BorderLayout());
        takeAttendanceOne.add(controlPanel, BorderLayout.NORTH);
        takeAttendanceOne.add(calendarPanel, BorderLayout.CENTER);

		String[] courseAacC = {"--Select a Subject--"}; 
		courseASubCom = new JComboBox<String>(courseAacC);
		crCom(courseASubCom,controlPanel,770,85,220,30,Color.DARK_GRAY,new Color(255, 255, 255),"Select Student Subject");
		
        
        add(takeAttendanceOne); 

        new Admin().selectSubjectOnSec(courseASubCom,sec.getid(),sec.getsId());
        
        updateCalendar();
        pack();
        setLocationRelativeTo(null);
    }
    

    public Calendar(Subject subject,String myId) {
        this.sub = subject;
        this.myId = myId;
        setTitle("EdUBox Calendar ~ "+sec.getsecName());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
        currentYearMonth = YearMonth.now();

        monthYearLabel = new JLabel("", JLabel.CENTER);
        JButton previousButton = new JButton("<");
        JButton nextButton = new JButton(">");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentYearMonth = currentYearMonth.minusMonths(1);
                updateCalendar();
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentYearMonth = currentYearMonth.plusMonths(1);
                updateCalendar();
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(previousButton);
        controlPanel.add(monthYearLabel);
        controlPanel.add(nextButton);

        calendarPanel = new JPanel(new GridLayout(0, 7));
        calendarPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        calendarPanel.setPreferredSize(new Dimension(600, 400)); 

        JPanel takeAttendanceOne = new JPanel(); 
        takeAttendanceOne.setLayout(new BorderLayout());
        takeAttendanceOne.add(controlPanel, BorderLayout.NORTH);
        takeAttendanceOne.add(calendarPanel, BorderLayout.CENTER);

        add(takeAttendanceOne); 

        updateCalendar();
        pack();
        setLocationRelativeTo(null);
    }

    public Calendar() {
    	 setTitle("EdUBox Calendar ~ ");
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

         this.setBounds(150,50,780,680);
         currentYearMonth = YearMonth.now();

         monthYearLabel = new JLabel("", JLabel.CENTER);
         JButton previousButton = new JButton("<");
         JButton nextButton = new JButton(">");
         previousButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 currentYearMonth = currentYearMonth.minusMonths(1);
                 updateCalendar();
             }
         });
         nextButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 currentYearMonth = currentYearMonth.plusMonths(1);
                 updateCalendar();
             }
         });

         JPanel controlPanel = new JPanel();
         controlPanel.add(previousButton);
         controlPanel.add(monthYearLabel);
         controlPanel.add(nextButton);

         calendarPanel = new JPanel(new GridLayout(0, 7));
         calendarPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
         calendarPanel.setPreferredSize(new Dimension(800, 600)); 

         JPanel takeAttendanceOne = new JPanel(); 
         takeAttendanceOne.setLayout(new BorderLayout());
         takeAttendanceOne.add(controlPanel, BorderLayout.NORTH);
         takeAttendanceOne.add(calendarPanel, BorderLayout.CENTER);

         add(takeAttendanceOne); 

         updateCalendar();
         pack();
         setLocationRelativeTo(null);
	}

	private void updateCalendar() {
        calendarPanel.removeAll();

        // Set month and year label
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        monthYearLabel.setText(currentYearMonth.format(formatter));

        // Set day labels
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : daysOfWeek) {
            JLabel dayLabel = new JLabel(day, JLabel.CENTER);
            calendarPanel.add(dayLabel);
        }

        LocalDate firstDayOfMonth = currentYearMonth.atDay(1);
        int startDay = firstDayOfMonth.getDayOfWeek().getValue();
        int numberOfDays = currentYearMonth.lengthOfMonth();


        for (int i = 1; i < startDay; i++) {
            JLabel emptyLabel = new JLabel("");
            calendarPanel.add(emptyLabel);
        }


        for (int day = 1; day <= numberOfDays; day++) {
            JLabel dayLabel = new JLabel(Integer.toString(day), JLabel.CENTER);
            dayLabel.addMouseListener(new ClickListener(day));
            calendarPanel.add(dayLabel);
        }


        calendarPanel.revalidate();
        calendarPanel.repaint();
    }


    private class ClickListener extends MouseAdapter {
        private int day;

        public ClickListener(int day) {
            this.day = day;
        }

        @Override
        public void mouseClicked(MouseEvent e) {

            String selectedDate = currentYearMonth.atDay(day).toString();
//            JOptionPane.showMessageDialog(null, "Selected date: " + selectedDate);
            
            if(courseASubCom.getSelectedItem()!=null) {
        		String s = courseASubCom.getSelectedItem().toString();
        		Subject sd = (Subject) courseASubCom.getSelectedItem();
        		int i = sd.getid();
        		String dName = sd.getsubName();
        		String clsId = sd.getclsId();
        		
        		if(i!=0) {
                    TakeAttendance as = new TakeAttendance(sd,selectedDate,sec,myId);
                    as.setVisible(true);
                    
                    dispose();
        		}else {
        			JOptionPane.showMessageDialog(null, "Please  Select a Subject ~ " + selectedDate);
        		}
        		
        		
        	}else {
        		JOptionPane.showMessageDialog(null, "Please  Select a Subject ~ " + selectedDate);
        	}
            

            
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calendar().setVisible(true);
            }
        });
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
}
