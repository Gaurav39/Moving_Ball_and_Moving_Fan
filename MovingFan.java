import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="MovingFan" width=500 height=500>
</applet>

*/


public class MovingFan extends Applet
{
int x=330;
public void paint(Graphics g)
{

g.setColor(Color.RED);
g.fillArc(80,70,200,200,x%360,60);
g.setColor(Color.BLUE);
g.fillArc(80,70,200,200,(x+120)%360,60);
g.setColor(Color.BLACK);
g.fillArc(80,70,200,200,(x+240)%360,60);

try
{
Thread.sleep(50);
}
catch(InterruptedException x)
{
}
x=x+10;
repaint();



}
}