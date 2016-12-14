package lesson6.lab2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class RainbowFrame extends JFrame {
	
	public static void main(String[] args) {
		RainbowFrame frame = new RainbowFrame();
		frame.setVisible(true);
	}

	public RainbowFrame() {
		setTitle("Rainbow Color Frame");
		setBounds(400, 200, 620, 130);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		addComponents(panel);
		add(panel);
	}

	private void addComponents(Container container) {

		container.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// local variable rc is accessed from within inner class; 
		// needs to be declared final
		for(final RainbowColors rc: RainbowColors.values()) {
			
			// local variable button is accessed from within inner class; 
			// needs to be declared final
			final JButton button = new JButton();
			button.setBackground(rc.color);
			button.setPreferredSize(new Dimension(80,80));
			container.add(button);

			button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(button, rc.description,
				    rc.toString() + " - " + rc.meaning, JOptionPane.PLAIN_MESSAGE );
                }
            });
			
		}

	}
}
