import java.awt.*;
import java.applet.*;
/*<applet code="Video_Play" height=400 width=500></Applet>*/
public class Video_Play extends Applet
{
	VideoClip vc;
	public void init()
	{
		vc=getVideoClip(getDocumentBase(),"heart.mp4");
	}
	public void start()
	{
		vc.play();
	}
}