package lesson6;

import java.awt.Container;
import javax.swing.*;

public class LoginFrame extends JFrame {

	JLabel lblUser;
	JLabel lblPassword;
	JTextField txtUser;
	JPasswordField pwdPassword;
	JButton btnLogin ;
	JButton btnRegister;
	
	public static void main(String[] args) {
		LoginFrame lf = new LoginFrame();
		lf.setVisible(true);
	}
	
	public LoginFrame() {
		
		setTitle("Login Screen");
		setResizable(false);
		setBounds(400, 200, 390, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);;
		
		JPanel panel = new JPanel();
		addComponents(panel);
		add(panel);
	}
	
	private void addComponents(Container container) {

		container.setLayout(null);
		
		lblUser = new JLabel("User");
		lblUser.setBounds(50, 40, 60, 10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(50, 80, 60, 10);
		
		txtUser = new JTextField();
		txtUser.setBounds(120, 30, 200, 30);
		
		pwdPassword= new JPasswordField();
		pwdPassword.setBounds(120, 70, 200, 30);
		
		btnLogin = new JButton("Login");
		btnLogin.setBounds(50, 150, 100, 30);
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(220, 150, 100, 30);
		
		container.add(lblUser);
		container.add(lblPassword);
		container.add(txtUser);
		container.add(pwdPassword);
		container.add(btnLogin);
		container.add(btnRegister);
		
		//pack();
	}

}
