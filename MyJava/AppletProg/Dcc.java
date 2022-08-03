import java.awt.*;
import java.applet.*;
public class Dcc extends Applet
{
	public void paint(Graphics g)
	{
		Font f=new Font("Jokerman",Font.BOLD,48);
		g.setFont(f);
		g.setColor(Color.blue);
		g.fillRoundRect(10,100,670,115,25,25);
		g.setColor(Color.yellow);
		g.drawString("Hello !! Welcome to Dcc.",18,150);
	}
	
}
/*<applet code="Dcc" height="500" width="700"></applet>*/