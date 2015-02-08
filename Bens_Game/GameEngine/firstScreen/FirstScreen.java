package firstScreen;

import java.awt.Color;
import java.awt.Graphics;

import main.Event;
import main.Screen;

public class FirstScreen implements Screen {

	private int x = 0;
	private int y = 40;
	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("the screen works");
		x++;
	}

	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.fillRect(x, y, 100, 40);

	}

	public void doEvents(Event e) {
		// TODO Auto-generated method stub
		
	}

}
