import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// upper panel with button and label
public class State extends JPanel implements ActionListener {
	TTTGame theGame;
	public void setGame(TTTGame g) {
		theGame = g;
	}
	public JButton button,label2,label1;
	
	//constructor State
    public State() {
		this.setPreferredSize(new Dimension(480, 100));
		JButton button = new JButton("New Game");
		button.addActionListener(this);
		add(button);
        label1 = new JButton("P1's Turn");
		add(label1);
		label2 = new JButton("<html>P1 wins:" + 0 +"<br>P2 Wins:" + 0+ "<br> Draw:" + 0 + "</html>");
		add(label2);
    }	

	@Override
	//when click New Game button to reset a new game board
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("New Game")) {
			//clear all previous record about the status of 9 grids on the chessboard
			theGame.a=0;theGame.b=0;theGame.c=0;theGame.d=0;theGame.f=0;theGame.h=0;theGame.i=0;theGame.j=0;theGame.k=0;
			theGame.num=0;
			theGame.x=false; theGame.y=false; theGame.z=false;
			theGame.theState.label1.setText("P1's Turn");//set label1 back to "P1's Turn" when resetting the game
			theGame.rep(); //repaint this chessboard when resetting a new game
		}
	}
}


	
