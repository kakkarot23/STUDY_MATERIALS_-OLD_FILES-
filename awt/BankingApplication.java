import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class BankingApplication extends JFrame {

    private Map<String, String> userCredentials;  
    private Map<String, Double> accountBalances;  

    private JTextField usernameField;
    private JPasswordField passwordField;

    public BankingApplication() {
        
        userCredentials = new HashMap<>();
        accountBalances = new HashMap<>();

        
        setTitle("Banking Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        JPanel loginPanel = createLoginPanel();
        add(loginPanel, BorderLayout.CENTER);

       
        setVisible(true);
    }

    private JPanel createLoginPanel() {
        JPanel loginPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        loginPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        JButton createAccountButton = new JButton("Create Account");
        createAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createAccount();
            }
        });

        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(createAccountButton);

        return loginPanel;
    }

    private void login() {
        String username = usernameField.getText();
        char[] passwordChars = passwordField.getPassword();
        String password = new String(passwordChars);

        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            showHomePage(username);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }

        
        passwordField.setText("");
    }

    private void createAccount() {
        String username = JOptionPane.showInputDialog(this, "Enter a new username:");
        if (username != null && !username.isEmpty()) {
            String password = JOptionPane.showInputDialog(this, "Enter a password:");
            if (password != null) {
                userCredentials.put(username, password);
                accountBalances.put(username, 0.0);
                JOptionPane.showMessageDialog(this, "Account created successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void showHomePage(String username) {
        
        JFrame homeFrame = new JFrame("Welcome, " + username + "!");
        homeFrame.setSize(400, 300);
        homeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        
        JPanel homePanel = new JPanel(new GridLayout(3, 1, 10, 10));
        homePanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        JLabel balanceLabel = new JLabel("Account Balance: $" + accountBalances.get(username));

        JButton viewDetailsButton = new JButton("View Customer Details");
        viewDetailsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewCustomerDetails(username);
            }
        });

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homeFrame.dispose();
                
                getContentPane().removeAll();
                add(createLoginPanel(), BorderLayout.CENTER);
                revalidate();
            }
        });

        homePanel.add(balanceLabel);
        homePanel.add(viewDetailsButton);
        homePanel.add(logoutButton);

        homeFrame.add(homePanel);
        homeFrame.setVisible(true);
    }

    private void viewCustomerDetails(String username) {
        JOptionPane.showMessageDialog(this, "Customer Details:\nUsername: " + username + "\nBalance: $" + accountBalances.get(username), "Customer Details", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BankingApplication();
            }
        });
    }
}
