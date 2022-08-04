package ja_0804;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;

public class Window_1 extends Frame {

	Window[] win = new Window[300];
	Color[] color = { Color.red, Color.yellow, Color.green};
	int x, y;
	
	public Window_1(String str)
	{
		super(str);
		for (int i = 0; i < 300; i++) 
		{
		win[i] = new Window(this);
		win[i].setBackground(color[i%3]);
		//중요한 문장! 3가지 색을 반복되게 하려는 문장임.10을 3으로 나눴을 때 올 수 있는 수 0,1,2!
		
		Label lbl = new Label(i + "번 윈도우");
		if(i<win.length/5) 
		{
			if((int)(i/10)%2==0 )
			{
				x +=10;
				y +=10;
			}
			else
			{
				x +=10;
				y -=10;
			}
		}
		
		else if(i<win.length/5*2) 
		{
			if((int)(i/10)%2==0 )
			{
				x +=10;
				y +=10;
			}
			else
			{
				x -=10;
				y +=10;
			}
		}
		
		else if(i<win.length/5*3) 
		{
			if((int)(i/10)%2==0 )
			{
				x -=10;
				y -=10;
			}
			else 
			{
				x -=10;
				y +=10;
			}
		}
		
		else if (i<win.length/5*4) 
		{
			if((int)(i/10)%2==0 )
			{
				x -=10;
				y -=10;
			}
			else
			{
				x +=10;
				y -=10;
			}
		}
		
		else
		{
			if((int)(i/10)%2==0 )
			{
				x +=10;
				y +=10;
			}
			else 
			{
				x +=10;
				y -=10;
			}
		}
		
		win[i].add(lbl);
		win[i].setBounds( x + 150 , 150 + y, 100, 100);
	
		win[i].setVisible(true);
		
		}
		setLocation(90, 90);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Window_1("윈도우");
	}
}
