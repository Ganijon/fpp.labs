package lesson7.lab1;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricConversionFrame extends JFrame {

    public static void main(String[] args) {
        MetricConversionFrame frame = new MetricConversionFrame();
        frame.setVisible(true);
    }

    public MetricConversionFrame() {

        setTitle("Metric Conversion Assistant");
        setResizable(false);
        setBounds(400, 200, 400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        addComponents(panel);
        add(panel);
    }

    private void addComponents(Container container) {

        container.setLayout(new GridLayout(5, 4, 2, 2));

        container.add(new JLabel("Mile:", JLabel.RIGHT));
        final JTextField txtMile = new JTextField();
        container.add(txtMile);

        container.add(new JLabel("Kilometer:", JLabel.RIGHT));
        final JTextField txtKilometer = new JTextField();
        container.add(txtKilometer);

        container.add(new JLabel("Pound:", JLabel.RIGHT));
        final JTextField txtPound = new JTextField();
        container.add(txtPound);

        container.add(new JLabel("Kilogram:", JLabel.RIGHT));
        final JTextField txtKilogram = new JTextField();
        container.add(txtKilogram);

        container.add(new JLabel("Gallon:", JLabel.RIGHT));
        final JTextField txtGallon = new JTextField();
        container.add(txtGallon);

        container.add(new JLabel("Liter:", JLabel.RIGHT));
        final JTextField txtLiter = new JTextField();
        container.add(txtLiter);

        container.add(new JLabel("Fahrenheit:", JLabel.RIGHT));
        final JTextField txtFahrenheit = new JTextField();
        container.add(txtFahrenheit);

        container.add(new JLabel("Centigrade:", JLabel.RIGHT));
        final JTextField txtCentigrade = new JTextField();
        container.add(txtCentigrade);

        final String PLACEHOLDER = "";
        container.add(new JLabel(PLACEHOLDER));
        container.add(new JLabel(PLACEHOLDER));

        final JButton btnClear = new JButton("Clear");
        container.add(btnClear);

        final JButton btnConvert = new JButton("Convert");
        container.add(btnConvert);

        // Handling events for buttons
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMile.setText("");
                txtKilometer.setText("");
                txtPound.setText("");
                txtKilogram.setText("");
                txtGallon.setText("");
                txtLiter.setText("");
                txtFahrenheit.setText("");
                txtCentigrade.setText("");
            }

        });

        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    // mile <-> kilogram
                    if (txtMile.getText().isEmpty()) {
                        if (!txtKilometer.getText().isEmpty()) {
                            double kilometer = Double.parseDouble(txtKilometer.getText());
                            double mile = kilometer * 1.60934;
                            txtMile.setText(String.format("%.3f", mile));
                        }
                    } else {
                        double mile = Double.parseDouble(txtMile.getText());
                        double kilometer = mile * 0.621371;
                        txtKilometer.setText(String.format("%.3f", kilometer));
                    }

                    // pound <-> kilogram
                    if (txtPound.getText().isEmpty()) {
                        if (!txtKilogram.getText().isEmpty()) {
                            double kilogram = Double.parseDouble(txtKilogram.getText());
                            double pound = kilogram * 2.204623;
                            txtPound.setText(String.format("%.3f", pound));
                        }
                    } else {
                        double pound = Double.parseDouble(txtPound.getText());
                        double kilogram = pound * 0.453592;
                        txtKilogram.setText(String.format("%.3f", kilogram));
                    }

                    // gallon <-> liter
                    if (txtGallon.getText().isEmpty()) {
                        if (!txtLiter.getText().isEmpty()) {
                            double liter = Double.parseDouble(txtLiter.getText());
                            double gallon = liter * 3.78541;
                            txtGallon.setText(String.format("%.3f", gallon));
                        }
                    } else {
                        double gallon = Double.parseDouble(txtGallon.getText());
                        double liter = gallon * 0.264172;
                        txtLiter.setText(String.format("%.3f", liter));
                    }

                    // fahrenheit <-> centigrade
                    if (txtFahrenheit.getText().isEmpty()) {
                        if (!txtLiter.getText().isEmpty()) {
                            double centigrade = Double.parseDouble(txtCentigrade.getText());
                            double fahrenheit = centigrade - 32;
                            txtFahrenheit.setText(String.format("%.3f", fahrenheit));
                        }
                    } else {
                        double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
                        double centigrade = fahrenheit + 32;
                        txtCentigrade.setText(String.format("%.3f", centigrade));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(btnConvert, ex.getMessage(), ex.getClass().getSimpleName(), 
                                                    JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
