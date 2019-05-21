import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class button extends JFrame implements ActionListener 
{
	private JButton btnBlue = new JButton("Blue");
	private JButton btnRed = new JButton("Red");
	
	Container pane = getContentPane();
	
	public button()
	{
		pane.setLayout(new FlowLayout());
		pane.add(btnBlue);
		pane.add(btnRed);
		
		btnBlue.addActionListener(this);
		btnRed.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnBlue)
		{
			pane.setBackground(Color.blue);
		}
		else
		{
			pane.setBackground(Color.red);
		}
	}
	public static void main (String[] args)
	{
		button gui = new button();
		gui.setSize(500, 300);
		gui.setVisible(true);
	}

}
