import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Window.Type;

public class designjogo extends JFrame {

	private JPanel contentPane;
Bool Up=true;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					designjogo frame = new designjogo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public designjogo() {
		setType(Type.UTILITY);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\so\\Pictures\\9cizZSmg_400x400.jpg"));
		lblNewLabel.setBounds(10, 121, 70, 70);
		contentPane.add(lblNewLabel);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if(e.getKeyCode()== KeyEvent.VK_W) {
					if (lblNewLabel.getLocation().y > 0) {
					lblNewLabel.setLocation(lblNewLabel.getLocation().x, lblNewLabel.getLocation().y - 10);
					}
				}
				if(e.getKeyCode()== KeyEvent.VK_S) {
					if (lblNewLabel.getLocation().y < 380) {
					lblNewLabel.setLocation(lblNewLabel.getLocation().x, lblNewLabel.getLocation().y + 10);
					}
				}
				if(e.getKeyCode()== KeyEvent.VK_A) {
					if (lblNewLabel.getLocation().x > 0) {
					lblNewLabel.setLocation(lblNewLabel.getLocation().x  - 10, lblNewLabel.getLocation().y);
					}
				}
				if(e.getKeyCode()== KeyEvent.VK_D) {
					if (lblNewLabel.getLocation().x < 630) {
					lblNewLabel.setLocation(lblNewLabel.getLocation().x  + 10, lblNewLabel.getLocation().y);
					}
				}
				
				{
					
						
				}
			}
		});
		/*
		Timer timer = new Timer();
	
timer.schedule(new TimerTask() {
	@Override
	public void run() {
		//TODO Auto-generated method stub
		
	}
	}

	
}

	*/
}
	
}
