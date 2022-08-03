import java.awt.*;
import java.applet.*;
public class Face6_Applet extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(100,100,100,100);
        g.setColor(Color.pink);
        g.fillOval(94,130,8,20);
        g.fillOval(198,130,8,20);
        g.setColor(Color.white);
        g.fillOval(120,120,20,20);
        g.fillOval(160,120,20,20);
        g.setColor(Color.black);
        g.drawLine(150,165,150,150);
        g.setColor(Color.red);
        g.drawArc(130,170,40,20,180,-180);
        g.setColor(Color.black);
        g.fillOval(125,125,8,10);
        g.fillOval(165,125,8,10);
    }
}
/*<Applet code="Face6_Applet" height="600" width="600"></Applet>*/
