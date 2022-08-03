/**
 * @(#)$[PrjName]Frame.java
 *
 * JFC $[PrjName] application
 *
 * @author 
 * @version 1.00 $[Year]/$[Month]/$[Day]
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class $[PrjName]Frame extends JFrame {
    
    /**
     * The constructor
     */  
	public $[PrjName]Frame() {
                
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu();
        JMenuItem menuFileExit = new JMenuItem();
        
        menuFile.setText("File");
        menuFileExit.setText("Exit");
        
        // Add action listener.for the menu button
        menuFileExit.addActionListener
        (
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    $[PrjName]Frame.this.windowClosed();
                }
            }
        ); 
        menuFile.add(menuFileExit);
        menuBar.add(menuFile);
        
        setTitle("$[PrjName]");
        setJMenuBar(menuBar);
        setSize(new Dimension(400, 400));
        
        // Add window listener.
        this.addWindowListener
        (
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    $[PrjName]Frame.this.windowClosed();
                }
            }
        );  
    }
    
    
    /**
     * Shutdown procedure when run as an application.
     */
    protected void windowClosed() {
    	
    	// TODO: Check if it is safe to close the application
    	
        // Exit application.
        System.exit(0);
    }
}
