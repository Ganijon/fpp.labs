package lesson04.lab41;

import javax.swing.*;
import java.awt.event.*;

public class AnonymousClass {

	//code that creates instances of the inner classes
	private static final String SUBMIT = "Submit";
	private static final String CLEAR = "Cancel";
	private static final String CANCEL = "Cancel";
	
	
	private static AbstractButton upperText ;
	private static AbstractButton lowerText;
	private static String inputString;
	
	public static void main(String... args) {
		
		JButton submitButn = new JButton(SUBMIT);
		
		class SubmitListener implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				inputString = upperText.getText();
				System.out.println("Got input: " + inputString);	
			}	
		}
		
		submitButn.addActionListener(new SubmitListener());
		//
		
		JButton clearButn = new JButton(CLEAR);

		clearButn.addActionListener(new ActionListener() { // anonymous class
			
			public void actionPerformed(ActionEvent e) {
				lowerText.setText("");	
				System.out.println("Clearing output text area.");
			}
		});
		//
		
		/*
		
		JButton cancelButn = new JButton(CANCEL);

		cancelButn.addActionListener((actionEvent) -> { // lambda expression
				lowerText.setText("");	
				System.out.println("Cancelling the operation.");
		});	
		
		*/

	}
	


}

