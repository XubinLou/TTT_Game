import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
// bottom board panel with MouseListener 
public class Canvas1 extends JPanel implements MouseListener{
	TTTGame theGame;
	public void setGame(TTTGame g) {
		theGame = g;
	}
	//constructor Canvas1
	public Canvas1() {
		this.setPreferredSize(new Dimension(480, 480));
	}
	@Override
	//draw "O" and "X" on the chassboard when the mouse clicks at specific positions on the board
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if(theGame.x==false&&theGame.y==false&&theGame.z==false) {
			if(x>90&&x<390&&y>90&&y<390){
				if(x>90&&x<190&&y>90&&y<190&&theGame.a==0) {
					theGame.num++;					
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(130, 130, 20, 20);
				        theGame.a=1;				    
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(130, 130, 150, 150);
				        g.drawLine(130, 150, 150, 130);
				        theGame.a=2;				        
				        theGame.Playgame();
					}
				}else if(x>190&&x<290&&y>190&&y<290&&theGame.b==0) {
					theGame.num++;
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(230, 230, 20, 20);
				        theGame.b=1;
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(230, 230, 250, 250);
				        g.drawLine(230, 250, 250, 230);
				        theGame.b=2;
				        theGame.Playgame();
					}
				}else if(x>290&&x<390&&y>290&&y<390&&theGame.c==0) {
					theGame.num++;
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(330, 330, 20, 20);
				        theGame.c=1;
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(330, 330, 350, 350);
				        g.drawLine(330, 350, 350, 330);
				        theGame.c=2;
				        theGame.Playgame();
					}
				}else if(x>190&&x<290&&y>90&&y<190&&theGame.d==0) {
					theGame.num++;
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(230, 130, 20, 20);
				        theGame.d=1;
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(230, 130, 250, 150);
				        g.drawLine(230, 150, 250, 130);
				        theGame.d=2;
				        theGame.Playgame();
					}
				}else if(x>290&&x<390&&y>90&&y<190&&theGame.f==0) {
					theGame.num++;
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(330, 130, 20, 20);
				        theGame.f=1;
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(330, 130, 350, 150);
				        g.drawLine(330, 150, 350, 130);
				        theGame.f=2;
				        theGame.Playgame();
					}
				}else if(x>290&&x<390&&y>190&&y<290&&theGame.h==0) {
					theGame.num++;
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(330, 230, 20, 20);
				        theGame.h=1;
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(330, 230, 350, 250);
				        g.drawLine(330, 250, 350, 230);
				        theGame.h=2;
				        theGame.Playgame();
					}
				}else if(x>90&&x<190&&y>190&&y<290&&theGame.i==0) {
					theGame.num++;
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(130, 230, 20, 20);
				        theGame.i=1;
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(130, 230, 150, 250);
				        g.drawLine(130, 250, 150, 230);
				        theGame.i=2;
				        theGame.Playgame();
					}
				}else if(x>90&&x<190&&y>290&&y<390&&theGame.j==0) {
					theGame.num++;
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(130, 330, 20, 20);
				        theGame.j=1;
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(130, 330, 150, 350);
				        g.drawLine(130, 350, 150, 330);
				        theGame.j=2;
				        theGame.Playgame();
					}
				}else if(x>190&&x<290&&y>290&&y<390&&theGame.k==0) {
					theGame.num++;
					if(theGame.num%2==0) {
						Graphics g=getGraphics();
				        g.drawOval(230, 330, 20, 20);
				        theGame.k=1;
				        theGame.Playgame();
					}else if(theGame.num%2==1) {
						Graphics g=getGraphics();
				        g.drawLine(230, 330, 250, 350);
				        g.drawLine(230, 350, 250, 330);
				        theGame.k=2;
				        theGame.Playgame();
					}
				}
			}else {
				
			}
		}
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	
	@Override
	//draw the chassboard
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("Calling paintComponent.");
		g.drawLine(90, 190, 390, 190);
		g.drawLine(90, 290, 390, 290);
		g.drawLine(190, 90, 190, 390);
		g.drawLine(290, 90, 290, 390);
		g.drawLine(0, 0, 480, 0);
	}	
}

