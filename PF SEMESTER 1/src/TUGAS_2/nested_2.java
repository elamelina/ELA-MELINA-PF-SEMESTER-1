package TUGAS_2;
import javax.swing.JOptionPane;
public class nested_2
{
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        if ( username != null && password != null
                && (
                (username.equals("ela") && password.equals("123")) ||
                        (username.equals("ichaq") && password.equals("456"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "You're in.");
        } 	else {
            JOptionPane.showMessageDialog(null, "You're suspicious.");
        }
    }
}

