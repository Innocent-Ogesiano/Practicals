import javax.swing.JOptionPane;

public class HelloWorldGUI {
	public static void main(String[] args) {
		String msg = "Hello World";
		String ans = "";
		JOptionPane.showMessageDialog(null, msg);
		ans = JOptionPane.showInputDialog(null, "Enter your name please"); // accepts the users' name
		JOptionPane.showMessageDialog(null, "Hello! " + ans); // say hello to the user
	}
}