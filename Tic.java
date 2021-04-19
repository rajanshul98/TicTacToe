// Program to develope a Tic Tac Toe game using Frame and Panel

import java.awt.*;
import java.awt.event.*;

class Tic extends Frame implements ActionListener
{
static Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
int c=1,c1=2;
static Label lb3;
	public static void main(String arr[])
		{
	Tic t= new Tic ();

	Label lb1=new Label("WELCOME TO TIC TAC TOE");
	Label lb2=new Label("Developer :- ANSHUL");
	lb3=new Label("");
	b1=new Button("");b2=new Button("");b3=new Button("");b4=new Button("");b5=new Button("");
	b6=new Button("");b7=new Button("");b8=new Button("");b9=new Button("");
	b10=new Button("Play Again");b11=new Button("Close");
	
	t.setLayout(new BorderLayout());
	Panel p=new Panel();
	p.setLayout(new GridLayout(3,3));
	p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
	
	Panel p1=new Panel();
	p1.setLayout(new GridLayout(1,1));
	p1.add(lb3);
	
	Panel p2=new Panel();
	p2.setLayout(new GridLayout(2,2));
	p2.add(b10);p2.add(b11);p2.add(lb2);
	
	Panel p3=new Panel();
	p3.setLayout(new GridLayout(2,1));
	p3.add(p1);p3.add(p2);
	
	t.add(lb1,BorderLayout.NORTH);
	t.add(p,BorderLayout.CENTER);
	t.add(p3,BorderLayout.SOUTH);
	t.setTitle("Tic Tac Toe - Game");
	t.setSize(280,350);
	t.setVisible(true);

	b1.addActionListener(t);b2.addActionListener(t);b3.addActionListener(t);b4.addActionListener(t);
	b5.addActionListener(t);b6.addActionListener(t);b7.addActionListener(t);b8.addActionListener(t);
	b9.addActionListener(t);b10.addActionListener(t);b11.addActionListener(t);
		}

	public void actionPerformed(ActionEvent e)
		{
	String s=e.getActionCommand();
			if(s.equals("Play Again"))
			{
			lb3.setText(" ");
			c1++;
			c=c1;
			b1.setLabel("");b2.setLabel("");b3.setLabel("");b4.setLabel("");b5.setLabel("");b6.setLabel("");
			b7.setLabel("");b8.setLabel("");b9.setLabel("");
			}
			else if(e.getSource()==b11)
			System.exit(0);
			
			if(s.equals(""))
			{
			if(c%2!=0)
				{
			if(e.getSource()==b1)
			b1.setLabel("X");
			else if(e.getSource()==b2)
			b2.setLabel("X");
			else if(e.getSource()==b3)
			b3.setLabel("X");
			else if(e.getSource()==b4)
			b4.setLabel("X");
			else if(e.getSource()==b5)
			b5.setLabel("X");
			else if(e.getSource()==b6)
			b6.setLabel("X");
			else if(e.getSource()==b7)
			b7.setLabel("X");
			else if(e.getSource()==b8)
			b8.setLabel("X");
			else if(e.getSource()==b9)
			b9.setLabel("X");
				}
			else
				{
			if(e.getSource()==b1)
			b1.setLabel("O");
			else if(e.getSource()==b2)
			b2.setLabel("O");
			else if(e.getSource()==b3)
			b3.setLabel("O");
			else if(e.getSource()==b4)
			b4.setLabel("O");
			else if(e.getSource()==b5)
			b5.setLabel("O");
			else if(e.getSource()==b6)
			b6.setLabel("O");
			else if(e.getSource()==b7)
			b7.setLabel("O");
			else if(e.getSource()==b8)
			b8.setLabel("O");
			else if(e.getSource()==b9)
			b9.setLabel("O");
				}
			}
		c++; 
		if(b1.getLabel()=="X" && b2.getLabel()=="X"&& b3.getLabel()=="X")
		lb3.setText("X wins");
		else if (b1.getLabel()=="O" && b2.getLabel()=="O" && b3.getLabel()=="O")
		lb3.setText("O wins");
		else if (b1.getLabel()=="X" && b4.getLabel()=="X" && b7.getLabel()=="X")
		lb3.setText("X wins");
		else if (b1.getLabel()=="O" && b4.getLabel()=="O" && b7.getLabel()=="O")
		lb3.setText("O wins");
		else if (b1.getLabel()=="X" && b5.getLabel()=="X" && b9.getLabel()=="X")
		lb3.setText("X wins");
		else if (b1.getLabel()=="O" && b5.getLabel()=="O" && b9.getLabel()=="O")
		lb3.setText("O wins");
		else if (b2.getLabel()=="X" && b5.getLabel()=="X" && b8.getLabel()=="X")
		lb3.setText("X wins");
		else if (b2.getLabel()=="O" && b5.getLabel()=="O" && b8.getLabel()=="O")
		lb3.setText("O wins");
		else if (b3.getLabel()=="X" && b5.getLabel()=="X" && b7.getLabel()=="X")
		lb3.setText("X wins");
		else if (b3.getLabel()=="O" && b5.getLabel()=="O" && b7.getLabel()=="O")
		lb3.setText("O wins");
		else if (b3.getLabel()=="X" && b6.getLabel()=="X" && b9.getLabel()=="X")
		lb3.setText("X wins");
		else if (b3.getLabel()=="O" && b6.getLabel()=="O" && b9.getLabel()=="O")
		lb3.setText("O wins");
		else if (b4.getLabel()=="X" && b5.getLabel()=="X" && b6.getLabel()=="X")
		lb3.setText("X wins");
		else if (b4.getLabel()=="O" && b5.getLabel()=="O" && b6.getLabel()=="O")
		lb3.setText("O wins");
		else if (b7.getLabel()=="X" && b8.getLabel()=="X" && b9.getLabel()=="X")
		lb3.setText("X wins");
		else if (b7.getLabel()=="O" && b8.getLabel()=="O" && b9.getLabel()=="O")
		lb3.setText("O wins");
		else if(b1.getLabel()!=""  && b2.getLabel()!="" && b3.getLabel()!=""  && b4.getLabel()!=""  && b5.getLabel()!="" && b6.getLabel()!=""  && b7.getLabel()!=""  && b8.getLabel()!=""  && b9.getLabel()!="")
		lb3.setText("Match Drawn");
		}
}