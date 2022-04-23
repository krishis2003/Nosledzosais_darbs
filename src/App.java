import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class App {
    public static void main(String[] args) throws Exception {
        JButton but;
        JFrame frame = new JFrame("Autoplaca vadibas panelis profesionaliem");
        JTextField textfield;  
     textfield = new JTextField("kalkulatora sadala");
     textfield.setBounds(50, 150, 200, 30);
     textfield.setLocation(20,20);
     frame.add(textfield);
    
     frame.setSize(800, 800);
     frame.setLayout(null);
     frame.setVisible(true);
    }
}
