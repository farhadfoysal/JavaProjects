package attendance;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class attend extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private List<Student> students;

    public attend() {
        setTitle("Attendance Mark Sheet");

        // Initialize the students list
        students = new ArrayList<>();
        students.add(new Student(1, "John Doe", "john@example.com", 0));
        students.add(new Student(2, "Jane Smith", "jane@example.com", 0));
        students.add(new Student(3, "Michael Johnson", "michael@example.com", 0));
        students.add(new Student(4, "Emily Davis", "emily@example.com", 0));

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

        // Add a JComboBox as the cell editor for attendance status
        TableColumn attendanceColumn = table.getColumnModel().getColumn(3);
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
                for (int row = 0; row < table.getRowCount(); row++) {
                    model.setValueAt(1, row, 3);
                }
            }
        });

        // Mark all students as absent button
        markAllAbsentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int row = 0; row < table.getRowCount(); row++) {
                    model.setValueAt(0, row, 3);
                }
            }
        });

        // Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Student> attendanceData = new ArrayList<>();
                for (int row = 0; row < table.getRowCount(); row++) {
                    int id = (int) model.getValueAt(row, 0);
                    String name = (String) model.getValueAt(row, 1);
                    String email = (String) model.getValueAt(row, 2);
                    int attendanceStatus = (int) model.getValueAt(row, 3);
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
                    message.append("Attendance: ").append(student.getAttendanceStatus() == 1 ? "Present" : "Absent").append("\n");
                    message.append("--------------------\n");
                }
                JOptionPane.showMessageDialog(attend.this, message.toString());
            }
        });

        buttonPanel.add(markAllPresentButton);
        buttonPanel.add(markAllAbsentButton);
        buttonPanel.add(submitButton);

        // Add the table and button panel to the frame
        setLayout(new BorderLayout());
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Create a JComboBox with attendance status options
    private JComboBox<String> createAttendanceComboBox() {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Present");
        comboBox.addItem("Absent");
        return comboBox;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new attend();
            }
        });
    }

    // Student class
    private class Student {
        private int id;
        private String name;
        private String email;
        private int attendanceStatus;

        public Student(int id, String name, String email, int attendanceStatus) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.attendanceStatus = attendanceStatus;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getAttendanceStatus() {
            return attendanceStatus;
        }
    }
}
