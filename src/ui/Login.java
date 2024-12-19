package ui;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.getContentPane().setLayout(null);

        frame.getContentPane().setBackground(new Color(0x2196F3)); // Blue background

        JPanel panel = new JPanel();
        panel.setBounds(50, 80, 300, 300);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        frame.getContentPane().add(panel);

        JLabel titleLabel = new JLabel("Sign In");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(new Color(0x0057D9));
        titleLabel.setBounds(100, 20, 100, 30);
        panel.add(titleLabel);

        JTextField usernameField = new JTextField();
        usernameField.setToolTipText("username");
        usernameField.setBounds(50, 72, 200, 38);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        String placeholder = " Enter your username";
        usernameField.setText(placeholder);
        usernameField.setForeground(java.awt.Color.GRAY);
        usernameField.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if (usernameField.getText().equals(placeholder)) {
                    usernameField.setText("");
                    usernameField.setForeground(java.awt.Color.BLACK);
                }
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if (usernameField.getText().isEmpty()) {
                    usernameField.setText(placeholder);
                    usernameField.setForeground(java.awt.Color.GRAY);
                }
			}

		
        	
        });
        panel.add(usernameField);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 122, 200, 38);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        String placeholder2 = " Enter ";
        passwordField.setText(placeholder2);
        passwordField.setForeground(java.awt.Color.GRAY);
        passwordField.addFocusListener(new FocusListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				if (passwordField.getText().equals(placeholder2)) {
					passwordField.setText("");
					passwordField.setForeground(java.awt.Color.BLACK);
                }
			}

			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if (passwordField.getText().isEmpty()) {
					passwordField.setText(placeholder2);
                    passwordField.setForeground(java.awt.Color.GRAY);
                }
			}

        });
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        loginButton.setBounds(100, 170, 100, 30);
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(new Color(51, 0, 255));
        loginButton.setFocusPainted(false);
        panel.add(loginButton);
        
        JButton btnRegister = new JButton("Create an new account");
        btnRegister.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnRegister.setForeground(new Color(51, 0, 255));
        btnRegister.setFocusPainted(false);
        btnRegister.setBackground(Color.WHITE);
        btnRegister.setBounds(50, 216, 200, 38);
        btnRegister.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				frame.setVisible(false);
				new Register();
				
			}
        	
        });
        panel.add(btnRegister);

        // Button Action
        loginButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        

        // Set Frame Visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
	}
}
