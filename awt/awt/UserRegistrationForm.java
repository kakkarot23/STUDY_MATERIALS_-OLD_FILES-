import java.awt.*;
import java.awt.event.*;

public class UserRegistrationForm extends Frame {

    public UserRegistrationForm() {
        
        setLayout(new GridLayout(8, 2, 10, 10));

        
        add(new Label("First Name:"));
        add(new TextField());

        add(new Label("Last Name:"));
        add(new TextField());

        add(new Label("Date of Birth:"));
        add(new TextField());

        add(new Label("Gender:"));
        CheckboxGroup genderGroup = new CheckboxGroup();
        add(new Checkbox("Male", genderGroup, false));
        add(new Checkbox("Female", genderGroup, false));

        add(new Label("Place:"));
        add(new TextField());

        add(new Label("Contact Number:"));
        add(new TextField());

        
        Button submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("Registration data submitted!");
            }
        });
        add(submitButton);

        
        setTitle("User Registration Form");
        setSize(400, 300);
        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
        dispose(); 
            }
        });
    }

    public static void main(String[] args) {
        new UserRegistrationForm();
    }
}
