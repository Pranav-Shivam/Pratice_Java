import java.awt.*;
import java.applet.*;
public class ImageDemo extends Applet
{
	Image img,img2;
	public void init()
	{
		img=getImage(getDocumentBase(),"flyingbird.gif");
		img2=getImage(getDocumentBase(),"flyingbird.gif");
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,0,200,170,190,this);
		g.drawImage(img2,200,200,170,190,this);
	}

}
/*<applet code="ImageDemo" height="1400" width="1500"></applet>*/