import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public abstract class GUI_GameOver implements ActionListener {

	protected JLabel secretWordLabel;
	protected JFrame parentFrame;
	protected JLabel gameResultLabel;
    protected JButton returnBtn;
    
    public GUI_GameOver (String Letters, JFrame frame)
    {
    	parentFrame = frame;
    	returnBtn = new JButton("Return to the main menu");
    	returnBtn.addActionListener(this); 
    }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		parentFrame.dispose();
    	new Start().createAndShowGUI();
	}

}
