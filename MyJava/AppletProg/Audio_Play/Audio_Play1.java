import java.awt.*;
import java.applet.*;
/*<applet code="Audio_Play1" height=400 width=500></Applet>*/
public class Audio_Play1 extends Applet
{
	AudioClip ac;
	public void init()
	{
		ac=getAudioClip(getDocumentBase(),"fg1.wav");
	}
	public void start()
	{
		ac.play();
	}
}