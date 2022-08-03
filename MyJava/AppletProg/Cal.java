/*<applet code=Cal height=400 width=500></applet>*/
import java.awt.*;
import java.applet.*;
public class Cal extends Applet
{
	public void init()
	{
		Label l1,l2,l3;
		TextField t1,t2;
		Button b1;
		l1=new Label("Enter  a number");
		l2=new Label("Entet b number");
		l3=new Label();
		t1=new TextField();
		t2=new TextField();
		b1=new Button("ADD");
		setLayout(null);
		l1.setBounds(50,70,100,20);
		l2.setBounds(50,100,100,20);
		l3.setBounds(70,50,40,20);
		t1.setBounds(120,70,100,20);
		t2.setBounds(120,100,100,20);
		b1.setBounds(70,150,40,20);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(l1);
		add(b1);
			
	}
}