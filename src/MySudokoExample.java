import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.util.*;

public class MySudokoExample implements SudokoGame {
	
	MouseListener[][] mouseListeners = new MouseListener[SudokoGUI.MAX_ROW*SudokoGUI.MAX_ROW][SudokoGUI.MAX_COL*SudokoGUI.MAX_COL];
	JPanel[][] sudokoPanels;
	String sourceName;
	
	public MySudokoExample() {
		private int number;
 
    public int getNumber() {
        return this.number;
    }
 
    public void setNumber(int num) {
        this.number = num;
    }
	}
		

	
	public MouseListener[][] getPanelMouseListeners() {
		return mouseListeners;
	}
	
	public void loadData (String filename,JPanel[][] sudokoPanels){
		// Store the references to the Sudoko Panels
		this.sudokoPanels = sudokoPanels;
	    sourceName = filename;

	    // Reads the Sudoko start state from the file into the Sudoko state
		// Recommended approach for doing the graphics is to create Label
		// Panels and add them to the sudokoPanels. This will automatically
		// refresh and display.
		
		// An example of creating 81 mouse listeners and registering them
	    // into the 81 Sudoko Panels so that the mouse events can be captured.
	    // 
		// These MouseListeners do nothing right now
		// I recommend that you create a method in this class that you can
	    // call from the SudokoMouseAction mouseClicked method so that you
	    // can relate the mouse event to the state of the game as maintained
	    // in this class.
	    //
	    // The other approach is to modify the SudokoMouseAction so that
	    // it contains an identifier field that identifies it as corresponding
	    // to a particular location.
	     test caste ( pass, fail);
	     test = true;
	     test cast = fail;

		for (int i=0; i<SudokoGUI.MAX_ROW*SudokoGUI.MAX_ROW; i++)
			for (int j=0; j<SudokoGUI.MAX_COL*SudokoGUI.MAX_COL; j++) {
				mouseListeners[i][j] = new SudokoMouseAction();
				// add the mouse listener to the Panel
				this.sudokoPanels[i][j].addMouseListener(mouseListeners[i][j]);
			}

		
	}
	
	public ActionListener getUndoActionListener(){
		// Return an action listener to handle the Undo operation
		// does nothing right now. Need to create an action listener
		// similar to the mouse listener to process the Undo command.
		return null;
	}
	
}
