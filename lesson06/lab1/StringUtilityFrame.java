package lesson6.lab1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StringUtilityFrame extends JFrame {

    // Define JButton
    private JButton    btnCountLetters;
    private JButton    btnReverseLetters;
    private JButton    btnRemoveDuplicates;

    // Define JLabel
    private JLabel     lblInput;
    private JLabel     lblOutput;

    // Define JTextField
    private JTextField txtInput;
    private JTextField txtOutput;

    // Entry point
    public static void main(String[] args) {
        StringUtilityFrame frame = new StringUtilityFrame();
        frame.setVisible(true);
    }

    // Constructor
    public StringUtilityFrame() {

        setTitle("Login Screen");
        setResizable(false);
        setBounds(400, 200, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        addComponents(panel);
        add(panel);
    }

    private void addComponents(Container container) {

        container.setLayout(null);

        // Define & place components
        btnCountLetters = new JButton("Count Letters");
        btnCountLetters.setBounds(30, 20, 150, 30);

        btnReverseLetters = new JButton("Reverse Letters");
        btnReverseLetters.setBounds(30, 60, 150, 30);

        btnRemoveDuplicates = new JButton("Remove Duplicates");
        btnRemoveDuplicates.setBounds(30, 100, 150, 30);

        lblInput = new JLabel("Input");
        lblInput.setBounds(200, 20, 150, 25);

        txtInput = new JTextField();
        txtInput.setBounds(200, 40, 150, 25);

        lblOutput = new JLabel("Output");
        lblOutput.setBounds(200, 80, 150, 25);

        txtOutput = new JTextField();
        txtOutput.setBounds(200, 100, 150, 25);

        container.add(btnCountLetters);
        container.add(btnReverseLetters);
        container.add(btnRemoveDuplicates);

        container.add(lblInput);
        container.add(lblOutput);
        container.add(txtInput);
        container.add(txtOutput);

        // Event handling with Lambda
        btnCountLetters.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int count = txtInput.getText().length();
                txtOutput.setText(Integer.toString(count));
            }
        });


        btnReverseLetters.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder input = new StringBuilder(txtInput.getText());
                String output = input.reverse().toString();
                txtOutput.setText(output);
            }
        });

        btnRemoveDuplicates.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder input = new StringBuilder(txtInput.getText());
                String output = new String();
                for (int i = 0; i < input.length(); i++) {
                    if (!output.contains(String.valueOf(input.charAt(i))))
                        output += String.valueOf(input.charAt(i));
                }
                txtOutput.setText(output);

            }
        });


    }
}
