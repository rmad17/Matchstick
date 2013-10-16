import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
@SuppressWarnings("serial")
public class Matchstick extends Applet
{
	JLabel l1,l2;
	Choice c;
	JButton b1;
	int t,b;
	JTextField tf,tf2;
	JPanel p1,p2;
	public void init()
	{
		t=21;
		b=0;
		b1=new JButton("OK");
		l1=new JLabel("USER");
		l2=new JLabel("COMPUTER");
		c=new Choice();
		p1=new JPanel();
		p2=new JPanel();
		tf=new JTextField(4);
		tf2=new JTextField(21);
		setLayout(new BorderLayout());
		p1.setLayout(new GridLayout(1,5));
		p1.add(l1);
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		p1.add(c);
		p1.add(b1);
		p1.add(l2);
		p1.add(tf);
		add(p1,BorderLayout.NORTH);
		p2.setLayout(new FlowLayout());
		p2.add(tf2);
		add(p2,BorderLayout.SOUTH);
		b1.addActionListener(new MyButton());
	}
	public void paint(Graphics g)
	{
		for(int i=0;i<t;i++)
		{
			int p;
			p=(12*i)+27;
			Color c1=new Color(84,41,41);
			g.setColor(c1);
			g.fillOval(p,160,5,10);
			Color c2=new Color(253,224,128);
			g.setColor(c2);
			g.fillRect(p,170,5,60);
		}
	}
	class MyButton implements ActionListener
	{
		public void actionPerformed(ActionEvent ae)
		{
			 int a=Integer.parseInt(c.getSelectedItem());
			 t=t-a;
			 b=5-a;
			 a=0;
			 t=t-b;
			 tf.setText(""+b);
			 b=0;
			 if(t==1)
			 {
				tf2.setText("     You lost the Game     ");
			 }
			 repaint();
		    
		}
	}
}
