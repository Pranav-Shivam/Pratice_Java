import java.applet.*;
import java.awt.*;
public class AppletEg extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome",150,220);
		g.drawRect(100,180,320,300);
		g.drawOval(100,140,150,50);
				
	}
}
/*<applet code="AppletEg" height="600" width="600"></applet>*/