package com.kukharuk.jdecrypter.awt;
import java.awt.*;        // using AWT containers and components
import java.awt.event.*;  // using AWT events and listener interfaces

//1NF3Z58N3805F47 - use this code for input

// An AWT GUI program inherits the top-level container java.awt.Frame
public class JDecrypter extends Frame implements ActionListener {
	private Label lblInput;     // declare input Label
	private Label lblOutput;    // declare output Label
	private TextField tfInput;  // declare input TextField
	private TextField tfOutput; // declare output TextField
	private String code;       // input code
	private String ver = "0.0.2"; 	//product version
	private Button btnDecr;   // declare component Button
	private String aai = "AAAAAAAAAAAAAA9";
	private String aia = "A9999999999AAAA";
	private String iii = "5AA2AAAAAAAAAA2";
	private String iai = "9AAAAAAAAAAAAA0";
	private String iaa = "5AA2AAAAAAAAAA2"; //old code: 999dddkkkkkkkkkkkkkjkkkk
	private String aii = "AAA900000000000";
	private String iia = "90000000000000A";
	private String decrypt = ""; //1NF3Z58N3805F47
	Decryptions dec = new Decryptions();
	
	/** Constructor to setup the GUI */
	public JDecrypter() {
		setLayout(new FlowLayout());
		// "this" Frame sets layout to FlowLayout, which arranges the components
		//  from left-to-right, and flow to next row from top-to-bottom.
		lblInput = new Label("Administrator Code "); // construct Label
		add(lblInput);               // "this" Frame adds Label
		tfInput = new TextField(15); // construct TextField
		add(tfInput);                // "this" Frame adds TextField
		
		// The TextField tfInput registers "this" object (AWTAccumulator)
		//  as an ActionEvent listener.
		tfInput.addActionListener(this); //working witn Enter button
		lblOutput = new Label("Password ");  // allocate Label
		add(lblOutput);               // "this" Frame adds Label
 
		tfOutput = new TextField(15); // allocate TextField
		tfOutput.setEditable(false);  // read-only
		add(tfOutput);                // "this" Frame adds TextField
      
		btnDecr = new Button("Decrypt"); // construct Button
		add(btnDecr);                  	// "this" Frame adds Button
		btnDecr.addActionListener(this); // for event-handling
      
		setTitle("PageStore Code Decoder       ver " + ver);  // "this" Frame sets title
		setSize(600, 80);  // "this" Frame sets initial window size
		setVisible(true);   // "this" Frame shows
		
		// Allocate an anonymous instance of an anonymous inner class
		// that extends WindowAdapter.
		// "this" Frame adds the instance as WindowEvent listener.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);  // Terminate the program
			}
		});
  
	}
   
	/** The entry main() method */
	public static void main(String[] args) {
		// Invoke the constructor to setup the GUI, by allocating an anonymous instance
		new JDecrypter();
	}
	
	/** Event handler - Called back when user hits the enter key on the TextField */
	@Override
	
	public void actionPerformed(ActionEvent evt) {
		code = tfInput.getText();
		//TODO: rewrite this part, should be more clearly and shortly 
		try {
			if (dec.checkString(code.substring(5,6)) == false && dec.checkString(code.substring(12,13)) == true) {
				decrypt = iai;
			}
			else if (dec.checkString(code.substring(2,3)) == true && dec.checkString(code.substring(5,6)) == true && dec.checkString(code.substring(12,13)) == true) {
				decrypt = iii;
				}
			else if (dec.checkString(code.substring(2,3)) == false && dec.checkString(code.substring(5,6)) == true && dec.checkString(code.substring(12,13)) == false) {
				decrypt = aia;
			}
			else if (dec.checkString(code.substring(2,3)) == false && dec.checkString(code.substring(5,6)) == false && dec.checkString(code.substring(12,13)) == true) {
				decrypt = aai;
			}
			else if (dec.checkString(code.substring(2,3)) == true && dec.checkString(code.substring(5,6)) == false && dec.checkString(code.substring(12,13)) == false) {
				decrypt = iaa;
			}
			else if (dec.checkString(code.substring(2,3)) == false && dec.checkString(code.substring(5,6)) == true && dec.checkString(code.substring(12,13)) == true) {
				decrypt = aii;
			}
			else if (dec.checkString(code.substring(2,3)) == true && dec.checkString(code.substring(5,6)) == true && dec.checkString(code.substring(12,13)) == false) {
				decrypt = iia;
				}
			}
			catch (Exception e) {
				decrypt = "Incorrect data";
			}
		
		//tfInput.setText(""); //clear input TextField
		tfOutput.setText(decrypt); // display decrypt on the output TextField
	   
   }
}