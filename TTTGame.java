import javax.swing.BoxLayout;
import javax.swing.JFrame;
// frame with two penals(Canvas1 and State)
public class TTTGame extends JFrame{
	Canvas1 theCanvas;
	State theState;
	public int num; //the number of valid clicks
	public int a,b,c,d,f,h,i,j,k; //the respective status of 9 grids in the chessboard. =0 means the grid is empty, =1 means the grid has been occupied by player2(P2),=2 means the grid has been occupied by player1(P1)
	public int p1w,p2w,draw; //the number of who wins and draw
	public boolean x=false, y=false,z=false; //the status of the outcomeof the game. x=true means P2 wins, y=true means P1 wins, z=true means draw.
    //constructor TTTGame with 2 object parameters
	public TTTGame(Canvas1 can, State st) {
    	//put 2 panels to this frame in an vertical order from top to bottom
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		theCanvas = can; theState = st;
		add(st);
	    add(can);
	    theCanvas.addMouseListener(theCanvas);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
    }
    //method to repaint chessboard when resetting a new game
    public void rep() {
		theCanvas.repaint(); //use .repaint() method to repaint this chessboard drawn before in the Canvas1
	}
    //method to see each grid's state on the chessboard and make corresponding changes in the status of label and button in the theState penal
    public void Playgame(){
    	//recognize and show who's turn
    	if(num%2==0) {
			theState.label1.setText("P1's Turn");
		}else if(num%2==1) {
			theState.label1.setText("P2's Turn");
		}
    //recognize and show who wins or draw
    	//P2 win!
		if((a==1&&b==1&&c==1)||(a==1&&d==1&&f==1)||(i==1&&b==1&&h==1)||(j==1&&k==1&&c==1)||
			(a==1&&i==1&&j==1)||(d==1&&b==1&&k==1)||(f==1&&h==1&&c==1)||(j==1&&b==1&&f==1)) {
			theState.label1.setText("P2 win!");
			x=true;
			p2w++;
			theState.label2.setText("<html>P1 Wins:" + p1w +"<br>P2 Wins:" + p2w+ "<br> Draw:" + draw + "</html>");
        //P1 win!
		}else if((a==2&&b==2&&c==2)||(a==2&&d==2&&f==2)||(i==2&&b==2&&h==2)||(j==2&&k==2&&c==2)||
				(a==2&&i==2&&j==2)||(d==2&&b==2&&k==2)||(f==2&&h==2&&c==2)||(j==2&&b==2&&f==2)) {
			theState.label1.setText("P1 win!");
		    y=true;
		    p1w++;
			theState.label2.setText("<html>P1 Wins:" + p1w +"<br>P2 Wins:" + p2w+ "<br> Draw:" + draw + "</html>");
	    //Draw!
		}else if(a>0&&b>0&&c>0&&d>0&&f>0&&h>0&&i>0&&j>0&&k>0&&y==false&&x==false){
			theState.label1.setText("Draw!");
			z=true;
			draw++;
			theState.label2.setText("<html>P1 Wins:" + p1w +"<br>P2 Wins:" + p2w+ "<br> Draw:" + draw + "</html>");
		}
	}
 //main method  
	public static void main(String[] args) {
		Canvas1 theCanvas = new Canvas1(); //create a Canvas1 object
		State theState = new State(); //create a State object
		TTTGame game=new TTTGame(theCanvas, theState); //create a TTTGame object with parameter Canvas1 object and State object created above
		game.theCanvas.setGame(game); //use the setgame method created from Canvas1 to make the TTTGame object which will be used in the Canvas1 is the object called "game" just created above in this main method 
		game.theState.setGame(game); //use the setgame method created from State to make the TTTGame object which will be used in the State is the object called "game" just created above in this main method 
//	    game.setVisible(true);
//	    game.setFocusable(true);
	}
}
