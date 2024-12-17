package attendance;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Attendance extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private List<String> studentNames;

    public Attendance() {
        setTitle("Attendance Mark Sheet");

        // Initialize the student names list
        studentNames = new ArrayList<>();
        studentNames.add("John Doe");
        studentNames.add("Jane Smith");
        studentNames.add("Michael Johnson");
        studentNames.add("Emily Davis");
        studentNames.add("Farhad Foysal");

        // Create the table model and set the column headers
        model = new DefaultTableModel();
        model.addColumn("Student Name");
        model.addColumn("Attendance");

        // Create the table and set the model
        table = new JTable(model);

        // Add a JComboBox as the cell editor for attendance status
        TableColumn attendanceColumn = table.getColumnModel().getColumn(1);
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
                    model.setValueAt("Present", row, 1);
                }
            }
        });

        // Mark all students as absent button
        markAllAbsentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int row = 0; row < table.getRowCount(); row++) {
                    model.setValueAt("Absent", row, 1);
                }
            }
        });

        // Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String[]> attendanceData = new ArrayList<>();
                for (int row = 0; row < table.getRowCount(); row++) {
                    String studentName = (String) model.getValueAt(row, 0);
                    String attendanceStatus = (String) model.getValueAt(row, 1);
                    String[] rowData = {studentName, attendanceStatus};
                    attendanceData.add(rowData);
                }
                // Process the attendance data (e.g., send to a database, perform calculations, etc.)
                // For now, let's just display the collected data in a message dialog
                StringBuilder message = new StringBuilder();
                for (String[] rowData : attendanceData) {
                    message.append(rowData[0]).append(": ").append(rowData[1]).append("\n");
                }
                JOptionPane.showMessageDialog(null, message.toString(), "Attendance Data", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        buttonPanel.add(markAllPresentButton);
        buttonPanel.add(markAllAbsentButton);
        buttonPanel.add(submitButton);

        // Add the student names to the table
        for (String studentName : studentNames) {
            model.addRow(new Object[]{studentName, "Absent"});
        }

        // Add the table and button panel to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(new JScrollPane(table), BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        // Set the size and make the frame visible
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        new Attendance();
    }
}
