
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ManagementSystem {
	 private JFrame LoginFrame; // Window (application) to add components to
	 private JLabel TopLabel; // Top part (row) of window
	 private JPanel CPanel; // Middle part of window
	 private JLabel BLabel; // Bottom part (row) of window
	 private JScrollPane SPane;

	 public ManagementSystem(){
	 prepareGUI(); // call prepareGUI() method
	 }
	 
	 public static void main(String[] args){
		// run application
		 ManagementSystem jtextfielddemo = new ManagementSystem();
		 jtextfielddemo.showTextFieldDemo();
		 }

	 private void prepareGUI(){
		 LoginFrame = new JFrame("Login"); // give application a title
		 LoginFrame.setSize(400,400); // give application a size
		 LoginFrame.setLayout(new GridLayout(3, 1)); // application has 3 rows + 1 columns
		// make application receive window events
		 LoginFrame.addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent windowEvent){
		 System.exit(0);
		 }
		 });
		
		 TopLabel = new JLabel("", JLabel.CENTER); // set up top row of application

		 BLabel = new JLabel("",JLabel.CENTER); // set up bottom row of application
		 BLabel.setSize(350,100); // give bottom row a size
		 CPanel = new JPanel(); // set up middle row of application
		 CPanel.setLayout(new FlowLayout()); // make middle row flow from left to right
		 LoginFrame.add(TopLabel); // add top row to application
		 LoginFrame.add(CPanel); // add middle row to application
		 LoginFrame.add(BLabel); // add bottom row to application
		 LoginFrame.setVisible(true); // display the 3 rows
		 }
	
	 
	 private void showTextFieldDemo(){
		 TopLabel.setText("Northampton Metropolitan University - Login"); 
		 JLabel namelabel= new JLabel("User ID: ", JLabel.RIGHT);
		 JLabel passwordLabel = new JLabel("Password: ", JLabel.CENTER); 
		 final JTextField userText = new JTextField(6);
		 final JPasswordField passwordText = new JPasswordField(6); 
		 JButton loginButton = new JButton("Login"); 
		 final DefaultComboBoxModel deptSelect = new DefaultComboBoxModel(); 
		 deptSelect.addElement("Science"); 
		 deptSelect.addElement("English"); 
		 deptSelect.addElement("Physics"); 
		 final JComboBox countryCombo = new JComboBox(deptSelect);
		 countryCombo.setSelectedIndex(0); 
		 JScrollPane countryListScrollPane = new JScrollPane(countryCombo); 
		 CPanel.add(countryListScrollPane);
		 LoginFrame.setVisible(true);
		 loginButton.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
		 
		 
		 }
		 });
		 CPanel.add(namelabel); // add label ‘User ID’ to middle row of application
		 CPanel.add(userText); // add Text Box to take 6 chars to middle row of application
		 CPanel.add(passwordLabel); // add label ‘Password’ to middle row of application
		 CPanel.add(passwordText); // add Text Box to take 6 chars to middle row of application
		 CPanel.add(loginButton); // add button labelled ‘Login’ to middle row of application
		 LoginFrame.setVisible(true); // make components visible
	 }
}
