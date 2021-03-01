import java.awt.*;
import javax.swing.JFrame;
public class GameFrame extends JFrame{
	GamePanel panel;
	
	 public GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Ping Pong Game");
		this.setResizable(false);
		this.setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
