package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PirexWindow extends JFrame implements  ActionListener {
	
    public PirexWindow()
    {
        super();
        setupLayout();
    }
    
    private void setupLayout() {
    	JFrame frame;
    	frame = new JFrame("Pirex");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	
        MainInterface main = new MainInterface();
        
        
        frame.add(main);
        JMenuBar menuBar = new JMenuBar();
        
    	JMenu fileMenu = new JMenu("File");						//File drop down window
    	JMenuItem openMenuItem = new JMenuItem("Open");
    	openMenuItem.addActionListener(this);	
    	fileMenu.add(openMenuItem);
    	
    	menuBar.add(fileMenu);
    	
    	frame.setPreferredSize(new Dimension(1080,720));
    	frame.setJMenuBar(menuBar);
    	
    	frame.pack();
    	frame.setVisible(true);
        
        
    	
    }
    public void actionPerformed(ActionEvent in)
    {
    	String event;
		event = in.getActionCommand();
		if(event == "Open") {
			System.out.println("Open Pressed");
		}
			
    }
}
