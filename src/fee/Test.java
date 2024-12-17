package fee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    private JTable table;
    private JButton submitButton;

    public Test() {
        // Create sample data
        Object[][] data = {
                {"Row 1 Data 1", "Row 1 Data 2"},
                {"Row 2 Data 1", "Row 2 Data 2"},
                {"Row 3 Data 1", "Row 3 Data 2"}
        };

        // Create column names
        String[] columnNames = {"Column 1", "Column 2"};

        // Create a DefaultTableModel
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create JTable with the model
        table = new JTable(model);

        // Set selection mode to multiple interval selection
        ListSelectionModel selectionModel = table.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Create JScrollPane and add the table to it
        JScrollPane scrollPane = new JScrollPane(table);

        // Create a panel and add the scroll pane
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        // Create a submit button
        submitButton = new JButton("Submit");

        // Add ActionListener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected rows' indices
                int[] selectedRows = table.getSelectedRows();

                // Retrieve the data from the selected rows
                for (int row : selectedRows) {
                    Object rowData1 = table.getValueAt(row, 0);
                    Object rowData2 = table.getValueAt(row, 1);

                    // Display the data
                    System.out.println("Selected row data: " + rowData1 + ", " + rowData2);
                }
            }
        });

        // Add the submit button to the panel
        panel.add(submitButton, BorderLayout.SOUTH);

        // Set the panel as the content pane of the JFrame
        setContentPane(panel);

        // Set JFrame properties
        setTitle("Multi-Row Selection Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the JFrame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Test();
            }
        });
    }
}

