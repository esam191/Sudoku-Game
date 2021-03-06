import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


/******************************************************************************
 * <p>Title: SudokoUI</p>
 * <p>Description: Sudoko Graphical Interface</p>
 * <p>for the ENGR2710 Project</p>
 * @author Ramiro Liscano
 * @version 1.0
 */
public class SudokoGUI extends JFrame implements SwingConstants {
	private static final long serialVersionUID=1;
	static final int MAX_ROW = 3;
	static final int MAX_COL = 3;

	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem,undoMenuItem;
	
	// Array of the 81 Panel squares
	JPanel[][] sudokoPanels = new JPanel[MAX_ROW*MAX_ROW][MAX_COL*MAX_COL];

	public SudokoGUI(){
		super("Sudoko Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(70,70);
		setPreferredSize(new Dimension(650,650));
		setResizable(false);
		
		//Add menu item to let user choose a number from 1-9 
		
		int[] numberToChoose = {1 , 2, 3, 4, 5, 6, 7, 8, 9}'
			JComboBox numbersList = new JComboBox (numbersToChoose);
		JLabel nameofWindow = new JLabel();
		public static final LEFT;   // left 
		public static final RIGHT;  //Right 
		public static final CENTER; // cenetr 
		
		int number  = Integer.parseInt( intupt , number );
        sum += number ;      
        Input.setText("");
        Output.text(sum + "");

		
		
		
		
		// Add the menu to support Undo operation
		//Create the menu bar.
		menuBar = new JMenuBar();

		//Build the File menu.
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		menu.getAccessibleContext().setAccessibleDescription(
		        "The File menu");
		menuBar.add(menu);
		
		//Add the Exit option.

		menuItem = new JMenuItem("Exit",
		                         KeyEvent.VK_X);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription(
		        "Exits the application");
		menuItem.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0); }});
          
		menu.add(menuItem);
		
		//Add the Edit menu for Undo operations.
		menu = new JMenu("Edit");
		menu.setMnemonic(KeyEvent.VK_E);
		menu.getAccessibleContext().setAccessibleDescription(
		        "This menu handles editing operations");
		menuBar.add(menu);

		//Add the Undo option.

		undoMenuItem = new JMenuItem("Undo");
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_U, ActionEvent.CTRL_MASK));
		undoMenuItem.getAccessibleContext().setAccessibleDescription(
		        "Undoes any user actions");
		// Undo listener will be added by a method call
		menu.add(undoMenuItem);
		
		// Listener for window closing
//		addWindowListener(new WindowClosing());
		
		// Create a 3x3 panel to hold the larger squares.
		JPanel outerPanel = new JPanel();
		outerPanel.setLayout(new GridLayout(MAX_ROW,MAX_COL));
		Border blackBorder =
	           BorderFactory.createLineBorder(Color.BLACK);
		outerPanel.setBorder(blackBorder);
		
		// Go through each one of the larger panels and insert sub 3x3 panels
		for(int i=0;i<MAX_ROW;i++)
			for (int j=0;j<MAX_COL;j++){
				JPanel innerPanel = new JPanel();
				innerPanel.setLayout(new GridLayout(MAX_ROW,MAX_COL));
				innerPanel.setBorder(blackBorder);
				outerPanel.add(innerPanel);

				//Go through the inner panels and create for each the
				// play panel where the numbers will go.
								
				for(int ii=0;ii<MAX_ROW;ii++)
					for (int jj=0;jj<MAX_COL;jj++){
						JPanel gamePanel = new JPanel();
						gamePanel.setBorder(blackBorder);
						innerPanel.add(gamePanel);
						sudokoPanels[i*MAX_ROW+ii][j*MAX_COL+jj]=gamePanel;
					}
			}
		setContentPane(outerPanel);
		setJMenuBar(menuBar);
	    pack();
	    setVisible(true);
	}
		
	/******************************************************************************
	 * 
	 * addUndoMenuListener
	 * Method to set the Undo action listener
	 * 
	 * @author Ramiro Liscano
	 * @version 1.0
	 * @param ActionListener aListener
	 * @return void
	 * 
	 */	

	public void addUndoMenuListener(ActionListener aListener){
		undoMenuItem.addActionListener(aListener);
	}

	/******************************************************************************
	 * 
	 * getSudokoPanels
	 * Method to get the sudoko panels
	 * 
	 * @author Ramiro Liscano
	 * @version 1.0
	 * @param none
	 * @return JPanel[][] - The panels representing the Sudoko
	 * 
	 */	
	
	public JPanel[][] getSudokoPanels() {
		return sudokoPanels;
	}
	
}
