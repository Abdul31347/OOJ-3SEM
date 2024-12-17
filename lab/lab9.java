import javax.swing.*;  
import java.awt.event.*;  

class Division implements ActionListener {  
    static JLabel label1, label2, resultLabel;  
    static JTextField textField1, textField2;  
    
    public static void main(String[] args) {  
        JFrame frame = new JFrame("Division of Numbers");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setSize(400, 200);  
        
        label1 = new JLabel("Enter the first number: ");  
        label2 = new JLabel("Enter the second number: ");  
        resultLabel = new JLabel("Result will appear here.");  
        
        textField1 = new JTextField(10);  
        textField2 = new JTextField(10);  
        
        JButton submit = new JButton("Submit");  
        
        Division division = new Division();  
        submit.addActionListener(division);  
        
        JPanel panel = new JPanel();  
        panel.add(label1);  
        panel.add(textField1);  
        panel.add(label2);  
        panel.add(textField2);  
        panel.add(submit);  
        panel.add(resultLabel);  
        
        frame.add(panel);  
        frame.setVisible(true);  
    }  
    
    public void actionPerformed(ActionEvent e) {  
        try {  
            int num1 = Integer.parseInt(textField1.getText());  
            int num2 = Integer.parseInt(textField2.getText());  
            
            if (num2 == 0) {  
                resultLabel.setText("Error: Division by zero!");  
            } else {  
                int result = num1 / num2;  
                resultLabel.setText("The result of the division is: " + result);  
            }  
        } catch (NumberFormatException ex) {  
            resultLabel.setText("Error: Please enter valid numbers.");  
        }  
    }  
}  
