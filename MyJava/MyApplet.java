import java.awt.*;
import java.applet.*;
//<Applet code="MyApplet" height="500" width ="700"></applet>
public class MyApplet extends Applet
{
    public void paint(Graphics g)
    {
        Font f=new Font("Arial",Font.BOLD,48);
		g.setColor(Color.red);
		g.setFont(f);
        g.drawString("Welcome to DCC",100,150);
        g.drawRect(80,90,520,170);
    }
}